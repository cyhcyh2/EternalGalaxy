package EG.CraftingTable;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static me.cyh2.eternalgalaxy.EternalGalaxy.*;

public class Rocket {
    public static NamespacedKey REKey;
    public static Recipe R() {
        REKey = new NamespacedKey(plugin, "ROCKET");
        ShapedRecipe recipe = new ShapedRecipe(REKey, Ritem);
        RecipeChoice mi = new RecipeChoice.ExactChoice(REitem);
        recipe.shape("ABC", "DEF", "GHI");
        recipe.setIngredient('A', Material.GOLD_BLOCK);
        recipe.setIngredient('B', Material.IRON_INGOT);
        recipe.setIngredient('C', Material.GOLD_BLOCK);
        recipe.setIngredient('D', Material.IRON_BLOCK);
        recipe.setIngredient('E', mi);
        recipe.setIngredient('F', Material.IRON_BLOCK);
        recipe.setIngredient('G', Material.DIAMOND);
        recipe.setIngredient('H', Material.IRON_INGOT);
        recipe.setIngredient('I', Material.DIAMOND);
        return recipe;
    }
}
