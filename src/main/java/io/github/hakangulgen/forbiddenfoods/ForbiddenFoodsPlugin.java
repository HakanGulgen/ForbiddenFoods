package io.github.hakangulgen.forbiddenfoods;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ForbiddenFoodsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();
        registerCommands();

        getServer().getLogger().info("Plugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("Plugin has been disabled.");
    }

    private void registerListeners() {
        PluginManager pm = getServer().getPluginManager();


    }

    private void registerCommands() {

    }
}
