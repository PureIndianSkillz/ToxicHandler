package PolytechOnline;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

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
				world.setSpawnLocation(820, 65, -748);
			}
			else {
				player.setGameMode(GameMode.CREATIVE);
				player.sendMessage(ChatColor.GOLD + "Welcome back team Dinosausage member. Your gamemode has been set to creative for you");
				Bukkit.broadcastMessage(ChatColor.GOLD+"Op " + ChatColor.BLUE + player.getDisplayName() + ChatColor.GOLD +" has joined the game" );
				Location loc = player.getLocation();
				player.playSound(loc, Sound.BLAZE_DEATH, 1, 0);
			}
			
		}
		@EventHandler
		public void onInteract(PlayerInteractEvent e){
			if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
				
				if(e.getMaterial()==Material.IRON_AXE){
					Player player = e.getPlayer();
					player.setVelocity(new Vector(player.getVelocity().getX(), 1, 
							player.getVelocity().getZ()));
					player.setVelocity(new Vector(player.getLocation().getDirection().getX(), 1, 
							player.getVelocity().getZ()));
                    player.getItemInHand().setDurability((short) (player.getItemInHand().getDurability()- Short.valueOf((short) -10)));
                    player.updateInventory();	
					
				
				}
				}
		
		
		
	
	
	
	}
		
	@EventHandler
	public void onClick(PlayerInteractEvent event){
		if(event.getMaterial()==Material.GOLD_SWORD){
			event.getPlayer().getWorld().strikeLightning(event.getPlayer().getTargetBlock(null, 50).getLocation());
			Player player = event.getPlayer();
			player.getInventory().removeItem(player.getInventory().getItemInHand());
			player.updateInventory();
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

