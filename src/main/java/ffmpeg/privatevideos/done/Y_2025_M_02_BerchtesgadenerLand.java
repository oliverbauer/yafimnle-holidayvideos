package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_02_BerchtesgadenerLand extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_02_BerchtesgadenerLand();
        main.mainTitle = "Winterwunder im Berchtesgadener Land";
        main.run();
    }

    @Override
    protected void run() {
        var f1 = gen20250221();
        var f2 = gen20250222();

        var joiner = new FFMpegJoiner();
        joiner.join("2025.02.winterwochenende-im-berchtesgadener-land", f1, f2);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20250221() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.02.21.fr.inzell.bad.reichenhall/";
        subTitle = "2025.02.21 Inzell nach Bad Reichenhall";
        setup();

        var yaFIMnle = new YaFIMnle("2025.02.21");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise";
        builders.add(img("DSC_0360.JPG"));
        builders.add(vid("GX011495.MP4"));
        detailTitle = "Inzell";
        builders.add(img("DSCN2428.JPG"));
        detailTitle = "Weißbachschlucht";
        builders.add(img("DSC_0363.JPG"));
        builders.add(vid("GX011496.MP4"));
        builders.add(vid("GX011499.MP4"));
        builders.add(vid("GX011500.MP4"));
        builders.add(vid("GX011501.MP4"));
        builders.add(img("DSC_0382.JPG"));
        builders.add(img("DSC_0392.JPG"));
        builders.add(img("DSC_0396.JPG"));
        builders.add(vid("GX011511.MP4"));
        builders.add(img("DSC_0406.JPG"));
        builders.add(vid("GX011516.MP4"));
        builders.add(img("DSC_0415.JPG"));
        builders.add(vid("GX011518.MP4"));
        builders.add(img("DSCN2467.JPG"));
        builders.add(img("DSC_0417.JPG"));
        builders.add(img("DSC_0418.JPG"));
        builders.add(img("DSC_0433.JPG"));
        builders.add(img("DSC_0436.JPG"));
        detailTitle = "Zum Thumsee";
        builders.add(img("DSC_0452.JPG"));
        detailTitle = "Thumsee";
        builders.add(img("DSC_0459.JPG"));
        builders.add(img("DSC_0463.JPG"));
        detailTitle = "Bad Reichenhall";
        builders.add(img("DSC_0464.JPG"));
        builders.add(img("DSC_0469.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250222() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.02.22.sa.ramsau/";
        subTitle = "2025.02.22 Ramsau";
        setup();

        var yaFIMnle = new YaFIMnle("2025.02.22");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Berchtesgaden";
        builders.add(img("DSC_0478.JPG"));
        builders.add(vid("GX011529.MP4"));
        detailTitle = "Anreise nach Ramsau";
        builders.add(img("DSC_0485.JPG"));
        builders.add(vid("GX011533.MP4"));
        builders.add(img("DSC_0489.JPG"));
        builders.add(img("DSC_0494.JPG"));
        detailTitle = "Zauberwald";
        builders.add(img("DSC_0514.JPG"));
        builders.add(vid("GX011536.MP4"));
        builders.add(img("DSC_0524.JPG"));
        builders.add(img("DSC_0530.JPG"));
        builders.add(vid("GX011540.MP4"));
        builders.add(vid("GX011541.MP4"));
        detailTitle = "Hintersee";
        builders.add(img("DSC_0531.JPG"));
        builders.add(vid("GX011544.MP4"));
        builders.add(img("DSC_0537.JPG"));
        builders.add(img("DSC_0548.JPG"));
        builders.add(vid("GX011547.MP4"));
        return yaFIMnle.of(builders).create();
    }
}
