import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

public class SpeedBoots implements CommandExecutor {

    public static ItemStack getSpeedboots() {

        ItemStack speedboots = new ItemStack(Material.NETHERITE_BOOTS);
        ItemMeta meta = speedboots.getItemMeta();

        meta.setDisplayName(ChatColor.BOLD + "Speed Boots");
        meta.setLore(Arrays.asList(ChatColor.WHITE + "- Speed 2",ChatColor.WHITE + "- Jump 1"));
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        speedboots.setItemMeta(meta);

        return speedboots;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("speedboots")) {
            if (sender instanceof Player) {
                ((Player) sender).getInventory().addItem(getSpeedboots());
            }
        }
        return false;
    }

}
