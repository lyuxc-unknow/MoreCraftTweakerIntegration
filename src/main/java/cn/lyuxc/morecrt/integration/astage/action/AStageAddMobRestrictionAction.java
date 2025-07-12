package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.AMobRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.world.entity.EntityType;

public class AStageAddMobRestrictionAction implements IRuntimeAction {
    private final AMobRestriction restriction;
    private final EntityType<?> mob;

    public AStageAddMobRestrictionAction(AMobRestriction restriction, EntityType<?> mob) {
        super();
        this.restriction = restriction;
        this.mob = mob;
    }
    @Override
    public void apply() {
        restriction.restrict(mob);
        ARestrictionManager.MOB_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Mob Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
