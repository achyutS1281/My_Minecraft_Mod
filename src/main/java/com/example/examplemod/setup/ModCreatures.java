package com.example.examplemod.setup;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.data.DataGenerator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShootableItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.WorldGenTickList;
import net.minecraftforge.entity.PartEntity;

import javax.annotation.Nullable;

public class ModCreatures {

    public static class baby_dragon extends EnderDragonEntity{

        public baby_dragon(EntityType<? extends EnderDragonEntity> p_i50230_1_, World p_i50230_2_) {
            super(EntityType.ENDER_DRAGON, p_i50230_2_);
            World world = super.getCommandSenderWorld();


        }
        public void onCrystalDestroyed(EnderCrystalEntity crystalEntity, BlockPos pos, DamageSource damageSource){

        }

        @Override
        public boolean canRiderInteract() {
            return true;
        }

        @Override
        public boolean isBaby() {
            return true;
        }

        @Override
        public boolean canBeControlledByRider() {
            return true;
        }

        @Override
        public boolean canFireProjectileWeapon(ShootableItem p_230280_1_) {
            return true;
        }

        @Override
        public boolean canBreatheUnderwater() {
            return true;
        }

        @Override
        public boolean fireImmune() {
            return true;
        }

        @Override
        public boolean displayFireAnimation() {
            return false;
        }

        @Override
        public boolean canBeLeashed(PlayerEntity p_184652_1_) {
            return true;
        }

    }


    static void register(){

    }
}
