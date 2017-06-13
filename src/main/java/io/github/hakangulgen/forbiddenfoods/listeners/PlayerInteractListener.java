package io.github.hakangulgen.forbiddenfoods.listeners;

import io.github.hakangulgen.forbiddenfoods.Strike;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if(e.getItem() == null || e.getItem().getType() == Material.AIR) {
            return;
        }
        if(e.getItem().getType() != Material.PORK || e.getItem().getType() != Material.GRILLED_PORK) {
            return;
        }
        Player p = e.getPlayer();
        Strike.strikeLocation(p.getLocation());
    }
}
