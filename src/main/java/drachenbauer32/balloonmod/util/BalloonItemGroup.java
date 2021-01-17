package drachenbauer32.balloonmod.util;

import drachenbauer32.balloonmod.Balloon;
import drachenbauer32.balloonmod.init.BalloonItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class BalloonItemGroup extends ItemGroup
{
    public BalloonItemGroup()
    {
        super("balloonss");
    }
    
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(BalloonItems.BALLOONS.get(BalloonColors.YELLOW).get());
    }
    
    @Override
    public void fill(NonNullList<ItemStack> itemStacks)
    {
        super.fill(itemStacks);
        itemStacks.sort(Balloon.itemSorter);
    }
}
