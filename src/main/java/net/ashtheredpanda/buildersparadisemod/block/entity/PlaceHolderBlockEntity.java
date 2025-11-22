package net.ashtheredpanda.buildersparadisemod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class PlaceHolderBlockEntity extends BlockEntity{
    public PlaceHolderBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.PLACEHOLDER_BE.get(), pPos, pBlockState);
    }
/*
    // Fields
    public String jsonName = "placeholder_block_off";
    public String blockDescription = "Block Template";

    // Getters
    public String getJsonName() { return this.jsonName; }
    public String getBlockDescription() { return this.blockDescription; }

    // Setters
    public void setJsonName(String JsonName) { this.jsonName = JsonName; }
    public void setBlockDescription(String BlockDescription) { this.blockDescription = BlockDescription; }

    // Other Methods
*/
}
