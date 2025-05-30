package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.item.AItemModRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;

public class AStageAddModRestrictionAction implements IRuntimeAction {
    private final AItemModRestriction restriction;
    private final String modId;

    public AStageAddModRestrictionAction(AItemModRestriction restriction, String modId) {
        super();
        this.restriction = restriction;
        this.modId = modId;
    }
    @Override
    public void apply() {
        restriction.restrict(modId);
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Mod Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
