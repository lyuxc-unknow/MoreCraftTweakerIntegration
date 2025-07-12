package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.AEffectRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.world.effect.MobEffect;

public class AStageAddEffectRestrictionAction implements IRuntimeAction {
    private final AEffectRestriction restriction;
    private final MobEffect effect;

    public AStageAddEffectRestrictionAction(AEffectRestriction restriction, MobEffect effect) {
        super();
        this.restriction = restriction;
        this.effect = effect;
    }
    @Override
    public void apply() {
        restriction.restrict(effect);
        ARestrictionManager.EFFECT_INSTANCE.addRestriction(restriction);
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
