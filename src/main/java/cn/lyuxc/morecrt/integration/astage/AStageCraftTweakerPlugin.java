package cn.lyuxc.morecrt.integration.astage;

import com.alessandro.astages.core.ARestrictionManager;
import com.alessandro.astages.core.restriction.*;
import com.alessandro.astages.core.restriction.item.*;
import com.alessandro.astages.core.restriction.recipe.ARecipeModRestriction;
import com.alessandro.astages.core.restriction.recipe.ARecipeRestriction;
import com.alessandro.astages.core.wrapper.OreWrapper;
import com.alessandro.astages.core.wrapper.RecipeModWrapper;
import com.alessandro.astages.core.wrapper.RecipeWrapper;
import com.alessandro.astages.store.ARestriction;
import com.alessandro.astages.store.Attributes;
import com.alessandro.astages.util.ACompareCondition;
import com.alessandro.astages.util.develop.UnderDevelopment;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.ingredient.IIngredient;
import com.blamejared.crafttweaker.api.recipe.manager.base.IRecipeManager;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.astage.AStage")
public class AStageCraftTweakerPlugin {
    public ARestriction<?,?,?> restrictions;

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin create() {
        return new AStageCraftTweakerPlugin();
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addItemRestriction(final String id, final String stage, final IIngredient... ingredients) {
        var restriction = new AItemRestriction(id, stage);
        for (var ingredient : ingredients) {
            for (var item : ingredient.getItems()) {
                restriction.restrict(item.getDefinition());
            }
        }
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        restrictions = restriction;
        return this;
    }

    @ZenCodeType.Method
    @UnderDevelopment
    public AStageCraftTweakerPlugin addPredicateRestriction(String id, String stage, ResourceLocation modelId) {
        var restriction = new AItemPredicateRestriction(id, stage);
        restriction.restrict(modelId);
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addModRestriction(String id, String stage, String modId) {
        var restriction = new AItemModRestriction(id, stage);
        restriction.restrict(modId);
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addTagRestriction(String id, String stage, ResourceLocation name) {
        var restriction = new AItemTagRestriction(id, stage);
        restriction.restrict(name);
        ARestrictionManager.ITEM_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addArmorRestriction(String id, String stage, Item... armors) {
        var restriction = new AItemRestriction(id, stage);
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
        restrictions = restriction;

        return this;
    }

    // DIMENSION Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addDimensionRestriction(String id, String stage, ResourceLocation dimension) {
        var restriction = new ADimensionRestriction(id, stage);
        restriction.restrict(dimension);

        ARestrictionManager.DIMENSION_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // MOB Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addMobRestriction(String id, String stage, EntityType<?> mob) {
        var restriction = new AMobRestriction(id, stage);
        restriction.restrict(mob);

        ARestrictionManager.MOB_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // RECIPE Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRecipeRestriction(String id, String stage, IRecipeManager<?> recipeType, ResourceLocation... recipeIds) {
        var restriction = new ARecipeRestriction(id, stage);

        for (ResourceLocation r : recipeIds) {
            restriction.restrict(new RecipeWrapper(recipeType.getRecipeType(), r));
        }

        ARestrictionManager.RECIPE_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addModRecipeRestriction(String id, String stage, String modId) {
        var restriction = new ARecipeModRestriction(id, stage);
        restriction.restrict(new RecipeModWrapper(modId));

        ARestrictionManager.RECIPE_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // SCREEN Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addScreenRestriction(String id, String stage, ResourceLocation screen) {
        var restriction = new AScreenRestriction(id, stage);
        restriction.restrict(BuiltInRegistries.MENU.get(screen));

        ARestrictionManager.SCREEN_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // ORE Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addOreRestriction(String id, String stage, BlockState original, BlockState replacement) {
        var restriction = new AOreRestriction(id, stage);
        restriction.restrict(new OreWrapper(original, replacement));

        ARestrictionManager.ORE_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // PET Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addPetRestriction(String id, String stage, EntityType<?> pet) {
        var restriction = new APetRestriction(id, stage);
        restriction.restrict(pet);

        ARestrictionManager.PET_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // STRUCTURE Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addStructureRestriction(String id, String stage, ResourceLocation... structures) {
        var restriction = new AStructureRestriction(id, stage);

        for (var structure : structures) {
            restriction.restrict(structure);
        }

        ARestrictionManager.STRUCTURE_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // ENCHANT Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addEnchantRestriction(String id, String stage, Enchantment enchantment) {
        var restriction = new AEnchantRestriction(id, stage);
        restriction.restrict(enchantment);

        ARestrictionManager.ENCHANT_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addEnchantRestriction(String id, String stage, Enchantment enchantment, ACompareCondition compareCondition, int level) {
        var restriction = new AEnchantRestriction(id, stage);
        restriction.restrict(enchantment)
                .set(Attributes.COMPARE_CONDITION, compareCondition)
                .set(Attributes.LEVEL, level);

        ARestrictionManager.ENCHANT_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // CROP Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addCropRestriction(String id, String stage, Block crop) {
        var restriction = new ACropRestriction(id, stage);
        restriction.restrict(crop);

        ARestrictionManager.CROP_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addCropRestriction(String id, String stage, Block crop, ACompareCondition compareCondition, int age) {
        var restriction = new ACropRestriction(id, stage);
        restriction.restrict(crop)
                .set(Attributes.COMPARE_CONDITION, compareCondition)
                .set(Attributes.AGE, age);

        ARestrictionManager.CROP_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // EFFECT Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addEffectRestriction(String id, String stage, MobEffect effect) {
        var restriction = new AEffectRestriction(id, stage);
        restriction.restrict(effect);

        ARestrictionManager.EFFECT_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    // REGION Restrictions
    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, BlockPos center, int deltaX, int deltaY, int deltaZ) {
        var restriction = new ARegionRestriction(id, stage);
        restriction.setArea(type, center, deltaX, deltaY, deltaZ);

        ARestrictionManager.REGION_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        var restriction = new ARegionRestriction(id, stage);
        restriction.setArea(type, minX, minY, minZ, maxX, maxY, maxZ);

        ARestrictionManager.REGION_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, BlockPos center, int radius) {
        var restriction = new ARegionRestriction(id, stage);
        restriction.setArea(type, center, radius);

        ARestrictionManager.REGION_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin addRegionRestriction(String id, String stage, ARegionRestriction.Type type, @NotNull BlockPos from, @NotNull BlockPos to) {
        var restriction = new ARegionRestriction(id, stage);
        restriction.setArea(type, from, to);

        ARestrictionManager.REGION_INSTANCE.addRestriction(restriction);
        restrictions = restriction;

        return this;
    }
}
