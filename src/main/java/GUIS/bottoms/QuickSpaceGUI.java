package GUIS.bottoms;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class QuickSpaceGUI {
    public static ItemStack Earth = new ItemStack(Material.LAPIS_BLOCK);
    public static ItemStack Space1 = new ItemStack(Material.BLACK_CONCRETE);
    public static ItemStack Moon = new ItemStack(Material.ANDESITE);
    public static void set_item (Boolean IsSet) {
        if (IsSet) {
            //
            ItemMeta em = Earth.getItemMeta();
            em.setDisplayName("§a地球");
            List<String> EFlore = new ArrayList<>();
            EFlore.add(ChatColor.AQUA + "§9人类母星");
            EFlore.add(ChatColor.RED + "§a矿产资源丰富");
            EFlore.add(ChatColor.LIGHT_PURPLE + "§c高级星球，具有智慧生命");
            EFlore.add(ChatColor.LIGHT_PURPLE + "§c危险等级：⭐");
            em.setLore(EFlore);
            Earth.setItemMeta(em);
            //
            ItemMeta s1m = Space1.getItemMeta();
            s1m.setDisplayName("§e星际空间");
            List<String> SP1Flore = new ArrayList<>();
            SP1Flore.add(ChatColor.AQUA + "§9位于地球和月球之间的星际空间");
            SP1Flore.add(ChatColor.RED + "§d可以建造空间站");
            SP1Flore.add(ChatColor.LIGHT_PURPLE + "§c危险等级：⭐⭐⭐");
            s1m.setLore(SP1Flore);
            Space1.setItemMeta(s1m);
            //
            ItemMeta MM = Moon.getItemMeta();
            MM.setDisplayName("§d月球");
            List<String> MFlore = new ArrayList<>();
            MFlore.add(ChatColor.AQUA + "§9地球唯一的卫星");
            MFlore.add(ChatColor.RED + "§d可以建造科考站");
            MFlore.add(ChatColor.LIGHT_PURPLE + "§c危险等级：⭐⭐⭐⭐");
            MM.setLore(MFlore);
            Moon.setItemMeta(MM);
            //
        }
    }
}
