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

    // fields
    String textureName = "bananan";
    String blockDescription = "yummy";

    public String getTextureName() {
        return this.textureName;
    }
    public String getBlockDescription() {
        return this.blockDescription;
    }
    /*
    public String getTextureName() {
        return this.textureName;
    }
    public String getTextureName() {
        return this.textureName;
    }
    */
    public void setTextureName(String TextureName) {
        textureName = TextureName;
    }

    public void setBlockDescription(String BlockDescription) {
        blockDescription = BlockDescription;
    }

}
