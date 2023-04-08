package com.example.examplemod.setup;

import com.example.examplemod.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.CookingRecipeSerializer;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.RecipeBook;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraftforge.registries.*;


public class Registration {

    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
    public static final DeferredRegister<Block> Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
    public static final DeferredRegister<Enchantment> Enchants = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ExampleMod.MOD_ID);
    public static final DeferredRegister<EntityType<?>> Entities = DeferredRegister.create(ForgeRegistries.ENTITIES, ExampleMod.MOD_ID);
    public static final DeferredRegister<IRecipeSerializer<?>> Recipes = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ExampleMod.MOD_ID);
    public static void register(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        System.out.println("Items is:" + Items.getEntries().toString());
        Items.register(modEventBus);
        Blocks.register(modEventBus);
        Enchants.register(modEventBus);
        Recipes.register(modEventBus);
        Entities.register(modEventBus);
        ModItems.register();
        ModEnchants.register();
        ModBlocks.register();
        ModCreatures.register();

    }

}
