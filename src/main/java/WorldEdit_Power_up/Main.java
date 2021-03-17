package WorldEdit_Power_up;

import WorldEdit_Power_up.Commands.Command_check;
import WorldEdit_Power_up.config_File.config_reload;
import WorldEdit_Power_up.config_File.config_test;
import WorldEdit_Power_up.Events.block_break_event;
import WorldEdit_Power_up.Events.player_join_event;
import WorldEdit_Power_up.others.Easter_Egg;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;

import org.bukkit.Bukkit;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public ConsoleCommandSender console = Bukkit.getConsoleSender();
    String power_up = this.getConfig().getString("power_up");
    
    @Override
    public void onEnable() {
        if(power_up == "true") {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                  WorldEdit_Power_up 를러그인을 불러왔습니다");
            System.out.println("                  플러그인 제작자 : boy0710boy, boyboy0710");
            System.out.println("    최신버전 다운 사이트 : https://github.com/boy-s-Studio/WorldEdit-Power-up");
            System.out.println("-----------------------------------------------------------------------------");
            
            Bukkit.getPluginManager().registerEvents(new player_join_event(), this);
            Bukkit.getPluginManager().registerEvents(new block_break_event(), this);
    
            //command class
            getCommand("/check").setExecutor(new Command_check());
            getCommand("/check").setTabCompleter(new Command_check());
    
            getCommand("config_test").setExecutor(new config_test());
            getCommand("config_test").setTabCompleter(new config_test());
    
            getCommand("config_reload").setExecutor(new config_reload());
            getCommand("config_reload").setTabCompleter(new config_reload());
    
            getCommand("boyboy0710").setExecutor(new Easter_Egg());
            getCommand("boyboy0710").setTabCompleter(new Easter_Egg());
    
            getCommand("boy0710boy").setExecutor(new Easter_Egg());
            getCommand("boy0710boy").setTabCompleter(new Easter_Egg());
    
        }
        
        else {
            System.out.println("config.yml에 있는 power_up 부분을 true 바꿔주십시오");
        }
    
        getCommand("config_reload").setExecutor(new config_reload());
        getCommand("config_reload").setTabCompleter(new config_reload());
        
        wep = getWorldEdit();
        
        
        //config.yml
        getConfig().options().copyDefaults(true);
        saveConfig();



    }
    
    @Override
    public void onDisable() {
        if(power_up == "true") {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                WorldEdit_Power_up 를러그인이 비활성화되었습니다");
            System.out.println("                  플러그인 제작자 : boy0710boy, boyboy0710");
            System.out.println("    최신버전 다운 사이트 : https://github.com/boy-s-Studio/WorldEdit-Power-up");
            System.out.println("-----------------------------------------------------------------------------");
        }

        else {
            System.out.println("config.yml에 있는 power_up 부분을 true 바꿔주십시오");
        }
        
        //config.yml
        saveConfig();
    }
    
    public WorldEditPlugin getWorldEdit() {
        Plugin p = Bukkit.getServer().getPluginManager().getPlugin("worldEdit");
        if (p instanceof WorldEditPlugin) {
            return (WorldEditPlugin) p;
        } else {
            return null;
        }
    
    }
    
    WorldEditPlugin wep;

}
