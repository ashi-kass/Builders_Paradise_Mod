
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint;

import com.google.gson.*;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class BlueprintCodec implements JsonDeserializer<Blueprint> {

    @Override
    public Blueprint deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
        JsonObject obj = json.getAsJsonObject();

        ResourceLocation id = new ResourceLocation(obj.get("id").getAsString());

        JsonObject sizeObj = obj.getAsJsonObject("size");
        BlockPos size = new BlockPos(
                sizeObj.get("x").getAsInt(),
                sizeObj.get("y").getAsInt(),
                sizeObj.get("z").getAsInt()
        );

        Map<BlockPos, ResourceLocation> blocks = new HashMap<>();
        JsonArray arr = obj.getAsJsonArray("blocks");
        for (JsonElement e : arr) {
            JsonObject b = e.getAsJsonObject();
            BlockPos pos = new BlockPos(
                    b.get("x").getAsInt(),
                    b.get("y").getAsInt(),
                    b.get("z").getAsInt()
            );
            blocks.put(pos, new ResourceLocation(b.get("block").getAsString()));
        }

        return new Blueprint(id, size, blocks);
    }
}



 */