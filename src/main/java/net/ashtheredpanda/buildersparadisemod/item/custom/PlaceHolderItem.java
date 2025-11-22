package net.ashtheredpanda.buildersparadisemod.item.custom;

import net.ashtheredpanda.buildersparadisemod.util.ModTags;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class PlaceHolderItem extends Item {
    public PlaceHolderItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {

        if (pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState blockState = pContext.getLevel().getBlockState(positionClicked.below(i));

                if (isValuableBlock(blockState)) {
                    outputValuableCoordinates(positionClicked.below(i), Objects.requireNonNull(player), blockState.getBlock());
                    foundBlock = true;

                    break;
                }
            }

            if (!foundBlock) {
                outputNoValuableFound(Objects.requireNonNull(player));
            }
        }

        return InteractionResult.SUCCESS;
    }

    private void outputValuableCoordinates(BlockPos below, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Valuable Found " + I18n.get(block.getDescriptionId())
                + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")"));
    }

    private void outputNoValuableFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.buildersparadise.placeholder_item.no_valuables"));
    }

    private boolean isValuableBlock(BlockState blockstate) {
        return blockstate.is(ModTags.Blocks.METAL_DETECTOR_VALUABLES);
    }
}
