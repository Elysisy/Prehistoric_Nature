package com.github.aechtrob.prehistoricnature.world.gen;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import com.github.aechtrob.prehistoricnature.world.features.ModConfiguredFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacements {

    public static final PlacedFeature LEPIDODENDRON_TREE_PLACED = PlacementUtils.register("lepidodendron_tree_placement",
            ModConfiguredFeatures.LEPIDODENDRON.placed(RarityFilter.onAverageOnceEvery(12),
            InSquarePlacement.spread(),
            //PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
            PlacementUtils.HEIGHTMAP_TOP_SOLID,
            BiomeFilter.biome()));

}
