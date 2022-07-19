package com.myfirstmod.concreteslabmod.item;

import com.myfirstmod.concreteslabmod.ConcreteSlabMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
    public static Item concreteSlab;
    public static void preInit(){
        concreteSlab = new ItemConcreteSlab("concrete_slab");
        registerItems();
    }
    public static void registerItems(){
        GameRegistry.register(concreteSlab, new ResourceLocation(ConcreteSlabMod.MODID, "concrete_slab"));
    }
    public static void registerRenders(){
        registerRender(concreteSlab);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ConcreteSlabMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
