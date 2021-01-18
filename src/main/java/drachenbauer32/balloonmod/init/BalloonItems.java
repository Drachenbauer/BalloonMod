package drachenbauer32.balloonmod.init;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import drachenbauer32.balloonmod.Balloon;
import drachenbauer32.balloonmod.items.BalloonBlockItem;
import drachenbauer32.balloonmod.util.Reference;
import drachenbauer32.balloonmod.util.BalloonColors;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BalloonItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    
    public static final Map<BalloonColors, RegistryObject<Item>> BALLOONS = Collections.synchronizedMap(new HashMap<BalloonColors, RegistryObject<Item>>());
    
    private static int i = 0;
    
    static
    {
        
        for(BalloonColors color : BalloonColors.values())
        {
            BALLOONS.put(color,ITEMS.register(color.GetName()+"_balloon", () -> new BalloonBlockItem(color,
                         new Item.Properties().defaultMaxDamage(0).group(Balloon.BALLOONS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair())));
            
            if (i < BalloonColors.values().length - 1)
            {
                i++;
            }
            else
            {
                i = 0;
            }
        }
    }
}
