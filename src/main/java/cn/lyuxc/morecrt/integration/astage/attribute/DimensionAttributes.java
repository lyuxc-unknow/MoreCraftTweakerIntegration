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
public class DimensionAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setEnterMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Dimension.ENTER_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setLevelMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Dimension.LEAVE_MESSAGE, function));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setExpiredMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Dimension.EXPIRED_MESSAGE, function));
        return helper;
    }
}
