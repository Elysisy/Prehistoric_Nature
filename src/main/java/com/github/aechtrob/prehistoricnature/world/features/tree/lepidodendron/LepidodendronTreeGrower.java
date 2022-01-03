package com.github.aechtrob.prehistoricnature.world.features.tree.lepidodendron;

import com.github.aechtrob.prehistoricnature.world.features.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class LepidodendronTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random p_60014_, boolean p_60015_) {
        return ModConfiguredFeatures.LEPIDODENDRON;
    }

}
