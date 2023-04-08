package com.example.examplemod.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> OP_ORE = register("op_ore", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(20).harvestLevel(3).sound(SoundType.ANCIENT_DEBRIS)));
    public static final RegistryObject<Block> OP_Block = register("op_block", () ->
            new Block(AbstractBlock.Properties.of(Material.STONE).strength(20).harvestLevel(3).sound(SoundType.METAL)));

    public static void register(){}
    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block){
        return Registration.Blocks.register(name, block);
    }
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.Items.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return ret;
    }
}
