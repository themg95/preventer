package com.dashomi.preventer.listeners;

import com.dashomi.preventer.PreventerClient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class UseItemEvent {
    public static ActionResult useItemListener(PlayerEntity player, World world, Hand hand) {
        if (PreventerClient.getPrevent()) {
            Item handItem = player.getStackInHand(hand).getItem();
            if (PreventerClient.config.preventRenamedItemUsing) {
                if (player.getStackInHand(hand).get(DataComponentTypes.FOOD) != null ) {
                    if (player.getStackInHand(hand).get(DataComponentTypes.CUSTOM_NAME) != null) {
                        if (PreventerClient.config.preventRenamedItemUsing_msg) {
                            player.sendMessage(Text.translatable("config.preventer.preventRenamedItemUsing.text"), true);
                        }
                        return ActionResult.FAIL;
                    }
                }
            }

            if (PreventerClient.config.preventPlaceAfterEating) {
                if (player.getStackInHand(hand).get(DataComponentTypes.FOOD) != null ) {
                    //confirms the player is actually eating the food and not just right-clicked the food on full hunger
                    if (player.getStackInHand(hand).use(world, player, hand) == ActionResult.CONSUME) {
                        PreventerClient.ticksSinceEating = 0;
                    }
                }
            }
        }

        return ActionResult.PASS;
    }
}
