/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class BlueprintItemUtil {

    public static void setBlueprint(ItemStack stack, ResourceLocation id) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.putString("Blueprint", id.toString());
    }

    public static ResourceLocation getBlueprint(ItemStack stack) {
        CompoundTag tag = stack.getTag();
        return tag != null && tag.contains("Blueprint")
                ? new ResourceLocation(tag.getString("Blueprint"))
                : null;
    }
}
*/
