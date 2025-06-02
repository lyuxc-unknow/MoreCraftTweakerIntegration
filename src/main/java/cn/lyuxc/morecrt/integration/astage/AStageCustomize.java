package cn.lyuxc.morecrt.integration.astage;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.network.chat.Component;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class AStageCustomize {
    @ZenCodeType.Method
    public static String getStage(AStageCraftTweakerPlugin helper) {
        return helper.stage.getStage();
    }

    @ZenCodeType.Method
    public static String getDescription(AStageCraftTweakerPlugin helper) {
        return helper.stage.getDescription();
    }

    @ZenCodeType.Method
    public static Component getAddTitle(AStageCraftTweakerPlugin helper) {
        return helper.stage.getAddTitle();
    }

    @ZenCodeType.Method
    public static Component getAddSubTitle(AStageCraftTweakerPlugin helper) {
        return helper.stage.getAddSubTitle();
    }

    @ZenCodeType.Method
    public static Component getRemoveSubTitle(AStageCraftTweakerPlugin helper) {
        return helper.stage.getAddTitle();
    }

    @ZenCodeType.Method
    public static Component getRemoveTitle(AStageCraftTweakerPlugin helper) {
        return helper.stage.getAddTitle();
    }

    @ZenCodeType.Method
    public static int getFadeIn(AStageCraftTweakerPlugin helper) {
        return helper.stage.getFadeIn();
    }

    @ZenCodeType.Method
    public static int getFadeOut(AStageCraftTweakerPlugin helper) {
        return helper.stage.getFadeOut();
    }

    @ZenCodeType.Method
    public static int getStay(AStageCraftTweakerPlugin helper) {
        return helper.stage.getStay();
    }

    @ZenCodeType.Method
    public static Boolean isServerOnly(AStageCraftTweakerPlugin helper) {
        return helper.stage.isServerOnly();
    }

    @ZenCodeType.Method
    public static Boolean isPlayerOnly(AStageCraftTweakerPlugin helper) {
        return helper.stage.isPlayerOnly();
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setAddTitle(AStageCraftTweakerPlugin helper, Component addTitle) {
        helper.stage.setAddTitle(addTitle);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setRemoveTitle(AStageCraftTweakerPlugin helper, Component removeTitle) {
        helper.stage.setRemoveTitle(removeTitle);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setAddSubTitle(AStageCraftTweakerPlugin helper, Component addSubTitle) {
        helper.stage.setAddSubTitle(addSubTitle);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setRemoveSubTitle(AStageCraftTweakerPlugin helper, Component removeSubTitle) {
        helper.stage.setRemoveSubTitle(removeSubTitle);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setFadeIn(AStageCraftTweakerPlugin helper, int fadeIn) {
        helper.stage.setFadeIn(fadeIn);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setFadeOut(AStageCraftTweakerPlugin helper, int fadeOut) {
        helper.stage.setFadeOut(fadeOut);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setStay(AStageCraftTweakerPlugin helper, int fadeOut) {
        helper.stage.setStay(fadeOut);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setServerOnly(AStageCraftTweakerPlugin helper, boolean serverOnly) {
        helper.stage.setServerOnly(serverOnly);
        return helper;
    }

    @ZenCodeType.Method
    public AStageCraftTweakerPlugin setPlayerOnly(AStageCraftTweakerPlugin helper, boolean playerOnly) {
        helper.stage.setServerOnly(playerOnly);
        return helper;
    }
}
