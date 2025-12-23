package ffmpeg.privatevideos;

import io.github.yafimnle.utils.CLI;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.util.*;

public class NightlyRun {
    public static void main(String[] args) throws InterruptedException {
        var main = new NightlyRun();
        main.run();
    }

    public void run() throws InterruptedException {
        Reflections reflections = new Reflections("ffmpeg.privatevideos.done");

        Set<Class<? extends AbstractNewApproach>> allClasses =
                reflections.getSubTypesOf(AbstractNewApproach.class);

        List<Class<?>> failed = new ArrayList<>();
        Map<String, Class<?>> classMap = new HashMap<>();
        for (Class<?> clazz : allClasses) {
            classMap.put(clazz.getSimpleName(), clazz);
        }
/*
        classMap.remove(Y_2015_Y_M05_AlpeAdriaTrail.class.getSimpleName()); // Done 21. Dez. 2025
        classMap.remove(Y_2016_M_06_Balkan.class.getSimpleName());
        classMap.remove(Y_2023_M_06_D_01_Slowenien_Slap_Sopota_Slap_Beri.class.getSimpleName()); // Done 21. Dez 2025
 */

        for (String clazzName : classMap.keySet().stream().sorted().toList()) {
            Class<?> clazz = classMap.get(clazzName);
            boolean success = runIt(clazz);
            if (!success) {
                failed.add(clazz);
            }
        }

        System.err.println("Failed: "+failed.size());
        for (Class<?> f : failed) {
            System.err.println("- "+f);
        }
    }

    private boolean runIt(Class<?> clazz) {
        try {
            Method meth = clazz.getMethod("main", String[].class);
            String[] params = null; // init params accordingly
            meth.invoke(null, (Object) params); // static method doesn't have an instance

            try {
                // cleanup
                CLI.exec("rm -rf /home/oliver/tmp/media", this);
                CLI.exec("rm /home/oliver/tmp/*videoonly*", this);
                CLI.exec("rm /home/oliver/tmp/*audioonly*", this);
                CLI.exec("rm /home/oliver/tmp/*.txt", this);
                CLI.exec("rm /home/oliver/tmp/*intermediate*", this);
            } catch (Exception e) {
                // ignore
            }

            // Sleep a bit...
            Thread.sleep(5000);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
