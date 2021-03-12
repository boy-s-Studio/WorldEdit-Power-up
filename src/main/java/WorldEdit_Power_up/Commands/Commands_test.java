package WorldEdit_Power_up.Commands;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class Commands_test implements CommandExecutor, TabExecutor {

    WorldEditPlugin wep;
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        
        if(args[0].equalsIgnoreCase("true")) {
            World w = p.getWorld();
            w.setGameRule(GameRule.DO_TILE_DROPS , true);
            System.out.println("");
        }
        else if(args[0].equalsIgnoreCase("false")) {
            World w = p.getWorld();
            w.setGameRule(GameRule.DO_TILE_DROPS , false);
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equals("test")) {
            if (args.length == 1) {
                return Arrays.asList("true", "false");
            }

        }
        return null;
    }
}

