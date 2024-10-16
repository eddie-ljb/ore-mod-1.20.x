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

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.PLUTONIUM_ERZ.get(), ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get(), ModBlocks.PLATIN_ERZ.get(), ModBlocks.DEEPSLATE_PLATIN_ERZ.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.TITAN_ERZ.get(), ModBlocks.DEEPSLATE_TITAN_ERZ.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.PLUTONIUM_ERZ.get(), ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get(), ModBlocks.PLATIN_ERZ.get(), ModBlocks.DEEPSLATE_PLATIN_ERZ.get(), ModBlocks.TITAN_ERZ.get(), ModBlocks.DEEPSLATE_TITAN_ERZ.get());


    }
}
