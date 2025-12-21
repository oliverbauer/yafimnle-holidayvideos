package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2024_M_07_D_28_Echternach_Wolfsschlucht extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2024_M_07_D_28_Echternach_Wolfsschlucht();
        main.mainTitle = "Luxemburg";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    public void run() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.07.28_echternach_wolfsschlucht";
        subTitle = "2024.07.28 Echternach";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.28");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Wolfsschlucht";
        builders.add(vid("GX010879.MP4"));
        builders.add(vid("GX010880.MP4"));
        builders.add(img("DSCN1533.JPG"));
        builders.add(img("DSCN1534.JPG"));
        builders.add(vid("GX010881.MP4"));
        builders.add(vid("GX010882.MP4"));
        builders.add(vid("GX010883.MP4"));
        builders.add(vid("GX010884.MP4"));
        builders.add(vid("GX010885.MP4"));
        builders.add(vid("GX010886.MP4"));
        builders.add(vid("GX010887.MP4"));
        builders.add(vid("GX010888.MP4"));
        builders.add(img("DSCN1547.JPG"));
        builders.add(img("DSCN1560.JPG"));
        builders.add(img("DSCN1561.JPG"));
        builders.add(vid("GX010890.MP4"));
        builders.add(vid("GX010891.MP4"));
        yaFIMnle.of(builders).create();
    }
}
