package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.item.AItemTagRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.resources.ResourceLocation;

public class AStageAddTagRestrictionAction implements IRuntimeAction {
    private final AItemTagRestriction restriction;
    private final ResourceLocation tagName;

    public AStageAddTagRestrictionAction(AItemTagRestriction restriction, ResourceLocation name) {
        super();
        this.restriction = restriction;
        this.tagName = name;
    }
    @Override
    public void apply() {
        restriction.restrict(tagName);
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Tag Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
