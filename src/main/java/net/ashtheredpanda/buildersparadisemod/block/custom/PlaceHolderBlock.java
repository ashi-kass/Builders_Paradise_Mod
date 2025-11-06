package net.ashtheredpanda.buildersparadisemod.block.custom;

import net.ashtheredpanda.buildersparadisemod.BuildersParadiseMod;
import net.ashtheredpanda.buildersparadisemod.block.entity.PlaceHolderBlockEntity;
import net.ashtheredpanda.buildersparadisemod.item.custom.BlueprintItem;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
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
import org.jetbrains.annotations.Nullable;

public class PlaceHolderBlock extends BaseEntityBlock {

    // Class Properties
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    // Constructor
    public PlaceHolderBlock(Properties pProperties) {
        super(pProperties);
    }

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
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if (entity instanceof PlaceHolderBlockEntity) {
                if (pHand == InteractionHand.MAIN_HAND && pPlayer.getItemInHand(pHand).getItem() instanceof BlueprintItem) {
                    ((PlaceHolderBlockEntity) entity).textureName = BlueprintItem.getTextureName();
                    //ResourceLocation.fromNamespaceAndPath(BuildersParadiseMod.MOD_ID, ((PlaceHolderBlockEntity) entity).textureName);
                    pPlayer.sendSystemMessage(Component.translatable(((PlaceHolderBlockEntity) entity).textureName));
                    pPlayer.sendSystemMessage(Component.translatable("Placeholder block changed"));
                }
            } else {
                throw new IllegalStateException("Something Went Wrong!");
            }
        }
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new PlaceHolderBlockEntity(pPos, pState);
    }
}
