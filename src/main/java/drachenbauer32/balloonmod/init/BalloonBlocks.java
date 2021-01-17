package drachenbauer32.balloonmod.init;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import drachenbauer32.balloonmod.block.BalloonBlock;
import drachenbauer32.balloonmod.block.BalloonBlockTop;
import drachenbauer32.balloonmod.util.BalloonColors;
import drachenbauer32.balloonmod.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BalloonBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
    
    public static final Map<BalloonColors, RegistryObject<Block>> BALLOONS = Collections.synchronizedMap(new HashMap<BalloonColors, RegistryObject<Block>>());
    public static final Map<BalloonColors, RegistryObject<Block>> BALLOONS_TOP = Collections.synchronizedMap(new HashMap<BalloonColors, RegistryObject<Block>>());
    
    private static int i = 0;
    
    static
    {
        
        for(BalloonColors color : BalloonColors.values())
        {
            BALLOONS.put(color,BLOCKS.register(color.GetName()+"_balloon_block", () -> new BalloonBlock(color, Block.Properties.create(Material.WOOL, color.GetColor()).sound(SoundType.CLOTH).
                                                lightValue(0).hardnessAndResistance(0.1f, 0.5f).variableOpacity())));
            
            BALLOONS_TOP.put(color,BLOCKS.register(color.GetName()+"_balloon_block_top", () -> new BalloonBlockTop(color, Block.Properties.create(Material.WOOL, color.GetColor()).sound(SoundType.CLOTH).
                                                lightValue(0).hardnessAndResistance(0.1f, 0.5f).variableOpacity())));
            
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
