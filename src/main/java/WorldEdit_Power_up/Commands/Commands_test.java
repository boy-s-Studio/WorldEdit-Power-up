package WorldEdit_Power_up.Commands;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class Commands_test implements CommandExecutor, TabExecutor {

    WorldEditPlugin wep;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("test")) {
            System.out.println("test");
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        return null;
    }
}
