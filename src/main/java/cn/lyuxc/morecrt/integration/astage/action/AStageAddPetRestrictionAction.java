package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.APetRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.world.entity.EntityType;

public class AStageAddPetRestrictionAction implements IRuntimeAction {
    private final APetRestriction restriction;
    private final EntityType<?> pet;

    public AStageAddPetRestrictionAction(APetRestriction restriction, EntityType<?> pet) {
        super();
        this.restriction = restriction;
        this.pet = pet;
    }
    @Override
    public void apply() {
        restriction.restrict(pet);
        ARestrictionManager.PET_INSTANCE.addRestriction(restriction);
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
