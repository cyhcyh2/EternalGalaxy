package EVENT;

import GUIS.SpaceGUI;
import me.cyh2.eternalgalaxy.EternalGalaxy;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import planet.MOON;

public class CGUI implements Listener {
    @EventHandler
    public static void Spacegui(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getInventory().equals(EternalGalaxy.SpaceGui)) {
            if (e.getCurrentItem() != null && e.getCurrentItem().equals(SpaceGUI.Moon)) {
                MOON.ToMoon(p);
            }
        }
    }
}
