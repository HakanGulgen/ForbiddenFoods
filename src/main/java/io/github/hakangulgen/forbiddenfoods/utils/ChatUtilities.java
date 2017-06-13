package io.github.hakangulgen.forbiddenfoods.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class ChatUtilities {

    public static final String PREFIX = "§8[§cForbiddenFoods§8] §7";

    public static final String NO_PERM = PREFIX + "§cYetkin yok.";

    public static void sendMessage(CommandSender sender, String msg) {
        if(sender instanceof ConsoleCommandSender)
            Bukkit.getLogger().info(format(msg));
        else
            sender.sendMessage(format(msg));
    }

    public static void broadcast(String msg) {
        Bukkit.broadcastMessage(format(msg));
    }

    private static String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
