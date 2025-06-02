package cn.lyuxc.morecrt.integration.crafttweaker;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.world.entity.player.Abilities;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Abilities")
public class ExpandAbilities {
    @ZenCodeType.Method
    @ZenCodeType.Setter("flying")
    public static void isFlying(Abilities internal, Boolean isFlying) {
        internal.flying = isFlying;
        internal.mayfly = isFlying;
    }
}
