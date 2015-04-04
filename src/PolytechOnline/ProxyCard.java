package PolytechOnline;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
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
            if (!player.isOp()){
            if(player.getInventory().contains(Material.SLIME_BALL)){
            		event.setCancelled(false);
            		}	
            else {
            		event.setCancelled(true);
            		}}
            
            
            		
            }//equals stone plate
           
            if (event.getClickedBlock().getType().equals(Material.IRON_PLATE)){
                if (!player.isOp()){
                if(player.getInventory().contains(Material.GOLD_NUGGET)){
                		event.setCancelled(false);
                		}	
                else {
                		event.setCancelled(true);
                		}}
                
                
                		
                } 
        	}//get player	
            }//player interact
	
	
			
	
	

	
			}//end
