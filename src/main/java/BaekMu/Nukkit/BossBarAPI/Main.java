package BaekMu.Nukkit.BossBarAPI;

import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

    @Override
    public void onLoad() {
        this.getLogger().info("Loaded.");
    }

    @Override
    public void onEnable() {
        this.getLogger().info("Enabled.");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Disabled.");
    }
}