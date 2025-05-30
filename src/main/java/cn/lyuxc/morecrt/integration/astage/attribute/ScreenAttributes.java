package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import cn.lyuxc.morecrt.integration.astage.action.AStageRestrictionAction;
import com.alessandro.astages.store.Attributes;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.network.chat.Component;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Function;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class ScreenAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setOpenScreenMessage(AStageCraftTweakerPlugin helper, Function<String, Component> function) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Screen.OPEN_MESSAGE, menuType -> function.apply(menuType.toString())));
        return helper;
    }
}
