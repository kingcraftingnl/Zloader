package nl.kingdev.zloader.mixin.mixins;

import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.Minecraft;
import nl.kingdev.zloader.Zloader;
import nl.kingdev.zloader.events.ZloaderPostInitializationEvent;
import nl.kingdev.zloader.events.ZloaderPreInitializationEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Created by Jasper on 20-6-2017.
 */
@Mixin(Minecraft.class)
public class MixinMinecraft {

    @Inject(method = "init()V", at = @At("HEAD"))
    public void preInit(CallbackInfo info){
        Zloader.getInstance().zloaderStart();
        EventManager.call(new ZloaderPreInitializationEvent());
    }

    @Inject(method = "init()V", at = @At("TAIL"))
    public void postInit(CallbackInfo info){
        EventManager.call(new ZloaderPostInitializationEvent());
    }


}
