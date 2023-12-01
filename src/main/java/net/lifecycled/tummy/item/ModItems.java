package net.lifecycled.tummy.item;

import net.lifecycled.tummy.Tummy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tummy.MODID);

    public static final RegistryObject<Item> TUMMY_SPAWN_EGG = ITEMS.register("tummy_spawn_egg",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUMMY_HARNESS = ITEMS.register("tummy_harness",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COMMAND_STICK = ITEMS.register("command_stick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TUMMY_SATCHEL = ITEMS.register("tummy_satchel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TUMMY_SUMMONER = ITEMS.register("tummy_summoner",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
