package nl.kingdev.zloader.transformer;

import net.minecraft.launchwrapper.IClassTransformer;
import nl.kingdev.zloader.Zloader;

/**
 * Created by Jasper on 21-6-2017.
 */
public class ZLoaderTransformer implements IClassTransformer {

    @Override
    public byte[] transform(String className, String transformedName, byte[] buffer) {

        byte[] toReturn = buffer;

        if(Zloader.getInstance().debug) {
            System.out.println("**Intransformer*** : " + className);
        }


        return toReturn;
    }
}
