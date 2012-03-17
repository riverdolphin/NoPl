package de.lordtobi.nopl;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class NoPlListener implements Listener {

    
	@EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent pcpe) {
		
		if(pcpe.getMessage().startsWith("/")) {
	    	
	    	if(pcpe.getMessage().contains("/ver") || pcpe.getMessage().contains("/version") || pcpe.getMessage().contains("/about") || pcpe.getMessage().contains("/icanhasbukkit") || !pcpe.getPlayer().isOp()) {
	    		
	    		if(!pcpe.getPlayer().isPermissionSet("nopl.ver")) {
	    			
	        		pcpe.setCancelled(true);
	        		
	        		pcpe.getPlayer().sendMessage(ChatColor.DARK_RED + "You don't have permission!");
	    			
	    		}
	    		
	    	}
	    	
	    	if(pcpe.getMessage().contains("/pl") || pcpe.getMessage().contains("/plugins") || !pcpe.getPlayer().isOp()) {
	    		
	    		if(!pcpe.getPlayer().isPermissionSet("nopl.pl")){
	
	        		pcpe.setCancelled(true);
	        		
	        		pcpe.getPlayer().sendMessage(ChatColor.DARK_RED + "You don't have permission!");
	    			
	    		}
	    		
	    	}
	    	
	    	if(pcpe.getMessage().contains("/help")) {
	    		
	    		if(!pcpe.getPlayer().isPermissionSet("nopl.help") || !pcpe.getPlayer().isOp()) {
	    			
	        		pcpe.setCancelled(true);
	        		
	        		pcpe.getPlayer().sendMessage(ChatColor.DARK_RED + "You don't have permission!");
	    			
	    		}
	    		
	    	}
	    	
	    	
	    	if(pcpe.getMessage().contains("/gc") || !pcpe.getPlayer().isOp()) {
	    		
	    		if(!pcpe.getPlayer().isPermissionSet("nopl.gc")) {
	        		
	        		pcpe.setCancelled(true);
	        		
	        		pcpe.getPlayer().sendMessage(ChatColor.DARK_RED + "You don't have permission!");
	    			
	    		}
	    		
	    	}
	    	
	    }
			
	}
	
}
