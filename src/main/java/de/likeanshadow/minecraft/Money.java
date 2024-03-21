package de.likeanshadow.minecraft;

import de.likeanshadow.minecraft.Commands.MoneyCommand;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Money extends JavaPlugin {
    private static Plugin plugin;
    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        this.getLogger().log(Level.INFO, "Starting Money-Plugin");
        getPlugin().getServer().getPluginCommand("money").setExecutor(new MoneyCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
