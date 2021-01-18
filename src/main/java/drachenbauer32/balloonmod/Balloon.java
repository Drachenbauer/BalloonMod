package drachenbauer32.balloonmod;

import java.util.Comparator;

import drachenbauer32.balloonmod.init.BalloonBlocks;
import drachenbauer32.balloonmod.init.BalloonItems;
import drachenbauer32.balloonmod.items.BalloonBlockItem;
import drachenbauer32.balloonmod.util.BalloonItemGroup;
import drachenbauer32.balloonmod.util.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class Balloon
{   
    public static final ItemGroup BALLOONS = new BalloonItemGroup();
    
    public static Comparator<ItemStack> itemSorter;
    
    public Balloon() 
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        
        BalloonBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BalloonItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        itemSorter = Comparator.comparing(stack -> ((BalloonBlockItem) stack.getItem()).color);
    }
    
    private void clientRegistries(final FMLClientSetupEvent event)
    {
        
    }
}
