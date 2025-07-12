package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.AScreenRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class AStageAddScreenRestrictionAction implements IRuntimeAction {
    private final AScreenRestriction restriction;
    private final ResourceLocation screen;

    public AStageAddScreenRestrictionAction(AScreenRestriction restriction, ResourceLocation screen) {
        super();
        this.restriction = restriction;
        this.screen = screen;
    }
    @Override
    public void apply() {
        var menu = BuiltInRegistries.MENU.get(screen);
        if (menu != null) {
            restriction.restrict(menu);
            ARestrictionManager.SCREEN_INSTANCE.addRestriction(restriction);
            AStageManager.reloadAfterScripts();
            ARestrictionManager.reloadAfterScripts();
        }
    }

    @Override
    public String describe() {
        return "AStage Adding Screen Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
