package com.aurgiyalgo.TownyElections.commands;

import com.aurgiyalgo.TownyElections.commands.elections.*;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import com.aurgiyalgo.TownyElections.TownyElections;

public class ElectionsCommandHandler extends CommandHandler {

	public ElectionsCommandHandler() {
		addSubCommand(new ElectionsVoteSubCommand());
		addSubCommand(new ElectionsConvokeSubCommand());
		addSubCommand(new ElectionsListSubCommand());
		addSubCommand(new ElectionsStopSubCommand());
		addSubCommand(new ElectionsUnvoteSubCommand());
	}

	@Override
	protected boolean executeHelp(CommandSender sender) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', TownyElections.Text.ELECTIONS_HELP_MESSAGE));
		return true;
	}

}
