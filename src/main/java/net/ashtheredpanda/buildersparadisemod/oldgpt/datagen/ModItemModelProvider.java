/*

package net.ashtheredpanda.buildersparadisemod.oldgpt.datagen;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BuildersParadiseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PLACEHOLDER_ITEM);
        simpleItem(ModItems.BLUEPRINT_ITEM);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {

        return withExistingParent(item.getId().getPath(),
                String.valueOf(ResourceLocation.parse("item/generated"))).texture("layer0",
                        String.valueOf(ResourceLocation.fromNamespaceAndPath(BuildersParadiseMod.MOD_ID, "item/" + item.getId().getPath())));
    }

}


 */