package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2024_M_08_Sabbatical_2024 extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2024_M_08_Sabbatical_2024();
        main.mainTitle = "Sabbatical August 2024";
        main.run();
    }

    @Override
    protected void run() {
        var f1 = gen20240703();
        var f2 = gen20240704();
        var f3 = gen20240708();
        var f4 = gen20240709();
        var f5 = gen20240718();
        var f6 = gen20240727();
        var f7 = gen20240728();
        var f8 = gen20240806();
        var f9 = gen20240828();
        var f10 = gen20240829();

        var joiner = new FFMpegJoiner();
        joiner.join(
                "2024.07+08.sabbatical.hevc",
                f1, f2, f3, f4, f5, f6, f7, f8, f9, f10
        );
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20240703() {
        sourceDir = "/media/oliver/Extreme SSD/2024/07/03_dresden";
        subTitle = "2024.07.03 Dresden";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.03");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreisetag nach Dresden";
        builders.add(vid("GX010634.MP4"));
        detailTitle = "Dresden";
        builders.add(img("DSCN1172.JPG"));
        builders.add(vid("GX010638.MP4"));
        builders.add(img("DSCN1180.JPG"));
        builders.add(vid("GX010642.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240704() {
        sourceDir = "/media/oliver/Extreme SSD/2024/07/04_wehlen_rathen";
        subTitle = "2024.07.04 Sächsische Schweiz";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.04");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Ankunft in Wehlen";
        builders.add(img("DSCN1188.JPG"));
        builders.add(vid("GX010645.MP4"));
        detailTitle = "Malerweg";
        builders.add(img("DSCN1187.JPG"));
        builders.add(img("DSCN1199.JPG"));
        builders.add(vid("GX010653.MP4"));
        builders.add(img("DSCN1204.JPG"));
        builders.add(img("DSCN1212.JPG"));
        detailTitle = "Basteibrücke";
        builders.add(vid("GX010669.MP4"));
        builders.add(vid("GX010668.MP4"));
        detailTitle = "Zu den Schrammsteinen";
        builders.add(img("DSCN1233.JPG"));
        builders.add(vid("GX010681.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240708() {
        sourceDir = "/media/oliver/Extreme SSD/2024/07/08_ravennaschlucht_donaueschingen";
        subTitle = "2024.07.08 Baden Würtemberg";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.08");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Via Mannheim...";
        builders.add(img("DSCN1240.JPG"));
        builders.add(img("DSCN1243.JPG"));
        detailTitle = "...in die Ravennaschlucht";
        builders.add(vid("GX010706.MP4"));
        detailTitle = "Ravennaschlucht";
        builders.add(vid("GX010710.MP4"));
        builders.add(img("DSCN1258.JPG"));
        builders.add(img("DSCN1261.JPG"));
        builders.add(vid("GX010714.MP4"));
        detailTitle = "Donaueschingen";
        builders.add(img("DSCN1276.JPG"));
        builders.add(vid("GX010721.MP4"));
        builders.add(vid("GX010723.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240709() {
        sourceDir = "/media/oliver/Extreme SSD/2024/07/09_bodensee";
        subTitle = "2024.07.09 Bodensee";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.09");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Konstanz";
        builders.add(img("DSCN1299.JPG"));
        builders.add(vid("GX010725.MP4"));
        builders.add(img("DSCN1300.JPG"));
        builders.add(vid("GX010727.MP4"));
        detailTitle = "Überlingen";
        builders.add(img("DSCN1309.JPG"));
        builders.add(img("DSCN1311.JPG"));
        builders.add(vid("GX010732.MP4"));
        builders.add(img("DSCN1313.JPG"));
        detailTitle = "Meersburg";
        builders.add(img("DSCN1322.JPG"));
        builders.add(img("DSCN1324.JPG"));
        builders.add(img("DSCN1328.JPG"));
        detailTitle = "Lindau";
        builders.add(img("DSCN1332.JPG"));
        builders.add(img("DSCN1334.JPG"));
        builders.add(vid("GX010742.MP4"));
        builders.add(img("DSCN1336.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240718() {
        sourceDir = "/media/oliver/Extreme SSD/2024/07/18_wolfsklamm";
        subTitle = "2024.07.18 Wolfsklamm in Stans bei Schwaz";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.18");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Jenbach";
        builders.add(vid("GX010809.MP4"));
        detailTitle = "Jenbach";
        builders.add(img("DSCN1449.JPG"));
        builders.add(img("DSCN1450.JPG"));
        detailTitle = "Wolfsklamm";
        builders.add(img("DSCN1454.JPG"));
        builders.add(img("DSCN1456.JPG"));
        builders.add(vid("GX010813.MP4"));
        builders.add(img("DSCN1459.JPG"));
        builders.add(vid("GX010819.MP4"));
        builders.add(img("DSCN1464.JPG"));
        detailTitle = "Richtung Scharnitz";
        builders.add(vid("GX010826.MP4"));
        detailTitle = "Scharnitz nach Mittenwald";
        builders.add(img("DSCN1479.JPG"));
        builders.add(vid("GX010836.MP4"));
        builders.add(img("DSCN1487.JPG"));
        detailTitle = "Garmisch-Partenkirchen";
        builders.add(vid("GX010840.MP4"));
        builders.add(vid("GX010842.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240727() {
        sourceDir = "/media/oliver/Extreme SSD/2024/07/27_irrel_teufelsschlucht";
        subTitle = "2024.07.27 Teufelsschlucht (Irrel)";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.27");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Irrel";
        builders.add(img("DSCN1496.JPG"));
        detailTitle = "Irreler Wasserfälle";
        builders.add(vid("GX010849.MP4"));
        detailTitle = "Teufelsschlucht";
        builders.add(img("DSCN1515.JPG"));
        builders.add(vid("GX010856.MP4"));
        builders.add(img("DSCN1521.JPG"));
        builders.add(vid("GX010865.MP4"));
        builders.add(vid("GX010866.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240728() {
        sourceDir = "/media/oliver/Extreme SSD/2024/07/28_echternach_wolfsschlucht";
        subTitle = "2024.07.28 Echternach (Luxemburg)";
        setup();

        var yaFIMnle = new YaFIMnle("2024.07.28");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Echternach";
        builders.add(img("DSCN1529.JPG"));
        builders.add(vid("GX010880.MP4"));
        builders.add(img("DSCN1540.JPG"));
        builders.add(vid("GX010884.MP4"));
        builders.add(img("DSCN1546.JPG"));
        builders.add(img("DSCN1560.JPG"));
        builders.add(img("DSCN1561.JPG"));
        builders.add(vid("GX010891.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240806() {
        sourceDir = "/media/oliver/Extreme SSD/2024/08/06_zell_am_see";
        subTitle = "2024.08.06 Zell am See";
        setup();

        var yaFIMnle = new YaFIMnle("2024.08.06");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Zell am See";
        builders.add(vid("GX010964.MP4"));
        builders.add(vid("GX010966.MP4"));
        builders.add(img("DSCN1725.JPG"));
        builders.add(img("DSCN1726.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240828() {
        sourceDir = "/media/oliver/Extreme SSD/2024/08/28_partnachklamm_hausberg";
        subTitle = "2024.08.28 Partnachklamm";
        setup();

        var yaFIMnle = new YaFIMnle("2024.08.28");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Partnachklamm";
        builders.add(img("DSCN1894.JPG"));
        builders.add(vid("GX011032.MP4"));
        builders.add(vid("GX011033.MP4"));
        builders.add(vid("GX011036.MP4"));
        builders.add(img("DSCN1907.JPG"));
        builders.add(img("DSCN1910.JPG"));
        builders.add(vid("GX011042.MP4"));
        builders.add(img("DSCN1929.JPG"));
        detailTitle = "Scharnitz nach Gießenbach";
        builders.add(vid("GX011051.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240829() {
        sourceDir = "/media/oliver/Extreme SSD/2024/08/29_gleirschklamm";
        subTitle = "2024.08.29 Gleirschklamm";
        setup();

        var yaFIMnle = new YaFIMnle("2024.08.29");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Gleirschklamm";
        builders.add(img("DSCN1944.JPG"));
        builders.add(img("DSCN1958.JPG"));
        builders.add(vid("GX011059.MP4"));
        builders.add(vid("GX011068.MP4"));
        detailTitle = "In der Klamm";
        builders.add(img("DSCN1983.JPG"));
        builders.add(img("DSCN1992.JPG"));
        builders.add(img("DSCN2005.JPG"));
        builders.add(vid("GX011077.MP4"));
        builders.add(vid("GX011079.MP4"));
        return yaFIMnle.of(builders).create();
    }
}
