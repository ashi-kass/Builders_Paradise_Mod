
/*

package net.ashtheredpanda.buildersparadisemod.oldgpt.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class BlueprintItem extends Item {

    public BlueprintItem(Item.Properties properties) {
        super(properties);
    }

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