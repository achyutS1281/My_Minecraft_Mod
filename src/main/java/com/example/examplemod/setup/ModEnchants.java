package com.example.examplemod.setup;

import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArrowItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraftforge.fml.RegistryObject;

public class ModEnchants {



    public static Enchantment opDamageEnchant = new DamageEnchantment(Enchantment.Rarity.VERY_RARE, 3867287, EquipmentSlotType.MAINHAND);
    public static class opDamageEnchant extends Enchantment{

        public opDamageEnchant() {

            super(Rarity.VERY_RARE, EnchantmentType.WEAPON, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND});
            super.getDamageBonus(654675, CreatureAttribute.UNDEAD);

        }
        @Override
        public void doPostAttack(LivingEntity user, Entity target, int level) {
            LightningBoltEntity lightningBoltEntity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, target.getCommandSenderWorld());
            lightningBoltEntity.moveTo(target.position());
            target.getCommandSenderWorld().addFreshEntity(lightningBoltEntity);
            target.hurt(DamageSource.LIGHTNING_BOLT, 437482);
            user.setInvulnerable(true);

            user.setNoActionTime(3);

            user.setHealth(20);
            user.setInvulnerable(false);
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();

            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();


        }




    }
    public static class summonEnchant extends Enchantment{

        protected summonEnchant(Rarity p_i46731_1_, EnchantmentType p_i46731_2_, EquipmentSlotType[] p_i46731_3_) {
            super(Rarity.VERY_RARE, EnchantmentType.DIGGER, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND});

        }

        @Override
        public void doPostAttack(LivingEntity p_151368_1_, Entity p_151368_2_, int p_151368_3_) {
            p_151368_1_.getCommandSenderWorld().addFreshEntity(new Entity(EntityType.IRON_GOLEM, p_151368_1_.getCommandSenderWorld()) {

                protected void defineSynchedData() {

                }


                protected void readAdditionalSaveData(CompoundNBT p_70037_1_) {

                }


                protected void addAdditionalSaveData(CompoundNBT p_213281_1_) {

                }


                public IPacket<?> getAddEntityPacket() {
                    return null;
                }
            });
        }
    }
    public static Enchantment opDamageBowEnchant = new DamageEnchantment(Enchantment.Rarity.VERY_RARE, 3867287, EquipmentSlotType.MAINHAND);
    public static class opDamageBowEnchant extends Enchantment{

        public opDamageBowEnchant() {

            super(Rarity.VERY_RARE, EnchantmentType.BOW, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND});
            super.getDamageBonus(654675, CreatureAttribute.UNDEAD);


        }
        @Override
        public void doPostAttack(LivingEntity user, Entity target, int level) {
            Vector3d forward = user.getViewVector(0);

            LightningBoltEntity lightningBoltEntity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, target.getCommandSenderWorld());
            lightningBoltEntity.moveTo(target.position());
            target.getCommandSenderWorld().addFreshEntity(lightningBoltEntity);
            target.hurt(DamageSource.LIGHTNING_BOLT, 437482);
            user.getCommandSenderWorld().explode(target, target.position().x, target.position().y, target.position().z, 10, Explosion.Mode.DESTROY);
            user.setInvulnerable(true);
            user.moveTo(target.position());

            user.setNoActionTime(3);

            user.setHealth(20);
            user.setInvulnerable(false);
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();

            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();


        }




    }
    public static Enchantment aimBot = new DamageEnchantment(Enchantment.Rarity.VERY_RARE, 3867287, EquipmentSlotType.MAINHAND);
    public static class AimBot extends PiercingEnchantment{

        public AimBot() {

            super(Rarity.VERY_RARE,new EquipmentSlotType[] {EquipmentSlotType.MAINHAND});
            super.getDamageBonus(654675, CreatureAttribute.UNDEAD);


        }
        @Override
        public void doPostAttack(LivingEntity user, Entity target, int level) {
            Vector3d forward = user.getViewVector(0);

            LightningBoltEntity lightningBoltEntity = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, target.getCommandSenderWorld());
            lightningBoltEntity.moveTo(target.position());
            target.getCommandSenderWorld().addFreshEntity(lightningBoltEntity);
            target.hurt(DamageSource.LIGHTNING_BOLT, 437482);
            user.getCommandSenderWorld().explode(target, target.position().x, target.position().y, target.position().z, 10, Explosion.Mode.DESTROY);
            user.setInvulnerable(true);
            user.moveTo(target.position());

            user.setNoActionTime(3);

            user.setHealth(20);
            user.setInvulnerable(false);
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();

            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();
            user.clearFire();


        }




    }

    
    public static final RegistryObject<Enchantment> openchant = Registration.Enchants.register("bursting_energy", () -> new opDamageEnchant());
    public static final RegistryObject<Enchantment> summonEnchant = Registration.Enchants.register("iron_protector", () -> new summonEnchant(Enchantment.Rarity.VERY_RARE, EnchantmentType.DIGGER, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> opbowenchant = Registration.Enchants.register("blessing_of_artemis", () -> new opDamageBowEnchant());
    static void register(){}

}
