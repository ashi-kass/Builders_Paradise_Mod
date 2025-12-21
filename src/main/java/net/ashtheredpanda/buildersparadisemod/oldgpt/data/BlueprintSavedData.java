/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.data;

import net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint.BlueprintInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BlueprintSavedData extends SavedData {

    private static final String DATA_NAME = "blueprint_instances";

    private final Map<UUID, BlueprintInstance> instances = new HashMap<>();

    public static BlueprintSavedData get(ServerLevel level) {
        return level.getDataStorage().computeIfAbsent(
                BlueprintSavedData::load,
                BlueprintSavedData::new,
                DATA_NAME
        );
    }

    public BlueprintSavedData() {}

    public static BlueprintSavedData load(CompoundTag tag) {
        BlueprintSavedData data = new BlueprintSavedData();
        var list = tag.getList("instances", 10);

        for (int i = 0; i < list.size(); i++) {
            BlueprintInstance inst = BlueprintInstance.load(list.getCompound(i));
            data.instances.put(inst.instanceId, inst);
        }
        return data;
    }

    @Override
    public CompoundTag save(CompoundTag tag) {
        var list = new net.minecraft.nbt.ListTag();
        for (BlueprintInstance inst : instances.values()) {
            list.add(inst.save());
        }
        tag.put("instances", list);
        return tag;
    }

    public BlueprintInstance create(String blueprintId, BlockPos anchor) {
        BlueprintInstance inst = new BlueprintInstance(blueprintId, anchor);
        instances.put(inst.instanceId, inst);
        setDirty();
        return inst;
    }

    public Collection<BlueprintInstance> all() {
        return instances.values();
    }
}

 */