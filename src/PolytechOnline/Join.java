package PolytechOnline;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Join implements Listener{

	public Join (JavaPlugin plugin){plugin.getServer().getPluginManager().registerEvents(this, plugin);}
		@EventHandler 
		public void onPlayerJoin(PlayerJoinEvent event)
		{
			Player player = event.getPlayer();
			if (!player.isOp()){
				PlayerInventory pi = player.getInventory();
				ItemStack proxycard = new ItemStack(Material.SLIME_BALL, 1);
				pi.clear();
				pi.addItem(proxycard);
				player.sendMessage(ChatColor.GOLD + "Welcome to Polytech Online!");
				player.sendMessage(ChatColor.GREEN + "Right Click your proxy card to bring up a list of teleports and left click on the place you want to go to.");
				World world = player.getWorld();
 				Location loc = new Location(world,820, 65, -748, 0, 0);
				player.teleport(loc);
				
			}
			else {
				player.setGameMode(GameMode.CREATIVE);
				player.sendMessage(ChatColor.GOLD + "Welcome back team Dinosausage member. Your gamemode has been set to creative for you");
				
				
				
			}
			
		}
	
		
		
		
		
	
	
	
	}

