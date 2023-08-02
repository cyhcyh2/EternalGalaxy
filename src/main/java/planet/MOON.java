package planet;

import me.cyh2.eternalgalaxy.EternalGalaxy;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;
import org.bukkit.generator.BiomeParameterPoint;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class MOON {
    private static class FlatWorldGenerator extends ChunkGenerator {
        private FlatWorldGenerator() {}

        public ChunkGenerator.ChunkData generateChunkData(World world, Random random, int x, int z, ChunkGenerator.BiomeGrid biome) {
            ChunkGenerator.ChunkData chunkData = createChunkData(world);
            for (int ix = 0; ix < 16; ix++) {
                for (int iz = 0; iz < 16; iz++) {
                    for (int y = 0; y < 50; y++) {
                        chunkData.setBlock(ix, y, iz, Material.BEDROCK);
                    }
                    for (int y = 50; y < 64; y++) {
                        chunkData.setBlock(ix, y, iz, Material.STONE);
                    }
                    for (int y = 64; y < 65; y++) {
                        chunkData.setBlock(ix, y, iz, Material.ANDESITE);
                        biome.setBiome(ix, iz, Biome.PLAINS);
                    }
                }
            }
            if (random.nextInt(30) == 0) {
                for (int ex = 0; ex < 16; ex++) {
                    for (int ez = 0; ez < 16; ez++) {
                        int height = (int) (Math.sin((x) / 20.0) * 10 + 60); // Adjust the height formula as desired
                        for (int y = 0; y < height; y++) {
                            chunkData.setBlock(x, y, z, Material.STONE);
                        }
                    }
                }
            }
            if (random.nextInt(20) == 0) {
                int centerX = 8 + random.nextInt(8);
                int centerZ = 8 + random.nextInt(8);
                int radiusX = random.nextInt(4) + 3;
                int radiusZ = random.nextInt(4) + 3;
                int depth = random.nextInt(4) + 1;
                for (int dx = -radiusX; dx <= radiusX; dx++) {
                    for (int dz = -radiusZ; dz <= radiusZ; dz++) {
                        for (int dy = -depth; dy <= 0; dy++) {
                            double distanceToCenter = Math.pow(dx * 1.0D / radiusX, 2.0D) + Math.pow(dz * 1.0D / radiusZ, 2.0D) + Math.pow(dy * 1.0D / depth, 2.0D);
                            if (distanceToCenter <= 1.0D) {
                                int blockX = centerX + dx;
                                int blockY = 65 + dy;
                                int blockZ = centerZ + dz;
                                chunkData.setBlock(blockX, blockY, blockZ, Material.AIR);
                            }
                        }
                    }
                }
            }
            return chunkData;
        }
    }

    public static World creatorMoonWorld() {
        WorldCreator worldCreator = new WorldCreator("Moon");
        worldCreator.environment(World.Environment.THE_END);
        worldCreator.generator(new FlatWorldGenerator());
        return Bukkit.createWorld(worldCreator);
    }

    public static void ToMoon(Player player) {
        player.teleport(EternalGalaxy.moon.getSpawnLocation());
    }
}
