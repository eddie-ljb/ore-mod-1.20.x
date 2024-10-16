package com.ebader.eddiesoremod.worldgen;

import com.ebader.eddiesoremod.EddiesOreMod;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Bootstrap;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_PLUTONIUM_ERZ = registerKey("add_plutonium_erz");
    public static final ResourceKey<BiomeModifier> ADD_PLATIN_ERZ = registerKey("add_platin_erz");
    public static final ResourceKey<BiomeModifier> ADD_TITAN_ERZ = registerKey("add_titan_erz");
    public static final ResourceKey<BiomeModifier> ADD_IOD_ERZ = registerKey("add_iod_erz");
    public static final ResourceKey<BiomeModifier> ADD_RUBIN_ERZ = registerKey("add_rubin_erz");
    public static final ResourceKey<BiomeModifier> ADD_ALUMINIUM_ERZ = registerKey("add_aluminium_erz");
    public static final ResourceKey<BiomeModifier> ADD_BLEI_ERZ = registerKey("add_blei_erz");
    public static final ResourceKey<BiomeModifier> ADD_CHROM_ERZ = registerKey("add_chrom_erz");
    public static final ResourceKey<BiomeModifier> ADD_SILBER_ERZ = registerKey("add_silber_erz");
    public static final ResourceKey<BiomeModifier> ADD_ZINN_ERZ = registerKey("add_zinn_erz");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_PLUTONIUM_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.PLUTONIUM_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_PLATIN_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.PLATIN_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_TITAN_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.TITAN_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_IOD_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.IOD_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_RUBIN_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.RUBIN_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ALUMINIUM_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.ALUMINIUM_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_BLEI_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.BLEI_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_CHROM_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.CHROM_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SILBER_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.SILBER_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ZINN_ERZ, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.ZINN_ERZ_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(EddiesOreMod.MOD_ID, name));
    }

}
