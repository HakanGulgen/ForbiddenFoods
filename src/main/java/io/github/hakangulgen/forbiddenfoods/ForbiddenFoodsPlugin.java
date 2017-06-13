package io.github.hakangulgen.forbiddenfoods;

import io.github.hakangulgen.forbiddenfoods.commands.StrikeCMD;
import io.github.hakangulgen.forbiddenfoods.listeners.PlayerDropItemListener;
import io.github.hakangulgen.forbiddenfoods.listeners.PlayerInteractListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ForbiddenFoodsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();
        registerCommands();

        getLogger().info("Plugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin has been disabled.");
    }

    private void registerListeners() {
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new PlayerDropItemListener(), this);
        pm.registerEvents(new PlayerInteractListener(), this);
    }

    private void registerCommands() {
        getCommand("strikep").setExecutor(new StrikeCMD());
    }
}
