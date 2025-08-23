package net.ashtheredpanda.buildersparadisemod.datagen;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.block.ModBlocks;
import net.ashtheredpanda.buildersparadisemod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BuildersParadiseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.BUILDERSTATION_BLOCK.get());

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
