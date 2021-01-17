package drachenbauer32.balloonmod.items;

import drachenbauer32.balloonmod.util.BalloonColors;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;

public class BalloonBlockItem extends BlockItem
{
    public final BalloonColors color;
    
    public BalloonBlockItem(BalloonColors color, Block blockIn, Properties builder)
    {
        super(blockIn, builder);
        this.color=color;
    }
    
    @Override
    protected boolean placeBlock(BlockItemUseContext context, BlockState state)
    {
        if (context.getWorld().getBlockState(context.getPos().up()).getBlock() instanceof AirBlock)
        {
            return super.placeBlock(context, state);
        }
        else
        {
            return false;
        }
    }
}
