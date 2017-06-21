package nl.kingdev.zloader.transformer;

import net.minecraft.launchwrapper.IClassTransformer;

/**
 * Created by Jasper on 21-6-2017.
 */
public class ZLoaderTransformer implements IClassTransformer {

    @Override
    public byte[] transform(String name, String transformedName, byte[] buffer) {

        return buffer;
    }
}
