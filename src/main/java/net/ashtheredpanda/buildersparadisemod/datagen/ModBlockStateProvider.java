package net.ashtheredpanda.buildersparadisemod.datagen;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.block.ModBlocks;
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
        getVariantBuilder(blockRegistryObject.get()).forAllStates(state -> {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("placeholder_block_on",
                        ResourceLocation.fromNamespaceAndPath(BuildersParadiseMod.MOD_ID, "block/" + "placeholder_block_on")))};

        });

        simpleBlockItem(blockRegistryObject.get(), models().cubeAll("",
                ResourceLocation.fromNamespaceAndPath(BuildersParadiseMod.MOD_ID, "block/" + "")));

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
