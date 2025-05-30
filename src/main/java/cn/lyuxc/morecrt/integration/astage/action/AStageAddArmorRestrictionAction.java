package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.item.AItemRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.alessandro.astages.store.Attributes;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.world.item.Item;

public class AStageAddArmorRestrictionAction implements IRuntimeAction {
    private final AItemRestriction restriction;
    private final Item[] armors;

    public AStageAddArmorRestrictionAction(AItemRestriction restriction, Item... armors) {
        super();
        this.restriction = restriction;
        this.armors = armors;
    }
    @Override
    public void apply() {
        for (var armor : armors) {
            restriction.restrict(armor);
        }

        restriction.set(Attributes.RENDERING_NAME, true)
                .set(Attributes.HIDING_TOOLTIP, false)
                .set(Attributes.PICKING_UP, true)
                .set(Attributes.STORING_IN_INVENTORY, true)
                .set(Attributes.ATTACKING, true)
                .set(Attributes.HIDING_JEI, false)
                .set(Attributes.BLOCK_PLACING, true)
                .set(Attributes.LEFT_CLICK_INTERACTIONS, true)
                .set(Attributes.RIGHT_CLICK_INTERACTIONS, true)
                .set(Attributes.BLOCK_BREAKING, true);

        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
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
