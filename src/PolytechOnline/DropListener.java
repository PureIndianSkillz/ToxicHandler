package PolytechOnline;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DropListener implements Listener{
	public DropListener (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}
		
	
	@EventHandler	
	//Prevents player from throwing weapons//
	public void onPlayerDropItem(PlayerDropItemEvent event) {
		Player player = event.getPlayer();
		if (!player.isOp()){
		if(event.getItemDrop().getItemStack().getType() == Material.BOWL){
			event.setCancelled(true);
			event.getPlayer().sendMessage(ChatColor.DARK_PURPLE + "You attempt to drop the item. But it flies back into your hand!");}
		if(event.getItemDrop().getItemStack().getType() == Material.STONE_SWORD){
			event.setCancelled(true);
			event.getPlayer().sendMessage(ChatColor.DARK_PURPLE + "You attempt to drop the item. But it flies back into your hand!");}
		if(event.getItemDrop().getItemStack().getType() == Material.WOOD_SWORD){
			event.setCancelled(true);
			event.getPlayer().sendMessage(ChatColor.DARK_PURPLE + "You attempt to drop the item. But it flies back into your hand!");}
		if(event.getItemDrop().getItemStack().getType() == Material.BOW){
			event.setCancelled(true);
			event.getPlayer().sendMessage(ChatColor.DARK_PURPLE + "You attempt to drop the item. But it flies back into your hand!");}
		if(event.getItemDrop().getItemStack().getType() == Material.ARROW){
			event.setCancelled(true);
			event.getPlayer().sendMessage(ChatColor.DARK_PURPLE + "You attempt to drop the item. But it flies back into your hand!");}
		if(event.getItemDrop().getItemStack().getType() == Material.STICK){
			event.setCancelled(true); 
			event.getPlayer().sendMessage(ChatColor.DARK_PURPLE + "You attempt to drop the item. But it flies back into your hand!");}
			}
	}//player drop event

	@EventHandler
	//Prevents player from taking off armor//
		public  void onClick(InventoryClickEvent event){
	    if (event.getSlotType() == InventoryType.SlotType.ARMOR){
		     Player player = (Player) event.getWhoClicked();
		     if (!player.isOp()){ 
		    	 
		    event.setCancelled(true);
		     }
	    }
	    		}
	
	@EventHandler	  
		//Prevents player from dropping items on death//
		public void onPlayerDeath(PlayerDeathEvent death){
		        	death.getDrops().clear();
		     }

}
		
		
	