package WorldEdit_Power_up.Commands;

import WorldEdit_Power_up.Main;
import com.sk89q.worldedit.IncompleteRegionException;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldedit.bukkit.BukkitPlayer;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.regions.Region;
import com.sk89q.worldedit.world.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class Command_save_loc implements CommandExecutor, TabExecutor {

    WorldEditPlugin wep;

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String s, String[] strings) {
        
        if(s.equalsIgnoreCase("/save_loc")) {
            Player p =(Player) Sender;
            Region region = null;
            BukkitPlayer bplayer = BukkitAdapter.adapt(p);
            
            try {
                region = wep.getSession(p).getSelection((World) p.getWorld());
            } catch (IncompleteRegionException e) {
                e.printStackTrace();
            }
            
            BlockVector3 max = region.getMaximumPoint();
            BlockVector3 min = region.getMinimumPoint();
            
            Main.getPlugin(Main.class).getConfig().set("loc_1", max);
            Main.getPlugin(Main.class).getConfig().set("loc_2", min);//config 값을 설정한디
            Main.getPlugin(Main.class).saveConfig();  //컨피그 값을 저장한다
            Main.getPlugin(Main.class).reloadConfig();  //컨피그를 리로드 한다
            
            System.out.println("마지막으로 지정된 위치를 저장하였습니다");
            System.out.println("첫번째 위치:" + max +" " + "두번째 위치:" + min);
        }
        
        return false;
    }
    
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        
        return null;
    }
    
}
