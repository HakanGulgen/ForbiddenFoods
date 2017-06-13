package io.github.hakangulgen.forbiddenfoods.listeners;

import io.github.hakangulgen.forbiddenfoods.Strike;
import io.github.hakangulgen.forbiddenfoods.utils.ChatUtilities;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDropItemListener implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        if(!e.getItemDrop().getType().equals(Material.BREAD)) {
            return;
        }
        e.setCancelled(true);
        Strike.strikeLocation(e.getPlayer().getLocation());
        //TODO ADD NEGATIVE POINTS FOR DROP BREAD
        ChatUtilities.sendMessage(e.getPlayer(), "§4Ekmek düşürme sebebiyle çarpıldın ve negatif puan aldın!");
    }
}
