package PolytechOnline;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Gamemode implements Listener{
	public Gamemode (JavaPlugin plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);}

	ArrayList<Player> teamcastle = new ArrayList<Player>();
	ArrayList<Player> teamvillage = new ArrayList<Player>(); 
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	  {
		 Player player = (Player)sender;
		 if (!(sender instanceof Player))
		    {
		     sender.sendMessage("You aren't a player");
		     return true;
		    }
		    if (cmd.getName().equalsIgnoreCase("jointeam"))
		    {
		      if (args.length == 0)
		      {
		        sender.sendMessage("Specify a team.");
		        return true;
		      }
		      if (args.length == 1)
		      {
		        if (args[0].equalsIgnoreCase("castle"))
		        {
		          if ((this.teamvillage.contains(player)) || (this.teamcastle.contains(player))){
		            sender.sendMessage("You're already on a team!");
		            return true;}
		          this.teamcastle.add(player);
		          
		        }
		       
		      }
		
		
		
		
		
		
	  }
	











return true; 



}}