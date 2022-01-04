package com.github.aechtrob.prehistoricnature.block;

import com.github.aechtrob.prehistoricnature.PrehistoricNature;
import com.github.aechtrob.prehistoricnature.block.PNblock.LepidodendronLogBlock;
import com.github.aechtrob.prehistoricnature.block.PNblock.LepidodendronStrobilusBlock;
import com.github.aechtrob.prehistoricnature.block.PNblock.LepidodendronWoodBlock;
import com.github.aechtrob.prehistoricnature.block.PNblock.LepidopterisBlock;
import com.github.aechtrob.prehistoricnature.block.customblock.PNLeavesBlock;
import com.github.aechtrob.prehistoricnature.block.customblock.PNLogBlock;
import com.github.aechtrob.prehistoricnature.block.customblock.PNPlanksBlock;
import com.github.aechtrob.prehistoricnature.item.ModItems;
import com.github.aechtrob.prehistoricnature.item.PNCreativeTab;
import com.github.aechtrob.prehistoricnature.world.features.tree.lepidodendron.LepidodendronTreeGrower;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PrehistoricNature.MOD_ID);

    public static final RegistryObject<SaplingBlock> LEPIDODENDRON_SAPLING = registerBlock("lepidodendron_sapling",
            () -> new SaplingBlock(new LepidodendronTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), PNCreativeTab.PN_PLANTS);
    public static final RegistryObject<LepidodendronLogBlock> LEPIDODENDRON_LOG = registerBlock("lepidodendron_log",
            () -> new LepidodendronLogBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), PNCreativeTab.PN_PLANTS);
    public static final RegistryObject<LepidodendronWoodBlock> LEPIDODENDRON_WOOD = registerBlock("lepidodendron_wood",
            () -> new LepidodendronWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), PNCreativeTab.PN_PLANTS);
    public static final RegistryObject<PNLogBlock> STRIPPED_LEPIDODENDRON_LOG = registerBlock("lepidodendron_log_stripped",
            () -> new PNLogBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), PNCreativeTab.PN_PLANTS);
    public static final RegistryObject<PNLogBlock> STRIPPED_LEPIDODENDRON_WOOD = registerBlock("lepidodendron_wood_stripped",
            () -> new PNLogBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), PNCreativeTab.PN_PLANTS);
    public static final RegistryObject<PNPlanksBlock> LEPIDODENDRON_PLANKS = registerBlock("lepidodendron_planks",
            () -> new PNPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), PNCreativeTab.PN_PLANTS);
    public static final RegistryObject<PNLeavesBlock> LEPIDODENDRON_LEAVES = registerBlock("lepidodendron_leaves",
            () -> new PNLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)), PNCreativeTab.PN_PLANTS);
    public static final RegistryObject<LepidodendronStrobilusBlock> LEPIDODENDRON_STROBILUS = registerBlock("lepidodendron_strobilus",
            () -> new LepidodendronStrobilusBlock(BlockBehaviour.Properties.copy(Blocks.GRASS)), PNCreativeTab.PN_PLANTS);

    public static final RegistryObject<LepidopterisBlock> LEPIDOPTERIS = registerBlock("lepidopteris",
            () -> new LepidopterisBlock(BlockBehaviour.Properties.copy(Blocks.FERN)), PNCreativeTab.PN_PLANTS);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
