package net.ashtheredpanda.buildersparadisemod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class PlaceHolderBlockEntity extends BlockEntity{

    // Fields
    public String textureName = "placeholder_block_off";

    public PlaceHolderBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.PLACEHOLDER_BE.get(), pPos, pBlockState);
    }
}
