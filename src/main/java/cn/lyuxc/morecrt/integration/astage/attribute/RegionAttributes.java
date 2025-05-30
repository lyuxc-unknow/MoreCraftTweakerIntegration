package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import cn.lyuxc.morecrt.integration.astage.action.AStageRestrictionAction;
import com.alessandro.astages.store.Attributes;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.network.chat.Component;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class RegionAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setJadeMobMessage(AStageCraftTweakerPlugin helper, Component component) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.Region.INTERACT_MESSAGE, () -> component));
        return helper;
    }
}
