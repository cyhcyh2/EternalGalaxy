package planet.SPACE;

import me.cyh2.eternalgalaxy.EternalGalaxy;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;

import java.io.IOException;
import java.util.Random;

public class space {
    private static class FlatWorldGenerator extends ChunkGenerator {
        private FlatWorldGenerator() {}

        public ChunkGenerator.ChunkData generateChunkData(World world, Random random, int x, int z, ChunkGenerator.BiomeGrid biome) {
            ChunkGenerator.ChunkData chunkData = createChunkData(world);
            for (int y = 0; y < chunkData.getMaxHeight(); y++) {
                chunkData.setBlock(x, y, z, Material.AIR);
            }
            return chunkData;
        }
    }

    public static World creatorSpace1World() {
        WorldCreator worldCreator = new WorldCreator("space1");
        worldCreator.environment(World.Environment.THE_END);
        worldCreator.generator(new FlatWorldGenerator());
        return Bukkit.createWorld(worldCreator);
    }

    public static void ToSpace1(Player player) throws IOException {
        if (EternalGalaxy.SSData.getBoolean("Datas." + player.getName() + ".has")) {
            player.teleport(new Location(EternalGalaxy.SP1, EternalGalaxy.SSData.getDouble("Datas." + player.getName() + ".x"), EternalGalaxy.SSData.getDouble("CD.y"), EternalGalaxy.SSData.getDouble("Datas." + player.getName() + ".z")));
            player.getLocation().subtract(0, 1, 0).getBlock().setType(Material.GOLD_BLOCK);
        }else {
            player.teleport(new Location(EternalGalaxy.SP1, EternalGalaxy.SSData.getDouble("CD.x") + 1000, EternalGalaxy.SSData.getDouble("CD.y"), EternalGalaxy.SSData.getDouble("CD.z") + 1000));
            GenerateSpaceStation.CSS(player);
            EternalGalaxy.SSData.set("CD.x", EternalGalaxy.SSData.getDouble("CD.x") + 1000);
            EternalGalaxy.SSData.set("CD.z", EternalGalaxy.SSData.getDouble("CD.z") + 1000);
            //
            EternalGalaxy.SSData.set("Datas." + player.getName() + ".x", EternalGalaxy.SSData.getDouble("CD.x"));
            EternalGalaxy.SSData.set("Datas." + player.getName() + ".z", EternalGalaxy.SSData.getDouble("CD.z"));
            EternalGalaxy.SSData.set("Datas." + player.getName() + ".has", true);
            EternalGalaxy.SSData.set("Datas." + player.getName() + ".name", player.getName() + "的初始空间站");
            EternalGalaxy.SSData.save(EternalGalaxy.SSDataFile);
        }
    }
}
