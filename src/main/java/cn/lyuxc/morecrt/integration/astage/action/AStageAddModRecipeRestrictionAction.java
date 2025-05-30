package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.recipe.ARecipeModRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.alessandro.astages.core.wrapper.RecipeModWrapper;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;

public class AStageAddModRecipeRestrictionAction implements IRuntimeAction {
    private final ARecipeModRestriction restriction;
    private final String modId;

    public AStageAddModRecipeRestrictionAction(ARecipeModRestriction restriction, String modId) {
        super();
        this.restriction = restriction;
        this.modId = modId;
    }

    @Override
    public void apply() {
        restriction.restrict(new RecipeModWrapper(modId));
        ARestrictionManager.RECIPE_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Mod Recipe Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
