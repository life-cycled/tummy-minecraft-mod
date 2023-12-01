package net.lifecycled.tummy.item;

import net.lifecycled.tummy.Tummy;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tummy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
    public static CreativeModeTab TUMMY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        TUMMY_TAB = event.registerCreativeModeTab(new ResourceLocation(Tummy.MODID, "tummy_tab"), builder ->
                builder.icon(() -> new ItemStack(ModItems.TUMMY_SPAWN_EGG.get())).title(Component.translatable(
                        "creativemodetab.tummy_tab")));

    }
}
