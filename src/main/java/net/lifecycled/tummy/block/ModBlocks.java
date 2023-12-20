package net.lifecycled.tummy.block;

import net.lifecycled.tummy.Tummy;
import net.lifecycled.tummy.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tummy.MODID);

    // ?????
    // public static final RegistryObject<Block> TUMMY_BED = registerBlock("tummy_bed", () -> new Block(BlockBehaviour.Properties.of(Material.WOOL).jumpFactor(6)));

    // to make a new block
    public static final RegistryObject<Block> TUMMY_BED = registerBlock(() ->new Block(BlockBehaviour.Properties.of(Material.WOOL,
            MaterialColor.SNOW).strength(0.2F).sound(SoundType.WOOL)));


    // private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    // {
    //     RegistryObject<T> toReturn = BLOCKS.register(name, block);
    //     registerBlockItem(name, toReturn);
    //     return toReturn;
    // }
    // intellij changes it to this which makes more sense VVV heres the original code just in case^^^
    private static <T extends Block> RegistryObject<T> registerBlock(Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register("tummy_bed", block);
        registerBlockItem("tummy_bed", toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
