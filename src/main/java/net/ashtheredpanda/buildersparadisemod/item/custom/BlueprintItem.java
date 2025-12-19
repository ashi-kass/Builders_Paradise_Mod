package net.ashtheredpanda.buildersparadisemod.item.custom;

import net.ashtheredpanda.buildersparadisemod.block.entity.PlaceHolderBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class BlueprintItem extends Item {
    public BlueprintItem(Properties pProperties) {
        super(pProperties);
    }

    // Fields
    public String BTextureID;
    public String BHitBox;
    public String BFunctionalityData;
    public String BDescription;

    // Other Methods

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level pLevel, Player pPlayer, @NotNull InteractionHand pUsedHand) {

        if (pPlayer.getItemInHand(pUsedHand).hasTag()) {
            pPlayer.getItemInHand(pUsedHand).setTag(new CompoundTag());
        }

        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return pStack.hasTag();
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {

        if (pStack.hasTag() && pStack.getTag() != null) {
            String lastTextureID = pStack.getTag().getString("buildersparadise.Blueprint_BID");
            pTooltipComponents.add(Component.literal(lastTextureID));

            String lastHitBox = pStack.getTag().getString("buildersparadise.Blueprint_BHitBox");
            pTooltipComponents.add(Component.literal(lastHitBox));

            String lastFunctionality = pStack.getTag().getString("buildersparadise.Blueprint_BFunctionality");
            pTooltipComponents.add(Component.literal(lastFunctionality));

            String lastDescription = pStack.getTag().getString("buildersparadise.Blueprint_BDescription");
            pTooltipComponents.add(Component.literal(lastDescription));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {
        Level pWorld = pContext.getLevel();
        BlockPos pPos = pContext.getClickedPos();
        ItemStack pStack = pContext.getItemInHand();

        if (pStack.hasTag() && Objects.requireNonNull(pStack.getTag()).contains("buildersparadise.Blueprint_BID") && pStack.getTag().contains("buildersparadise.Blueprint_BHitBox") &&
                pStack.getTag().contains("buildersparadise.Blueprint_BFunctionality") && pStack.getTag().contains("buildersparadise.Blueprint_BDescription")) {
            BTextureID = pStack.getTag().getString("buildersparadise.Blueprint_BID");
            BHitBox = pStack.getTag().getString("buildersparadise.Blueprint_BHitBox");
            BFunctionalityData = pStack.getTag().getString("buildersparadise.Blueprint_BFunctionality");
            BDescription = pStack.getTag().getString("buildersparadise.Blueprint_BDescription");
        }

        BlockEntity blockentity = pWorld.getBlockEntity(pPos);

        if (blockentity instanceof PlaceHolderBlockEntity placeHolderBlockEntity) {
            placeHolderBlockEntity.setBlockTextureID(BTextureID);
            placeHolderBlockEntity.setBlockHitBox(BHitBox);
            placeHolderBlockEntity.setBlockFunctionalityData(BFunctionalityData);
            placeHolderBlockEntity.setBlockDescription(BDescription);

            blockentity.setChanged();
            pWorld.sendBlockUpdated(pPos, pWorld.getBlockState(pPos), pWorld.getBlockState(pPos), 3);

            if (pContext.getLevel().isClientSide()) {
                // Debug Messages
                Objects.requireNonNull(pContext.getPlayer()).sendSystemMessage(Component.literal(placeHolderBlockEntity.getBlockTextureID()));
                pContext.getPlayer().sendSystemMessage(Component.literal(placeHolderBlockEntity.getBlockHitBox()));
                pContext.getPlayer().sendSystemMessage(Component.literal(placeHolderBlockEntity.getBlockFunctionalityData()));
                pContext.getPlayer().sendSystemMessage(Component.literal(placeHolderBlockEntity.getBlockDescription()));
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
