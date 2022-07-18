package com.myfirstmod.concreteslabmod;

import com.myfirstmod.concreteslabmod.item.ModItems;
import com.myfirstmod.concreteslabmod.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.myfirstmod.concreteslabmod.proxy.CommonProxy;

@Mod(modid = ConcreteSlabMod.MODID, version = ConcreteSlabMod.VERSION, name = ConcreteSlabMod.NAME)
public class ConcreteSlabMod
{
    public static final String MODID = "concreteslabmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Concrete Slab Mod";

    @SidedProxy(clientSide = "com.myfirstmod.concreteslabmod.proxy.ClientProxy", serverSide = "com.myfirstmod.concreteslabmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ConcreteSlabMod instance;

    public static CreativeTab creativeTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        creativeTab = new CreativeTab(CreativeTabs.getNextID(), "concrete_slabs");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
