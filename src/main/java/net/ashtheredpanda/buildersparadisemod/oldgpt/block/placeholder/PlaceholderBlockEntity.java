
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.block.placeholder;

import net.ashtheredpanda.buildersparadisemod.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint.BlueprintInstance;
import net.minecraft.world.level.block.state.BlockState;

public class PlaceholderBlockEntity extends BlockEntity {

    private BlueprintInstance instance;

    public PlaceholderBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PLACEHOLDER_BE.get(), pos, state);
    }

    public void setInstance(BlueprintInstance inst) {
        this.instance = inst;
        setChanged();
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        if (instance != null) {
            tag.put("BlueprintInstance", instance.save());
        }
    }

    @Override
    public void load(CompoundTag tag) {
        if (tag.contains("BlueprintInstance")) {
            instance = BlueprintInstance.load(tag.getCompound("BlueprintInstance"));
        }
    }
}

 */


