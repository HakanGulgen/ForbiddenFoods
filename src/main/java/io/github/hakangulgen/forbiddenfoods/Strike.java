package io.github.hakangulgen.forbiddenfoods;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Strike {

    public static void strikeLocation(Player p) {

        p.setFireTicks(5);
        p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 5, 5));
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 5, 5));
        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 5, 5));

        for(int i = 0; i < 5; i++) {
            p.getWorld().strikeLightning(p.getLocation());
        }
    }
}
