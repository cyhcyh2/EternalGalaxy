package E;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static me.cyh2.eternalgalaxy.EternalGalaxy.Ritem;
import static me.cyh2.eternalgalaxy.EternalGalaxy.SpaceGui;

public class cre implements Listener {

    @EventHandler
    public void use(PlayerInteractEvent event) {
        if (event.getAction().toString().contains("RIGHT")) { // 检测是否为右键动作
            ItemStack ei = event.getItem();
            ItemMeta em = ei.getItemMeta();
            if (ei != null && ei.getType() == Material.CLOCK && em.hasDisplayName() && em.getLore().equals(Ritem.getItemMeta().getLore())) {
                event.getPlayer().openInventory(SpaceGui);
                String s = "hi";
                event.setCancelled(true);
            }
        }
    }

}