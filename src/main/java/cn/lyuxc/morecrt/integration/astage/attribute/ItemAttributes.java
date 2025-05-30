package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import cn.lyuxc.morecrt.integration.astage.action.AStageRestrictionAction;
import com.alessandro.astages.store.Attributes;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Function;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class ItemAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setHideName(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Item.HIDDEN_NAME, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setDropMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Item.DROP_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setAttackMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Item.ATTACK_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setPickUpMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Item.PICKING_UP_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setUsingMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Item.USING_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMiningMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Item.MINING_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setPlacingMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        helper.restrictions.set(Attributes.Item.PLACING_MESSAGE, function);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setJadeItemMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        helper.restrictions.set(Attributes.Item.JADE_ITEM_MESSAGE, function);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setJadeBlockMessage(AStageCraftTweakerPlugin helper, Function<ItemStack, Component> function) {
        helper.restrictions.set(Attributes.Item.JADE_BLOCK_MESSAGE, function);
        return helper;
    }
}
