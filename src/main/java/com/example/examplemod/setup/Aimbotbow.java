package com.example.examplemod.setup;

import com.sun.javafx.geom.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.LightningBoltRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

import net.minecraft.loot.conditions.Alternative;
import net.minecraft.loot.conditions.DamageSourceProperties;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.ServerWorldInfo;
import net.minecraftforge.event.entity.ProjectileImpactEvent;


import java.util.*;
import java.util.function.Predicate;


class Aimbotbow extends BowItem {


    public Aimbotbow(String name, Material material) {
        super(new Item.Properties().tab(ItemGroup.TAB_COMBAT).defaultDurability(100000000));
        super.getAllSupportedProjectiles();




    }
    public void onUsingTick(ItemStack stack, LivingEntity player, int count){
        AbstractArrowEntity aimbotarrow = super.customArrow(new AbstractArrowEntity(EntityType.ARROW, player.getCommandSenderWorld()) {
            @Override
            protected ItemStack getPickupItem() {
                return new ItemStack(Items.ARROW);
            }


        });
        // List<Entity> entities = player.getCommandSenderWorld().getEntities(EntityType.by(new EntityType<>(), ))
        LivingEntity currentEntity;
        Vector3d forward = player.getLookAngle();
        /*List<LivingEntity> list = new List<LivingEntity>() {
            @Override
            public int size() {
                return 78;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<LivingEntity> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(LivingEntity livingEntity) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends LivingEntity> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends LivingEntity> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public LivingEntity get(int index) {
                return null;
            }

            @Override
            public LivingEntity set(int index, LivingEntity element) {
                return null;
            }

            @Override
            public void add(int index, LivingEntity element) {

            }

            @Override
            public LivingEntity remove(int index) {
                return null;
            }


            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<LivingEntity> listIterator() {
                return null;
            }

            @Override
            public ListIterator<LivingEntity> listIterator(int index) {
                return null;
            }

            @Override
            public List<LivingEntity> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        Collection<? extends LivingEntity> entities = new Collection<LivingEntity>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<LivingEntity> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(LivingEntity livingEntity) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends LivingEntity> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        }
        list.addAll(new);
        player.getCommandSenderWorld().getNearestEntity()*/
        PlayerEntity currentPlayer = player.getCommandSenderWorld().getNearestPlayer(EntityPredicate.DEFAULT.range(1000), 1000, 1000, 1000);
        aimbotarrow.lerpMotion(currentPlayer.position().x, currentPlayer.position().y, currentPlayer.position().z);
        // player.getCommandSenderWorld().getNearestEntity(, EntityPredicate.DEFAULT, player, 100, 100, 100, player.getBoundingBox().inflate(100, 100, 100));

    }













 
}
