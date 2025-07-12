package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.AOreRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.alessandro.astages.core.wrapper.OreWrapper;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.world.level.block.state.BlockState;

public class AStageAddOreRestrictionAction implements IRuntimeAction {
    private final AOreRestriction restriction;
    private final BlockState original;
    private final BlockState replacement;

    public AStageAddOreRestrictionAction(AOreRestriction restriction, BlockState original, BlockState replacement) {
        super();
        this.restriction = restriction;
        this.original = original;
        this.replacement = replacement;
    }
    @Override
    public void apply() {
        restriction.restrict(new OreWrapper(original, replacement));
        ARestrictionManager.ORE_INSTANCE.addRestriction(restriction);

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
