package BOSSES;

import net.skinsrestorer.api.SkinsRestorerAPI;
import net.skinsrestorer.api.exception.SkinRequestException;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.NPC;

public class BOSSONEARTH {
    public static NPC createNPC(Block block) {
        Location npcLocation = new Location(block.getWorld(), block.getX(), block.getY(), block.getZ());
        NPC npc = (NPC) block.getWorld().spawnEntity(npcLocation, EntityType.VILLAGER);
        npc.setCustomName("awa");
        npc.setCustomNameVisible(true);
        try {
            SkinsRestorerAPI.getApi().setSkin("awa", "cyh2");
        }catch (SkinRequestException t) {
            //
        }
        return npc;
    }
}