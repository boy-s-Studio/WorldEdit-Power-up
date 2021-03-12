package WorldEdit_Power_up.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class player_join_event implements Listener {
    
    @EventHandler
    public void join(PlayerJoinEvent e) {
        e.setJoinMessage(e.getPlayer() + "님이 입장하셨습니다");
    }
    
}
