package WorldEdit_Power_up;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Event implements Listener {

    @EventHandler
    public void join(PlayerJoinEvent e) {
        e.setJoinMessage(e.getPlayer() + "님이 입장하셨습니다");
    }
    
    @EventHandler
    public void BlockBreakEvent(BlockBreakEvent e) {
    
    
    
    }

}