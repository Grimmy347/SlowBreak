package com.meeku.slowbreakPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class SlowBreak extends JavaPlugin {
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	Field field=net.minecraft.server.Block.class.getDeclaredField("strength");
    	field.setAccessible(true);
    	field.setFloat(net.minecraft.server.Block.BED, 50.0F);
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
}
