
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint;

import net.minecraft.nbt.CompoundTag;

public record BlueprintDefinition(
        String id,
        String author,
        int version,
        CompoundTag structureData
) {
    public CompoundTag save() {
        CompoundTag tag = new CompoundTag();
        tag.putString("id", id);
        tag.putString("author", author);
        tag.putInt("version", version);
        tag.put("structure", structureData.copy());
        return tag;
    }

    public static BlueprintDefinition load(CompoundTag tag) {
        return new BlueprintDefinition(
                tag.getString("id"),
                tag.getString("author"),
                tag.getInt("version"),
                tag.getCompound("structure")
        );
    }
}



 */