package com.dashomi.preventer.mixin;

import com.dashomi.preventer.PreventerClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

    @Inject(method = "consumeItem", at = @At(value = "HEAD"))
    private void resetTicksSinceFoodEat(CallbackInfo ci) {
        LivingEntity entity = (LivingEntity) (Object) this;
        ItemStack itemStack = entity.getStackInHand(entity.getActiveHand());

        //ensures the entity here is the client player
        if (entity instanceof ClientPlayerEntity && itemStack.getComponents().contains(DataComponentTypes.FOOD)) {
            PreventerClient.ticksSinceEating = 0;
        }
    }
}
