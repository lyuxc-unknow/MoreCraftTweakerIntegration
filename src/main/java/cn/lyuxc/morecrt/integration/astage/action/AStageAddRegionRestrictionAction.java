package cn.lyuxc.morecrt.integration.astage.action;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.ARegionRestriction;
import com.alessandro.astages.core.stage.AStageManager;
import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;

public class AStageAddRegionRestrictionAction implements IRuntimeAction {
    private final ARegionRestriction restriction;
    private final ARegionRestriction.Type type;
    private BlockPos fromBlockPos;
    private BlockPos toBlockPos;
    private int radius;
    private int minX;
    private int minY;
    private int minZ;
    private int maxX;
    private int maxY;
    private int maxZ;
    private BlockPos center;
    private int deltaX;
    private int deltaY;
    private int deltaZ;
    private final Type methodType;

    public AStageAddRegionRestrictionAction(ARegionRestriction restriction, ARegionRestriction.Type type, BlockPos center, int deltaX, int deltaY, int deltaZ) {
        super();
        this.restriction = restriction;
        this.type = type;
        this.center = center;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.deltaZ = deltaZ;
        this.methodType = Type.ONE;
    }

    public AStageAddRegionRestrictionAction(ARegionRestriction restriction, ARegionRestriction.Type type, int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        super();
        this.restriction = restriction;
        this.type = type;
        this.minX = minX;
        this.minY = minY;
        this.minZ = minZ;
        this.maxX = maxX;
        this.maxY = maxY;
        this.maxZ = maxZ;
        this.methodType = Type.TWO;
    }

    public AStageAddRegionRestrictionAction(ARegionRestriction restriction,ARegionRestriction.Type type, BlockPos center, int radius) {
        super();
        this.restriction = restriction;
        this.type = type;
        this.center = center;
        this.radius = radius;
        this.methodType = Type.THREE;
    }

    public AStageAddRegionRestrictionAction(ARegionRestriction restriction, ARegionRestriction.Type type, @NotNull BlockPos from, @NotNull BlockPos to) {
        super();
        this.restriction = restriction;
        this.type = type;
        this.fromBlockPos = from;
        this.toBlockPos = to;
        this.methodType = Type.FOUR;
    }

    enum Type {
        ONE,
        TWO,
        THREE,
        FOUR
    }

    @Override
    public void apply() {
        switch (methodType) {
            case Type.ONE -> restriction.setArea(type, center, deltaX, deltaY, deltaZ);
            case Type.TWO -> restriction.setArea(type, minX, minY, minZ, maxX, maxY, maxZ);
            case Type.THREE -> restriction.setArea(type, center, radius);
            case Type.FOUR -> restriction.setArea(type, fromBlockPos, toBlockPos);
        }
        ARestrictionManager.REGION_INSTANCE.addRestriction(restriction);
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