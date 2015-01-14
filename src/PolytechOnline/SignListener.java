package PolytechOnline;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SignListener implements Listener{
	public SignListener (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}
		
	
	@EventHandler	
	
	public void onSignCreate(SignChangeEvent sign)
	{
		Player player = sign.getPlayer();
		
		if(sign.getLine(1).equalsIgnoreCase("knightl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Knight-Light");
			sign.setLine(1, (ChatColor.DARK_RED+"Knight"));
			sign.setLine(2, (ChatColor.DARK_RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("knighth")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Knight-Heavy");
			sign.setLine(1, (ChatColor.DARK_RED+"Knight"));
			sign.setLine(2, (ChatColor.DARK_RED+"Heavy"));}
		
		if(sign.getLine(1).equalsIgnoreCase("archerl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Archer-Light");
			sign.setLine(1, (ChatColor.DARK_RED+"Archer"));
			sign.setLine(2, (ChatColor.DARK_RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("archerh")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Archer-Heavy");
			sign.setLine(1, (ChatColor.DARK_RED+"Archer"));
			sign.setLine(2, (ChatColor.DARK_RED+"Heavy"));}
		
		if(sign.getLine(1).equalsIgnoreCase("wizardl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Wizard-Light");
			sign.setLine(1, (ChatColor.DARK_RED+"Wizard"));
			sign.setLine(2, (ChatColor.DARK_RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("wizardh")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Wizard-Heavy");
			sign.setLine(1, (ChatColor.DARK_RED+"Wizard"));
			sign.setLine(2, (ChatColor.DARK_RED+"Heavy"));}
		
		if(sign.getLine(1).equalsIgnoreCase("farmerl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Farmer-Light");
			sign.setLine(1, (ChatColor.DARK_RED+"Farmer"));
			sign.setLine(2, (ChatColor.DARK_RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("farmerh")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Farmer-Heavy");
			sign.setLine(1, (ChatColor.DARK_RED+"Farmer"));
			sign.setLine(2, (ChatColor.DARK_RED+"Heavy"));}
		
		if(sign.getLine(1).equalsIgnoreCase("bowmanl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Bowman-Light");
			sign.setLine(1, (ChatColor.DARK_RED+"Bowman"));
			sign.setLine(2, (ChatColor.DARK_RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("bowmanh")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Bowman-Heavy");
			sign.setLine(1, (ChatColor.DARK_RED+"Bowman"));
			sign.setLine(2, (ChatColor.DARK_RED+"Heavy"));}
		
		if(sign.getLine(1).equalsIgnoreCase("alchemistl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Alchemist-Light");
			sign.setLine(1, (ChatColor.DARK_RED+"Alchemist"));
			sign.setLine(2, (ChatColor.DARK_RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("alchemisth")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Alchemist-Heavy");
			sign.setLine(1, (ChatColor.DARK_RED+"Alchemist"));
			sign.setLine(2, (ChatColor.DARK_RED+"Heavy"));}
		
		if(sign.getLine(1).equalsIgnoreCase("castle")){
			player.sendMessage(ChatColor.GREEN + "You made a pick side sign: castle");
			sign.setLine(1, (ChatColor.BLACK+"Choose Side:"));
			sign.setLine(2, (ChatColor.DARK_RED+"CASTLE"));}
		
		if(sign.getLine(1).equalsIgnoreCase("village")){
			player.sendMessage(ChatColor.GREEN + "You made a pick side sign: village");
			sign.setLine(1, (ChatColor.BLACK+"Choose Side:"));
			sign.setLine(2, (ChatColor.DARK_RED+"VILLAGE"));}
		
		if(sign.getLine(1).equalsIgnoreCase("VillageTeam")){
			player.sendMessage(ChatColor.GREEN + "You created a team selecter-village");
			sign.setLine(1, (ChatColor.DARK_RED+"Village"));}
		
		if(sign.getLine(1).equalsIgnoreCase("CastleTeam")){
			player.sendMessage(ChatColor.GREEN + "You created a team selecter-castle");
			sign.setLine(1, (ChatColor.DARK_RED+"CastleTeam"));}
		
		}	
	
			
		}

