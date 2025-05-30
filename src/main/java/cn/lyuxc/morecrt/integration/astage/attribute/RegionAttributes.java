package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import com.alessandro.astages.store.Attributes;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.network.chat.Component;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class RegionAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setJadeMobMessage(AStageCraftTweakerPlugin helper, Component component) {
        helper.restrictions.set(Attributes.Region.INTERACT_MESSAGE, () -> component);
        return helper;
    }
}
