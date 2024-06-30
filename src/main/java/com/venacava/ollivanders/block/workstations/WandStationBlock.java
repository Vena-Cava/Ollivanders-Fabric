package com.venacava.ollivanders.block.workstations;

import com.mojang.serialization.MapCodec;
import com.venacava.ollivanders.screen.WandCraftingScreenHandler;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;


public class WandStationBlock extends Block {
    public static final MapCodec<com.venacava.ollivanders.block.workstations.WandStationBlock> CODEC = com.venacava.ollivanders.block.workstations.WandStationBlock.createCodec(com.venacava.ollivanders.block.workstations.WandStationBlock::new);
    private static final Text TITLE = Text.translatable("container.ollivanders.wand_station");

    public MapCodec<? extends com.venacava.ollivanders.block.workstations.WandStationBlock> getCodec() {
        return CODEC;
    }

    public WandStationBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }
        player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
        return ActionResult.CONSUME;
    }

    @Override
    protected NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new WandCraftingScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos)), TITLE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0f, 0f, 0f, 1.0f, 1.0f, 1.0f);
    }

    // Load this class
    public static void registerWandStation() {
    }
}

