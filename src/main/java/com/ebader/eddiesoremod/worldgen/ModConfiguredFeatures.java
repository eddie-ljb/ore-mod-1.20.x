package com.ebader.eddiesoremod.worldgen;

import com.ebader.eddiesoremod.EddiesOreMod;
import com.ebader.eddiesoremod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLUTONIUM_ERZ_KEY = registerKey("plutonium_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATIN_ERZ_KEY = registerKey("platin_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITAN_ERZ_KEY = registerKey("titan_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IOD_ERZ_KEY = registerKey("iod_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBIN_ERZ_KEY = registerKey("rubin_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINIUM_ERZ_KEY = registerKey("aluminium_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLEI_ERZ_KEY = registerKey("blei_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHROM_ERZ_KEY = registerKey("chrom_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILBER_ERZ_KEY = registerKey("silber_erz");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZINN_ERZ_KEY = registerKey("zinn_erz");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldPlutoniumErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.PLUTONIUM_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPlatinErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.PLATIN_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_PLATIN_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTitanErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.TITAN_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_TITAN_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldIodErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.IOD_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_IOD_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldRubinErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.RUBIN_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_RUBIN_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldAluminiumErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.ALUMINIUM_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_ALUMINIUM_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldBleiErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.BLEI_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_BLEI_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldChromErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.CHROM_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_CHROM_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSilberErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.SILBER_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_SILBER_ERZ.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldZinnErze  = List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.ZINN_ERZ.get().defaultBlockState()), OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_ZINN_ERZ.get().defaultBlockState()));

        register(context, OVERWORLD_PLUTONIUM_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldPlutoniumErze, 3));
        register(context, OVERWORLD_PLATIN_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldPlatinErze, 2));
        register(context, OVERWORLD_TITAN_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldTitanErze, 1));
        register(context, OVERWORLD_IOD_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldIodErze, 3));
        register(context, OVERWORLD_RUBIN_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldRubinErze, 2));
        register(context, OVERWORLD_ALUMINIUM_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldAluminiumErze, 3));
        register(context, OVERWORLD_BLEI_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldBleiErze, 2));
        register(context, OVERWORLD_CHROM_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldChromErze, 3));
        register(context, OVERWORLD_SILBER_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldSilberErze, 2));
        register(context, OVERWORLD_ZINN_ERZ_KEY, Feature.ORE, new OreConfiguration(overworldZinnErze, 3));
    }



    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(EddiesOreMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
