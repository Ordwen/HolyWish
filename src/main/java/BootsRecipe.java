import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

public class BootsRecipe {

    public static ShapedRecipe getBootsRecipe() {

        ShapedRecipe recipe = new ShapedRecipe(SpeedBoots.getSpeedboots());
        recipe.shape("%*%","%$%","%%%");
        recipe.setIngredient('%', Material.NETHERITE_INGOT);
        recipe.setIngredient('*', Material.BEACON);
        recipe.setIngredient('$', Material.NETHERITE_BOOTS);

        return recipe;
    }
}
