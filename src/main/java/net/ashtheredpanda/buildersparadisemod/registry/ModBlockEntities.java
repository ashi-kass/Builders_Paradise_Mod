package net.ashtheredpanda.buildersparadisemod.registry;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.oldgpt.block.placeholder.PlaceholderBlockEntity;
import net.ashtheredpanda.buildersparadisemod.oldgpt.block.station.BuilderStationBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BuildersParadiseMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<BuilderStationBlockEntity>> BUILDERSTATION_BE =
            BLOCK_ENTITIES.register("builderstation_blockentity", () ->
                    BlockEntityType.Builder.of(BuilderStationBlockEntity::new,
                            ModBlocks.BUILDERSTATION_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<PlaceholderBlockEntity>> PLACEHOLDER_BE =
            BLOCK_ENTITIES.register("placeholder_blockentity", () ->
                    BlockEntityType.Builder.of(PlaceholderBlockEntity::new,
                            ModBlocks.PLACEHOLDER_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
