package net.lifecycled.tummy;

import com.mojang.logging.LogUtils;
import net.lifecycled.tummy.item.ModCreativeModeTabs;
import net.lifecycled.tummy.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Tummy.MODID)
public class Tummy
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "tummy";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public Tummy()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeModeTabs.TUMMY_TAB)
        {
            event.accept(ModItems.TUMMY_SPAWN_EGG);
        }

        if (event.getTab() == ModCreativeModeTabs.TUMMY_TAB)
        {
            event.accept(ModItems.TUMMY_HARNESS);
        }

        if (event.getTab() == ModCreativeModeTabs.TUMMY_TAB)
        {
            event.accept(ModItems.COMMAND_STICK);
        }

        if (event.getTab() == ModCreativeModeTabs.TUMMY_TAB)
        {
            event.accept(ModItems.TUMMY_SATCHEL);
        }

        if (event.getTab() == ModCreativeModeTabs.TUMMY_TAB)
        {
            event.accept(ModItems.TUMMY_SUMMONER);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
