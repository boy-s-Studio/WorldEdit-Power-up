package WorldEdit_Power_up.Commands;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class Commands_test implements CommandExecutor, TabExecutor {

    WorldEditPlugin wep;



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p =(Player) sender;
        if (label.equalsIgnoreCase("test")) {
            World w = p.getWorld();
            w.setGameRule(GameRule.COMMAND_BLOCK_OUTPUT , true);
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        return null;
    }
}
