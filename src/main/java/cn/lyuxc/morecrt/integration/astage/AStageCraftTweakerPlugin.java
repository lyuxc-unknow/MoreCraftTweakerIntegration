package cn.lyuxc.morecrt.integration.astage;

import cn.lyuxc.morecrt.integration.astage.action.*;
import com.alessandro.astages.core.restriction.*;
import com.alessandro.astages.core.restriction.item.AItemModRestriction;
import com.alessandro.astages.core.restriction.item.AItemPredicateRestriction;
import com.alessandro.astages.core.restriction.item.AItemRestriction;
import com.alessandro.astages.core.restriction.item.AItemTagRestriction;
import com.alessandro.astages.core.restriction.recipe.ARecipeModRestriction;
import com.alessandro.astages.core.restriction.recipe.ARecipeRestriction;
import com.alessandro.astages.store.ARestriction;
import com.alessandro.astages.util.ACompareCondition;
import com.alessandro.astages.util.develop.UnderDevelopment;
import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.ingredient.IIngredient;
import com.blamejared.crafttweaker.api.recipe.manager.base.IRecipeManager;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.astage.AStage")
public class AStageCraftTweakerPlugin {
    public ARestriction<?,?,?> restrictions;

    @ZenCodeGlobals.Global("AStage")
    public static AStageCraftTweakerPlugin INSTANCE = new AStageCraftTweakerPlugin();

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addItemRestriction(final String id, final String stage, final IIngredient... ingredients) {
        var restriction = new AItemRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddItemRestrictionAction(restriction, ingredients));
        restrictions = restriction;
        return this;
    }

    @ZenCodeType.Method
    @UnderDevelopment
    public AStageCraftTweakerPlugin addPredicateRestriction(String id, String stage, ResourceLocation modelId) {
        var restriction = new AItemPredicateRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddPredicateRestrictionAction(restriction, modelId));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addModRestriction(String id, String stage, String modId) {
        var restriction = new AItemModRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddModRestrictionAction(restriction, modId));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addTagRestriction(String id, String stage, ResourceLocation name) {
        var restriction = new AItemTagRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddTagRestrictionAction(restriction, name));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addArmorRestriction(String id, String stage, Item... armors) {
        var restriction = new AItemRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddArmorRestrictionAction(restriction, armors));
        restrictions = restriction;

        return this;
    }

    // DIMENSION Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addDimensionRestriction(String id, String stage, ResourceLocation dimension) {
        var restriction = new ADimensionRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddDimensionRestrictionAction(restriction, dimension));
        restrictions = restriction;

        return this;
    }

    // MOB Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addMobRestriction(String id, String stage, EntityType<?> mob) {
        var restriction = new AMobRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddMobRestrictionAction(restriction, mob));
        restrictions = restriction;

        return this;
    }

    // RECIPE Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRecipeRestriction(String id, String stage, IRecipeManager<?> recipeType, ResourceLocation... recipeIds) {
        var restriction = new ARecipeRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddRecipeRestrictionAction(restriction, recipeType, recipeIds));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addModRecipeRestriction(String id, String stage, String modId) {
        var restriction = new ARecipeModRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddModRecipeRestrictionAction(restriction, modId));
        restrictions = restriction;

        return this;
    }

    // SCREEN Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addScreenRestriction(String id, String stage, ResourceLocation screen) {
        var restriction = new AScreenRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddScreenRestrictionAction(restriction, screen));
        restrictions = restriction;

        return this;
    }

    // ORE Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addOreRestriction(String id, String stage, BlockState original, BlockState replacement) {
        var restriction = new AOreRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddOreRestrictionAction(restriction, original, replacement));
        restrictions = restriction;

        return this;
    }

    // PET Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addPetRestriction(String id, String stage, EntityType<?> pet) {
        var restriction = new APetRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddPetRestrictionAction(restriction, pet));
        restrictions = restriction;

        return this;
    }

    // STRUCTURE Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addStructureRestriction(String id, String stage, ResourceLocation... structures) {
        var restriction = new AStructureRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddStructureRestrictionAction(restriction, structures));
        restrictions = restriction;

        return this;
    }

    // ENCHANT Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addEnchantRestriction(String id, String stage, Enchantment enchantment) {
        var restriction = new AEnchantRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddEnchantRestrictionAction(restriction, enchantment));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addEnchantRestriction(String id, String stage, Enchantment enchantment, ACompareCondition compareCondition, int level) {
        var restriction = new AEnchantRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddEnchantRestrictionAction(restriction, enchantment, compareCondition, level));
        restrictions = restriction;

        return this;
    }

    // CROP Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addCropRestriction(String id, String stage, Block crop) {
        var restriction = new ACropRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddCropRestrictionAction(restriction, crop));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addCropRestriction(String id, String stage, Block crop, ACompareCondition compareCondition, int age) {
        var restriction = new ACropRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddCropRestrictionAction(restriction, crop, compareCondition, age));
        restrictions = restriction;

        return this;
    }

    // EFFECT Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addEffectRestriction(String id, String stage, MobEffect effect) {
        var restriction = new AEffectRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddEffectRestrictionAction(restriction, effect));
        restrictions = restriction;

        return this;
    }

    // REGION Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, BlockPos center, int deltaX, int deltaY, int deltaZ) {
        var restriction = new ARegionRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddRegionRestrictionAction(restriction, type, center, deltaX, deltaY, deltaZ));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        var restriction = new ARegionRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddRegionRestrictionAction(restriction, type, minX, minY, minZ, maxX, maxY, maxZ));
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, BlockPos center, int radius) {
        var restriction = new ARegionRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddRegionRestrictionAction(restriction, type, center, radius));
        restrictions = restriction;
        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, @NotNull BlockPos from, @NotNull BlockPos to) {
        var restriction = new ARegionRestriction(id, stage);
        CraftTweakerAPI.apply(new AStageAddRegionRestrictionAction(restriction, type, from, to));
        restrictions = restriction;
        return this;
    }
}
