package vesper.pw.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import vesper.pw.world.PaleWorldPlacedFeatures;

public class TreeGen {
    public static void generateTrees(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PALE_GARDEN), GenerationStep.Feature.VEGETAL_DECORATION, PaleWorldPlacedFeatures.STRIPPED_PALE_OAK);
    }


}
