
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.block.placeholder;

import net.ashtheredpanda.buildersparadisemod.oldgpt.blueprint.BlueprintInstance;
import net.ashtheredpanda.buildersparadisemod.oldgpt.data.BlueprintSavedData;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class PlaceholderBlock extends Block {

    public PlaceholderBlock(Properties props) {
        super(props);
    }

    @Override
    public void onPlace(
            BlockState state,
            Level level,
            BlockPos pos,
            BlockState oldState,
            boolean moving
    ) {
        if (level.isClientSide || !(level instanceof ServerLevel server)) return;

        BlueprintSavedData data = BlueprintSavedData.get(server);

        // Create instance WITHOUT using block position as identity
        BlueprintInstance inst = data.create(
                "example_blueprint",
                pos
        );

        // Optional per-instance metadata
        inst.customData.putString("placedBy", "system");

        data.setDirty();
    }
}

 */