package com.ebader.eddiesoremod.datagen.loot;

import com.ebader.eddiesoremod.block.ModBlocks;
import com.ebader.eddiesoremod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {


    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.PLUTONIUM_ERZ.get(), block -> createRedstoneLikeOreDrops(ModBlocks.PLUTONIUM_ERZ.get(), ModItems.PLUTONIUM.get()));
        this.add(ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get(), block -> createRedstoneLikeOreDrops(ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get(), ModItems.PLUTONIUM.get()));

        this.add(ModBlocks.PLATIN_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.PLATIN_ERZ.get(), ModItems.PLATIN.get()));
        this.add(ModBlocks.DEEPSLATE_PLATIN_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_PLATIN_ERZ.get(), ModItems.PLATIN.get()));

        this.add(ModBlocks.TITAN_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.TITAN_ERZ.get(), ModItems.TITAN.get()));
        this.add(ModBlocks.DEEPSLATE_TITAN_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TITAN_ERZ.get(), ModItems.TITAN.get()));

        this.add(ModBlocks.IOD_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.IOD_ERZ.get(), ModItems.IOD.get()));
        this.add(ModBlocks.DEEPSLATE_IOD_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_IOD_ERZ.get(), ModItems.IOD.get()));

        this.add(ModBlocks.RUBIN_ERZ.get(), block -> createRedstoneLikeOreDrops(ModBlocks.RUBIN_ERZ.get(), ModItems.RUBIN.get()));
        this.add(ModBlocks.DEEPSLATE_RUBIN_ERZ.get(), block -> createRedstoneLikeOreDrops(ModBlocks.DEEPSLATE_RUBIN_ERZ.get(), ModItems.RUBIN.get()));

        this.add(ModBlocks.ALUMINIUM_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.ALUMINIUM_ERZ.get(), ModItems.ALUMINIUM.get()));
        this.add(ModBlocks.DEEPSLATE_ALUMINIUM_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ALUMINIUM_ERZ.get(), ModItems.ALUMINIUM.get()));

        this.add(ModBlocks.BLEI_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.BLEI_ERZ.get(), ModItems.BLEI.get()));
        this.add(ModBlocks.DEEPSLATE_BLEI_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_BLEI_ERZ.get(), ModItems.BLEI.get()));

        this.add(ModBlocks.CHROM_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.CHROM_ERZ.get(), ModItems.CHROM.get()));
        this.add(ModBlocks.DEEPSLATE_CHROM_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_CHROM_ERZ.get(), ModItems.CHROM.get()));

        this.add(ModBlocks.SILBER_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.SILBER_ERZ.get(), ModItems.SILBER.get()));
        this.add(ModBlocks.DEEPSLATE_SILBER_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SILBER_ERZ.get(), ModItems.SILBER.get()));

        this.add(ModBlocks.ZINN_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.ZINN_ERZ.get(), ModItems.ZINN.get()));
        this.add(ModBlocks.DEEPSLATE_ZINN_ERZ.get(), block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ZINN_ERZ.get(), ModItems.ZINN.get()));

    }

    protected LootTable.Builder createRedstoneLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 4.0F))).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
