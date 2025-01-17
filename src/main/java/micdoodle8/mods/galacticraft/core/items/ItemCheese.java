package micdoodle8.mods.galacticraft.core.items;

import micdoodle8.mods.galacticraft.api.item.GCRarity;
import micdoodle8.mods.galacticraft.core.GalacticraftCore;
import micdoodle8.mods.galacticraft.core.util.EnumSortCategoryItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemCheese extends ItemFood implements ISortableItem, GCRarity
{

    public ItemCheese(int par1, float par2, boolean par3)
    {
        super(par1, par2, par3);
        this.setTranslationKey("cheese_curd");
    }

    public ItemCheese(int par1, boolean par2)
    {
        this(par1, 0.6F, par2);
    }

    @Override
    public CreativeTabs getCreativeTab()
    {
        return GalacticraftCore.galacticraftItemsTab;
    }

    @Override
    public EnumSortCategoryItem getCategory(int meta)
    {
        return EnumSortCategoryItem.GENERAL;
    }
}
