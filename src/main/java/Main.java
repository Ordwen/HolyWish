import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Le plugin démarre.");
        getCommand("speedboots").setExecutor(new SpeedBoots());
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        getServer().addRecipe(BootsRecipe.getBootsRecipe());
    }

    @Override
    public void onDisable() {
        System.out.println("Le plugin s'éteint.");
    }

}
