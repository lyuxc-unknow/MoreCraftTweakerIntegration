package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.ACropRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.alessandro.astages.store.Attributes;
import com.alessandro.astages.util.ACompareCondition;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.world.level.block.Block;

public class AStageAddCropRestrictionAction implements IRuntimeAction {
    private final ACropRestriction restriction;
    private final Block crop;
    private ACompareCondition compareCondition;
    private int age;

    public AStageAddCropRestrictionAction(ACropRestriction restriction, Block crop) {
        super();
        this.restriction = restriction;
        this.crop = crop;
    }

    public AStageAddCropRestrictionAction(ACropRestriction restriction, Block crop, ACompareCondition compareCondition, int age) {
        super();
        this.restriction = restriction;
        this.crop = crop;
        this.compareCondition = compareCondition;
        this.age = age;
    }

    @Override
    public void apply() {
        restriction.restrict(crop);
        if (compareCondition != null && age > 0) {
            restriction.set(Attributes.AGE, age);
            restriction.set(Attributes.COMPARE_CONDITION, compareCondition);
        }
        ARestrictionManager.CROP_INSTANCE.addRestriction(restriction);
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
