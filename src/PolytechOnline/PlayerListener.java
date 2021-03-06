package PolytechOnline;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener implements Listener{

	public PlayerListener (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
        if (e.getClickedBlock().getState() instanceof Sign) {
            Sign s = (Sign) e.getClickedBlock().getState();
            
                     //village 
            		//village enforcer light
            		if(s.getLine(1).equalsIgnoreCase(ChatColor.RED+"enforcer"))
            			if (s.getLine(2).equalsIgnoreCase(ChatColor.RED+"light")){
    				e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Enforcer Class");
    				player.setMaxHealth(12);
    				player.setHealth(12);
    				ItemStack stonesword = new ItemStack(Material.STONE_SWORD, 1);
    				ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
    				ItemStack ironchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
    				ItemStack ironlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
    				ItemStack ironboots = new ItemStack(Material.IRON_BOOTS, 1);    				
    				ItemStack strength = new ItemStack(373, 1, (short) 8233);
    				ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
    				ItemStack harming = new ItemStack(373, 1, (short) 16396);
    				PlayerInventory pi = player.getInventory();
    				pi.clear();
    				pi.addItem(stonesword);
    				pi.addItem(strength);
    				pi.addItem(harming);
    				pi.addItem(harming);
    				pi.addItem(ppotato);
    				pi.setHelmet(ironhelmet);
    				pi.setChestplate(ironchest);
    				pi.setLeggings(ironlegs);
    				pi.setBoots(ironboots);
    				player.updateInventory();
    				World world = player.getWorld();
 					Location loc = new Location(world,-16, 50, -236, 180, 0);
 					player.teleport(loc);
 					player.sendMessage("You were teleported to the main bridge.");
    				
    				}
            		
            		//village enforcer heavy	
            		if(s.getLine(1).equalsIgnoreCase(ChatColor.RED+"enforcer"))
            			if (s.getLine(2).equalsIgnoreCase(ChatColor.RED+"heavy")){
    				e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Enforcer Class");
    					player.setMaxHealth(20);
    					player.setHealth(20);
    					ItemStack stonesword = new ItemStack(Material.STONE_SWORD, 1);
    					ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
    					ItemStack ironchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
    					ItemStack ironlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
    					ItemStack ironboots = new ItemStack(Material.IRON_BOOTS, 1);
    					ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
    					ItemStack strength = new ItemStack(373, 1, (short) 8233);
    					ItemStack harming = new ItemStack(373, 1, (short) 16396);
    					PlayerInventory pi = player.getInventory();
    					pi.clear();
    					pi.addItem(stonesword);
    					pi.addItem(strength);
    					pi.addItem(harming);
    					pi.addItem(harming);
    					pi.addItem(ppotato);
    					pi.setHelmet(ironhelmet);
    					pi.setChestplate(ironchest);
    					pi.setLeggings(ironlegs);
    					pi.setBoots(ironboots);
    					player.updateInventory();
    					World world = player.getWorld();
    					Location loc = new Location(world,-16, 50, -236, 180, 0);
     					player.teleport(loc);
     					player.sendMessage("You were teleported to the main bridge.");
    					
    				}               
                	
            		//village ranger light
            		if(s.getLine(1).equalsIgnoreCase(ChatColor.RED+"ranger"))
                		if (s.getLine(2).equalsIgnoreCase(ChatColor.RED+"light")){
        				e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Ranger Class");
        				player.setMaxHealth(12);
        				player.setHealth(12);
        				ItemStack wood = new ItemStack(Material.WOOD_SWORD, 1);
        				ItemStack chainhelmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        				ItemStack chainchest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        				ItemStack chainlegs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        				ItemStack chainboots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        				ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
        				ItemStack bow = new ItemStack(Material.BOW, 1);
        				bow.addEnchantment(Enchantment.DURABILITY, 1);
        				ItemStack arrow = new ItemStack(Material.ARROW, 64);       				
        				PlayerInventory pi = player.getInventory();
        				pi.clear();
        				pi.addItem(wood);
        				pi.addItem(bow);
        				pi.addItem(arrow);
        				pi.addItem(arrow);
        				pi.addItem(ppotato);
        				pi.setHelmet(chainhelmet);
        				pi.setChestplate(chainchest);
        				pi.setLeggings(chainlegs);
        				pi.setBoots(chainboots);
        				player.updateInventory();
        				World world = player.getWorld();
        				Location loc = new Location(world,-16, 50, -236, 180, 0);
     					player.teleport(loc);
     					player.sendMessage("You were teleported to the main bridge.");
        				
        				}
            		
            		//village ranger heavy
            		if(s.getLine(1).equalsIgnoreCase(ChatColor.RED+"ranger"))
                		if (s.getLine(2).equalsIgnoreCase(ChatColor.RED+"heavy")){
        				e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Ranger Class");
        					player.setMaxHealth(20);
        					player.setHealth(20);
        					ItemStack wood = new ItemStack(Material.WOOD_SWORD, 1);
        					ItemStack chainhelmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        					ItemStack chainchest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        					ItemStack chainlegs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        					ItemStack chainboots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        					ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
        					ItemStack bow = new ItemStack(Material.BOW, 1);
        					bow.addEnchantment(Enchantment.DURABILITY, 1);
        					ItemStack arrow = new ItemStack(Material.ARROW, 64);       				
        					PlayerInventory pi = player.getInventory();
        					pi.clear();
        					pi.addItem(wood);
        					pi.addItem(bow);
        					pi.addItem(arrow);
        					pi.addItem(arrow);
        					pi.addItem(ppotato);
        					pi.setHelmet(chainhelmet);
        					pi.setChestplate(chainchest);
        					pi.setLeggings(chainlegs);
        					pi.setBoots(chainboots);
        					player.updateInventory();
        					World world = player.getWorld();
        					Location loc = new Location(world,-16, 50, -236, 180, 0);
         					player.teleport(loc);
         					player.sendMessage("You were teleported to the main bridge.");
        				
        				}
                	
            		//village chemist light
                	if(s.getLine(1).equalsIgnoreCase(ChatColor.RED+"Chemist"))
            			if (s.getLine(2).equalsIgnoreCase(ChatColor.RED+"light")){            				
            				e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Chemist Class");
            				player.setMaxHealth(12);
            				player.setHealth(12);
            				ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            				ItemStack leatherchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            				ItemStack leatherlegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            				ItemStack leatherboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            				ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
            				ItemStack swiftness = new ItemStack(373, 1, (short) 8194);
            				ItemStack harming = new ItemStack(373, 4, (short) 16420);
            				ItemStack stick = new ItemStack(Material.STICK, 1);
            				stick.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
            				stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
            				PlayerInventory pi = player.getInventory();
            				pi.clear();
            				pi.addItem(stick);
            				pi.addItem(swiftness);
            				pi.addItem(harming);
            				pi.addItem(ppotato);
            				pi.setHelmet(leatherhelmet);
            				pi.setChestplate(leatherchest);
            				pi.setLeggings(leatherlegs);
            				pi.setBoots(leatherboots);
            				player.updateInventory();
            				World world = player.getWorld();
            				Location loc = new Location(world,-16, 50, -236, 180, 0);
         					player.teleport(loc);
         					player.sendMessage("You were teleported to the main bridge.");
            	
            				}
                	
                	//village chemist heavy
                	if(s.getLine(1).equalsIgnoreCase(ChatColor.RED+"Chemist"))
            			if (s.getLine(2).equalsIgnoreCase(ChatColor.RED+"heavy")){            				
            					e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Chemist Class");
            					player.setMaxHealth(20);
            					player.setHealth(20);
            					ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
            					ItemStack leatherchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
            					ItemStack leatherlegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
            					ItemStack leatherboots = new ItemStack(Material.LEATHER_BOOTS, 1);
            					ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
            					ItemStack swiftness = new ItemStack(373, 1, (short) 8194);
            					ItemStack harming = new ItemStack(373, 4, (short) 16420);
            					ItemStack stick = new ItemStack(Material.STICK, 1);
            					stick.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
            					stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
            					PlayerInventory pi = player.getInventory();
            					pi.clear();
            					pi.addItem(stick);
            					pi.addItem(swiftness);
            					pi.addItem(harming);
            					pi.addItem(ppotato);
            					pi.setHelmet(leatherhelmet);
            					pi.setChestplate(leatherchest);
            					pi.setLeggings(leatherlegs);
            					pi.setBoots(leatherboots);
            					player.updateInventory();
            					World world = player.getWorld();
            					Location loc = new Location(world,-16, 50, -236, 180, 0);
             					player.teleport(loc);
             					player.sendMessage("You were teleported to the main bridge.");
            					
            					}
                	
                	//castle
                	 //castle enforcer light	
                	 if(s.getLine(1).equalsIgnoreCase(ChatColor.BLUE+"enforcer"))
                 		if (s.getLine(2).equalsIgnoreCase(ChatColor.BLUE+"light")){
             					e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Enforcer Class");
             					player.setMaxHealth(12);
             					player.setHealth(12);
             					ItemStack stonesword = new ItemStack(Material.STONE_SWORD, 1);
             					ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
             					ItemStack ironchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
             					ItemStack ironlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
             					ItemStack ironboots = new ItemStack(Material.IRON_BOOTS, 1);
             					ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
             					ItemStack strength = new ItemStack(373, 1, (short) 8233);
             					ItemStack harming = new ItemStack(373, 1, (short) 16396);
             					PlayerInventory pi = player.getInventory();
             					pi.clear();
             					pi.addItem(stonesword);
             					pi.addItem(strength);
             					pi.addItem(harming);
             					pi.addItem(harming);
             					pi.addItem(ppotato);
             					pi.setHelmet(ironhelmet);
             					pi.setChestplate(ironchest);
             					pi.setLeggings(ironlegs);
             					pi.setBoots(ironboots);
             					player.updateInventory();
             					World world = player.getWorld();
             					Location loc = new Location(world,-6, 50, -72, 0, 0);
             					player.teleport(loc);
             					player.sendMessage("You were teleported to the main bridge.");
             					
             					}
                	
                	 //castle enforcer heavy
                	 if(s.getLine(1).equalsIgnoreCase(ChatColor.BLUE+"enforcer"))
                  		if (s.getLine(2).equalsIgnoreCase(ChatColor.BLUE+"heavy")){
              					e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Enforcer Class");
              					player.setMaxHealth(20);
              					player.setHealth(20);
              					ItemStack stonesword = new ItemStack(Material.STONE_SWORD, 1);            				
              					ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET, 1);
              					ItemStack ironchest = new ItemStack(Material.IRON_CHESTPLATE, 1);
              					ItemStack ironlegs = new ItemStack(Material.IRON_LEGGINGS, 1);
              					ItemStack ironboots = new ItemStack(Material.IRON_BOOTS, 1); 
              					ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
              					ItemStack strength = new ItemStack(373, 1, (short) 8233);
              					ItemStack harming = new ItemStack(373, 1, (short) 16396);
              					PlayerInventory pi = player.getInventory();
              					pi.clear();
              					pi.addItem(stonesword);
              					pi.addItem(strength);
              					pi.addItem(harming);
              					pi.addItem(harming);
              					pi.addItem(ppotato);
              					pi.setHelmet(ironhelmet);
              					pi.setChestplate(ironchest);
              					pi.setLeggings(ironlegs);
              					pi.setBoots(ironboots);
              					player.updateInventory();
              					World world = player.getWorld();
              					Location loc = new Location(world,-6, 50, -72, 0, 0);
             					player.teleport(loc);
             					player.sendMessage("You were teleported to the main bridge.");
              				
             					}   	
                     
                	 //castle ranger light
                     if(s.getLine(1).equalsIgnoreCase(ChatColor.BLUE+"ranger"))
                 		if (s.getLine(2).equalsIgnoreCase(ChatColor.BLUE+"light")){                				
                 				e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Ranger Class");
                 				player.setMaxHealth(12);
                				player.setHealth(12);
                 				ItemStack wood = new ItemStack(Material.WOOD_SWORD, 1);
                 				ItemStack chainhelmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
                 				ItemStack chainchest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
                 				ItemStack chainlegs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                 				ItemStack chainboots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
                 				ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
                 				ItemStack bow = new ItemStack(Material.BOW, 1);
                 				bow.addEnchantment(Enchantment.DURABILITY, 1);
                 				ItemStack arrow = new ItemStack(Material.ARROW, 64);                				
                 				PlayerInventory pi = player.getInventory();
                 				pi.clear();
                 				pi.addItem(wood);
                 				pi.addItem(bow);
                 				pi.addItem(arrow);
                 				pi.addItem(arrow);
                 				pi.addItem(ppotato);
                 				pi.setHelmet(chainhelmet);
                 				pi.setChestplate(chainchest);
                 				pi.setLeggings(chainlegs);
                 				pi.setBoots(chainboots);
                 				player.updateInventory();
                 				World world = player.getWorld();
                 				Location loc = new Location(world,-6, 50, -72, 0, 0);
             					player.teleport(loc);
             					player.sendMessage("You were teleported to the main bridge.");
                 	
                				}
                    
                     //castle ranger heavy
                     if(s.getLine(1).equalsIgnoreCase(ChatColor.BLUE+"ranger"))
                  		if (s.getLine(2).equalsIgnoreCase(ChatColor.BLUE+"heavy")){                				
                  				e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Ranger Class");
                  				player.setMaxHealth(20);
                				player.setHealth(20);
                  				ItemStack wood = new ItemStack(Material.WOOD_SWORD, 1);
                  				ItemStack chainhelmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
                  				ItemStack chainchest = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
                  				ItemStack chainlegs = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                  				ItemStack chainboots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
                  				ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
                  				ItemStack bow = new ItemStack(Material.BOW, 1);
                  				bow.addEnchantment(Enchantment.DURABILITY, 1);
                  				ItemStack arrow = new ItemStack(Material.ARROW, 64);                				
                  				PlayerInventory pi = player.getInventory();
                  				pi.clear();
                  				pi.addItem(wood);
                  				pi.addItem(bow);
                  				pi.addItem(arrow);
                  				pi.addItem(arrow);
                  				pi.addItem(ppotato);
                  				pi.setHelmet(chainhelmet);
                  				pi.setChestplate(chainchest);
                  				pi.setLeggings(chainlegs);
                  				pi.setBoots(chainboots);
                  				player.updateInventory();
                  				World world = player.getWorld();
                  				Location loc = new Location(world,-6, 50, -72, 0, 0);
             					player.teleport(loc);
             					player.sendMessage("You were teleported to the main bridge.");
                  				
                 				}
                       
                       //castle chemist light	
                       if(s.getLine(1).equalsIgnoreCase(ChatColor.BLUE+"chemist"))
                    	   if (s.getLine(2).equalsIgnoreCase(ChatColor.BLUE+"light")){                     				
                     			e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Chemist Class");
                     			player.setMaxHealth(12);
                    			player.setHealth(12);
                     			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
                     			ItemStack leatherchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                   				ItemStack leatherlegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
                   				ItemStack leatherboots = new ItemStack(Material.LEATHER_BOOTS, 1);
                   				ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
                   				ItemStack swiftness = new ItemStack(373, 1, (short) 8194);
                   				ItemStack harming = new ItemStack(373, 4, (short) 16420);
                   				ItemStack stick = new ItemStack(Material.STICK, 1);
                   				stick.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
                   				stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
                   				PlayerInventory pi = player.getInventory();
                  				pi.clear();
                     			pi.addItem(stick);
                     			pi.addItem(swiftness);
                     			pi.addItem(harming);
                     			pi.addItem(ppotato);
                    			pi.setHelmet(leatherhelmet);
                   				pi.setChestplate(leatherchest);
                   				pi.setLeggings(leatherlegs);
                   				pi.setBoots(leatherboots);
                   				player.updateInventory();
                   				World world = player.getWorld();
                   				Location loc = new Location(world,-6, 50, -72, 0, 0);
             					player.teleport(loc);
             					player.sendMessage("You were teleported to the main bridge.");
                   	
                    			} 
                      
                       //castle chemist heavy
                       if(s.getLine(1).equalsIgnoreCase(ChatColor.BLUE+"chemist"))
                    	   if (s.getLine(2).equalsIgnoreCase(ChatColor.BLUE+"heavy")){                     				
                     			e.getPlayer().sendMessage(ChatColor.RED+"You have chosen the Chemist Class");
                     			player.setMaxHealth(20);
                    			player.setHealth(20);
                     			ItemStack leatherhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
                   				ItemStack leatherchest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
                   				ItemStack leatherlegs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
                   				ItemStack leatherboots = new ItemStack(Material.LEATHER_BOOTS, 1);
                   				ItemStack ppotato = new ItemStack(Material.POISONOUS_POTATO);
                   				ItemStack swiftness = new ItemStack(373, 1, (short) 8194);
                   				ItemStack harming = new ItemStack(373, 4, (short) 16420);
                   				ItemStack stick = new ItemStack(Material.STICK, 1);
                   				stick.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
                   				stick.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
                    			PlayerInventory pi = player.getInventory();
                    			pi.clear();
                     			pi.addItem(stick);
                     			pi.addItem(swiftness);
                   				pi.addItem(harming);
                   				pi.addItem(ppotato);
                   				pi.setHelmet(leatherhelmet);
                   				pi.setChestplate(leatherchest);
                   				pi.setLeggings(leatherlegs);
                   				pi.setBoots(leatherboots);
                   				player.updateInventory();
                   				World world = player.getWorld();
                   				Location loc = new Location(world,-6, 50, -72, 0, 0);
             					player.teleport(loc);
             					player.sendMessage("You were teleported to the main bridge.");
                   			
                    			}                        	
                       
                       //side village
                       if(s.getLine(1).equalsIgnoreCase(ChatColor.BLACK+"choose side:"))
                     	if (s.getLine(2).equalsIgnoreCase(ChatColor.DARK_RED+"village"))
                     			{
                         		World world = player.getWorld();
                         		Location loc = player.getLocation();
                         		world.setSpawnLocation(571, 49, -734);
                         		player.sendMessage(ChatColor.DARK_PURPLE+"You choose the side: Village");
                         		World world1 = player.getWorld();
                         		Location loc1 = new Location(world1, 571, 49, -734, 89, 0);
                				player.teleport(loc1);
                         		}
                         	
                       //side castle
                       if(s.getLine(1).equalsIgnoreCase(ChatColor.BLACK+"choose side:"))
                     		if (s.getLine(2).equalsIgnoreCase(ChatColor.DARK_RED+"castle"))
                         	{
                         		World world = player.getWorld();
                         		Location loc = player.getLocation();
                         		world.setSpawnLocation(571, 49, -734);
                         		player.sendMessage(ChatColor.DARK_PURPLE+"You choose the side: Castle");
                         		World world1 = player.getWorld();
                         		Location loc1 = new Location(world1, 571, 49, -734, 89, 0);
                				player.teleport(loc1); }
                       
                         	
                         	
                         		
                         	}}}
            	