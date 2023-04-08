package com.example.examplemod.setup;

import com.google.gson.JsonObject;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.tags.ITag;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.ArmorItem;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nullable;
import javax.tools.Tool;
import java.awt.List;
import java.util.*;

public class ModItems {
    public static class newSwordItemTier implements IItemTier {
        @Override
        public  int getUses() {
            return 1000000;
        }

        @Override
        public  float getSpeed() {
            return 1000;
        }

        @Override
        public float getAttackDamageBonus() {
            return 1000000;
        }

        @Override
        public int getLevel() {
            return 200;
        }

        @Override
        public int getEnchantmentValue() {
            return 10000000;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
        }

    }
    public static class newArmorItemTier implements IArmorMaterial {


        @Override
        public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
            return 10000;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
            return 100000000;
        }

        @Override
        public int getEnchantmentValue() {
            return 100000000;
        }

        @Override
        public SoundEvent getEquipSound() {
            return null;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
        }

        @Override
        public String getName() {
            return "op_armor";
        }

        @Override
        public float getToughness() {
            return 100000000;
        }

        @Override
        public float getKnockbackResistance() {
            return 1000000000;
        }
    }
    public static class newToolItemTier implements IItemTier {


        @Override
        public int getUses() {
            return 1000000000;
        }

        @Override
        public float getSpeed() {
            return 1000000000;
        }

        @Override
        public float getAttackDamageBonus() {
            return 10000;
        }

        @Override
        public int getLevel() {
            return 1000000;
        }

        @Override
        public int getEnchantmentValue() {
            return 1000000;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    }
    public static class dragon_axe_recipe implements IRecipe {


        @Override
        public boolean matches(IInventory p_77569_1_, World p_77569_2_) {
            return false;
        }

        @Override
        public ItemStack assemble(IInventory p_77572_1_) {
            return null;
        }

        @Override
        public boolean canCraftInDimensions(int p_194133_1_, int p_194133_2_) {
            return false;
        }

        @Override
        public ItemStack getResultItem() {
            return new ItemStack(dragon_axe);
        }

        @Override
        public NonNullList<ItemStack> getRemainingItems(IInventory p_179532_1_) {
            return IRecipe.super.getRemainingItems(p_179532_1_);
        }

        @Override
        public NonNullList<Ingredient> getIngredients() {
            NonNullList<Ingredient> ingredients = NonNullList.create();
            ingredients.add(Ingredient.of(new ItemStack[]{new ItemStack(Items.DRAGON_BREATH, 3), new ItemStack(Items.STICK)}));
            return ingredients;
        }

        @Override
        public boolean isSpecial() {
            return IRecipe.super.isSpecial();
        }

        @Override
        public String getGroup() {
            return IRecipe.super.getGroup();
        }

        @Override
        public ItemStack getToastSymbol() {
            return IRecipe.super.getToastSymbol();
        }

        @Override
        public ResourceLocation getId() {
            return null;
        }

        @Override
        public IRecipeSerializer<?> getSerializer() {
            return null;
        }

        @Override
        public IRecipeType<?> getType() {
            return null;
        }
    }
    public static class dragon_serializer implements IRecipeSerializer<IRecipe<?>>{


        @Override
        public IRecipe<?> fromJson(ResourceLocation p_199425_1_, JsonObject p_199425_2_) {
            return new dragon_axe_recipe();
        }

        @Nullable
        @Override
        public IRecipe<?> fromNetwork(ResourceLocation p_199426_1_, PacketBuffer p_199426_2_) {
            return new dragon_axe_recipe();
        }

        @Override
        public void toNetwork(PacketBuffer p_199427_1_, IRecipe<?> p_199427_2_) {

        }


        @Override
        public IRecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return null;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ResourceLocation.of("dragon_axe_recipe", 'd');
        }

        @Override
        public Class<IRecipeSerializer<?>> getRegistryType() {
            return null;
        }
    }


    public static SwordItem OPSword = new SwordItem(new newSwordItemTier(),7, 7, new Item.Properties().defaultDurability(1000000).tab(ItemGroup.TAB_COMBAT));
    public static final RegistryObject<Item> OPSWORD = Registration.Items.register("test_sword", () ->
            new SwordItem(new newSwordItemTier(), 7, 7, new SwordItem.Properties().tab(ItemGroup.TAB_COMBAT).durability(100000)));
    public static final RegistryObject<Item> Opsword = Registration.Items.register("op_sword", () -> OPSword);
    public static AxeItem OPAxe = new AxeItem(new newSwordItemTier(), 7, 7, new Item.Properties().defaultDurability(1000000).tab(ItemGroup.TAB_TOOLS));
    public static final RegistryObject<Item> Opaxe = Registration.Items.register("op_axe", () -> OPAxe);
    public static Item OPHelmet = new ArmorItem(new newArmorItemTier(), EquipmentSlotType.HEAD, new Item.Properties().defaultDurability(100000000).tab(ItemGroup.TAB_COMBAT));
    public static Item OPChest = new ArmorItem(new newArmorItemTier(), EquipmentSlotType.CHEST, new Item.Properties().defaultDurability(100000000).tab(ItemGroup.TAB_COMBAT));
    public static Item OPlegs = new ArmorItem(new newArmorItemTier(), EquipmentSlotType.LEGS, new Item.Properties().defaultDurability(100000000).tab(ItemGroup.TAB_COMBAT));
    public static Item OPBoots = new ArmorItem(new newArmorItemTier(), EquipmentSlotType.FEET, new Item.Properties().defaultDurability(100000000).tab(ItemGroup.TAB_COMBAT));
    public static final RegistryObject<Item> Ophelm = Registration.Items.register("op_helmet.json", () -> OPHelmet);
    public static final RegistryObject<Item> Opchest = Registration.Items.register("op_chestplate", () -> OPChest);
    public static final RegistryObject<Item> Oplegs = Registration.Items.register("op_leggings", () -> OPlegs);
    public static final RegistryObject<Item> Opboot = Registration.Items.register("op_boots", () -> OPBoots);
    public static PickaxeItem OPPick = new PickaxeItem(new newToolItemTier(), 7, 7, new Item.Properties().defaultDurability(576523543).addToolType(ToolType.PICKAXE, 200000).tab(ItemGroup.TAB_TOOLS));
    public static final RegistryObject<Item> Oppick = Registration.Items.register("op_pickaxe", () -> OPPick);
    public static HoeItem OPHoe = new HoeItem(new newToolItemTier(), 7, 7, new Item.Properties().defaultDurability(576523543).addToolType(ToolType.HOE, 200000).tab(ItemGroup.TAB_TOOLS));
    public static final RegistryObject<Item> Ophoe = Registration.Items.register("op_hoe", () -> OPHoe);
    public static SwordItem Lightsaber = new SwordItem(new newSwordItemTier(),7, 7, new Item.Properties().defaultDurability(1000000).tab(ItemGroup.TAB_COMBAT));
    public static final RegistryObject<Item> lightsaber = Registration.Items.register("lightsaber", () -> Lightsaber);
    public static PotionItem opPotion = new PotionItem(new Item.Properties().tab(ItemGroup.TAB_BREWING));
    public static final RegistryObject<Item> oppotion = Registration.Items.register("op_potion", () -> opPotion);
    public static Material swordmaterial = Material.FIRE;
    public static SwordItem FlameSword = new ItemExampleWeapon("example_sword", Material.FIRE);
    public static final RegistryObject<Item> flamesword = Registration.Items.register("flame_sword", FlameSword.delegate);
    public static AxeItem dragon_axe = new ItemExampleTool("mega_axe", Material.EXPLOSIVE);
    public static final RegistryObject<Item> Dragon_axe = Registration.Items.register("dragon_axe", dragon_axe.delegate);
   /*  public static final RegistryObject<IRecipeSerializer<?>> axerecip = Registration.Recipes.register("dragon_axe_recipe", new dragon_serializer());
    */
    public static BowItem aimbot_bow = new Aimbotbow("posessed_bow", Material.EXPLOSIVE);
    public static final RegistryObject<Item> Aimbot_bow = Registration.Items.register("aimbot_bow", aimbot_bow.delegate);
    static void register(){}

}
