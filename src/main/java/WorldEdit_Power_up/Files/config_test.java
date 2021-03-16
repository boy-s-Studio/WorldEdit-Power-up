package WorldEdit_Power_up.Files;

import WorldEdit_Power_up.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class config_test implements CommandExecutor, TabExecutor {

    String test = Main.getPlugin(Main.class).getConfig().getString("test");
    boolean power_up = Main.getPlugin(Main.class).getConfig().getBoolean("power_up");

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(label.equalsIgnoreCase("config_test")) {
            if(power_up == true){
                System.out.println(test);
            }
            else {
                System.out.println("power_up값을 true로 바꿔주세요");
            }
        }
        return false;
    }
    
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        return null;
    }
}
