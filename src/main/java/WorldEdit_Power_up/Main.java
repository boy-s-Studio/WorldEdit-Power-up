package WorldEdit_Power_up;

import com.sk89q.worldedit.IncompleteRegionException;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.bukkit.BukkitPlayer;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.regions.Region;
import com.sk89q.worldedit.world.World;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("플러그인 활성화");
        wep = getWorldEdit();
    }

    @Override
    public void onDisable() {

    }

    public WorldEditPlugin getWorldEdit() {
        Plugin p = Bukkit.getServer().getPluginManager().getPlugin("worldEdit");
        if(p instanceof WorldEditPlugin) {
            return (WorldEditPlugin) p;
        }
        else {
            return null;
        }
    }

    WorldEditPlugin wep;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;
        if(label.equalsIgnoreCase("/check")) {

            Region region = null;

            BukkitPlayer bplayer = BukkitAdapter.adapt(p);
            try {
                region = wep.getSession(p).getSelection((World) p.getWorld());
            }
            catch(IncompleteRegionException e) {
                e.printStackTrace();
            }

            BlockVector3 max = region.getMaximumPoint();
            BlockVector3 min = region.getMinimumPoint();

            p.sendMessage(max.toString() + ", " + min.toString());

        }
        return false;
    }

}
/*
Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "명령어"); // 콘솔에서 명령어 실행
Bukkit.dispatchCommand(플레이어, "명령어"); // 플레이어의 권한으로 명령어 실행
 */
