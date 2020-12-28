package com.alikeshadow.aliketools.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class Stalagmite extends HorizontalBlock implements IWaterLoggable {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public Stalagmite() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.5F, 6.0F)
        );
        setRegistryName("stalagmite");
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(BlockStateProperties.WATERLOGGED, Boolean.FALSE));
    }
    private static final VoxelShape SHAPE_N = VoxelShapes.or(
            Block.makeCuboidShape(13, 0, 12, 12, 4, 8),
            Block.makeCuboidShape(12, 0, 13, 6, 5, 7),
            Block.makeCuboidShape(6, 0, 11, 5, 7, 9),
            Block.makeCuboidShape(11, 4, 12, 6, 9, 8),
            Block.makeCuboidShape(10, 8, 11, 8, 13, 9),
            Block.makeCuboidShape(8, 8, 11, 7, 12, 10),
            Block.makeCuboidShape(10, 12, 10, 9, 15, 9),
            Block.makeCuboidShape(8, 9, 9, 7, 16, 8)
    );
    private static final VoxelShape SHAPE_S = VoxelShapes.or(
            Block.makeCuboidShape(3, 0, 4, 4, 4, 8),
            Block.makeCuboidShape(4, 0, 3, 10, 5, 9),
            Block.makeCuboidShape(10, 0, 5, 11, 7, 7),
            Block.makeCuboidShape(5, 4, 4, 10, 9, 8),
            Block.makeCuboidShape(6, 8, 5, 8, 13, 7),
            Block.makeCuboidShape(8, 8, 5, 9, 12, 6),
            Block.makeCuboidShape(6, 12, 6, 7, 15, 7),
            Block.makeCuboidShape(8, 9, 7, 9, 16, 8)
    );
    private static final VoxelShape SHAPE_E = VoxelShapes.or(
            Block.makeCuboidShape(3, 0, 6, 9, 5, 12),
            Block.makeCuboidShape(4, 0, 12, 8, 4, 13),
            Block.makeCuboidShape(5, 0, 5, 7, 7, 6),
            Block.makeCuboidShape(4, 4, 6, 8, 9, 11),
            Block.makeCuboidShape(5, 8, 8, 7, 13, 10),
            Block.makeCuboidShape(5, 8, 7, 6, 12, 8),
            Block.makeCuboidShape(6, 12, 9, 7, 15, 10),
            Block.makeCuboidShape(7, 9, 7, 8, 16, 8)
    );
    private static final VoxelShape SHAPE_W = VoxelShapes.or(
            Block.makeCuboidShape(13, 0, 10, 7, 5, 4),
            Block.makeCuboidShape(12, 0, 4, 8, 4, 3),
            Block.makeCuboidShape(11, 0, 11, 9, 7, 10),
            Block.makeCuboidShape(12, 4, 10, 8, 9, 5),
            Block.makeCuboidShape(11, 8, 8, 9, 13, 6),
            Block.makeCuboidShape(11, 8, 9, 10, 12, 8),
            Block.makeCuboidShape(10, 12, 7, 9, 15, 6),
            Block.makeCuboidShape(9, 9, 9, 8, 16, 8)
    );

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING)) {
            case SOUTH:
                return SHAPE_S;
            case NORTH:
            default:
                return SHAPE_N;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    public IFluidState getFluidState(BlockState state) {
        return state.get(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
    }
    public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
        return true;
    }
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.get(BlockStateProperties.WATERLOGGED)) {
            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
        }
        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING, BlockStateProperties.WATERLOGGED);
    }

}
