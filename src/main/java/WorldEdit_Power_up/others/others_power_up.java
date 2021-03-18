package WorldEdit_Power_up.others;

import WorldEdit_Power_up.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.Arrays;
import java.util.List;

public class others_power_up implements CommandExecutor, TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(label.equalsIgnoreCase("power_up")) {
            if(args[0].equalsIgnoreCase("true")) {
                Main.getPlugin(Main.class).getConfig().set("power_up", true);
                Main.getPlugin(Main.class).reloadConfig();
            }

            if(args[0].equalsIgnoreCase("false")) {
                Main.getPlugin(Main.class).getConfig().set("power_up", true);
                Main.getPlugin(Main.class).reloadConfig();
            }


        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {

        if (command.getName().equals("power_up")) {
            if (args.length == 1) {
                return Arrays.asList("true", "false");
            }


        }
        return null;
    }
}
