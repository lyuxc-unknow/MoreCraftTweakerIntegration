package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.ADimensionRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.resources.ResourceLocation;

public class AStageAddDimensionRestrictionAction implements IRuntimeAction {
    private final ADimensionRestriction restriction;
    private final ResourceLocation dimension;

    public AStageAddDimensionRestrictionAction(ADimensionRestriction restriction, ResourceLocation dimension) {
        super();
        this.restriction = restriction;
        this.dimension = dimension;
    }
    @Override
    public void apply() {
        restriction.restrict(dimension);
        ARestrictionManager.DIMENSION_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Dimension Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
