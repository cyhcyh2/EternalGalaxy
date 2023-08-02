package Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    public static RecipeChoice.MaterialChoice iRocket () {
        RecipeChoice.MaterialChoice ir = new RecipeChoice.MaterialChoice(Material.CLOCK);
        ItemStack Ritem = ir.getItemStack();
        ItemMeta Rmeta = Ritem.getItemMeta();
        Rmeta.setDisplayName("火箭");
        List<String> Rlore = new ArrayList<>();
        Rlore.add(ChatColor.LIGHT_PURPLE + "一个火箭！");
        Rlore.add(ChatColor.AQUA + "翱翔天际吧！");
        Rmeta.setLore(Rlore);
        Rmeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        Rmeta.setUnbreakable(true);
        Rmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Ritem.setItemMeta(Rmeta);
        ir.getItemStack().setItemMeta(Rmeta);
        return ir;
    }
}
