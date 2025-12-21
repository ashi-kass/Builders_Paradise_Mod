package net.ashtheredpanda.buildersparadisemod.registry;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.oldgpt.item.BlueprintItem;
import net.ashtheredpanda.buildersparadisemod.oldgpt.item.PlaceholderItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BuildersParadiseMod.MOD_ID);

    public static final RegistryObject<Item> PLACEHOLDER_ITEM = ITEMS.register("placeholder_item",
            () -> new PlaceholderItem(new Item.Properties()));

    public static final RegistryObject<Item> BLUEPRINT_ITEM = ITEMS.register("blueprint_item",
            () -> new BlueprintItem(new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
