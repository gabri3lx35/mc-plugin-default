package me.gabri3lx35;

import org.bukkit.plugin.java.JavaPlugin;

public class McPluginDefault extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("This plugin is now running");
    }

    @Override
    public void onDisable() {
        System.out.println("This plugin is has stopped running");
    }
}
