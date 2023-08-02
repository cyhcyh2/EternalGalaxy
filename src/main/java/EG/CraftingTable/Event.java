package EG.CraftingTable;

import BOSSES.BOSSONEARTH;
import net.skinsrestorer.api.exception.SkinRequestException;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.NPC;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.Bukkit;
import net.skinsrestorer.api.SkinsRestorerAPI;

public class Event implements Listener {
    @EventHandler
    public static void REB(BlockPlaceEvent e) {
        Block eb = e.getBlock();
        Location ebl = eb.getLocation();
        int x = ebl.getBlockX();
        int y = ebl.getBlockY();
        int z = ebl.getBlockZ();
        Material MainBlock = ebl.getBlock().getType();
        Material block1 = getBlockTypeAtLocation(e.getBlock().getWorld(), x, y, z + 1);
        Material block2 = getBlockTypeAtLocation(e.getBlock().getWorld(), x, y, z - 1);
        Material block3 = getBlockTypeAtLocation(e.getBlock().getWorld(), x + 1, y, z);
        Material block4 = getBlockTypeAtLocation(e.getBlock().getWorld(), x - 1, y, z);
        if (MainBlock == Material.NETHERITE_BLOCK && block1 == Material.DIAMOND_BLOCK && block2 == Material.DIAMOND_BLOCK && block3 == Material.DIAMOND_BLOCK && block4 == Material.DIAMOND_BLOCK) {
            NPC n = BOSSONEARTH.createNPC(eb);
            try {
                SkinsRestorerAPI.getApi().setSkin("awa", "cyh2");
            }catch (SkinRequestException t) {
                e.getPlayer().sendTitle("错误", "有些地方出了点错，请联系腐竹解决！");
            }
        }
    }
    public static Material getBlockTypeAtLocation(World world, int x, int y, int z) {
        Location location = new Location(world, x, y, z);
        return location.getBlock().getType();
    }
}
