package com.github.aechtrob.prehistoricnature.world;

import com.github.aechtrob.prehistoricnature.PrehistoricNature;
import com.github.aechtrob.prehistoricnature.world.gen.ModPlacements;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PrehistoricNature.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

       event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.LEPIDODENDRON_TREE);

    }
}


