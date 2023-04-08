package com.example.examplemod.setup;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.LightningBoltRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.*;

import net.minecraft.loot.conditions.Alternative;
import net.minecraft.loot.conditions.DamageSourceProperties;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.ServerWorldInfo;
import net.minecraftforge.event.entity.ProjectileImpactEvent;


import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

class ItemExampleWeapon extends SwordItem {


    public ItemExampleWeapon(String name, Material material) {
        super(new ModItems.newSwordItemTier(), 100000, 100000, new Item.Properties().tab(ItemGroup.TAB_COMBAT));



    }

    public boolean onEntitySwing( ItemStack stack, LivingEntity entityLiving) {
        Vector3d forward = entityLiving.getViewVector(0);

        Entity projectile = new FireballEntity(entityLiving.getCommandSenderWorld(), entityLiving, entityLiving.position().x + forward.x * 2.0f, entityLiving.position().y + forward.y * 1.0f, entityLiving.position().z + forward.z * 2.0f) {

        };

        projectile.push(forward.x * 5, forward.y * 5, forward.z * 5);
       
        projectile.canCollideWith(entityLiving);


        entityLiving.getCommandSenderWorld().addFreshEntity(projectile);
        entityLiving.setInvulnerable(true);

        entityLiving.setNoActionTime(3);

        entityLiving.setHealth(20);
        entityLiving.setInvulnerable(false);
        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();

        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();
        entityLiving.clearFire();

        return super.onEntitySwing(stack, entityLiving);
    }


    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity playerin, Entity entity) {
        Vector3d forward = playerin.getViewVector(60);

        LightningBoltEntity projectile = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, playerin.getCommandSenderWorld());
        Explosion explosion = new Explosion(playerin.getCommandSenderWorld(), entity, entity.position().x, entity.position().y, entity.position().z, 10, true, Explosion.Mode.DESTROY);
        projectile.moveTo(entity.position());
        playerin.getCommandSenderWorld().explode(entity, entity.position().x, entity.position().y, entity.position().z, 10, Explosion.Mode.DESTROY);
        entity.hurt(DamageSource.GENERIC, 2333);
        DamageSource.LIGHTNING_BOLT.setExplosion();
        playerin.getCommandSenderWorld().addFreshEntity(projectile);
        entity.captureDrops(new Collection<ItemEntity>() {
            @Override
            public int size() {
                return 4;
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
            public Iterator<ItemEntity> iterator() {
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
            public boolean add(ItemEntity itemEntity) {
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
            public boolean addAll(Collection<? extends ItemEntity> c) {
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
        });




        return true;
    }

    ;




}
