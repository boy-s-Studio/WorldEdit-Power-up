package WorldEdit_Power_up.Commands;

import WorldEdit_Power_up.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class config_test implements CommandExecutor, TabExecutor {
    
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(label.equalsIgnoreCase("config_test")) {
            System.out.println(Main.getPlugin(Main.class).getConfig().getString("test"));
        }
        return false;
    }
    
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        
        
        
        return null;
    }
}
