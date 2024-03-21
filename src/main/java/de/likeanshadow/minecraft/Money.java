package de.likeanshadow.minecraft;

import jdk.jfr.internal.LogLevel;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Money extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().log(Level.INFO, "Starting Money-Plugin");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
