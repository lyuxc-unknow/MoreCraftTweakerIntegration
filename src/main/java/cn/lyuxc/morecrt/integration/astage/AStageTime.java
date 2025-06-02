package cn.lyuxc.morecrt.integration.astage;

import com.alessandro.astages.util.ATime;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.astage.ATime")
public class AStageTime {
    @ZenCodeGlobals.Global("ATime")
    public static final AStageTime INSTANCE = new AStageTime();

    public AStageTime() { }

    @ZenCodeType.Method
    public int getTicks(String time) {
        return new ATime(time).getTicks();
    }
}
