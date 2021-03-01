package WorldEdit_Power_up;

import com.sk89q.worldedit.IncompleteRegionException;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.bukkit.BukkitPlayer;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.regions.Region;
import com.sk89q.worldedit.world.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class commands implements TabExecutor {

    WorldEditPlugin wep;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        if (label.equalsIgnoreCase("/check")) {

            Region region = null;

            BukkitPlayer bplayer = BukkitAdapter.adapt(p);
            try {
                region = wep.getSession(p).getSelection((World) p.getWorld());
            } catch (IncompleteRegionException e) {
                e.printStackTrace();
            }

            BlockVector3 max = region.getMaximumPoint();
            BlockVector3 min = region.getMinimumPoint();

            p.sendMessage(max.toString() + ", " + min.toString());

        }

        if (label.equalsIgnoreCase("test")) {
            Region region = null;
            BukkitPlayer bplayer = BukkitAdapter.adapt(p);
            try {
                region = wep.getSession(p).getSelection((World) p.getWorld());
            } catch (IncompleteRegionException e) {
                e.printStackTrace();
            }
            BlockVector3 pos1 = region.getMaximumPoint();
            BlockVector3 pos2 = region.getMinimumPoint();

        }
        return false;
    }
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equals("")) {
            if (args.length == 1) {

            }
            else if(args.length == 2) {

            }
            else if(args.length == 3) {

            }
        }
        return null;
    }


}
