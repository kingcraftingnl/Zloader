package nl.kingdev.zloader;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import nl.kingdev.zloader.events.ZloaderInitializationEvent;
import nl.kingdev.zloader.events.ZloaderPostInitializationEvent;
import nl.kingdev.zloader.events.ZloaderPreInitializationEvent;
import org.lwjgl.opengl.Display;

/**
 * Created by Jasper on 20-6-2017.
 */
public class Zloader {

    private static Zloader instance = new Zloader();
    public static Zloader getInstance(){
        return instance;
    }

    public int modCount = 1;

    public void zloaderStart() {
        EventManager.register(this);
    }

    @EventTarget
    public void onPreInit(ZloaderPreInitializationEvent e ){
        Display.setTitle("Zloader PreInitialization");
        System.out.println("***Zloader preInitEvent***");

    }

    @EventTarget
    public void onInit(ZloaderInitializationEvent e){
        Display.setTitle("Zloader Initialization");
    }

    @EventTarget
    public void onPostInit(ZloaderPostInitializationEvent e){
        Display.setTitle("Zloader Loaded, Total Mods loaded:" + Zloader.getInstance().modCount);
    }

}
