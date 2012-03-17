package de.lordtobi.nopl;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoPl extends JavaPlugin {
	
    @Override
	public void onDisable() {
		
        PluginDescriptionFile pdf = this.getDescription();
		
		System.out.println("[" + pdf.getName() + "] " + pdf.getName() + " v" + pdf.getVersion() + " disabled!");
		
	}
    
	@Override
    public void onEnable() {
    	
        PluginManager pm = getServer().getPluginManager();
        
        pm.registerEvents(new NoPlListener(), this);
        
        PluginDescriptionFile pdf = this.getDescription();
        
        System.out.println("[" + pdf.getName() + "] " + pdf.getName() + " v" + pdf.getVersion() + " enabled!");
        
    }
}
