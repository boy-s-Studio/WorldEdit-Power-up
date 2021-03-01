package WorldEdit_Power_up;

import com.sk89q.worldedit.bukkit.WorldEditPlugin;

import org.bukkit.Bukkit;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("플러그인 활성화");
        wep = getWorldEdit();
        Bukkit.getPluginManager().registerEvents(new Event(), this);

        //command class
        getCommand("/check").setExecutor(new commands());
        getCommand("test").setExecutor(new commands());

    }

    @Override
    public void onDisable() {

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