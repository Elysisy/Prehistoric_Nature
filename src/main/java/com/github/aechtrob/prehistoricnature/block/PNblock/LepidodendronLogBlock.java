package com.github.aechtrob.prehistoricnature.block.PNblock;

import com.github.aechtrob.prehistoricnature.block.ModBlocks;
import com.github.aechtrob.prehistoricnature.block.customblock.PNLogBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class LepidodendronLogBlock extends PNLogBlock {
    public LepidodendronLogBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, Level world, BlockPos pos, Player player, ItemStack stack, ToolAction toolAction) {
        Block block = state.getBlock();
        if (block == ModBlocks.LEPIDODENDRON_LOG.get()) {
            switch (state.getValue(AXIS)){
                case Y:
                    return ModBlocks.STRIPPED_LEPIDODENDRON_LOG.get().defaultBlockState();
                case Z:
                    return ModBlocks.STRIPPED_LEPIDODENDRON_LOG.get().defaultBlockState().setValue(AXIS, Direction.Axis.Z);
                case X:
                    return ModBlocks.STRIPPED_LEPIDODENDRON_LOG.get().defaultBlockState().setValue(AXIS, Direction.Axis.X);
                default:
                    return ModBlocks.STRIPPED_LEPIDODENDRON_LOG.get().defaultBlockState();
            }
        } else {
            return super.getToolModifiedState(state, world, pos, player, stack, toolAction);
        }
    }
}
