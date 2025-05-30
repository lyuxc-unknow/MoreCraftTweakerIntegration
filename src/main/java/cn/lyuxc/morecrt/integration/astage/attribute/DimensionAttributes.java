package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import com.alessandro.astages.store.Attributes;
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
        helper.restrictions.set(Attributes.Dimension.ENTER_MESSAGE, function);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setLevelMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        helper.restrictions.set(Attributes.Dimension.LEAVE_MESSAGE, function);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setExpiredMessage(AStageCraftTweakerPlugin helper, Function<ResourceLocation, Component> function) {
        helper.restrictions.set(Attributes.Dimension.EXPIRED_MESSAGE, function);
        return helper;
    }
}
