package cn.lyuxc.morecrt.integration.astage.action;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.stage.AStageManager;
import com.alessandro.astages.store.Attribute;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;

public class AStageRestrictionAction<T> implements IRuntimeAction {
    private final AStageCraftTweakerPlugin plugin;
    private final Attribute<T> attribute;
    private final T value;

    public AStageRestrictionAction(AStageCraftTweakerPlugin plugin, Attribute<T> attribute, T value) {
        super();
        this.plugin = plugin;
        this.attribute = attribute;
        this.value = value;
    }

    @Override
    public void apply() {
        this.plugin.restrictions.set(attribute,value);
        AStageManager.reloadAfterScripts();
        ARestrictionManager.reloadAfterScripts();
    }

    @Override
    public String describe() {
        return "";
    }

    @Override
    public String systemName() {
        return "AStageRestrictionAction";
    }
}
