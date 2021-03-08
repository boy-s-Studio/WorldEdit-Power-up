package WorldEdit_Power_up.boyboy0710;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Random;

public class Easter_Egg implements CommandExecutor, TabExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String s, String[] strings) {

        if(cmd.getName().equalsIgnoreCase("boyboy0710")) {
            Player p =(Player) Sender;
            Random r = new Random();
            int kick = r.nextInt();

            if(kick == 10000) {
                p.sendMessage("당신은 엄청난 행운아?!");
            }
            else {
                p.kickPlayer("이스터애그였습니다");
            }

        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
