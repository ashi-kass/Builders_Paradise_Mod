
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BlueprintManager {

    private static final Map<ResourceLocation, Blueprint> REGISTRY = new HashMap<>();
    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(Blueprint.class, new BlueprintCodec())
            .create();

    public static void load(MinecraftServer server) {
        REGISTRY.clear();

        server.getResourceManager()
                .listResources("blueprints", p -> p.getPath().endsWith(".json"))
                .forEach((id, res) -> {
                    try (var reader = new InputStreamReader(res.open())) {
                        Blueprint bp = GSON.fromJson(reader, Blueprint.class);
                        REGISTRY.put(bp.id(), bp);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }

    public static Blueprint get(ResourceLocation id) {
        return REGISTRY.get(id);
    }
}



 */