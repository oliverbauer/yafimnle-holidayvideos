package ffmpeg.privatevideos;

import io.github.yafimnle.utils.FileUtils;

import java.io.File;
import java.util.Arrays;

public class GenerateNewClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        var forPath = "/media/oliver/Extreme SSD/2019/05_Sabbatical_Neue_Wohnung/07_hvar_stari_grad";
        var className = "Y_2019_05_07_Hvar_Stari_Grad";
        var mainTitle = "Frühsommer in Kroatien";
        var subTitle = "2019.05.07 Hvar und Stari Grad";
        var detailTitle = "Hvar";
        var outputname = "2019.05.07.hvar_und_stari_grad";

        String prefix = """
                package ffmpeg.privatevideos.wip;
               
                import ffmpeg.privatevideos.AbstractNewApproach;
                import io.github.yafimnle.YaFIMnle;
                import io.github.yafimnle.common.Builder;
                import io.github.yafimnle.config.Presets;
                
                import java.util.ArrayList;
                import java.util.List;
                
                public class CLAZZNAME extends AbstractNewApproach {
                   public static void main(String[] args) {
                       var main = new CLAZZNAME();
                       main.mainTitle = "MAINTITLE";
                       main.run();
                   }
                
                   private void setup() {
                     Presets.hw_h264_nvenc(sourceDir, destinationDir);
                   }
                
                   @Override
                   public void run() {
                     sourceDir = "SOURCEDIR";
                     subTitle = "SUBTITLE";
                     setup();
                
                     var yaFIMnle = new YaFIMnle("OUTPUTNAME");
                     detailTitle = "DETAILTITLE";
                     List<Builder> builders = new ArrayList<>();
                """;
        prefix = prefix.replace("CLAZZNAME", className);
        prefix = prefix.replace("SOURCEDIR", forPath);
        prefix = prefix.replace("MAINTITLE", mainTitle);
        prefix = prefix.replace("SUBTITLE", subTitle);
        prefix = prefix.replace("DETAILTITLE", detailTitle);
        prefix = prefix.replace("OUTPUTNAME", outputname);

        sb.append(prefix);

        for (File file : Arrays.stream(new File(forPath).listFiles()).sorted().toList()) {
            if (file.getName().contains("MTS"))
                continue;
            if (file.getName().toLowerCase().endsWith("jpg")) {
                sb.append("\t\tbuilders.add(img(\""+file.getName()+"\"));\n");
            } else if (file.getName().toLowerCase().endsWith("mp4")) {
                sb.append("\t\tbuilders.add(vid(\""+file.getName()+"\"));\n");
            } else {
                throw new RuntimeException("unknown yet: "+file.getName());
            }
        }

        var suffix = """
                yaFIMnle.of(builders).create();
                            }
                        }
                """;
        sb.append(suffix);

        FileUtils.writeStringBuilderToFile(sb, "/home/oliver/ffmpeg-video-gen/yafimnle-examples/src/main/java/ffmpeg/privatevideos/wip/"+className+".java");

    }
}
