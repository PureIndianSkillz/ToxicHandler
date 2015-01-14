package PolytechOnline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class ProxyCard implements Listener{
	public ProxyCard (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}
		
	@EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.PHYSICAL));
        Player player = event.getPlayer();
        {
            if (event.getClickedBlock().getType().equals(Material.STONE_PLATE)){
            if(player.getInventory().contains(Material.SLIME_BALL)){
            		event.setCancelled(false);
            		}
            	
            	else {
            		event.setCancelled(true);
            		
            			
            		}	
            		}
            	
            	
            	}	
            	
                  
            	
            }
	
	
       



}
