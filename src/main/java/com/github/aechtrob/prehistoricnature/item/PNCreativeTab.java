package com.github.aechtrob.prehistoricnature.item;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PNCreativeTab {
    public static final CreativeModeTab PN_PLANTS = new CreativeModeTab("PNPlantsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.LEPIDODENDRON_SAPLING.get().asItem());
        }
    };

    public static final CreativeModeTab PN_STATIC = new CreativeModeTab("PNStaticTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEPIDOPTERIS_SEED.get());
        }
    };
}
