package net.ashtheredpanda.buildersparadisemod.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class PlaceHolderBlockEntity extends BlockEntity{
    public PlaceHolderBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.PLACEHOLDER_BE.get(), pPos, pBlockState);
    }

    // Fields
    private String BlockTextureID;
    private String BlockHitBox;
    private String BlockFunctionalityData;
    private String BlockDescription;

    // Setters
    public void setBlockTextureID(String textureID) { this.BlockTextureID = textureID; }
    public void setBlockHitBox(String hitBox) { this.BlockHitBox = hitBox; }
    public void setBlockFunctionalityData(String functionalityData) { this.BlockFunctionalityData = functionalityData; }
    public void setBlockDescription(String description) { this.BlockDescription = description; }

    // Getters
    public String getBlockTextureID() { return this.BlockTextureID; }
    public String getBlockHitBox() { return this.BlockHitBox; }
    public String getBlockFunctionalityData() { return this.BlockFunctionalityData; }
    public String getBlockDescription() { return this.BlockDescription; }

    // NBT Methods

    @Override
    protected void saveAdditional(@NotNull CompoundTag pTag) {
        super.saveAdditional(pTag);
        pTag.putString("SavedTextureID", this.BlockTextureID);
        pTag.putString("SavedHitBox", this.BlockHitBox);
        pTag.putString("SavedFunctionalityData", this.BlockFunctionalityData);
        pTag.putString("SavedDescription", this.BlockDescription);
    }

    @Override
    public void load(@NotNull CompoundTag pTag) {
        super.load(pTag);
        this.BlockTextureID = pTag.getString("SavedTextureID");
        this.BlockHitBox = pTag.getString("SavedHitBox");
        this.BlockFunctionalityData = pTag.getString("SavedFunctionalityData");
        this.BlockDescription = pTag.getString("SavedDescription");
    }
}
