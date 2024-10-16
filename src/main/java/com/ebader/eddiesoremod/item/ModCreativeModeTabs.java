package com.ebader.eddiesoremod.item;

import com.ebader.eddiesoremod.EddiesOreMod;

import com.ebader.eddiesoremod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EddiesOreMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ORES_TAB = CREATIVE_MODE_TABS.register("eddiesoremod", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PLUTONIUM.get()))
            .title(Component.translatable("creativetab.ores_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.PLUTONIUM.get());
                pOutput.accept(ModBlocks.PLUTONIUM_ERZ.get());
                pOutput.accept(ModBlocks.DEEPSLATE_PLUTONIUM_ERZ.get());

                pOutput.accept(ModItems.BLEI.get());
                pOutput.accept(ModItems.CHROM.get());
                pOutput.accept(ModItems.ALUMINIUM.get());
                pOutput.accept(ModItems.IOD.get());

                pOutput.accept(ModItems.PLATIN.get());
                pOutput.accept(ModBlocks.PLATIN_ERZ.get());
                pOutput.accept(ModBlocks.DEEPSLATE_PLATIN_ERZ.get());

                pOutput.accept(ModItems.RUBIN.get());
                pOutput.accept(ModItems.SILBER.get());

                pOutput.accept(ModItems.TITAN.get());
                pOutput.accept(ModBlocks.TITAN_ERZ.get());
                pOutput.accept(ModBlocks.DEEPSLATE_TITAN_ERZ.get());

                pOutput.accept(ModItems.ZINN.get());

            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
