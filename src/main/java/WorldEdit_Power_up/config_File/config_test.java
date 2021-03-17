package WorldEdit_Power_up.config_File;

import WorldEdit_Power_up.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import java.util.List;

public class config_test implements CommandExecutor, TabExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(label.equalsIgnoreCase("config_test")) {
                String s = "와 대성공";
                
                String test = Main.getPlugin(Main.class).getConfig().getString("test");  //config를 불러온다
                Main.getPlugin(Main.class).getConfig().set("test", s);  //config 값을 설정한디
                Main.getPlugin(Main.class).saveConfig();  //컨피그 값을 저장한다
                Main.getPlugin(Main.class).reloadConfig();  //컨피그를 리로드 한다
            
                System.out.println(test);  //프린트 한다

            }


        return false;
    }
    
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        return null;
    }
}
