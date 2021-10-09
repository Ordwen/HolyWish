import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Listeners implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {

        Player p = event.getPlayer();

        if(p.getInventory().getBoots() != null && p.getInventory().getBoots().hasItemMeta() && p.getInventory().getBoots().getItemMeta().equals(SpeedBoots.getSpeedboots().getItemMeta())) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 1));
            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 10, 1));
        }

    }

}
