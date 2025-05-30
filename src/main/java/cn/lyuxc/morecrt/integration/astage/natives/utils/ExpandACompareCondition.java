package cn.lyuxc.morecrt.integration.astage.natives.utils;

import com.alessandro.astages.util.ACompareCondition;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

@ZenRegister
@NativeTypeRegistration(value = ACompareCondition.class, zenCodeName = "mode.astage.ACompareCondition")
@BracketEnum("astage:condition")
public class ExpandACompareCondition {
}
