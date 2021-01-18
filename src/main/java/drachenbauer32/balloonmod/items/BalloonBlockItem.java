package drachenbauer32.balloonmod.items;

import drachenbauer32.balloonmod.init.BalloonBlocks;
import drachenbauer32.balloonmod.util.BalloonColors;
import net.minecraft.block.AirBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;

public class BalloonBlockItem extends BlockItem
{
    public final BalloonColors color;
    
    public BalloonBlockItem(BalloonColors color, Properties builder)
    {
        super(BalloonBlocks.BALLOONS.get(color).get(), builder);
        this.color = color;
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
    
    /*@Override
    public ActionResultType onItemUse(ItemUseContext context)
    {
        if (context.getWorld().getBlockState(context.getPos().up()).getBlock() instanceof AirBlock)
        {
            context.getWorld().setBlockState(context.getPos(), BalloonBlocks.BALLOONS.get(color).get().getDefaultState().with(FACING, context.getPlacementHorizontalFacing()));
            return ActionResultType.SUCCESS;
        }
        else
        {
            return ActionResultType.FAIL;
        }
    }*/
}
