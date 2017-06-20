package nl.kingdev.zloader.mixin.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Created by Jasper on 20-6-2017.
 */
@Mixin(Minecraft.class)
public class MixinMinecraft {

    @Inject(method = "runTick()V", at = @At("HEAD"))
    public void runTick(CallbackInfo info){


    }


}
