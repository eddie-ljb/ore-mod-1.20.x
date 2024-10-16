package com.ebader.eddiesoremod.datagen;

import com.ebader.eddiesoremod.EddiesOreMod;
import com.ebader.eddiesoremod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EddiesOreMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.IOD_ERZ.get(), ModBlocks.DEEPSLATE_IOD_ERZ.get(), ModBlocks.ALUMINIUM_ERZ.get(), ModBlocks.DEEPSLATE_ALUMINIUM_ERZ.get(), ModBlocks.SILBER_ERZ.get(), ModBlocks.DEEPSLATE_SILBER_ERZ.get(), ModBlocks.ZINN_ERZ.get(), ModBlocks.DEEPSLATE_ZINN_ERZ.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.PLUTONIUM_ERZ.get(), ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get(), ModBlocks.PLATIN_ERZ.get(), ModBlocks.DEEPSLATE_PLATIN_ERZ.get(), ModBlocks.CHROM_ERZ.get(), ModBlocks.DEEPSLATE_CHROM_ERZ.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.RUBIN_ERZ.get(), ModBlocks.DEEPSLATE_RUBIN_ERZ.get(), ModBlocks.BLEI_ERZ.get(), ModBlocks.DEEPSLATE_BLEI_ERZ.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.TITAN_ERZ.get(), ModBlocks.DEEPSLATE_TITAN_ERZ.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.PLUTONIUM_ERZ.get(), ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get(), ModBlocks.PLATIN_ERZ.get(), ModBlocks.DEEPSLATE_PLATIN_ERZ.get(), ModBlocks.TITAN_ERZ.get(), ModBlocks.DEEPSLATE_TITAN_ERZ.get(), ModBlocks.IOD_ERZ.get(), ModBlocks.DEEPSLATE_IOD_ERZ.get(), ModBlocks.RUBIN_ERZ.get(), ModBlocks.DEEPSLATE_RUBIN_ERZ.get(), ModBlocks.ALUMINIUM_ERZ.get(), ModBlocks.DEEPSLATE_ALUMINIUM_ERZ.get(),
                ModBlocks.BLEI_ERZ.get(), ModBlocks.DEEPSLATE_BLEI_ERZ.get(), ModBlocks.CHROM_ERZ.get(), ModBlocks.DEEPSLATE_CHROM_ERZ.get(), ModBlocks.SILBER_ERZ.get(), ModBlocks.DEEPSLATE_SILBER_ERZ.get(), ModBlocks.ZINN_ERZ.get(), ModBlocks.DEEPSLATE_ZINN_ERZ.get());


    }
}
