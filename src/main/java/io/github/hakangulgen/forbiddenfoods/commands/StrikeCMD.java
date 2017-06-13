package io.github.hakangulgen.forbiddenfoods.commands;

import io.github.hakangulgen.forbiddenfoods.Strike;
import io.github.hakangulgen.forbiddenfoods.utils.ChatUtilities;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StrikeCMD implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            ChatUtilities.sendMessage(sender, "§cBu komut konsoldan kullanilamaz.");
            return true;
        }
        if(!sender.isOp()) {
            ChatUtilities.sendMessage(sender, "§cYetkin yok.");
            return true;
        }
        if(args.length == 2) {
            try {
                Player target = Bukkit.getPlayer(args[0]);
                int points = Integer.valueOf(args[1]);

                Strike.strikeLocation(target.getLocation());
                //TODO ADD NEGATIVE POINTS
            } catch (Exception e) {
                ChatUtilities.sendMessage(sender, "§c/strikep <player> <points>");
            }
        }
        return true;
    }
}
