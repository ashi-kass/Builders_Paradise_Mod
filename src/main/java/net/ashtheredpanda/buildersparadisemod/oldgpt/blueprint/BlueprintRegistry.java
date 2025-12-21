
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint;

import net.minecraft.nbt.CompoundTag;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class BlueprintRegistry {

    private static final Map<String, CompoundTag> BLUEPRINTS = new HashMap<>();

    public static void register(String id, CompoundTag definition) {
        BLUEPRINTS.put(id, definition);
    }

    public static CompoundTag get(String id) {
        return BLUEPRINTS.get(id);
    }

    public static Set<String> keys() {
        return BLUEPRINTS.keySet();
    }

    public static CompoundTag exportAll() {
        CompoundTag out = new CompoundTag();
        for (var e : BLUEPRINTS.entrySet()) {
            out.put(e.getKey(), e.getValue());
        }
        return out;
    }

    public static void importAll(CompoundTag tag) {
        for (String key : tag.getAllKeys()) {
            BLUEPRINTS.put(key, tag.getCompound(key));
        }
    }
}

*/