package EG.CraftingTable;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import static me.cyh2.eternalgalaxy.EternalGalaxy.REitem;
import static me.cyh2.eternalgalaxy.EternalGalaxy.plugin;

public class RocketEngine {
    public static NamespacedKey REKey;
    public static Recipe RE() {
        REKey = new NamespacedKey(plugin, "ROCKET_ENGINE");
        ShapedRecipe recipe = new ShapedRecipe(REKey, REitem);
        recipe.shape("ABC", "DEF", "GHI");
        recipe.setIngredient('A', Material.GOLD_BLOCK);
        recipe.setIngredient('B', Material.IRON_INGOT);
        recipe.setIngredient('C', Material.GOLD_BLOCK);
        recipe.setIngredient('D', Material.IRON_BLOCK);
        recipe.setIngredient('E', Material.PISTON);
        recipe.setIngredient('F', Material.IRON_BLOCK);
        recipe.setIngredient('G', Material.DIAMOND);
        recipe.setIngredient('H', Material.IRON_INGOT);
        recipe.setIngredient('I', Material.DIAMOND);
        return recipe;
    }
}

