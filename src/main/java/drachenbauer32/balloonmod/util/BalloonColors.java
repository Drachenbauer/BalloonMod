package drachenbauer32.balloonmod.util;

import net.minecraft.block.material.MaterialColor;

public enum BalloonColors
{
    RED("red", MaterialColor.RED),
    ORANGE("orange", MaterialColor.ADOBE),
    YELLOW("yellow", MaterialColor.YELLOW),
    LIME("lime", MaterialColor.LIME),
    CYAN("cyan", MaterialColor.CYAN),
    BLUE("blue", MaterialColor.BLUE),
    PURPLE("purple", MaterialColor.PURPLE),
    MAGENTA("magenta", MaterialColor.MAGENTA),
    PINK("pink", MaterialColor.PINK),
    LIGHT_BLUE("light_blue", MaterialColor.LIGHT_BLUE),
    GREEN("green", MaterialColor.GREEN),
    BROWN("brown", MaterialColor.BROWN),
    BLACK("black", MaterialColor.BLACK),
    GRAY("gray", MaterialColor.GRAY),
    LIGHT_GRAY("light_gray", MaterialColor.LIGHT_GRAY),
    WHITE("white", MaterialColor.SNOW);
    
    public final String name;
    public final MaterialColor color;
    
    private BalloonColors(String name, MaterialColor color) {
        this.name = name;
        this.color = color;
    }
    
    public String GetName()
    {
        return name;
    }
    
    public MaterialColor GetColor()
    {
        return color;
    }
}
