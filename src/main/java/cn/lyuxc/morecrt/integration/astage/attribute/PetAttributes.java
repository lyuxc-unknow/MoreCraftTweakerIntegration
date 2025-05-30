package cn.lyuxc.morecrt.integration.astage.attribute;

import cn.lyuxc.morecrt.integration.astage.AStageCraftTweakerPlugin;
import com.alessandro.astages.store.Attributes;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import org.openzen.zencode.java.ZenCodeType;

import java.util.function.Function;

@ZenRegister
@ZenCodeType.Expansion("mods.astage.AStage")
public class PetAttributes {
    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setTameMessage(AStageCraftTweakerPlugin helper, Function<Entity, Component> function) {
        helper.restrictions.set(Attributes.Pet.TAME_MESSAGE, function);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setBreedMessage(AStageCraftTweakerPlugin helper, Function<Entity, Component> function) {
        helper.restrictions.set(Attributes.Pet.BREED_MESSAGE, function);
        return helper;
    }

    @ZenCodeType.Method
    public static AStageCraftTweakerPlugin setMountMessage(AStageCraftTweakerPlugin helper, Function<Entity, Component> function) {
        helper.restrictions.set(Attributes.Pet.MOUNT_MESSAGE, function);
        return helper;
    }
}
