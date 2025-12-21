
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;

import java.util.UUID;

public class BlueprintInstance {
    public UUID instanceId;
    public String blueprintId;

    public BlockPos anchor; // mutable placement anchor
    public CompoundTag customData;
    public BlockPos origin;

    public BlueprintInstance(String blueprintId, BlockPos anchor) {
        this.instanceId = UUID.randomUUID();
        this.blueprintId = blueprintId;
        this.anchor = anchor;
        this.customData = new CompoundTag();
    }

    public BlueprintInstance(UUID id, String blueprintId, BlockPos anchor, CompoundTag data) {
        this.instanceId = id;
        this.blueprintId = blueprintId;
        this.anchor = anchor;
        this.customData = data;
    }

    public BlueprintInstance() {
        
    }

    public CompoundTag save() {
        CompoundTag tag = new CompoundTag();
        tag.putUUID("id", instanceId);
        tag.putString("blueprint", blueprintId);
        tag.putLong("anchor", anchor.asLong());
        tag.put("data", customData);
        return tag;
    }

    public static BlueprintInstance load(CompoundTag tag) {
        return new BlueprintInstance(
                tag.getUUID("id"),
                tag.getString("blueprint"),
                BlockPos.of(tag.getLong("anchor")),
                tag.getCompound("data")
        );
    }
}

 */