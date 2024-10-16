package com.ebader.eddiesoremod.worldgen;

import com.ebader.eddiesoremod.EddiesOreMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> PLUTONIUM_ERZ_PLACED_KEY = registerKey("plutonium_erz_placed");
    public static final ResourceKey<PlacedFeature> PLATIN_ERZ_PLACED_KEY = registerKey("platin_erz_placed");
    public static final ResourceKey<PlacedFeature> TITAN_ERZ_PLACED_KEY = registerKey("titan_erz_placed");
    public static final ResourceKey<PlacedFeature> IOD_ERZ_PLACED_KEY = registerKey("iod_erz_placed");
    public static final ResourceKey<PlacedFeature> RUBIN_ERZ_PLACED_KEY = registerKey("rubin_erz_placed");
    public static final ResourceKey<PlacedFeature> ALUMINIUM_ERZ_PLACED_KEY = registerKey("aluminium_erz_placed");
    public static final ResourceKey<PlacedFeature> BLEI_ERZ_PLACED_KEY = registerKey("blei_erz_placed");
    public static final ResourceKey<PlacedFeature> CHROM_ERZ_PLACED_KEY = registerKey("chrom_erz_placed");
    public static final ResourceKey<PlacedFeature> SILBER_ERZ_PLACED_KEY = registerKey("silber_erz_placed");
    public static final ResourceKey<PlacedFeature> ZINN_ERZ_PLACED_KEY = registerKey("zinn_erz_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, PLUTONIUM_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLUTONIUM_ERZ_KEY), ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PLATIN_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATIN_ERZ_KEY), ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-74), VerticalAnchor.absolute(90))));
        register(context, TITAN_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITAN_ERZ_KEY), ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-84), VerticalAnchor.absolute(75))));
        register(context, IOD_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_IOD_ERZ_KEY), ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(92))));
        register(context, RUBIN_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBIN_ERZ_KEY), ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-95), VerticalAnchor.absolute(72))));
        register(context, ALUMINIUM_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ALUMINIUM_ERZ_KEY), ModOrePlacement.commonOrePlacement(9, HeightRangePlacement.uniform(VerticalAnchor.absolute(-70), VerticalAnchor.absolute(80))));
        register(context, BLEI_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_BLEI_ERZ_KEY), ModOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(-95), VerticalAnchor.absolute(62))));
        register(context, CHROM_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHROM_ERZ_KEY), ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(64))));
        register(context, SILBER_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SILBER_ERZ_KEY), ModOrePlacement.commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-95), VerticalAnchor.absolute(52))));
        register(context, ZINN_ERZ_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZINN_ERZ_KEY), ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(-65), VerticalAnchor.absolute(81))));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(EddiesOreMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
