package WorldEdit_Power_up;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;

import org.bukkit.Bukkit;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

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
        getCommand("/check").setExecutor(new commands());
        getCommand("test").setExecutor(new commands());



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

/*
Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "명령어"); // 콘솔에서 명령어 실행
Bukkit.dispatchCommand(플레이어, "명령어"); // 플레이어의 권한으로 명령어 실행
 */
}