package Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

public class methanol {
    public static ItemStack CMethanol () {
        ItemStack waterBottle = new ItemStack(Material.POTION);
        ItemMeta meta = waterBottle.getItemMeta();
        PotionMeta potionMeta = (PotionMeta) meta;
        potionMeta.setBasePotionData(new PotionData(PotionType.WATER));
        waterBottle.setItemMeta(potionMeta);
        ItemMeta wm = waterBottle.getItemMeta();
        wm.setDisplayName("甲醇（不可食用的工业酒精）");
        List<String> Flore = new ArrayList<>();
        Flore.add(ChatColor.AQUA + "比较重要的工业物品");
        Flore.add(ChatColor.RED + "可用于制作各种物品（如：火箭燃料）");
        Flore.add(ChatColor.LIGHT_PURPLE + "品质：较为重要");
        wm.setLore(Flore);
        waterBottle.setItemMeta(wm);
        return waterBottle;
    }
}