package me.cyh2.eternalgalaxy;

import Commands.rocket;
import EG.CraftingTable.METHANOL;
import EG.CraftingTable.Rocket;
import EG.CraftingTable.RocketEngine;
import GUIS.SpaceGUI;
import org.bukkit.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementDisplay;
import org.bukkit.advancement.AdvancementDisplayType;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import planet.MOON;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import static GUIS.bottoms.QuickSpaceGUI.set_item;

public final class EternalGalaxy extends JavaPlugin implements Listener {
    public static Logger logger;
    public static Plugin plugin;
    public static Server server;
    public static Advancement THAEadvancement;
    public static Advancement ESEadvancement;
    public static ItemStack REitem = new ItemStack(Material.COMPASS);
    public static ItemStack Ritem = new ItemStack(Material.PISTON);
    public static ItemStack methanol;
    public static ItemStack LiquidFuel;
    public static ItemStack icon;
    public static String name;
    public static World moon;
    public static World SP1;
    public static Inventory SpaceGui;
    public static File SSDataFile;
    public static YamlConfiguration SSData;
    @Override
    public void onEnable() {
        logger = getLogger();
        plugin = getPlugin(this.getClass());
        server = getServer();
        saveResource("PlayerDatas/SpaceStation.yml", false);
        SSDataFile = new File(getDataFolder() + "/PlayerDatas/SpaceStation.yml");
        SSData = YamlConfiguration.loadConfiguration(SSDataFile);
        PluginManager PM = server.getPluginManager();
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.GREEN.toString() +  "-----------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.GREEN.toString() + "   永恒星河玩法插件已启动！");
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.RED.toString() + ChatColor.UNDERLINE +  "   你正在使用的是快照版本！");
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.GREEN.toString() + "-----------------------------------------------");
        //
        ItemMeta REmeta = REitem.getItemMeta();
        REmeta.setDisplayName("火箭发动机");
        List<String> RElore = new ArrayList<>();
        RElore.add(ChatColor.LIGHT_PURPLE + "一个火箭发动机");
        RElore.add(ChatColor.AQUA + "尝试用它造一个火箭？");
        REmeta.setLore(RElore);
        REmeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        REmeta.setUnbreakable(true);
        REmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        REitem.setItemMeta(REmeta);
        //
        Ritem = new ItemStack(Material.CLOCK);
        ItemMeta Rmeta = Ritem.getItemMeta();
        Rmeta.setDisplayName("初级火箭");
        List<String> Rlore = new ArrayList<>();
        Rlore.add(ChatColor.AQUA + "较为普通的火箭，只能飞往月球和星际空间");
        Rlore.add(ChatColor.RED + "启动需要10液体燃料");
        Rlore.add(ChatColor.LIGHT_PURPLE + "品质：一般");
        Rmeta.setLore(Rlore);
        Rmeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        Rmeta.setUnbreakable(true);
        Rmeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        Ritem.setItemMeta(Rmeta);
        //
        methanol = Items.methanol.CMethanol();
        //
        LiquidFuel = Items.Liquid_Fuel.CLF();
        //
        NamespacedKey key = new NamespacedKey(this, "ROCKET");
        THAEadvancement = new Advancement() {
            @Override
            public Collection<String> getCriteria() {
                return null;
            }

            @Override
            public AdvancementDisplay getDisplay() {
                return null;
            }

            @Override
            public NamespacedKey getKey() {
                return key;
            }
        };
        //
        icon = new ItemStack(Material.DIAMOND);
        name = ChatColor.GOLD + "§e[§a永恒星河§e]§d∞真正的上天入地！";
        icon = new ItemStack(Material.DIAMOND);
        name = ChatColor.GOLD + "§e[§a永恒星河§e]§d真正的上天入地！";
        //
        server.addRecipe(EG.CraftingTable.RocketEngine.RE());
        server.addRecipe(EG.CraftingTable.Rocket.R());
        server.addRecipe(EG.CraftingTable.METHANOL.M());
        PM.registerEvents(new EG.CraftingTable.Event(), plugin);
        PM.registerEvents(new E.ACHE(), plugin);
        PM.registerEvents(new E.CGUI(), plugin);
        PM.registerEvents(new E.cre(), plugin);
        PM.registerEvents(this, plugin);
        server.getPluginCommand("rocket").setExecutor(new rocket());
        getServer().getUnsafe().loadAdvancement(THAEadvancement.getKey(), Util.createAdvancementMessage(THAEadvancement, name, icon).toString());
        //getServer().getUnsafe().loadAdvancement(THAEadvancement.getKey(), Util.createAdvancementMessage(THAEadvancement, name, icon).toString());
        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "eternalgalaxy:advancements");
        if (Bukkit.getWorld("Moon") == null) {
            moon = MOON.creatorMoonWorld();
        } else {
            moon = Bukkit.getWorld("Moon");
        }
        if (Bukkit.getWorld("space1") == null) {
            SP1 = planet.SPACE.space.creatorSpace1World();
        } else {
            SP1 = Bukkit.getWorld("space1");
        }
        set_item(true);
        SpaceGui = SpaceGUI.CreateGUI();
    }

    @Override
    public void onDisable() {
        server.removeRecipe(Rocket.REKey);
        server.removeRecipe(RocketEngine.REKey);
        server.removeRecipe(METHANOL.REKey);
        server.getUnsafe().removeAdvancement(THAEadvancement.getKey());
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.GREEN.toString() +  "-----------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.GREEN.toString() + "   永恒星河玩法插件已关闭！");
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.GREEN.toString() + "   感谢使用！再见！");
        Bukkit.getConsoleSender().sendMessage("§e[§a永恒星河§e]" + ChatColor.GREEN.toString() + "-----------------------------------------------");
    }
}
