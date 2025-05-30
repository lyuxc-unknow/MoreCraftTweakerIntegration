package cn.lyuxc.morecrt;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.stage.AStageManager;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.CommandEvent;

@Mod("more_crafttweaker_integration")
public class MoreCrafttweakerIntegration {
    public MoreCrafttweakerIntegration() {
        NeoForge.EVENT_BUS.addListener(this::onReload);
    }

    private void onReload(final CommandEvent event) {
        if (event.getParseResults().getReader().getString().equals("reload") && event.getParseResults().getContext().getSource().hasPermission(2)) {
            AStageManager.reloadBeforeScripts();
            ARestrictionManager.reloadBeforeScripts();
        }
    }
}
