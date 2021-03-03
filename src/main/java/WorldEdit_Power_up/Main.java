package WorldEdit_Power_up;

import WorldEdit_Power_up.Commands.Command_check;
import WorldEdit_Power_up.Commands.Commands_test;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;

import org.bukkit.Bukkit;

import org.bukkit.World;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Main extends JavaPlugin {

    public ConsoleCommandSender console = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                  WorldEdit_Power_up 를러그인을 불러왔습니다");
        System.out.println("                  플러그인 제작자 : boy0710boy, boyboy0710");
        System.out.println("    최신버전 다운 사이트 : https://github.com/boy-s-Studio/WorldEdit-Power-up");
        System.out.println("-----------------------------------------------------------------------------");
        wep = getWorldEdit();
        Bukkit.getPluginManager().registerEvents(new Event(), this);

        //command class
        getCommand("/check").setExecutor(new Command_check());
        getCommand("/check").setTabCompleter(new Command_check());

        getCommand("test").setExecutor(new Commands_test());
        getCommand("test").setTabCompleter(new Commands_test());


    }

    @Override
    public void onDisable() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                WorldEdit_Power_up 를러그인이 비활성화되었습니다");
        System.out.println("                  플러그인 제작자 : boy0710boy, boyboy0710");
        System.out.println("    최신버전 다운 사이트 : https://github.com/boy-s-Studio/WorldEdit-Power-up");
        System.out.println("-----------------------------------------------------------------------------");
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

/*
Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "명령어"); // 콘솔에서 명령어 실행
Bukkit.dispatchCommand(플레이어, "명령어"); // 플레이어의 권한으로 명령어 실행
 */

/*
대충 아이디어
1.mode 추가
 ex) brush mode, read mode 등등
     명령어로 변경
2.
3.
 */