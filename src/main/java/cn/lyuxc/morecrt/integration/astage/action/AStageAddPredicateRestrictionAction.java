package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.item.AItemPredicateRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.resources.ResourceLocation;

public class AStageAddPredicateRestrictionAction implements IRuntimeAction {
    private final AItemPredicateRestriction restriction;
    private final ResourceLocation modelId;

    public AStageAddPredicateRestrictionAction(AItemPredicateRestriction restriction, ResourceLocation location) {
        super();
        this.restriction = restriction;
        this.modelId = location;
    }
    @Override
    public void apply() {
        restriction.restrict(modelId);
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Item Predicate Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
