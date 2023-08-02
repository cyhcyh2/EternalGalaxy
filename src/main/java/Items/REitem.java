package Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class REitem {
    public static RecipeChoice.MaterialChoice iRE () {
        RecipeChoice.MaterialChoice ire = new RecipeChoice.MaterialChoice(Material.CLOCK);
        ItemStack iREitem = ire.getItemStack();
        ItemMeta REmeta = iREitem.getItemMeta();
        REmeta.setDisplayName("火箭发动机");
        List<String> RElore = new ArrayList<>();
        RElore.add(ChatColor.LIGHT_PURPLE + "一个火箭发动机");
        RElore.add(ChatColor.AQUA + "尝试用它造一个火箭？");
        REmeta.setLore(RElore);
        REmeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        REmeta.setUnbreakable(true);
        REmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        iREitem.setItemMeta(REmeta);
        return ire;
    }
}
