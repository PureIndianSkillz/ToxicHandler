package PolytechOnline;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ToxicHandler extends JavaPlugin{ 
	public static  Logger logger = Logger.getLogger("Minecraft");
	public static ToxicHandler plugin;
	
	
	
	public void onEnable() {
		new PolytechOnline.SignListener(this);
		new PolytechOnline.PlayerListener(this);
		new PolytechOnline.DropListener(this);
		new PolytechOnline.ProxyCard(this);
		new PolytechOnline.Teleport(this);
		new PolytechOnline.Join(this);
		PluginDescriptionFile pdfFile = this.getDescription();
		ToxicHandler.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " Toxic Havoc Development Build Has Been Enabled");
		}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	    Player player = (Player) sender;
	   
			
	   //send to spawn
	   if(commandLabel.equalsIgnoreCase("spawn")){
		   World world = player.getWorld();
			Location loc = new Location(world,820, 65, -748, 0, 0);
			player.teleport(loc);
			}
		
	   //Give player a proxy card
	   if(commandLabel.equalsIgnoreCase("proxycard")){
			PlayerInventory pi = player.getInventory();
			if (!player.getInventory().contains(Material.SLIME_BALL)){
				ItemStack proxycard = new ItemStack(Material.SLIME_BALL, 1);
				pi.addItem(proxycard);
				player.sendMessage(ChatColor.GOLD +"A proxycard appears in your inventory");
        		}
			else {
				player.sendMessage(ChatColor.RED + "You appear to already have a proxy card, please check your inventory");	
				}
			
			
		}	
	
			
			
			
			
			
			
			
			
			
			
		
		
		
			
			
			return true;}
	    
	
	
	
	
	public static void start() {
		
		
		
		
	}
	public static void stop(){
		
		
		
	}
}