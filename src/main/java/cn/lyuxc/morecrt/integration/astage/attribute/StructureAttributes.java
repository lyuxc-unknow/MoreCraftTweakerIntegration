package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import cn.lyuxc.morecrt.integration.astage.action.AStageRestrictionAction;
import com.alessandro.astages.store.Attributes;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Function;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class StructureAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setAttackMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Structure.ATTACK_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setInteractMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Structure.INTERACT_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setEnterMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Structure.ENTER_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setPlacingMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Structure.PLACING_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMiningMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Structure.MINING_MESSAGE, function));
        return helper;
    }
}
