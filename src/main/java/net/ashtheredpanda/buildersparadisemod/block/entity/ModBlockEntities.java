package net.ashtheredpanda.buildersparadisemod.block.entity;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BuildersParadiseMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<BuilderStationBlockEntity>> BUILDERSTATION_BE =
            BLOCK_ENTITIES.register("builderstation_be", () ->
                    BlockEntityType.Builder.of(BuilderStationBlockEntity::new,
                            ModBlocks.BUILDERSTATION_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
