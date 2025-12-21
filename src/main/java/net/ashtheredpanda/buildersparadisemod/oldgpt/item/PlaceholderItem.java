/*

package net.ashtheredpanda.buildersparadisemod.oldgpt.item;


import net.ashtheredpanda.buildersparadisemod.oldgpt.block.placeholder.PlaceholderBlockEntity;
import net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint.BlueprintInstance;
import net.ashtheredpanda.buildersparadisemod.oldgpt.util.BlueprintItemUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;

public class PlaceholderItem extends Item {

    public PlaceholderItem(Item.Properties properties) {
        super(properties);

    }

    public static InteractionResult use(Level level, BlockPos pos, Player player, ItemStack stack) {
        ResourceLocation bp = BlueprintItemUtil.getBlueprint(stack);
        if (bp == null) return InteractionResult.FAIL;

        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof PlaceholderBlockEntity pbe) {
            BlueprintInstance inst = new BlueprintInstance();
            inst.blueprintId = bp.toString();
            inst.origin = pos;
            pbe.setInstance(inst);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.FAIL;
    }
}


 */
