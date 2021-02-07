package tk.cupzyy.suicidePlugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.GOLD + "[SuicidePlugin]: Only players can use this command");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("kill")){
            player.setHealth(0.0);
        }
        return true;
    }
}
