package com.aurgiyalgo.TownyElections.commands.government;

import com.aurgiyalgo.TownyElections.commands.SubCommand;
import com.aurgiyalgo.TownyElections.government.GovernmentData;
import com.palmergames.bukkit.towny.TownyUniverse;
import org.bukkit.entity.Player;

public class GovernmentListSubCommand extends SubCommand {

    public GovernmentListSubCommand() {
        super("list", 0);
    }

    @Override
    public boolean execute(Player player, String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (GovernmentData governmentData : governmentManager.getGovernmentDataList()) {
            stringBuilder.append(TownyUniverse.getInstance().getNation(governmentData.getUuid()));
            stringBuilder.append(" - ");
            stringBuilder.append(governmentData.getGovernmentType());
            stringBuilder.append("\n");
        }
        player.sendMessage(stringBuilder.toString());
        return true;
    }

}
