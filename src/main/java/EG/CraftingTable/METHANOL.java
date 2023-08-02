package EG.CraftingTable;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import static me.cyh2.eternalgalaxy.EternalGalaxy.methanol;
import static me.cyh2.eternalgalaxy.EternalGalaxy.plugin;

public class METHANOL {
    public static NamespacedKey REKey;
    public static Recipe M() {
        REKey = new NamespacedKey(plugin, "METHANOL");
        ShapedRecipe recipe = new ShapedRecipe(REKey, methanol);
        recipe.shape("AB", "CD");
        recipe.setIngredient('A', Material.COAL_BLOCK);
        recipe.setIngredient('B', Material.COAL_BLOCK);
        recipe.setIngredient('C', Material.COAL_BLOCK);
        recipe.setIngredient('D', Material.COAL_BLOCK);
        return recipe;
    }
}
