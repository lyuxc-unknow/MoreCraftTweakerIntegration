package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import cn.lyuxc.morecrt.integration.astage.action.AStageRestrictionAction;
import com.alessandro.astages.store.Attributes;
import com.alessandro.astages.util.ACompareCondition;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.ChatFormatting;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class CommonAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setRendingName(AStageCraftTweakerPlugin helper, boolean isRending) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.RENDERING_NAME, isRending));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setHideInJEI(AStageCraftTweakerPlugin helper, boolean isHideInJEI) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.HIDING_JEI, isHideInJEI));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanPickUp(AStageCraftTweakerPlugin helper, boolean isCanPickingUp) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.PICKING_UP, isCanPickingUp));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeEquipped(AStageCraftTweakerPlugin helper, boolean isCanBeEquipped) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.EQUIPPING, isCanBeEquipped));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeStoredInInventory(AStageCraftTweakerPlugin helper, boolean isCanBeStoredInInventory) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.STORING_IN_INVENTORY, isCanBeStoredInInventory));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanAttack(AStageCraftTweakerPlugin helper, boolean isCanAttack) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.ATTACKING, isCanAttack));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setHideTooltip(AStageCraftTweakerPlugin helper, boolean isHideTooltip) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.HIDING_TOOLTIP, isHideTooltip));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBePlaced(AStageCraftTweakerPlugin helper, boolean isCanBePlaced) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.BLOCK_PLACING, isCanBePlaced));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanItemBeLeftClicked(AStageCraftTweakerPlugin helper, boolean isCanItemBeLeftClicked) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.LEFT_CLICK_INTERACTIONS, isCanItemBeLeftClicked));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanItemBeRightClicked(AStageCraftTweakerPlugin helper, boolean isCanItemBeRightClicked) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.RIGHT_CLICK_INTERACTIONS, isCanItemBeRightClicked));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeDig(AStageCraftTweakerPlugin helper, boolean isCanBeDig) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.BLOCK_BREAKING, isCanBeDig));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setTamable(AStageCraftTweakerPlugin helper, boolean isTamable) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.TAMABLE, isTamable));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setBreedable(AStageCraftTweakerPlugin helper, boolean isBreedable) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.BREEDABLE, isBreedable));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMountable(AStageCraftTweakerPlugin helper, boolean isMountable) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.MOUNTABLE, isMountable));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanEnter(AStageCraftTweakerPlugin helper, boolean isCanEnter) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.ENTERING, isCanEnter));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanInteract(AStageCraftTweakerPlugin helper, boolean isCanInteract) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.GENERIC_INTERACTIONS, isCanInteract));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMakeExplosionsAffectBlocks(AStageCraftTweakerPlugin helper, boolean isMakeExplosionsAffectBlocks) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.EXPLOSIONS_AFFECT_BLOCKS, isMakeExplosionsAffectBlocks));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMakeExplosionsAffectEntities(AStageCraftTweakerPlugin helper, boolean isMakeExplosionsAffectEntities) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.EXPLOSIONS_AFFECT_ENTITIES, isMakeExplosionsAffectEntities));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setDisableSpawner(AStageCraftTweakerPlugin helper, boolean isDisableSpawner) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.SPAWNER, !isDisableSpawner));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setBidirectional(AStageCraftTweakerPlugin helper, boolean isBidirectional) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.BIDIRECTIONAL, isBidirectional));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeUsedInAnvil(AStageCraftTweakerPlugin helper, boolean isCanBeUsedInAnvil) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.ANVIL, isCanBeUsedInAnvil));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeUsedInEnchantingTable(AStageCraftTweakerPlugin helper, boolean isCanBeUsedInEnchantingTable) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.ENCHANTING_TABLE, isCanBeUsedInEnchantingTable));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanInteractWithBlock(AStageCraftTweakerPlugin helper, boolean isCanInteractWithBlock) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.BLOCK_INTERACTIONS, isCanInteractWithBlock));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setEnableMobSpawning(AStageCraftTweakerPlugin helper, boolean isEnableMobSpawning) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.MOB_SPAWNING, isEnableMobSpawning));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin spawnReplacementWithEquipment(AStageCraftTweakerPlugin helper, boolean value) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.SPAWN_WITH_DIFFERENT_EQUIPMENT, value));

        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setAllowAccess(AStageCraftTweakerPlugin helper, boolean isAllowAccess) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.ALLOW_ACCESS, isAllowAccess));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setPickUpDelay(AStageCraftTweakerPlugin helper, int time) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.PICK_UP_DELAY, time));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setAge(AStageCraftTweakerPlugin helper, int age) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.AGE, age));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setLevel(AStageCraftTweakerPlugin helper, int level) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.LEVEL, level));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMinLightLevel(AStageCraftTweakerPlugin helper, int level) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.MIN_LIGHT_LEVEL, level));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMaxLightLevel(AStageCraftTweakerPlugin helper, int level) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.MAX_LIGHT_LEVEL, level));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMaxAccess(AStageCraftTweakerPlugin helper, int value) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.MAX_ACCESS, value));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setDimension(AStageCraftTweakerPlugin helper, ResourceLocation value) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.DIMENSION, value));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setReplacing(AStageCraftTweakerPlugin helper, EntityType<?> value) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.REPLACE, value));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCompareCondition(AStageCraftTweakerPlugin helper, ACompareCondition value) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.COMPARE_CONDITION, value));
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setChatFormatting(AStageCraftTweakerPlugin helper, ChatFormatting formatting) {
        CraftTweakerAPI.apply(new AStageRestrictionAction<>(helper, Attributes.CHAT_FORMATTING, formatting));
        return helper;
    }
}
