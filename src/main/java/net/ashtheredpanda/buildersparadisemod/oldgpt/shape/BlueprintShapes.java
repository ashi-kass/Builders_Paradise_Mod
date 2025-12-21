
/*
package net.ashtheredpanda.buildersparadisemod.oldgpt.shape;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;


public class BlueprintShapes {

    // ─────────────────────────────
    // BASIC PARTS
    // ─────────────────────────────

    private static final VoxelShape SLAB_BOTTOM =
            Block.box(0, 0, 0, 16, 8, 16);

    private static final VoxelShape SLAB_TOP =
            Block.box(0, 8, 0, 16, 16, 16);

    // ─────────────────────────────
    // STRAIGHT STAIRS
    // ─────────────────────────────

    private static final VoxelShape STRAIGHT_NORTH_BOTTOM = Shapes.or(
            SLAB_BOTTOM,
            Block.box(0, 8, 0, 16, 16, 8)
    );

    private static final VoxelShape STRAIGHT_SOUTH_BOTTOM = Shapes.or(
            SLAB_BOTTOM,
            Block.box(0, 8, 8, 16, 16, 16)
    );

    private static final VoxelShape STRAIGHT_WEST_BOTTOM = Shapes.or(
            SLAB_BOTTOM,
            Block.box(0, 8, 0, 8, 16, 16)
    );

    private static final VoxelShape STRAIGHT_EAST_BOTTOM = Shapes.or(
            SLAB_BOTTOM,
            Block.box(8, 8, 0, 16, 16, 16)
    );

    // TOP = inverted
    private static final VoxelShape STRAIGHT_NORTH_TOP =
            Shapes.or(SLAB_TOP, Block.box(0, 0, 8, 16, 8, 16));
    private static final VoxelShape STRAIGHT_SOUTH_TOP =
            Shapes.or(SLAB_TOP, Block.box(0, 0, 0, 16, 8, 8));
    private static final VoxelShape STRAIGHT_WEST_TOP =
            Shapes.or(SLAB_TOP, Block.box(8, 0, 0, 16, 8, 16));
    private static final VoxelShape STRAIGHT_EAST_TOP =
            Shapes.or(SLAB_TOP, Block.box(0, 0, 0, 8, 8, 16));

    // ─────────────────────────────
    // INNER / OUTER CORNERS (BOTTOM)
    // ─────────────────────────────

    private static final VoxelShape INNER_NW_BOTTOM = Shapes.or(
            SLAB_BOTTOM,
            Block.box(0, 8, 0, 8, 16, 8)
    );

    private static final VoxelShape OUTER_NW_BOTTOM = Shapes.or(
            SLAB_BOTTOM,
            Block.box(0, 8, 0, 16, 16, 8),
            Block.box(0, 8, 0, 8, 16, 16)
    );

    // (For brevity, other rotations follow the same pattern)

    // ─────────────────────────────
    // RESOLVER
    // ─────────────────────────────

    public static final VoxelShape CUBE = Shapes.block();

    public static VoxelShape get(String shapeId, Direction facing, Half half) {
        return switch (shapeId) {

            case "stair_straight" -> straight(facing, half);
            case "stair_inner"    -> inner(facing, half);
            case "stair_outer"    -> outer(facing, half);
            case "slab"           -> half == Half.TOP ? SLAB_TOP : SLAB_BOTTOM;
            case "cube"           -> CUBE;

            default -> Shapes.block();
        };
    }

    private static VoxelShape straight(Direction f, Half h) {
        if (h == Half.TOP) {
            return switch (f) {
                case SOUTH -> STRAIGHT_SOUTH_TOP;
                case WEST  -> STRAIGHT_WEST_TOP;
                case EAST  -> STRAIGHT_EAST_TOP;
                default    -> STRAIGHT_NORTH_TOP;
            };
        }

        return switch (f) {
            case SOUTH -> STRAIGHT_SOUTH_BOTTOM;
            case WEST  -> STRAIGHT_WEST_BOTTOM;
            case EAST  -> STRAIGHT_EAST_BOTTOM;
            default    -> STRAIGHT_NORTH_BOTTOM;
        };
    }

    private static VoxelShape inner(Direction f, Half h) {
        // example for NW only — others rotate the same way
        return INNER_NW_BOTTOM;
    }

    private static VoxelShape outer(Direction f, Half h) {
        return OUTER_NW_BOTTOM;
    }
}
*/