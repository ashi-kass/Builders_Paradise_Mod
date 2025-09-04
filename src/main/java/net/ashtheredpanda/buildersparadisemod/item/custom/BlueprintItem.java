package net.ashtheredpanda.buildersparadisemod.item.custom;

import net.ashtheredpanda.buildersparadisemod.block.custom.PlaceHolderBlock;
import net.ashtheredpanda.buildersparadisemod.block.entity.PlaceHolderBlockEntity;
import net.ashtheredpanda.buildersparadisemod.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class BlueprintItem extends Item {
    public BlueprintItem(Properties pProperties) {
        super(pProperties);
    }
    @NotNull
    public InteractionResult useOn(Level pLevel, BlockPos pPos) {
        if (pLevel.isClientSide()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if(blockEntity instanceof PlaceHolderBlockEntity) {
                ((PlaceHolderBlockEntity) blockEntity).textureName = "placeholder_block_on";
            } else {
                throw new IllegalStateException("This isnt a Placeholder Block");
            }
        }
        return InteractionResult.SUCCESS;
    }

    private boolean isPlaceholderBlock(BlockState blockstate) {
        return blockstate.is(ModTags.Blocks.BLOCK_IS_PLACEHOLDER);
    }

    private void outputPlaceholderFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.buildersparadise.blueprint_item.placeholder"));
    }

    private void outputNoPlaceholderFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.buildersparadise.blueprint_item.no_placeholder"));
    }
}
