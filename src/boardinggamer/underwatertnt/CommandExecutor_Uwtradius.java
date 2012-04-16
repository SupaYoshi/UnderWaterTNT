/*
 * UnderWaterTNT - by boardinggamer
 * 
 *
 * powered by Kickstarter
 */

package boardinggamer.underwatertnt;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class CommandExecutor_Uwtradius implements CommandExecutor {
	private UnderWaterTNT plugin;

	public CommandExecutor_Uwtradius(UnderWaterTNT plugin){
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command,String label, String[] args) {
		if (command.getName().equalsIgnoreCase("uwtradius")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Y U NO PLAYER??!111");
				return true;
			}

			if (args.length == 1){
				Player plr = (Player) sender;
				if (plr.isOp()){
					int newr = Integer.parseInt(args[0]);
					plugin.getConfig().set("Radius", newr);
					plugin.saveConfig();
					plr.sendMessage(ChatColor.AQUA+"You set the radius to "+newr+".");
				}
			}
			return true;
		}
		return false;
	}
}
