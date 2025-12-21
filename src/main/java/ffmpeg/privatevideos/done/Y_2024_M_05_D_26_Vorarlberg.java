package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

// TODO needs audio
public class Y_2024_M_05_D_26_Vorarlberg extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2024_M_05_D_26_Vorarlberg();
        main.mainTitle = "Mai 2024 Vorarlberg";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    protected void run() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.05.26_dornbirn_alplochschlucht";
        subTitle = "2024.05.26 Vorarlberg";
        setup();

        var yaFIMnle = new YaFIMnle("2024.05.26.oesterreich.vorarlberg.alplochschlucht_und_rappenlochschlucht");

        detailTitle = "Konstanz";
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSCN1048.JPG"));
        builders.add(img("DSCN1051.JPG"));
        builders.add(img("DSCN1057.JPG"));
        builders.add(vid("GX010555.MP4"));
        builders.add(img("DSCN1060.JPG"));
        builders.add(vid("GX010558.MP4"));
        detailTitle = "Friedrichshafen";
        builders.add(img("DSCN1064.JPG"));
        builders.add(img("DSCN1066.JPG"));
        builders.add(vid("GX010559.MP4"));
        detailTitle = "Dornbirn";
        builders.add(img("DSCN1068.JPG"));
        builders.add(vid("GX010564.MP4"));
        builders.add(img("DSCN1081.JPG"));
        builders.add(vid("GX010572.MP4"));
        builders.add(img("DSCN1089.JPG"));
        builders.add(vid("GX010576.MP4"));
        builders.add(img("DSCN1100.JPG"));
        builders.add(vid("GX010580.MP4"));
        builders.add(vid("GX010581.MP4"));
        detailTitle = "Alplochschlucht und Rappenlochschlucht";
        builders.add(img("DSCN1102.JPG"));
        builders.add(vid("GX010582.MP4"));
        builders.add(img("DSCN1107.JPG"));
        builders.add(img("DSCN1110.JPG"));
        builders.add(vid("GX010586.MP4"));
        builders.add(img("DSCN1125.JPG"));
        builders.add(vid("GX010594.MP4"));
        yaFIMnle.of(builders).create();
    }
}