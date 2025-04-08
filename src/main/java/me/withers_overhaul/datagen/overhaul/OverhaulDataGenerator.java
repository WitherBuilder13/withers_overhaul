package me.withers_overhaul.datagen.overhaul;

import me.withers_overhaul.world.gen.OverhaulChunkGenerator;
import net.minecraft.world.dimension.DimensionTypes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class OverhaulDataGenerator {
    public static void main(String[] args) {
        String vanillaDir = "src/main/generated/data/vanilla";
        String destinationDirectory = "src/main/resources/data/minecraft";

        DimensionGen.addBiomes();
        DimensionGen.generate(OverhaulChunkGenerator.OVERHAUL, DimensionTypes.OVERWORLD);
        moveFiles(vanillaDir + "/worldgen/biome", destinationDirectory + "/worldgen/biome");
        moveFiles(vanillaDir + "/dimension", destinationDirectory + "/dimension");
        deleteDirectory(vanillaDir);
    }

    public static void moveFiles(String sourceDirectory, String destinationDirectory) {

        // Check if the source directory exists
        File srcFile = new File(sourceDirectory);
        if (!srcFile.exists()) {
            System.out.println("Source directory '" + sourceDirectory + "' does not exist.");
            return;
        }

        // Check if the destination directory exists, create it if not
        File dstFile = new File(destinationDirectory);
        if (!dstFile.exists()) {
            dstFile.mkdirs();
        }

        // Move all files from source to destination
        try {
            Files.list(Paths.get(sourceDirectory))
                    .forEach(file -> {
                        try {
                            Files.move(file, Paths.get(destinationDirectory, file.getFileName().toString()), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Moved '" + file.getFileName() + "' to '" + destinationDirectory + "'");
                        } catch (IOException e) {
                            System.err.println("Error moving file: " + e.getMessage());
                        }
                    });
        } catch (IOException e) {
            System.err.println("Error listing files: " + e.getMessage());
        }
    }

    public static void deleteDirectory(String directory) {
        try {
            Files.deleteIfExists(Paths.get(directory));
            System.out.println("Deleted source directory: " + directory);
        } catch (IOException e) {
            System.err.println("Error deleting source directory: " + e.getMessage());
        }
    }
}
