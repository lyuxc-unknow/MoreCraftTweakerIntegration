package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.AStructureRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.resources.ResourceLocation;

public class AStageAddStructureRestrictionAction implements IRuntimeAction {
    private final AStructureRestriction restriction;
    private final ResourceLocation[] structures;

    public AStageAddStructureRestrictionAction(AStructureRestriction restriction, ResourceLocation... structures) {
        super();
        this.restriction = restriction;
        this.structures = structures;
    }
    @Override
    public void apply() {
        for (var structure : structures) {
            restriction.restrict(structure);
        }

        ARestrictionManager.STRUCTURE_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Armor Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
