package tk.cupzyy.suicidePlugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import tk.cupzyy.suicidePlugin.commands.SuicideCommands;

public class SuicidePlugin extends JavaPlugin {
    @Override
    public void onEnable(){
        SuicideCommands commands = new SuicideCommands();
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[SuicidePlugin]: Plugin enabled");
        getCommand("kill").setExecutor(commands);
    }
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[SuicidePlugin]: Plugin disabled");
    }
}
