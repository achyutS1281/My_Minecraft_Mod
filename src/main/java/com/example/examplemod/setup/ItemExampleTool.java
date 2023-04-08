package com.example.examplemod.setup;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.item.*;
import net.minecraft.loot.conditions.DamageSourceProperties;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraftforge.common.ToolType;

import java.util.Set;

class ItemExampleTool extends AxeItem {

    public ItemExampleTool(String name, Material material) {
        super(new ModItems.newToolItemTier(), 100000, 100000, new Item.Properties().addToolType(ToolType.AXE, 12302).tab(ItemGroup.TAB_TOOLS));

    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entityLiving) {
        Vector3d forward = entityLiving.getViewVector(0);
        DragonFireballEntity projectile = new DragonFireballEntity(entityLiving.getCommandSenderWorld(), entityLiving, entityLiving.position().x + forward.x * 2.0f, entityLiving.position().y + forward.y * 1.0f, entityLiving.position().z + forward.z * 2.0f);
        projectile.push(forward.x * 8, forward.y * 8, forward.z * 8);

        entityLiving.getCommandSenderWorld().addFreshEntity(projectile);
        return super.onEntitySwing(stack, entityLiving);
    }
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity playerin, Entity entity) {
        Vector3d forward = playerin.getViewVector(0);


        Explosion explosion = new Explosion(playerin.getCommandSenderWorld(), entity, entity.position().x, entity.position().y, entity.position().z, 94, true, Explosion.Mode.DESTROY);

        playerin.getCommandSenderWorld().explode(playerin, entity.position().x, entity.position().y, entity.position().z, 10, Explosion.Mode.BREAK);
        entity.hurt(DamageSource.GENERIC, 23333);
        DamageSource.LIGHTNING_BOLT.setExplosion();




        return true;
    }
}
