package EG.ACH;

import me.cyh2.eternalgalaxy.Util;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

import static me.cyh2.eternalgalaxy.EternalGalaxy.THAEadvancement;
import static me.cyh2.eternalgalaxy.EternalGalaxy.server;

public class EngineerSpecializingInEngines {
    public static void giveTHAEAchievement(Player player) {
        if (THAEadvancement != null) {
            if (!player.getAdvancementProgress(server.getAdvancement(THAEadvancement.getKey())).isDone()) {
                player.getAdvancementProgress(server.getAdvancement(THAEadvancement.getKey())).awardCriteria("criteria_name");
                ItemStack icon = new ItemStack(Material.DIAMOND);
                Collection<? extends Player> onlinePlayers = Bukkit.getServer().getOnlinePlayers();
                String name = ChatColor.GOLD + "§e[§a永恒星河§e]§d在宇宙中上天入地！\n§d造出一台火箭！";
                player.sendTitle(name, "");
                for (Player p : onlinePlayers) {
                    TextComponent text = new TextComponent("§e[§a永恒星河§e]§r" + player.getName() + "取得了成就§a[真正的上天入地]");
                    Util.SuperTEXTSCE(text, name, p);
                }
            }
        }
    }
}
