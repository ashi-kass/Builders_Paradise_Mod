package net.ashtheredpanda.buildersparadisemod.item.custom;

import net.ashtheredpanda.buildersparadisemod.block.entity.PlaceHolderBlockEntity;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class BlueprintItem extends Item {
    public BlueprintItem(Properties pProperties) {
        super(pProperties);
    }

    // fields
    public String textureID = "banana";
    public String blockDescription = "yummy";

    // getters
    public String getTextureName() {return this.textureID;}
    public String getBlockDescription() {return this.blockDescription;}

    // setters
    public void setTextureName(String TextureName) {textureID = TextureName;}
    public void setBlockDescription(String BlockDescription) {blockDescription = BlockDescription;}

    // Other Methods


    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

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
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {

        if (pStack.hasTag()) {
            String blueprint_BlockDescription = pStack.getTag().getString("buildersparadise.Blueprint_Block_Description");
            pTooltipComponents.add(Component.literal(blueprint_BlockDescription));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
    /*
    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {
        if (pContext.getLevel().isClientSide()) {
            Block blockEntity = pContext.getLevel().setBlock(pContext.getClickedPos());
            if (blockEntity instanceof PlaceHolderBlockEntity && Objects.requireNonNull(pContext.getPlayer()).getUsedItemHand() == InteractionHand.MAIN_HAND) {
                {
                    ((PlaceHolderBlockEntity) blockEntity).setJsonName(textureID);
                    ((PlaceHolderBlockEntity) blockEntity).setBlockDescription(blockDescription);
                }
            } else {
                Objects.requireNonNull(pContext.getPlayer()).sendSystemMessage(Component.translatable("it fucked up"));
            }
        }
        return InteractionResult.SUCCESS;
    }
*/

}
