package EVENT;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static me.cyh2.eternalgalaxy.EternalGalaxy.methanol;

public class cs implements Listener {
    @EventHandler
    public static void cs(PlayerJoinEvent e) {
        e.getPlayer().getInventory().setItem(1, methanol);
    }
}
