package EG.ACH;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

import static me.cyh2.eternalgalaxy.EternalGalaxy.THAEadvancement;
import static me.cyh2.eternalgalaxy.EternalGalaxy.server;

public class TrulyHeavenAndEarth {
    public static void giveTHAEAchievement(Player player) {
        if (THAEadvancement != null) {
            if (!player.getAdvancementProgress(server.getAdvancement(THAEadvancement.getKey())).isDone()) {
                player.getAdvancementProgress(server.getAdvancement(THAEadvancement.getKey())).awardCriteria("criteria_name");
                ItemStack icon = new ItemStack(Material.DIAMOND);
                Collection<? extends Player> onlinePlayers = Bukkit.getServer().getOnlinePlayers();
                String name = ChatColor.GOLD + "§e[§a永恒星河§e]§d在宇宙中上天入地！\n§d造出一台火箭！";
                player.sendTitle(name, "");
                for (Player p : onlinePlayers) {
                    ComponentBuilder t1 = new ComponentBuilder("§a[真正的上天入地]");
                    t1.event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/ad"));
                    t1.event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(name).create()));
                    ComponentBuilder t2 = new ComponentBuilder("§e[§a永恒星河§e]§r" + player.getName() + "取得了成就");
                    t2.append(t1.create());
                    p.spigot().sendMessage(t2.create());
                }
            }
        }
    }
}
