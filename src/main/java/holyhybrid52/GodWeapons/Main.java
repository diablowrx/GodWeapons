package holyhybrid52.GodWeapons;

import holyhybrid52.GodWeapons.proxy.CommonProxy;
import holyhybrid52.GodWeapons.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by holyhybrid52 on 2/27/2018.
 *
 * Main class for God Weapons mod
 */
@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class Main {
    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }
}
