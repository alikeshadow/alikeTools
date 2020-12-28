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

public class Stalactite extends HorizontalBlock implements IWaterLoggable {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    public Stalactite() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.5F, 6.0F)
        );
        setRegistryName("stalactite");
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(BlockStateProperties.WATERLOGGED, Boolean.FALSE));
    }
    private static final VoxelShape SHAPE_N = VoxelShapes.or(
            Block.makeCuboidShape(13.0D, 16.0D, 12.0D, 12.0D, 12.0D, 8.0D),
            Block.makeCuboidShape(12.0D, 16.0D, 13.0D, 6.0D, 11.0D, 7.0D),
            Block.makeCuboidShape(6.0D, 16.0D, 11.0D, 5.0D, 9.0D, 9.0D),
            Block.makeCuboidShape(11.0D, 12.0D, 12.0D, 6.0D, 7.0D, 8.0D),
            Block.makeCuboidShape(10.0D, 8.0D, 11.0D, 8.0D, 3.0D, 9.0D),
            Block.makeCuboidShape(8.0D, 8.0D, 11.0D, 7.0D, 4.0D, 10.0D),
            Block.makeCuboidShape(10.0D, 4.0D, 10.0D, 9.0D, 1.0D, 9.0D),
            Block.makeCuboidShape(8.0D, 7.0D, 9.0D, 7.0D, 0.0D, 8.0D)
    );
    private static final VoxelShape SHAPE_S = VoxelShapes.or(
            Block.makeCuboidShape(3.0D, 16.0D, 4.0D, 4.0D, 12.0D, 8.0D),
            Block.makeCuboidShape(4.0D, 16.0D, 3.0D, 10.0D, 11.0D, 9.0D),
            Block.makeCuboidShape(10.0D, 16.0D, 5.0D, 11.0D, 9.0D, 7.0D),
            Block.makeCuboidShape(5.0D, 12.0D, 4.0D, 10.0D, 7.0D, 8.0D),
            Block.makeCuboidShape(6.0D, 8.0D, 5.0D, 8.0D, 3.0D, 7.0D),
            Block.makeCuboidShape(8.0D, 8.0D, 5.0D, 9.0D, 4.0D, 6.0D),
            Block.makeCuboidShape(6.0D, 4.0D, 6.0D, 7.0D, 1.0D, 7.0D),
            Block.makeCuboidShape(8.0D, 7.0D, 7.0D, 9.0D, 0.0D, 8.0D)
    );
    private static final VoxelShape SHAPE_E = VoxelShapes.or(
            Block.makeCuboidShape(3.0D, 16.0D, 6.0D, 9.0D, 11.0D, 12.0D),
            Block.makeCuboidShape(4.0D, 16.0D, 12.0D, 8.0D, 12.0D, 13.0D),
            Block.makeCuboidShape(5.0D, 16.0D, 5.0D, 7.0D, 9.0D, 6.0D),
            Block.makeCuboidShape(4.0D, 12.0D, 6.0D, 8.0D, 7.0D, 11.0D),
            Block.makeCuboidShape(5.0D, 8.0D, 8.0D, 7.0D, 3.0D, 10.0D),
            Block.makeCuboidShape(5.0D, 8.0D, 7.0D, 6.0D, 4.0D, 8.0D),
            Block.makeCuboidShape(6.0D, 4.0D, 9.0D, 7.0D, 1.0D, 10.0D),
            Block.makeCuboidShape(7.0D, 7.0D, 7.0D, 8.0D, 0.0D, 8.0D)
    );
    private static final VoxelShape SHAPE_W = VoxelShapes.or(
            Block.makeCuboidShape(13.0D, 16.0D, 10.0D, 7.0D, 11.0D, 4.0D),
            Block.makeCuboidShape(12.0D, 16.0D, 4.0D, 8.0D, 12.0D, 3.0D),
            Block.makeCuboidShape(11.0D, 16.0D, 11.0D, 9.0D, 9.0D, 10.0D),
            Block.makeCuboidShape(12.0D, 12.0D, 10.0D, 8.0D, 7.0D, 5.0D),
            Block.makeCuboidShape(11.0D, 8.0D, 8.0D, 9.0D, 3.0D, 6.0D),
            Block.makeCuboidShape(11.0D, 8.0D, 9.0D, 10.0D, 4.0D, 8.0D),
            Block.makeCuboidShape(10.0D, 4.0D, 7.0D, 9.0D, 1.0D, 6.0D),
            Block.makeCuboidShape(9.0D, 7.0D, 9.0D, 8.0D, 0.0D, 8.0D)
    );

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch((Direction)state.get(FACING)) {
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
