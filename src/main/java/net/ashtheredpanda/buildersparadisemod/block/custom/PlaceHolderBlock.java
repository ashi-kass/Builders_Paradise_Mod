package net.ashtheredpanda.buildersparadisemod.block.custom;

import net.ashtheredpanda.buildersparadisemod.block.ModBlocks;
import net.ashtheredpanda.buildersparadisemod.block.entity.PlaceHolderBlockEntity;
import net.ashtheredpanda.buildersparadisemod.item.ModItems;
import net.ashtheredpanda.buildersparadisemod.item.custom.BlueprintItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlaceHolderBlock extends BaseEntityBlock {


    // Class Fields
    public String jsonName = "placeholder_block_off";
    public String blockDescription = "Block Template";

    // Class Properties
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    // Constructor
    public PlaceHolderBlock(Properties pProperties) {
        super(pProperties);
    }

    // Field Getters
    public String getJsonName() { return this.jsonName; }
    public String getBlockDescription() { return this.blockDescription; }

    // Field Setters
    public void setJsonName(String JsonName) { this.jsonName = JsonName; }
    public void setBlockDescription(String BlockDescription) { this.blockDescription = BlockDescription; }

    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);

    public VoxelShape getShape() {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    /* PlaceHolder Block Entity */

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
    }

    @Override
    public @NotNull InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof PlaceHolderBlockEntity && pHand == InteractionHand.MAIN_HAND) {
                if (pPlayer.getItemInHand(InteractionHand.MAIN_HAND).is((ModItems.BLUEPRINT_ITEM.get()))) {

                    //pPlayer.sendSystemMessage(Component.translatable(((PlaceHolderBlockEntity) blockEntity).getJsonName()));

                    //pPlayer.sendSystemMessage(Component.translatable(((PlaceHolderBlockEntity) blockEntity).getBlockDescription()));
                    pPlayer.sendSystemMessage(Component.translatable("Placeholder Block Changed"));
                } else {
                    pPlayer.sendSystemMessage(Component.translatable("You Need To Use a Blueprint"));
                }
            } else {
                throw new IllegalStateException("Something Went Wrong!");
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new PlaceHolderBlockEntity(pPos, pState);
    }

}