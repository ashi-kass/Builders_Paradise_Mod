package net.ashtheredpanda.buildersparadisemod.item.custom;

import net.ashtheredpanda.buildersparadisemod.item.ModItems;
import net.ashtheredpanda.buildersparadisemod.util.InventoryUtil;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class PlaceHolderItem extends Item {
    public PlaceHolderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {

        if (pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();

            if(InventoryUtil.hasPlayerStackInInventory(Objects.requireNonNull(player), ModItems.BLUEPRINT_ITEM.get())) {
                addDatatoBlueprint(player);
            }
        }

        return InteractionResult.SUCCESS;
    }

    private void addDatatoBlueprint(Player player) {
        ItemStack Blueprint = player.getInventory().getItem(InventoryUtil.getInventoryIndex(player, ModItems.BLUEPRINT_ITEM.get()));

        CompoundTag data = new CompoundTag();
        data.putString("buildersparadise.Blueprint_BID", "ID");
        data.putString("buildersparadise.Blueprint_BHitBox", "HitBox");
        data.putString("buildersparadise.Blueprint_BFunctionality", "Functionality");
        data.putString("buildersparadise.Blueprint_BDescription", "Description");

        Blueprint.setTag(data);
    }
}
