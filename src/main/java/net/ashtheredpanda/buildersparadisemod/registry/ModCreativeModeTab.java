package net.ashtheredpanda.buildersparadisemod.registry;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuildersParadiseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BUILDERSPARADISE_TAB =  CREATIVE_MODE_TABS.register("buildersparadise_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BUILDERSTATION_BLOCK.get()))
                    .title(Component.translatable("creativetab.buildersparadise_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.BUILDERSTATION_BLOCK.get());
                        output.accept(ModBlocks.PLACEHOLDER_BLOCK.get());

                        output.accept(ModItems.PLACEHOLDER_ITEM.get());
                        output.accept(ModItems.BLUEPRINT_ITEM.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
