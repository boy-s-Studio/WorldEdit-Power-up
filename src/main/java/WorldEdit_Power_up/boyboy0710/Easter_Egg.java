package WorldEdit_Power_up.boyboy0710;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Random;

public class Easter_Egg implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {

        if(cmd.getName().equalsIgnoreCase("boyboy0710")) {
            Player p =(Player) sender;
            Random r = new Random();
            int kick = r.nextInt();

            if(kick == 10000) {
                p.sendMessage("당신은 엄청난 행운아?!");
            }
            else {
                p.kickPlayer("이스터애그였습니다");
            }

        }
        
        if(cmd.getName().equalsIgnoreCase("boy0710boy")) {
            Player p = (Player) sender;
            Random r = new Random();
            int kick = r.nextInt();
            
            if(kick == 999999999) {
                p.kickPlayer("당신은 1/99999999의 확률을 뚫고 킥당했습니다(Easter_Egg)");
            }
            
            else {
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK,99999999));
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK,99999999));
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK,99999999));
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK,99999999));
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_BLOCK,99999999));
                p.sendMessage("당신은 boy0710boy님의 축복을 받았습니다!!!!!");
            }
            
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
