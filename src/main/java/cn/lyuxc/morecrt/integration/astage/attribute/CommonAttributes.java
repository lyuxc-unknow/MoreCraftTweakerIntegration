package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import com.alessandro.astages.store.Attributes;
import com.alessandro.astages.util.ACompareCondition;
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
        helper.restrictions.set(Attributes.RENDERING_NAME, isRending);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setHideInJEI(AStageCraftTweakerPlugin helper, boolean isHideInJEI) {
        helper.restrictions.set(Attributes.HIDING_JEI, isHideInJEI);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanPickUp(AStageCraftTweakerPlugin helper, boolean isCanPickingUp) {
        helper.restrictions.set(Attributes.PICKING_UP, isCanPickingUp);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeEquipped(AStageCraftTweakerPlugin helper, boolean isCanBeEquipped) {
        helper.restrictions.set(Attributes.EQUIPPING, isCanBeEquipped);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeStoredInInventory(AStageCraftTweakerPlugin helper, boolean isCanBeStoredInInventory) {
        helper.restrictions.set(Attributes.STORING_IN_INVENTORY, isCanBeStoredInInventory);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanAttack(AStageCraftTweakerPlugin helper, boolean isCanAttack) {
        helper.restrictions.set(Attributes.ATTACKING, isCanAttack);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setHideTooltip(AStageCraftTweakerPlugin helper, boolean isHideTooltip) {
        helper.restrictions.set(Attributes.HIDING_TOOLTIP, isHideTooltip);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBePlaced(AStageCraftTweakerPlugin helper, boolean isCanBePlaced) {
        helper.restrictions.set(Attributes.BLOCK_PLACING, isCanBePlaced);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanItemBeLeftClicked(AStageCraftTweakerPlugin helper, boolean isCanItemBeLeftClicked) {
        helper.restrictions.set(Attributes.LEFT_CLICK_INTERACTIONS, isCanItemBeLeftClicked);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanItemBeRightClicked(AStageCraftTweakerPlugin helper, boolean isCanItemBeRightClicked) {
        helper.restrictions.set(Attributes.RIGHT_CLICK_INTERACTIONS, isCanItemBeRightClicked);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeDig(AStageCraftTweakerPlugin helper, boolean isCanBeDig) {
        helper.restrictions.set(Attributes.BLOCK_BREAKING, isCanBeDig);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setTamable(AStageCraftTweakerPlugin helper, boolean isTamable) {
        helper.restrictions.set(Attributes.TAMABLE, isTamable);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setBreedable(AStageCraftTweakerPlugin helper, boolean isBreedable) {
        helper.restrictions.set(Attributes.BREEDABLE, isBreedable);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMountable(AStageCraftTweakerPlugin helper, boolean isMountable) {
        helper.restrictions.set(Attributes.MOUNTABLE, isMountable);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanEnter(AStageCraftTweakerPlugin helper, boolean isCanEnter) {
        helper.restrictions.set(Attributes.ENTERING, isCanEnter);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanInteract(AStageCraftTweakerPlugin helper, boolean isCanInteract) {
        helper.restrictions.set(Attributes.GENERIC_INTERACTIONS, isCanInteract);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMakeExplosionsAffectBlocks(AStageCraftTweakerPlugin helper, boolean isMakeExplosionsAffectBlocks) {
        helper.restrictions.set(Attributes.EXPLOSIONS_AFFECT_BLOCKS, isMakeExplosionsAffectBlocks);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMakeExplosionsAffectEntities(AStageCraftTweakerPlugin helper, boolean isMakeExplosionsAffectEntities) {
        helper.restrictions.set(Attributes.EXPLOSIONS_AFFECT_ENTITIES, isMakeExplosionsAffectEntities);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setDisableSpawner(AStageCraftTweakerPlugin helper, boolean isDisableSpawner) {
        helper.restrictions.set(Attributes.SPAWNER, !isDisableSpawner);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setBidirectional(AStageCraftTweakerPlugin helper, boolean isBidirectional) {
        helper.restrictions.set(Attributes.BIDIRECTIONAL, isBidirectional);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeUsedInAnvil(AStageCraftTweakerPlugin helper, boolean isCanBeUsedInAnvil) {
        helper.restrictions.set(Attributes.ANVIL, isCanBeUsedInAnvil);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanBeUsedInEnchantingTable(AStageCraftTweakerPlugin helper, boolean isCanBeUsedInEnchantingTable) {
        helper.restrictions.set(Attributes.ENCHANTING_TABLE, isCanBeUsedInEnchantingTable);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCanInteractWithBlock(AStageCraftTweakerPlugin helper, boolean isCanInteractWithBlock) {
        helper.restrictions.set(Attributes.BLOCK_INTERACTIONS, isCanInteractWithBlock);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setEnableMobSpawning(AStageCraftTweakerPlugin helper, boolean isEnableMobSpawning) {
        helper.restrictions.set(Attributes.MOB_SPAWNING, isEnableMobSpawning);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin spawnReplacementWithEquipment(AStageCraftTweakerPlugin helper, boolean value) {
        helper.restrictions.set(Attributes.SPAWN_WITH_DIFFERENT_EQUIPMENT, value);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setAllowAccess(AStageCraftTweakerPlugin helper, boolean isAllowAccess) {
        helper.restrictions.set(Attributes.ALLOW_ACCESS, isAllowAccess);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setPickUpDelay(AStageCraftTweakerPlugin helper, int time) {
        helper.restrictions.set(Attributes.PICK_UP_DELAY, time);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setAge(AStageCraftTweakerPlugin helper, int age) {
        helper.restrictions.set(Attributes.AGE, age);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setLevel(AStageCraftTweakerPlugin helper, int level) {
        helper.restrictions.set(Attributes.LEVEL, level);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMinLightLevel(AStageCraftTweakerPlugin helper, int level) {
        helper.restrictions.set(Attributes.MIN_LIGHT_LEVEL, level);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMaxLightLevel(AStageCraftTweakerPlugin helper, int level) {
        helper.restrictions.set(Attributes.MAX_LIGHT_LEVEL, level);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMaxAccess(AStageCraftTweakerPlugin helper, int value) {
        helper.restrictions.set(Attributes.MAX_ACCESS, value);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setDimension(AStageCraftTweakerPlugin helper, ResourceLocation value) {
        helper.restrictions.set(Attributes.DIMENSION, value);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setReplacing(AStageCraftTweakerPlugin helper, EntityType<?> value) {
        helper.restrictions.set(Attributes.REPLACE, value);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setCompareCondition(AStageCraftTweakerPlugin helper, ACompareCondition value) {
        helper.restrictions.set(Attributes.COMPARE_CONDITION, value);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setChatFormatting(AStageCraftTweakerPlugin helper, ChatFormatting formatting) {
        helper.restrictions.set(Attributes.CHAT_FORMATTING, formatting);
        return helper;
    }
}
