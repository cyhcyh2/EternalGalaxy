package planet.SPACE;

import org.bukkit.Material;
import org.bukkit.entity.Player;

public class GenerateSpaceStation {
    public static void CSS (Player player) {
        player.getLocation().subtract(0, 1, 0).getBlock().setType(Material.GOLD_BLOCK);
        player.getLocation().subtract(-1, 1, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, 1, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(0, 1, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(0, 1, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, 1, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, 1, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, 1, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, 1, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        // dpc
        player.getLocation().subtract(-2, 0, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, 0, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, 0, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, 0, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, 0, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        //
        player.getLocation().subtract(2, 0, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, 0, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, 0, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, 0, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, 0, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        //
        player.getLocation().subtract(0, 0, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, 0, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, 0, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, 0, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, 0, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        // 1c
        player.getLocation().subtract(-2, -1, 0).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(-2, -1, 1).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(-2, -1, 2).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(-2, -1, -1).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(-2, -1, -2).getBlock().setType(Material.GLASS);
        //
        player.getLocation().subtract(2, -1, 0).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(2, -1, 1).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(2, -1, 2).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(2, -1, -1).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(2, -1, -2).getBlock().setType(Material.GLASS);
        //
        player.getLocation().subtract(0, -1, -2).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(1, -1, -2).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(2, -1, -2).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(-1, -1, -2).getBlock().setType(Material.GLASS);
        player.getLocation().subtract(-2, -1, -2).getBlock().setType(Material.GLASS);
        // 2c
        player.getLocation().subtract(-2, -2, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, -2, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, -2, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, -2, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, -2, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        //
        player.getLocation().subtract(2, -2, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, -2, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, -2, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, -2, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, -2, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        //
        player.getLocation().subtract(0, -2, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, -2, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, -2, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, -2, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, -2, -2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        //
        player.getLocation().subtract(0, -2, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, -2, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(2, -2, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, -2, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-2, -2, 2).getBlock().setType(Material.POLISHED_DEEPSLATE);
        // 3c
        player.getLocation().subtract(0, -3, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, -3, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, -3, 0).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(0, -3, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(0, -3, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, -3, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, -3, -1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(1, -3, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        player.getLocation().subtract(-1, -3, 1).getBlock().setType(Material.POLISHED_DEEPSLATE);
        // upc
    }
}
