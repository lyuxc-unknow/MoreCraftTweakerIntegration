package cn.lyuxc.morecrt.integration.astage.natives.event;

import com.alessandro.astages.event.custom.actions.AllStageRemovedPlayerEvent;
import com.alessandro.astages.event.custom.actions.StageAddedPlayerEvent;
import com.alessandro.astages.event.custom.actions.StageRemovedPlayerEvent;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.event.ZenEvent;
import com.blamejared.crafttweaker.api.event.bus.IEventBus;
import com.blamejared.crafttweaker.api.event.bus.NeoForgeEventBusWire;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nonnull;
import java.util.List;

@ZenRegister
public class ExpandStageEvent {
    @ZenRegister
    @ZenEvent
    @NativeTypeRegistration(value = StageAddedPlayerEvent.class, zenCodeName = "mods.astage.events.StageAddedEvent")
    public static class ExpandStageAddedPlayerEvent {
        @ZenEvent.Bus
        public static final IEventBus<StageAddedPlayerEvent> BUS = IEventBus.direct(
                StageAddedPlayerEvent.class,
                NeoForgeEventBusWire.of()
        );

        @Nonnull
        @ZenCodeType.Method
        @ZenCodeType.Getter("stage")
        public static String getStageName (StageAddedPlayerEvent event) {
            return event.stage;
        }
    }

    @ZenRegister
    @ZenEvent
    @NativeTypeRegistration(value = StageRemovedPlayerEvent.class, zenCodeName = "mods.astage.events.StageRemovedEvent")
    public static class ExpandStageRemovedEvent {
        @ZenEvent.Bus
        public static final IEventBus<StageRemovedPlayerEvent> BUS = IEventBus.direct(
                StageRemovedPlayerEvent.class,
                NeoForgeEventBusWire.of()
        );

        @Nonnull
        @ZenCodeType.Method
        @ZenCodeType.Getter("stage")
        public static String getStageName (StageRemovedPlayerEvent event) {
            return event.stage;
        }
    }

    @ZenRegister
    @ZenEvent
    @NativeTypeRegistration(value = AllStageRemovedPlayerEvent.class, zenCodeName = "mods.astage.events.AllStageRemovedEvent")
    public static class ExpandAllStageRemovedEvent {
        @ZenEvent.Bus
        public static final IEventBus<AllStageRemovedPlayerEvent> BUS = IEventBus.direct(
                AllStageRemovedPlayerEvent.class,
                NeoForgeEventBusWire.of()
        );

        @Nonnull
        @ZenCodeType.Method
        @ZenCodeType.Getter("stage")
        public static List<String> getStageName (AllStageRemovedPlayerEvent event) {
            return event.stages;
        }
    }
}
