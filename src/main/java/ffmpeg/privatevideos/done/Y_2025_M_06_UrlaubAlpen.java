package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_06_UrlaubAlpen extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_06_UrlaubAlpen();
        main.mainTitle = "Sommerurlaub 2025";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20250607(); // 1m08s Donaueschingen
        var f2 = gen20250608(); // 1m54s Lugano +  Locarno
        var f3 = gen20250609(); // 1m59s Como + Milano
        var f4 = gen20250610(); // 1m58s Desancano + Innsbruck
        var f5 = gen20250611(); // 4m12s Strohwollner Schlucht + Vorderkaserklamm
        var f6 = gen20250612(); // 3m10s Liechtensteinklamm + Golling + Salzburg
        var f7 = gen20250613(); //   58s Mengschlucht
                                // Summe: 15m20s

        var joiner = new FFMpegJoiner();
        joiner.join("2025.06.schweiz.italien.oesterreich", f1, f2, f3, f4, f5, f6, f7);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20250607() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.06.07.donaueschingen/";
        subTitle = "2025.06.07 Deutschland Tag 1/7";
        setup();

        var yaFIMnle = new YaFIMnle("2025.06.07");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Karlsruhe";
        builders.add(img("P1000180.JPG"));
        builders.add(img("P1000181.JPG"));
        builders.add(img("P1000183.JPG"));
        builders.add(img("P1000191.JPG"));
        builders.add(vid("GX011698-schloss.MP4"));
        builders.add(img("P1000189.JPG"));
        builders.add(vid("GX011699.MP4").seconds("00:00:00", "00:00:03"));
        builders.add(vid("GX011700.MP4").seconds("00:00:08", "00:00:12"));
        detailTitle = "Donaueschingen";
        builders.add(img("P1000203.JPG"));
        builders.add(img("P1000208.JPG"));
        builders.add(img("P1000212.JPG"));
        builders.add(img("P1000218.JPG"));
        builders.add(vid("GX011703-schlosspark-donaueschingen.MP4"));
        builders.add(img("P1000225.JPG"));
        builders.add(img("P1000227.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250608() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.06.08.lugano.locarno";
        subTitle = "2025.06.08 Schweiz Tag 2/7";
        setup();

        var yaFIMnle = new YaFIMnle("2025.06.08");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Bellinzona";
        builders.add(vid("GX011712.MP4"));
        builders.add(img("P1000245.JPG"));
        builders.add(img("P1000248.JPG"));
        builders.add(img("P1000254.JPG"));
        builders.add(vid("GX011713-bellinzona.MP4"));
        builders.add(img("P1000260.JPG"));
        builders.add(img("P1000265.JPG"));
        builders.add(img("P1000273.JPG"));
        builders.add(vid("GX011715.MP4"));
        builders.add(img("P1000277.JPG"));
        detailTitle = "Lugano";
        builders.add(img("P1000282.JPG"));
        builders.add(vid("GX011718-lugano.MP4"));
        builders.add(img("P1000290.JPG"));
        builders.add(img("P1000291.JPG"));
        builders.add(img("P1000292.JPG"));
        builders.add(vid("GX011720.MP4"));
        builders.add(img("P1000299.JPG"));
        builders.add(img("P1000307.JPG"));
        builders.add(img("P1000312.JPG"));
        builders.add(vid("GX011722.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250609() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.06.09.como.milano/";
        subTitle = "2025.06.09 Italien Tag 3/7";
        setup();

        var yaFIMnle = new YaFIMnle("2025.06.09");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Como";
        builders.add(img("P1000327.JPG"));
        builders.add(img("P1000329.JPG"));
        builders.add(img("P1000339.JPG"));
        builders.add(img("P1000336.JPG"));
        builders.add(vid("GX011728-duomo.MP4"));
        builders.add(img("P1000339.JPG"));
        builders.add(vid("GX011730.MP4"));
        detailTitle = "Milano";
        builders.add(img("P1000357.JPG"));
        builders.add(img("P1000360.JPG"));
        builders.add(img("P1000365.JPG"));
        builders.add(img("P1000371.JPG"));
        builders.add(img("P1000373.JPG"));
        builders.add(vid("GX011733.MP4"));
        builders.add(img("P1000378.JPG"));
        builders.add(img("P1000384.JPG"));
        builders.add(img("P1000385.JPG"));
        builders.add(vid("GX011735.MP4"));
        builders.add(img("P1000393.JPG"));
        builders.add(vid("GX011737.MP4"));
        builders.add(img("P1000403.JPG"));
        detailTitle = "Brescia";
        builders.add(img("P1000420.JPG"));
        builders.add(vid("GX011741.MP4"));
        builders.add(vid("GX011740-brescia.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250610() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.06.10.desancano.innsbruck/";
        subTitle = "2025.06.10 Italien Tag 4/7";
        setup();

        var yaFIMnle = new YaFIMnle("2025.06.10");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise";
        builders.add(vid("GX011744.MP4"));
        detailTitle = "Peschiera del Garda";
        builders.add(img("P1000435.JPG"));
        builders.add(img("P1000441.JPG"));
        builders.add(img("P1000427.JPG"));
        builders.add(vid("GX011745.MP4"));
        builders.add(vid("GX011746.MP4"));
        detailTitle = "Trento";
        builders.add(img("P1000444.JPG"));
        builders.add(vid("GX011751.MP4"));
        builders.add(img("P1000454.JPG"));
        builders.add(img("P1000456.JPG"));
        builders.add(vid("GX011750-trento.MP4"));
        builders.add(img("P1000460.JPG"));
        builders.add(img("P1000461.JPG"));
        detailTitle = "Bozen";
        builders.add(img("P1000476.JPG"));
        builders.add(img("P1000481.JPG"));
        builders.add(img("P1000487.JPG"));
        builders.add(vid("GX011754-bozen.MP4"));
        builders.add(vid("GX011755.MP4"));
        subTitle = "2025.06.10 Österreich";
        detailTitle = "Innsbruck";
        builders.add(img("P1000494.JPG"));
        builders.add(img("P1000498.JPG"));
        builders.add(img("P1000514.JPG"));
        builders.add(img("P1000521.JPG"));
        builders.add(img("P1000529.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250611() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.06.11.strohwollner.schlucht.saalfelden/";
        subTitle = "2025.06.11 Österreich Tag 5/7";
        setup();

        var yaFIMnle = new YaFIMnle("2025.06.11");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Strohwollner Schlucht bei Lofer";
        builders.add(img("P1000535.JPG"));
        builders.add(vid("GX011759.MP4"));
        builders.add(img("P1000552.JPG"));
        builders.add(vid("GX011766.MP4"));
        builders.add(img("P1000556.JPG"));
        builders.add(img("P1000557.JPG"));
        builders.add(vid("GX011768.MP4"));
        detailTitle = "Vorderkaserklamm";
        builders.add(img("P1000565.JPG"));
        builders.add(vid("GX011774.MP4"));
        builders.add(vid("GX011775.MP4"));
        builders.add(vid("GX011780.MP4"));
        builders.add(img("P1000582.JPG"));
        builders.add(vid("GX011782.MP4"));
        builders.add(vid("GX011783.MP4"));
        builders.add(vid("GX011784.MP4"));
        builders.add(img("P1000593.JPG"));
        builders.add(img("P1000599.JPG"));
        detailTitle = "Zell am See";
        builders.add(vid("GX011792.MP4"));
        builders.add(img("P1000608.JPG"));
        builders.add(img("P1000610.JPG"));
        builders.add(img("P1000612.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250612() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.06.12.liechtensteinklamm.salzburg/";
        subTitle = "2025.06.12 Österreich Tag 6/7";
        setup();

        var yaFIMnle = new YaFIMnle("2025.06.12");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Liechtensteinklamm";
        builders.add(img("P1000636.JPG"));
        builders.add(img("P1000642.JPG"));
        builders.add(img("P1000646.JPG"));
        builders.add(vid("GX011799.MP4"));
        builders.add(img("P1000652.JPG"));
        builders.add(img("P1000653.JPG"));
        builders.add(vid("GX011800.MP4"));
        builders.add(vid("GX011801.MP4"));
        detailTitle = "Wasserfall Golling";
        builders.add(img("P1000667.JPG"));
        builders.add(img("P1000671.JPG"));
        builders.add(img("P1000676.JPG"));
        builders.add(vid("GX011804.MP4"));
        builders.add(vid("GX011813.MP4"));
        builders.add(img("P1000697.JPG"));
        detailTitle = "Salzburg";
        builders.add(img("P1000709.JPG"));
        builders.add(img("P1000717.JPG"));
        builders.add(img("P1000730.JPG"));
        builders.add(img("P1000733.JPG"));
        builders.add(vid("GX011819.MP4"));
        builders.add(img("P1000736.JPG"));
        builders.add(vid("GX011823.MP4"));
        builders.add(vid("GX011824.MP4"));
        builders.add(img("P1000765.JPG"));
        builders.add(img("P1000766.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20250613() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.06.13.mengschlucht/";
        subTitle = "2025.06.13 Österreich Tag 7/7";
        setup();

        var yaFIMnle = new YaFIMnle("2025.06.13");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Mengschlucht";
        builders.add(vid("GX011837.MP4"));
        builders.add(img("P1000807.JPG"));
        builders.add(img("P1000812.JPG"));
        builders.add(vid("GX011839.MP4"));
        builders.add(img("P1000814.JPG"));
        builders.add(vid("GX011844.MP4"));
        return yaFIMnle.of(builders).create();
    }
}
