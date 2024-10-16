package com.ebader.eddiesoremod.datagen;

import com.ebader.eddiesoremod.EddiesOreMod;
import com.ebader.eddiesoremod.block.ModBlocks;
import com.ebader.eddiesoremod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EddiesOreMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.PLUTONIUM_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_PLUTONIUM_ERZ);
        blockWithItem(ModBlocks.PLATIN_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_PLATIN_ERZ);
        blockWithItem(ModBlocks.TITAN_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_TITAN_ERZ);
        blockWithItem(ModBlocks.IOD_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_IOD_ERZ);
        blockWithItem(ModBlocks.RUBIN_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_RUBIN_ERZ);
        blockWithItem(ModBlocks.ALUMINIUM_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_ALUMINIUM_ERZ);
        blockWithItem(ModBlocks.BLEI_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_BLEI_ERZ);
        blockWithItem(ModBlocks.CHROM_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_CHROM_ERZ);
        blockWithItem(ModBlocks.SILBER_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_SILBER_ERZ);
        blockWithItem(ModBlocks.ZINN_ERZ);
        blockWithItem(ModBlocks.DEEPSLATE_ZINN_ERZ);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
