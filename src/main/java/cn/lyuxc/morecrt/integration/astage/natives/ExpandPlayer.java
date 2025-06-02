package cn.lyuxc.morecrt.integration.astage.natives;

import com.alessandro.astages.capability.AProvider;
import com.alessandro.astages.capability.PlayerStage;
import com.alessandro.astages.util.AStagesUtil;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;

@ZenRegister
@ZenCodeType.Expansion("crafttweaker.api.entity.type.player.Player")
public class ExpandPlayer {
    @ZenCodeType.Method
    public static void addStage(Player player, String stages) {
        if (player instanceof ServerPlayer serverPlayer) {
            var playerStage = getPlayerData(serverPlayer);
            playerStage.addStage(stages);
            playerStage.setChangedFor(serverPlayer, PlayerStage.Operation.ADD, stages);
        }
    }

    @ZenCodeType.Method
    public static void removeStage(Player player, String stage) {
        if (player instanceof ServerPlayer serverPlayer) {
            var playerStage = getPlayerData(serverPlayer);
            playerStage.removeStage(stage);
            playerStage.setChangedFor(serverPlayer, PlayerStage.Operation.REMOVE, stage);
        }
    }

    @ZenCodeType.Method
    public static List<String> getStages(Player player) {
        if (player instanceof ServerPlayer serverPlayer) {
            var playerStage = getPlayerData(serverPlayer);
            return playerStage.getStages();
        }
        return List.of();
    }

    @ZenCodeType.Method
    public static void removeAllStages(Player player) {
        if (player instanceof ServerPlayer serverPlayer) {
            var playerStage = getPlayerData(serverPlayer);
            playerStage.removeAllStages();
            playerStage.setChangedFor(serverPlayer, PlayerStage.Operation.REMOVE_ALL, null);
        }
    }

    @ZenCodeType.Method
    public static boolean hasStage(Player player, String stage) {
        if (player instanceof ServerPlayer serverPlayer) {
            return AStagesUtil.hasStage(serverPlayer, stage);
        }
        return false;
    }

    @ZenCodeType.Method
    public static boolean hasAtLeastOneStage(Player player, List<String> stages) {
        if (player instanceof ServerPlayer serverPlayer) {
            for (var stage : stages) {
                if (hasStage(serverPlayer, stage)) {
                    return true;
                }
            }
        }

        return false;
    }

    @ZenCodeType.Method
    public static boolean hasAllStages(Player player, List<String> stages) {
        if (player instanceof ServerPlayer serverPlayer) {
            for (var stage : stages) {
                if (!hasStage(serverPlayer, stage)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static PlayerStage getPlayerData(Player player) {
        return player.getData(AProvider.PLAYER_STAGE);
    }
}
