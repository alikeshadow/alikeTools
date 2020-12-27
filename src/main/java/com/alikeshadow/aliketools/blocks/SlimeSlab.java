package com.alikeshadow.aliketools.blocks;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class SlimeSlab extends SlabBlock {
    public SlimeSlab() {
        super(Properties.create(Material.CLAY)
                .sound(SoundType.SLIME)
                .slipperiness(0.8F)
        );
        setRegistryName("slimeslab");
    }
   // @Override
   // public BlockRenderLayer getRenderLayer() { return BlockRenderLayer.TRANSLUCENT; }

    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        if (entityIn.isCrouching()) {
            super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
        } else {
            entityIn.onLivingFall(fallDistance, 0.0F);
        }
    }
    public void onLanded(IBlockReader worldIn, Entity entityIn) {
        if (entityIn.isCrouching()) {
            super.onLanded(worldIn, entityIn);
        } else {
            Vector3d vec3d = entityIn.getMotion();
            if (vec3d.y < 0.0D) {
                double d0 = entityIn instanceof LivingEntity ? 1.0D : 0.8D;
                entityIn.setMotion(vec3d.x, -vec3d.y * d0, vec3d.z);
            }
        }
    }
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        double d0 = Math.abs(entityIn.getMotion().y);
        if (d0 < 0.1D && !entityIn.isCrouching()) {
            double d1 = 0.4D + d0 * 0.2D;
            entityIn.setMotion(entityIn.getMotion().mul(d1, 1.0D, d1));
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }
}