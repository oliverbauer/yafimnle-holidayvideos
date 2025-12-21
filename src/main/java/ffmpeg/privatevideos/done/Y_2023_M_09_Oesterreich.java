package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2023_M_09_Oesterreich extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2023_M_09_Oesterreich();
        main.mainTitle = "Herbsturlaub in den Alpen";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20230924();
        var f2 = gen20230925();
        var f3 = gen20230926();
        var f4 = gen20230927();
        var f5 = gen20230928();
        var f6 = gen20230929();

        var joiner = new FFMpegJoiner();
        joiner.join(
                "2023.09.alpenurlaub",
                f1, f2, f3, f4, f5, f6
        );
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public File gen20230924() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.09.24_bodensee_buerserberg/";
        subTitle = "2023.09.04 Anreise nach Österreich Bludenz Bürserschlucht";
        setup();

        var yaFIMnle = new YaFIMnle("2023.09.24");
        List<Builder> builders = new ArrayList<>();

        detailTitle = "Bodensee";
        builders.add(vid("DSCN0299.MP4")
                .seconds("00:00:00", "00:00:03")
                .as("DSCN0299-000000-000003.mp4"));
        builders.add(vid("DSCN0299.MP4")
                .seconds("00:00:08", "00:00:14")
                .as("DSCN0299-000008-000014.mp4"));
        builders.add(img("DSCN0296.JPG"));
        builders.add(img("DSCN0302.JPG"));
        builders.add(img("DSCN0305.JPG"));
        builders.add(img("DSCN0307.JPG"));
        builders.add(img("DSCN0310.JPG"));
        builders.add(img("DSCN0312.JPG"));
        builders.add(img("DSCN0316.JPG"));
        builders.add(img("DSCN0318.JPG"));
        detailTitle = "Lindau";
        builders.add(img("DSCN0324.JPG"));
        builders.add(vid("DSCN0325.MP4"));
        detailTitle = "ÖBB nach Österreich";
        builders.add(vid("DSCN0326.MP4"));
        builders.add(img("DSCN0330.JPG"));
        builders.add(img("DSCN0331.JPG"));
        builders.add(img("DSCN0333.JPG"));
        builders.add(img("DSCN0334.JPG"));
        builders.add(vid("DSCN0335.MP4"));
        builders.add(img("DSCN0336.JPG"));
        builders.add(vid("DSCN0337.MP4"));
        builders.add(img("DSCN0338.JPG"));
        builders.add(img("DSCN0339.JPG"));
        builders.add(img("DSCN0340.JPG"));
        builders.add(img("DSCN0341.JPG"));
        builders.add(img("DSCN0342.JPG"));
        builders.add(img("DSCN0343.JPG"));
        builders.add(img("DSCN0344.JPG"));
        builders.add(img("DSCN0345.JPG"));

        return yaFIMnle.of(builders).create();

    }

    public File gen20230925() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.09.25_sillschlucht/";
        subTitle = "2023.09.25 Tirol (Stubaital + Innsbruck + Sillschlucht + Seefeld)";
        setup();

        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("2023.09.25");

        detailTitle = "Schönberg im Stubaital nach Innsbruck via Sillschlucht";
        builders.add(vid("DSCN0346.MP4"));
        builders.add(img("DSCN0347.JPG"));
        builders.add(img("DSCN0348.JPG"));
        builders.add(img("DSCN0349.JPG"));
        builders.add(img("DSCN0350.JPG"));
        builders.add(vid("DSCN0351.MP4"));
        builders.add(img("DSCN0352.JPG"));
        builders.add(vid("DSCN0355.MP4"));
        builders.add(img("DSCN0357.JPG"));
        builders.add(img("DSCN0359.JPG"));
        detailTitle = "Europabrücke";
        builders.add(img("DSCN0361.JPG"));
        detailTitle = "";
        builders.add(img("DSCN0362.JPG"));
        detailTitle = "Sillschlucht";
        builders.add(img("DSCN0366.JPG"));
        builders.add(img("DSCN0368.JPG"));
        builders.add(img("DSCN0370.JPG"));
        builders.add(img("DSCN0372.JPG"));
        builders.add(vid("DSCN0375.MP4"));
        detailTitle = "Wasserfall";
        builders.add(vid("DSCN0382.MP4"));
        builders.add(vid("DSCN0385.MP4"));
        builders.add(vid("DSCN0386.MP4"));
        builders.add(img("DSCN0388.JPG"));
        builders.add(img("DSCN0391.JPG"));
        builders.add(img("DSCN0392.JPG"));
        builders.add(img("DSCN0393.JPG"));
        detailTitle = "Bergiselschanze";
        builders.add(img("DSCN0394.JPG"));
        builders.add(img("DSCN0396.JPG"));
        detailTitle = "";
        builders.add(img("DSCN0399.JPG"));
        builders.add(img("DSCN0401.JPG"));
        builders.add(img("DSCN0402.JPG"));
        builders.add(vid("DSCN0404.MP4"));
        builders.add(img("DSCN0405.JPG"));
        builders.add(img("DSCN0406.JPG"));
        builders.add(img("DSCN0408.JPG"));
        detailTitle = "Seefeld in Tirol";
        builders.add(vid("DSCN0417.MP4"));
        builders.add(img("DSCN0418.JPG"));
        builders.add(vid("DSCN0419.MP4"));
        builders.add(img("DSCN0420.JPG"));
        builders.add(vid("DSCN0421.MP4"));
        builders.add(img("DSCN0423.JPG"));
        builders.add(img("DSCN0424.JPG"));
        builders.add(img("DSCN0425.JPG"));

        return yaFIMnle.of(builders).create();

    }

    public File gen20230926() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.09.26_geisterklamm_schlusssteig_zirl/";
        subTitle = "2023.09.26 Leutascher Geisterklamm und Schloßbachklamm";
        setup();

        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("2023.09.26");

        detailTitle = "Leutascher Geisterklamm";
        builders.add(img("DSCN0426.JPG"));
        builders.add(img("DSCN0429.JPG"));
        builders.add(img("DSCN0431.JPG"));
        builders.add(img("DSCN0432.JPG"));
        builders.add(img("DSCN0433.JPG"));
        builders.add(img("DSCN0436.JPG"));
        builders.add(vid("DSCN0437.MP4"));
        builders.add(img("DSCN0440.JPG"));
        builders.add(vid("DSCN0441.MP4"));
        builders.add(img("DSCN0442.JPG"));
        builders.add(img("DSCN0444.JPG"));
        builders.add(img("DSCN0445.JPG"));
        builders.add(vid("DSCN0448.MP4"));
        builders.add(img("DSCN0449.JPG"));
        builders.add(img("DSCN0450.JPG"));
        detailTitle = "Schlossbachklamm bei Zirl";
        builders.add(img("DSCN0452.JPG"));
        builders.add(vid("DSCN0453.MP4"));
        builders.add(img("DSCN0454.JPG"));
        builders.add(vid("DSCN0455.MP4"));
        builders.add(img("DSCN0456.JPG"));
        builders.add(img("DSCN0457.JPG"));
        builders.add(img("DSCN0458.JPG")); // Schild Schlossbachklamm
        builders.add(img("DSCN0459.JPG"));
        builders.add(img("DSCN0461.JPG"));
        builders.add(vid("DSCN0463.MP4"));
        builders.add(img("DSCN0464.JPG"));
        builders.add(img("DSCN0466.JPG"));
        builders.add(vid("DSCN0467.MP4"));
        builders.add(img("DSCN0468.JPG"));
        builders.add(img("DSCN0469.JPG"));
        builders.add(img("DSCN0470.JPG"));
        builders.add(vid("DSCN0471.MP4"));
        builders.add(img("DSCN0472.JPG"));
        builders.add(img("DSCN0473.JPG"));
        builders.add(img("DSCN0474.JPG"));
        builders.add(img("DSCN0475.JPG"));
        builders.add(vid("DSCN0476.MP4"));
        builders.add(vid("DSCN0478.MP4")
                .seconds("00:00:42", "00:00:54")
                .as("DSCN0478-000042-000054.mp4"));
        builders.add(img("DSCN0479.JPG"));

        return yaFIMnle.of(builders).create();

    }

    public File gen20230927() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.09.27_drei_seen_gebiet/";
        subTitle = "2023.09.27 Bad Reichenhall Weißbachschlucht";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2023.09.27");

        detailTitle = "Ruholding zum Drei-Seen-Gebiet in dem Chiemgauer Alpen";
        builders.add(img("DSCN0489.JPG"));
        builders.add(img("DSCN0490.JPG"));
        builders.add(vid("DSCN0493.MP4"));
        builders.add(img("DSCN0494.JPG"));
        builders.add(img("DSCN0495.JPG"));
        builders.add(vid("DSCN0496.MP4"));
        builders.add(img("DSCN0497.JPG"));
        builders.add(vid("DSCN0499.MP4"));
        builders.add(img("DSCN0501.JPG"));
        builders.add(vid("DSCN0502.MP4"));
        detailTitle = "Thumsee bei Bad Reichenhall";
        builders.add(img("DSCN0509.JPG"));
        builders.add(img("DSCN0510.JPG"));
        builders.add(vid("DSCN0511.MP4"));
        builders.add(img("DSCN0512.JPG"));
        builders.add(img("DSCN0513.JPG"));
        builders.add(img("DSCN0514.JPG"));
        builders.add(img("DSCN0517.JPG"));
        builders.add(img("DSCN0520.JPG"));
        detailTitle = "Mein Hotel";
        builders.add(img("DSCN0521.JPG"));

        return yaFIMnle.of(builders).create();

    }

    public File gen20230928() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.09.28_thumsee_koenigsee/";
        subTitle = "2023.09.28 Thumsee in die Weißbachschlucht";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2023.09.28");

        detailTitle = "Thumsee in die Weißbachschlucht";
        builders.add(img("DSCN0525.JPG"));
        builders.add(img("DSCN0535.JPG")); // Schild Weißbachschlucht
        builders.add(vid("DSCN0538.MP4"));
        builders.add(vid("DSCN0539.MP4"));
        builders.add(vid("DSCN0541.MP4"));
        builders.add(img("DSCN0542.JPG"));
        builders.add(img("DSCN0543.JPG"));
        builders.add(vid("DSCN0544.MP4"));
        builders.add(img("DSCN0545.JPG"));
        builders.add(img("DSCN0546.JPG"));
        builders.add(img("DSCN0547.JPG"));
        builders.add(vid("DSCN0548.MP4"));
        builders.add(img("DSCN0549.JPG"));
        builders.add(vid("DSCN0550.MP4"));
        builders.add(img("DSCN0551.JPG"));
        builders.add(img("DSCN0552.JPG"));
        builders.add(img("DSCN0554.JPG"));
        builders.add(img("DSCN0556.JPG"));
        builders.add(img("DSCN0557.JPG"));
        detailTitle = "Berchtesgaden Königse";
        builders.add(vid("DSCN0559.MP4"));
        builders.add(img("DSCN0560.JPG"));
        builders.add(img("DSCN0561.JPG"));
        builders.add(img("DSCN0562.JPG"));
        builders.add(img("DSCN0566.JPG"));
        builders.add(img("DSCN0568.JPG"));
        builders.add(vid("DSCN0570.MP4"));
        builders.add(img("DSCN0571.JPG"));
        builders.add(img("DSCN0573.JPG"));
        builders.add(vid("DSCN0574.MP4"));
        builders.add(img("DSCN0575.JPG"));
        builders.add(vid("DSCN0576.MP4"));
        builders.add(img("DSCN0577.JPG"));
        detailTitle = "Bad Reichenhall";
        builders.add(vid("DSCN0578.MP4"));
        builders.add(img("DSCN0579.JPG"));
        builders.add(vid("DSCN0580.MP4"));
        builders.add(img("DSCN0581.JPG"));
        builders.add(img("DSCN0582.JPG"));
        builders.add(img("DSCN0583.JPG"));
        builders.add(img("DSCN0584.JPG"));

        return yaFIMnle.of(builders).create();

    }

    public File gen20230929() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.09.29_zell_am_see/";
        subTitle = "2023.09.29 Zell am See";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2023.09.29");

        detailTitle = "Zell am See";
        builders.add(img("DSCN0590.JPG"));
        builders.add(img("DSCN0591.JPG"));
        builders.add(img("DSCN0592.JPG"));
        builders.add(img("DSCN0593.JPG"));
        builders.add(vid("DSCN0594.MP4"));
        builders.add(img("DSCN0595.JPG"));
        builders.add(img("DSCN0596.JPG"));

        return yaFIMnle.of(builders).create();

    }
}
