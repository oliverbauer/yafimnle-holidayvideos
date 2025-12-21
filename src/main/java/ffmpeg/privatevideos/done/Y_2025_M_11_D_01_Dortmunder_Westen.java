package ffmpeg.privatevideos.done;


import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_11_D_01_Dortmunder_Westen extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_11_D_01_Dortmunder_Westen();
        main.mainTitle = "Herbstwanderung im Dortmunder Westen";
        main.subTitle = "01.11.2025";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    public void run() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.11.01.dortmund.luetgendortmund/";
        setup();

        var yaFIMnle = new YaFIMnle("2025.11.01.herbstwanderung.im.dortmunder.westen");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Bushaltestelle Brüning";
        builders.add(img("P1022461.JPG"));
        detailTitle = "Oberes Oelbachtal";
        builders.add(img("P1022462.JPG"));
        builders.add(img("P1022463.JPG"));
        builders.add(vid("GX012453.MP4"));
        builders.add(img("P1022464.JPG"));
        builders.add(vid("GX012454.MP4"));
        builders.add(img("P1022465.JPG"));
        builders.add(img("P1022466.JPG"));
        builders.add(vid("GX012455.MP4"));
        builders.add(img("P1022467.JPG"));
        builders.add(img("P1022468.JPG"));
        builders.add(vid("GX012456.MP4"));
        builders.add(img("P1022469.JPG"));
        builders.add(img("P1022470.JPG"));
        builders.add(vid("GX012457.MP4"));
        builders.add(img("P1022471.JPG"));
        builders.add(img("P1022473.JPG"));
        builders.add(vid("GX012458.MP4"));
        builders.add(img("P1022474.JPG"));
        builders.add(img("P1022476.JPG"));
        builders.add(img("P1022477.JPG"));
        builders.add(img("P1022478.JPG"));
        detailTitle = "Quellen Ölbach";
        builders.add(vid("GX012459.MP4"));
        builders.add(img("P1022479.JPG"));
        builders.add(img("P1022480.JPG"));
        builders.add(vid("GX012460.MP4"));
        builders.add(vid("GX012461.MP4"));
        detailTitle = "Volksgarten Bövinghausen";
        builders.add(img("P1022482.JPG"));
        builders.add(img("P1022483.JPG"));
        builders.add(vid("GX012462.MP4"));
        builders.add(img("P1022484.JPG"));
        builders.add(vid("GX012463.MP4"));
        builders.add(img("P1022486.JPG"));
        builders.add(img("P1022487.JPG"));
        builders.add(vid("GX012464.MP4"));
        builders.add(vid("GX012465.MP4"));
        builders.add(img("P1022489.JPG"));
        detailTitle = "Dellwiger Bachtal";
        builders.add(img("P1022490.JPG"));
        builders.add(img("P1022491.JPG"));
        builders.add(vid("GX012466.MP4"));
        builders.add(vid("GX012467.MP4"));
        builders.add(img("P1022492.JPG"));
        builders.add(img("P1022493.JPG"));
        builders.add(img("P1022494.JPG"));
        builders.add(vid("GX012468.MP4"));
        builders.add(img("P1022495.JPG"));
        builders.add(vid("GX012469.MP4"));
        builders.add(img("P1022497.JPG"));
        builders.add(img("P1022498.JPG"));
        builders.add(img("P1022499.JPG"));
        builders.add(vid("GX012470.MP4"));
        builders.add(img("P1022500.JPG"));
        builders.add(img("P1022501.JPG"));
        builders.add(vid("GX012471.MP4"));
        builders.add(img("P1022502.JPG"));
        builders.add(vid("GX012473.MP4"));
        builders.add(vid("GX012475.MP4"));
        builders.add(img("P1022503.JPG"));
        detailTitle = "Volksgarten Lütgendortmund";
        builders.add(img("P1022504.JPG"));
        builders.add(img("P1022505.JPG"));
        builders.add(img("P1022506.JPG"));
        builders.add(vid("GX012476.MP4"));
        builders.add(img("P1022507.JPG"));
        builders.add(vid("GX012477.MP4"));
        builders.add(vid("GX012478.MP4"));
        builders.add(img("P1022508.JPG"));
        builders.add(vid("GX012479.MP4"));

        yaFIMnle.of(builders).create();
    }
}