
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.datagen;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BuildersParadiseMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BUILDERSTATION_BLOCK);

        placeholderBlock(ModBlocks.PLACEHOLDER_BLOCK);
    }

    private void placeholderBlock(RegistryObject<Block> blockRegistryObject) {
        getVariantBuilder(blockRegistryObject.get()).forAllStates(state ->  new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("placeholder_block",
                        ResourceLocation.fromNamespaceAndPath( BuildersParadiseMod.MOD_ID, "block/" + "placeholder_block")))

        });

        simpleBlockItem(blockRegistryObject.get(), models().cubeAll("placeholder_block",
                ResourceLocation.fromNamespaceAndPath( BuildersParadiseMod.MOD_ID, "block/" + "placeholder_block")));

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private String name(Block b) {
        return b.builtInRegistryHolder().key().location().getPath();
    }
}


 */