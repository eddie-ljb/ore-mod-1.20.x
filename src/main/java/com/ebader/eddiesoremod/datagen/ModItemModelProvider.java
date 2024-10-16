package com.ebader.eddiesoremod.datagen;

import com.ebader.eddiesoremod.EddiesOreMod;
import com.ebader.eddiesoremod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EddiesOreMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ALUMINIUM);
        simpleItem(ModItems.BLEI);
        simpleItem(ModItems.IOD);
        simpleItem(ModItems.CHROM);
        simpleItem(ModItems.PLATIN);
        simpleItem(ModItems.PLUTONIUM);
        simpleItem(ModItems.RUBIN);
        simpleItem(ModItems.SILBER);
        simpleItem(ModItems.TITAN);
        simpleItem(ModItems.ZINN);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EddiesOreMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
