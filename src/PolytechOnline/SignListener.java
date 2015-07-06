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
		
		//village classes
		//village enforcer
		if(sign.getLine(1).equalsIgnoreCase("enforcerl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Enforcer-Light");
			sign.setLine(1, (ChatColor.RED+"Enforcer"));
			sign.setLine(2, (ChatColor.RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("enforcerh")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Enforcer-Heavy");
			sign.setLine(1, (ChatColor.RED+"Enforcer"));
			sign.setLine(2, (ChatColor.RED+"Heavy"));}
		
		//village ranger
		if(sign.getLine(1).equalsIgnoreCase("Rangerl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Ranger-Light");
			sign.setLine(1, (ChatColor.RED+"Ranger"));
			sign.setLine(2, (ChatColor.RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("rangerh")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Ranger-Heavy");
			sign.setLine(1, (ChatColor.RED+"Ranger"));
			sign.setLine(2, (ChatColor.RED+"Heavy"));}
		
		//village chemist
		if(sign.getLine(1).equalsIgnoreCase("Chemistl")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Chemist-Light");
			sign.setLine(1, (ChatColor.RED+"Chemist"));
			sign.setLine(2, (ChatColor.RED+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("chemisth")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Chemist-Heavy");
			sign.setLine(1, (ChatColor.RED+"Chemist"));
			sign.setLine(2, (ChatColor.RED+"Heavy"));}
		
		
		
		//castle	
		//castle enforcer
		if(sign.getLine(1).equalsIgnoreCase("enforcerlc")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Enforcer-Light");
			sign.setLine(1, (ChatColor.BLUE+"Enforcer"));
			sign.setLine(2, (ChatColor.BLUE+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("enforcerhc")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Enforcer-Heavy");
			sign.setLine(1, (ChatColor.BLUE+"Enforcer"));
			sign.setLine(2, (ChatColor.BLUE+"Heavy"));}
		
		//castle ranger
		if(sign.getLine(1).equalsIgnoreCase("rangerlc")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Ranger-Light");
			sign.setLine(1, (ChatColor.BLUE+"Ranger"));
			sign.setLine(2, (ChatColor.BLUE+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("rangerhc")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Ranger-Heavy");
			sign.setLine(1, (ChatColor.BLUE+"Ranger"));
			sign.setLine(2, (ChatColor.BLUE+"Heavy"));}
		
		//castle chemist
		if(sign.getLine(1).equalsIgnoreCase("chemistlc")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Chemist-Light");
			sign.setLine(1, (ChatColor.BLUE+"Chemist"));
			sign.setLine(2, (ChatColor.BLUE+"Light"));}
		if(sign.getLine(1).equalsIgnoreCase("chemisthc")){
			player.sendMessage(ChatColor.GREEN + "You made a pick class sign: Chemist-Heavy");
			sign.setLine(1, (ChatColor.BLUE+"Chemist"));
			sign.setLine(2, (ChatColor.BLUE+"Heavy"));}
		
		
		
		
		
		
		
		
		
		
		
		
		//sides
		if(sign.getLine(1).equalsIgnoreCase("castle")){
			player.sendMessage(ChatColor.GREEN + "You made a pick side sign: castle");
			sign.setLine(1, (ChatColor.BLACK+"Choose Side:"));
			sign.setLine(2, (ChatColor.DARK_RED+"CASTLE"));}
		if(sign.getLine(1).equalsIgnoreCase("village")){
			player.sendMessage(ChatColor.GREEN + "You made a pick side sign: village");
			sign.setLine(1, (ChatColor.BLACK+"Choose Side:"));
			sign.setLine(2, (ChatColor.DARK_RED+"VILLAGE"));}
		
		//teams not attached
		if(sign.getLine(1).equalsIgnoreCase("VillageTeam")){
			player.sendMessage(ChatColor.GREEN + "You created a team selecter-village");
			sign.setLine(1, (ChatColor.DARK_RED+"Village"));}
		if(sign.getLine(1).equalsIgnoreCase("CastleTeam")){
			player.sendMessage(ChatColor.GREEN + "You created a team selecter-castle");
			sign.setLine(1, (ChatColor.DARK_RED+"CastleTeam"));}
		
		}//sign change event	
	
			
		}

