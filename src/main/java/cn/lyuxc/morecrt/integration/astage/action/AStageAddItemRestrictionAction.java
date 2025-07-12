package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.server.restriction.item.AItemRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import com.blamejared.crafttweaker.api.ingredient.IIngredient;

public class AStageAddItemRestrictionAction implements IRuntimeAction {
    private final AItemRestriction restriction;
    private final IIngredient[] ingredients;

    public AStageAddItemRestrictionAction(AItemRestriction restriction, IIngredient... ingredients) {
        super();
        this.restriction = restriction;
        this.ingredients = ingredients;
    }
    @Override
    public void apply() {
        for (var ingredient : ingredients) {
            for (var item : ingredient.getItems()) {
                restriction.restrict(item.getDefinition());
            }
        }
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "AStage Adding Item Restriction";
    }

    @Override
    public String systemName() {
        return "AStage";
    }
}
