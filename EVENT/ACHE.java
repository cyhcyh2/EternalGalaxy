package EVENT;


import EG.ACH.TrulyHeavenAndEarth;
import me.cyh2.eternalgalaxy.EternalGalaxy;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.CraftItemEvent;

public class ACHE implements Listener {
    @EventHandler
    public static void TrulyHeavenAndEarth(EntityPickupItemEvent event) {
        if (event.getEntity() instanceof Player) {
            Player p = (Player) event.getEntity();
            if (event.getItem().getItemStack().equals(EternalGalaxy.Ritem)) {
                TrulyHeavenAndEarth.giveTHAEAchievement(p);
            }
        }
    }
    @EventHandler
    public static void TrulyHeavenAndEarthOnCraftingTable(CraftItemEvent event) {
        Player p = (Player) event.getWhoClicked();
        if (event.getRecipe().getResult().equals(EternalGalaxy.Ritem)) {
            TrulyHeavenAndEarth.giveTHAEAchievement(p);
        }
    }
}

