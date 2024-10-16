package com.ebader.eddiesoremod.block;

import com.ebader.eddiesoremod.EddiesOreMod;
import com.ebader.eddiesoremod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EddiesOreMod.MOD_ID);

    public static final RegistryObject<Block> PLUTONIUM_ERZ = registerBlock("plutonium_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> DEEPSLATE_PLUTONIUM_ERZ = registerBlock("deepslate_plutonium_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(4, 7)));

    public static final RegistryObject<Block> TITAN_ERZ = registerBlock("titan_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(5, 7)));
    public static final RegistryObject<Block> DEEPSLATE_TITAN_ERZ = registerBlock("deepslate_titan_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(6, 7)));

    public static final RegistryObject<Block> PLATIN_ERZ = registerBlock("platin_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(4, 7)));
    public static final RegistryObject<Block> DEEPSLATE_PLATIN_ERZ = registerBlock("deepslate_platin_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(5, 7)));

    public static final RegistryObject<Block> IOD_ERZ = registerBlock("iod_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> DEEPSLATE_IOD_ERZ = registerBlock("deepslate_iod_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(4, 7)));

    public static final RegistryObject<Block> RUBIN_ERZ = registerBlock("rubin_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(5, 7)));
    public static final RegistryObject<Block> DEEPSLATE_RUBIN_ERZ = registerBlock("deepslate_rubin_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(5, 7)));

    public static final RegistryObject<Block> ALUMINIUM_ERZ = registerBlock("aluminium_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(2, 7)));
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ERZ = registerBlock("deepslate_aluminium_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> BLEI_ERZ = registerBlock("blei_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(4, 7)));
    public static final RegistryObject<Block> DEEPSLATE_BLEI_ERZ = registerBlock("deepslate_blei_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(5, 7)));

    public static final RegistryObject<Block> CHROM_ERZ = registerBlock("chrom_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> DEEPSLATE_CHROM_ERZ = registerBlock("deepslate_chrom_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(4, 7)));

    public static final RegistryObject<Block> SILBER_ERZ = registerBlock("silber_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(4, 7)));
    public static final RegistryObject<Block> DEEPSLATE_SILBER_ERZ = registerBlock("deepslate_silber_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(5, 7)));

    public static final RegistryObject<Block> ZINN_ERZ = registerBlock("zinn_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> DEEPSLATE_ZINN_ERZ = registerBlock("deepslate_zinn_erz", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(4f), UniformInt.of(4, 7)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
