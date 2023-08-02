package GUIS;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import static GUIS.bottoms.QuickSpaceGUI.*;

public class SpaceGUI {
    public static Inventory GUI;

    public static Inventory CreateGUI() {
        GUI = Bukkit.createInventory(null, 9, "§e[§a永恒星河§e]§d星球选择");
        GUI.setItem(0, Earth);
        GUI.setItem(1, Space1);
        GUI.setItem(2, Moon);
        return GUI;
    }
}
