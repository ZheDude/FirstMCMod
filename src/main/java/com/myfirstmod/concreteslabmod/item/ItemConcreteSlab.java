package com.myfirstmod.concreteslabmod.item;

import com.myfirstmod.concreteslabmod.ConcreteSlabMod;
import net.minecraft.item.Item;

public class ItemConcreteSlab extends Item {
    public ItemConcreteSlab(String name) {
        setUnlocalizedName(name);
        setCreativeTab(ConcreteSlabMod.creativeTab);
    }
}
