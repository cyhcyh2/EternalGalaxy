package Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Liquid_Fuel {
    public static ItemStack CLF() {
        ItemStack ILF = new ItemStack(Material.POTION);
        ItemMeta MI = ILF.getItemMeta();
        if (MI != null) {
            MI.setDisplayName("液体火箭燃料");
            List<String> Flore = new ArrayList<>();
            Flore.add(ChatColor.AQUA + "重要的太空探索用物品");
            Flore.add(ChatColor.RED + "可用于驱动液体燃料火箭");
            Flore.add(ChatColor.LIGHT_PURPLE + "品质：重要");
            MI.setLore(Flore);
            ILF.setItemMeta(MI);
        }
        return ILF;
    }
}
