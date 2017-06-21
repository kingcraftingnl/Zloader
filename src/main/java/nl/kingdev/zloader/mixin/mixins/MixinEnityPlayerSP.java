package nl.kingdev.zloader.mixin.mixins;

import com.darkmagician6.eventapi.EventManager;
import net.minecraft.client.entity.EntityPlayerSP;
import nl.kingdev.zloader.events.mcevents.EventOnLivingUpdate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Created by Jasper on 21-6-2017.
 */
@Mixin(EntityPlayerSP.class)
public class MixinEnityPlayerSP {


    @Inject(method = "onLivingUpdate()V" , at = @At("HEAD"))
    public void onLivingUpdate(CallbackInfo info) {
        EventManager.call(new EventOnLivingUpdate());
    }

}
