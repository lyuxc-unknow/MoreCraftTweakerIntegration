package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.recipe.ARecipeRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.alessandro.astages.core.wrapper.RecipeWrapper;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import com.blamejared.crafttweaker.api.recipe.manager.base.IRecipeManager;
import net.minecraft.resources.ResourceLocation;

public class AStageAddRecipeRestrictionAction implements IRuntimeAction {
    private final ARecipeRestriction restriction;
    private final IRecipeManager<?> recipeType;
    private final ResourceLocation[] recipeIds;

    public AStageAddRecipeRestrictionAction(ARecipeRestriction restriction, IRecipeManager<?> recipeType, ResourceLocation... recipeIds) {
        super();
        this.restriction = restriction;
        this.recipeType = recipeType;
        this.recipeIds = recipeIds;
    }

    @Override
    public void apply() {
        for (ResourceLocation r : recipeIds) {
            restriction.restrict(new RecipeWrapper(recipeType.getRecipeType(), r));
        }

        ARestrictionManager.RECIPE_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Recipe Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
