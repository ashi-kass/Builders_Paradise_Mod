package net.ashtheredpanda.buildersparadisemod.item.custom;

import net.minecraft.world.item.Item;

public class BlueprintItem extends Item {
    public BlueprintItem(Properties pProperties) {
        super(pProperties);
    }

    // Fields
    public static String textureName = "placeholder_block_on";

    public static String getTextureName() {
        return textureName;
    }
//
//    @NotNull
//    public InteractionResult useOn(Level pLevel, BlockPos pPos) {
//        if (pLevel.isClientSide()) {
//            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
//            if(blockEntity instanceof PlaceHolderBlockEntity) {
//                ((PlaceHolderBlockEntity) blockEntity).textureName = "placeholder_block_on";
//            } else {
//                throw new IllegalStateException("This Block isn't a Placeholder Block");
//            }
//        }
//        return InteractionResult.SUCCESS;
//    }
}
