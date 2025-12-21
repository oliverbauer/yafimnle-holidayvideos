package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_08_Allgaeu extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_08_Allgaeu();
        main.mainTitle = "Sommer 2025 im Allgäu Bayern und Vorarlberg";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20250830();
        var f2 = gen20250831();
        var f3 = gen20250901();
        var f4 = gen20250902();
        var f5 = gen20250903();

        var joiner = new FFMpegJoiner();
        joiner.join("2025.08+09.alpenurlaub", f1, f2, f3, f4, f5);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20250830() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.08.30.nesselwang.wasserfallweg/";
        subTitle = "2025.08.30 Deutschland - Allgäu - Nesselwang";
        setup();

        detailTitle = "Wasserfallweg";
        var yaFIMnle = new YaFIMnle("2025.08.30");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("P1011721.JPG"));
        builders.add(vid("GX012087.MP4"));
        builders.add(vid("GX012089.MP4").seconds("00:00:40", "00:00:52"));
        builders.add(img("P1011743.JPG"));
        builders.add(vid("GX012091.MP4"));
        builders.add(vid("GX012093.MP4"));
        builders.add(img("P1011756.JPG"));
        builders.add(img("P1011760.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250831() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.08.31.pfronten.reichenbachklamm/";
        subTitle = "2025.08.31 Deutschland - Allgäu - Pfronten";
        setup();

        detailTitle = "Reichenbachklamm";
        var yaFIMnle = new YaFIMnle("2025.08.31");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC01256.jpg"));
        builders.add(vid("GX012108.MP4"));
        builders.add(img("P1011782.JPG"));
        builders.add(img("P1011791.JPG"));
        builders.add(vid("GX012109.MP4"));
        builders.add(vid("GX012112.MP4"));
        builders.add(img("P1011799.JPG"));
        builders.add(vid("GX012119.MP4"));
        builders.add(img("P1011811.JPG"));
        builders.add(vid("GX012122.MP4"));
        builders.add(img("DSC01279.jpg"));
        builders.add(img("DSC01285.jpg"));
        builders.add(img("DSC01286.jpg"));
        builders.add(vid("GX012123.MP4"));
        builders.add(vid("GX012125.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250901() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.09.01.farchant.kuhfluchtwasserfaelle/";
        subTitle = "2025.09.01 Deutschland - Allgäu - Farchant";
        setup();

        detailTitle = "Kuhfluchtwasserfälle";
        var yaFIMnle = new YaFIMnle("2025.09.01");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("P1011854.JPG"));
        builders.add(img("P1021880.JPG"));
        builders.add(img("P1021889.JPG"));
        builders.add(vid("GX012158.MP4"));
        builders.add(img("DSC01314.jpg"));
        builders.add(vid("GX012159.MP4"));
        builders.add(vid("GX012161.MP4"));
        builders.add(vid("GX012166.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250902() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.09.02.lindau/";
        subTitle = "2025.09.02 Deutschland - Bayern - Lindau";
        setup();

        detailTitle = "Lindau Insel";
        var yaFIMnle = new YaFIMnle("2025.09.02");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC01329.jpg"));
        builders.add(vid("GX012182.MP4"));
        builders.add(img("DSC01332.jpg"));
        builders.add(img("DSC01333.jpg"));
        builders.add(vid("GX012183.MP4"));
        builders.add(img("P1021952.JPG"));
        builders.add(img("P1021954.JPG"));
        builders.add(img("P1021966.JPG"));
        builders.add(img("P1021967.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250903() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.09.03.dornbirn.rappenlochschlucht.alplochschlucht/";
        subTitle = "2025.09.03 Österreich - Vorarlberg - Dornbirn";
        setup();

        detailTitle = "Rappenlochschlucht + Alplochschlucht";
        var yaFIMnle = new YaFIMnle("2025.09.03");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("P1021974.JPG"));
        builders.add(img("P1021981.JPG"));
        builders.add(vid("GX012192.MP4"));
        builders.add(img("P1021987.JPG"));
        builders.add(img("P1021989.JPG"));
        builders.add(vid("GX012194.MP4"));
        builders.add(vid("GX012195.MP4"));
        builders.add(img("P1021996.JPG"));
        builders.add(vid("GX012199.MP4"));
        builders.add(img("DSC01353.jpg"));
        builders.add(img("DSC01364.jpg"));
        builders.add(vid("GX012202.MP4"));
        builders.add(img("P1022016.JPG"));
        builders.add(img("P1022019.JPG"));

        return yaFIMnle.of(builders).create();
    }
}
