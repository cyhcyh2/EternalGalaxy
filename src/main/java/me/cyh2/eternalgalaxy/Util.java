package me.cyh2.eternalgalaxy;

import com.google.gson.JsonObject;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Util {
    public static void SuperTEXTSCE(TextComponent TC, String TEXT, Player player) {
        TC.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(TEXT).create()));
        player.spigot().sendMessage(TC);
    }
    public static JsonObject createAdvancementMessage(Advancement advancement, String name, ItemStack icon) {
        // 创建 JSON 格式的自定义成就消息
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", "display");
        jsonObject.addProperty("title", name);
        jsonObject.addProperty("description", "");

        JsonObject iconObject = new JsonObject();
        iconObject.addProperty("item", icon.getType().toString());
        iconObject.addProperty("data", icon.getDurability());
        if (icon.hasItemMeta()) {
            ItemMeta im = icon.getItemMeta();
            im.setDisplayName(ChatColor.RED.toString() + ChatColor.ITALIC + "火箭");
            icon.setItemMeta(im);
        }
        jsonObject.add("icon", iconObject);

        jsonObject.addProperty("frame", "task");
        jsonObject.addProperty("announce_to_chat", true);
        jsonObject.addProperty("show_toast", true);
        jsonObject.addProperty("hidden", false);

        JsonObject criteriaObject = new JsonObject();
        JsonObject criteriaContentObject = new JsonObject();
        criteriaContentObject.addProperty("trigger", "minecraft:impossible");

        criteriaObject.add("criteria_name", criteriaContentObject);
        jsonObject.add("criteria", criteriaObject);

        // 将 JSON 转换为字节数组发送给玩家
        return jsonObject;
    }
    public static void ps(EternalGalaxy plugin, Player player, Sound sound) {
        player.playSound(player.getLocation(), sound, 100.0f, 1.0f);
    }
}
