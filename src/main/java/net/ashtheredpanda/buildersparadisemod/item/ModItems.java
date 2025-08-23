package net.ashtheredpanda.buildersparadisemod.item;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.item.custom.BlueprintItem;
import net.ashtheredpanda.buildersparadisemod.item.custom.PlaceHolderItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BuildersParadiseMod.MOD_ID);

    public static final RegistryObject<Item> PLACEHOLDER_ITEM = ITEMS.register("placeholder_item",
            () -> new PlaceHolderItem(new Item.Properties()));

    public static final RegistryObject<Item> BLUEPRINT_ITEM = ITEMS.register("blueprint_item",
            () -> new BlueprintItem(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
