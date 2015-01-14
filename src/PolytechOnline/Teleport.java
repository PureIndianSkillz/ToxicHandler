package PolytechOnline;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Teleport implements Listener{
	public Teleport (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		if(e.getAction() == Action.RIGHT_CLICK_AIR | e.getAction() == Action.RIGHT_CLICK_BLOCK){
			
			if(e.getMaterial()==Material.SLIME_BALL){
				
				Inventory inv = Bukkit.createInventory(null, 9, "§9Teleports");
				
				ItemStack wool = new ItemStack(Material.WOOL, 1);
				ItemMeta meta = wool.getItemMeta();
				meta.setDisplayName("§6S§4P§6H§4S");
				wool.setItemMeta(meta);
				
				
				ItemStack black = new ItemStack(Material.WOOL, 1, DyeColor.BLACK.getData());
				ItemMeta b = black.getItemMeta();
				b.setDisplayName("Lobby");
				black.setItemMeta(b);
				
				ItemStack blue = new ItemStack(Material.WOOL, 1, DyeColor.BLUE.getData());
				ItemMeta bl = blue.getItemMeta();
				bl.setDisplayName("Builders Monument");
				blue.setItemMeta(bl);
				
				ItemStack green = new ItemStack(Material.WOOL, 1, DyeColor.GREEN.getData());
				ItemMeta gr = green.getItemMeta();
				gr.setDisplayName("MLG Jumping Puzzle");
				green.setItemMeta(gr);
				
				inv.addItem(wool);
				inv.addItem(black);
				inv.addItem(blue);
				inv.addItem(green);
				e.getPlayer().openInventory(inv);
				
				Player player = e.getPlayer();
				if (player.isOp()){
				ItemStack pink = new ItemStack(Material.WOOL, 1, DyeColor.PINK.getData());
				ItemMeta pi = pink.getItemMeta();
				pi.setDisplayName("Op only Toxic Havoc Tp");
				pink.setItemMeta(pi);
				inv.addItem(pink);
				}
				player.updateInventory();
				}//slimeball
				}//rightclick
				}//player interact


	@EventHandler
	public void onClick(InventoryClickEvent e){
		//Wool teleports
		Player p = (Player) e.getWhoClicked();
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6S§4P§6H§4S")){
			World world = p.getWorld();
			Location loc = new Location(world,571, 49, -734, 89, 0);
			p.teleport(loc);
			p.sendMessage("You were teleported to §6S§4P§6H§4S!");}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Lobby")){
			World world = p.getWorld();
			Location loc = new Location(world,820, 65, -748, 0, 0);
			p.teleport(loc);
			p.sendMessage("You were teleported to Lobby!");}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Builders Monument")){
			World world = p.getWorld();
			Location loc = new Location(world,481, 98, -935, 180, 0);
			p.teleport(loc);
			p.sendMessage("You were teleported to the Builders Monument");}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Op only Toxic Havoc Tp")){
			World world = p.getWorld();
			Location loc = new Location(world,411, 134, 61, 190, 0);
			p.teleport(loc);
			p.sendMessage("You were teleported to the Toxic Havoc Map");}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("MLG Jumping Puzzle")){
			World world = p.getWorld();
			Location loc = new Location(world,427, 49, -739, 90, 0);
			p.teleport(loc);
			p.sendMessage("You were teleported to the MLG jumping puzzle");}
		
			}//inventory click
	

	@SuppressWarnings("deprecation")
	@EventHandler
	//nether star teleport
    public void onInteractEvent(PlayerInteractEvent event){  
            if(event.getAction().equals(Action.LEFT_CLICK_AIR)||equals(Action.LEFT_CLICK_BLOCK));{
                if(event.getPlayer().getItemInHand().getType() == Material.NETHER_STAR){
                    event.setCancelled(true);
                    Block target = event.getPlayer().getTargetBlock(null, 50);
                    float Yaw = event.getPlayer().getLocation().getYaw();
                    float Pitch = event.getPlayer().getLocation().getPitch();
                    Location loc = target.getLocation();
                    loc.setY(loc.getY()+1);
                    loc.setPitch(Pitch);
                    loc.setYaw(Yaw);
                    event.getPlayer().teleport(loc);
                    Player player = event.getPlayer();
                    player.getInventory().removeItem(player.getInventory().getItemInHand());
                    player.updateInventory();
                }//equal to netherstar
            }//rightclick
    }//player interact



















}