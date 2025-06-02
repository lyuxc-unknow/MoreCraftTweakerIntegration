package cn.lyuxc.morecrt.integration.astage;

import com.alessandro.astages.capability.ClientPlayerStage;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@ZenCodeType.Name("mods.astage.AStagesClient")
public class AStageClient {
    @ZenCodeGlobals.Global("AStagesClient")
    public static final AStageClient INSTANCE = new AStageClient();

    public AStageClient() { }

    @ZenCodeType.Method
    public List<String> getClientStages() {
        return ClientPlayerStage.getPlayerStages();
    }
}
