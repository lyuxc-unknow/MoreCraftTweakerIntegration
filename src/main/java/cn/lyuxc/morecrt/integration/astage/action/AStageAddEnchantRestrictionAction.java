package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.AEnchantRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.alessandro.astages.store.Attributes;
import com.alessandro.astages.util.ACompareCondition;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.world.item.enchantment.Enchantment;

public class AStageAddEnchantRestrictionAction implements IRuntimeAction {
    private final AEnchantRestriction restriction;
    private final Enchantment enchantment;
    private ACompareCondition compareCondition;
    private int level;

    public AStageAddEnchantRestrictionAction(AEnchantRestriction restriction, Enchantment enchantment) {
        super();
        this.restriction = restriction;
        this.enchantment = enchantment;
    }

    public AStageAddEnchantRestrictionAction(AEnchantRestriction restriction, Enchantment enchantment, ACompareCondition compareCondition, int level) {
        super();
        this.restriction = restriction;
        this.enchantment = enchantment;
        this.compareCondition = compareCondition;
        this.level = level;
    }

    @Override
    public void apply() {
        restriction.restrict(enchantment);
        if (level > -1 && compareCondition != null) {
            restriction.set(Attributes.LEVEL, level);
            restriction.set(Attributes.COMPARE_CONDITION, compareCondition);
        }
        ARestrictionManager.ENCHANT_INSTANCE.addRestriction(restriction);
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
