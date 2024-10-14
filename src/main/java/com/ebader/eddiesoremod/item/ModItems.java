package com.ebader.eddiesoremod.item;

import com.ebader.eddiesoremod.EddiesOreMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EddiesOreMod.MOD_ID);

    public static final RegistryObject<Item>  PLUTONIUM = ITEMS.register("plutonium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  BLEI = ITEMS.register("blei", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  CHROM = ITEMS.register("chrom", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ALUMINIUM = ITEMS.register("aluminium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  IOD = ITEMS.register("iod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  PLATIN = ITEMS.register("platin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  RUBIN = ITEMS.register("rubin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  SILBER = ITEMS.register("silber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  TITAN = ITEMS.register("titan", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item>  ZINN = ITEMS.register("zinn", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
