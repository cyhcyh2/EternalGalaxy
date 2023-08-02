package E;

import me.cyh2.eternalgalaxy.EternalGalaxy;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import planet.MOON;

import java.io.IOException;

import static GUIS.bottoms.QuickSpaceGUI.*;
import static me.cyh2.eternalgalaxy.EternalGalaxy.plugin;
import static me.cyh2.eternalgalaxy.Util.ps;

public class CGUI implements Listener {
    @EventHandler
    public static void Spacegui(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().equals(EternalGalaxy.SpaceGui)) {
            if (e.getCurrentItem() != null && e.getCurrentItem().equals(Earth)) {
                if (p.getBedSpawnLocation() == null) {
                    p.teleport(Bukkit.getWorld("world").getSpawnLocation());

                } else {
                    p.teleport(p.getBedSpawnLocation());
                }
                ps((EternalGalaxy) plugin, p, Sound.ENTITY_FIREWORK_ROCKET_LAUNCH);
                e.setCancelled(true);
            }
            if (e.getCurrentItem() != null && e.getCurrentItem().equals(Space1)) {
                planet.SPACE.space.ToSpace1(p);
                ps((EternalGalaxy) plugin, p, Sound.ENTITY_FIREWORK_ROCKET_LAUNCH);
                e.setCancelled(true);
            }
            if (e.getCurrentItem() != null && e.getCurrentItem().equals(Moon)) {
                MOON.ToMoon(p);
                ps((EternalGalaxy) plugin, p, Sound.ENTITY_FIREWORK_ROCKET_LAUNCH);
                e.setCancelled(true);
            }
        }
    }
}
