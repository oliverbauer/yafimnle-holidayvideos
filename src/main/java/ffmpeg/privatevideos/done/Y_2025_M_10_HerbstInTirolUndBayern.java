package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.common.FadeType;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_10_HerbstInTirolUndBayern extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_10_HerbstInTirolUndBayern();
        main.mainTitle = "2025 Alpenurlaub im Herbst";
        main.run();
    }

    @Override
    protected void run() {
        var f1 = gen20251011(); // 2m11s Stuttgart + Kufstein
        var f2 = gen20251012(); // 5m13s Innsbruck + Scharnitz
        var f3 = gen20251013(); // 3m46s Hochzirl + Brixen + Trento
        var f4 = gen20251014(); // 1m54s Sterzing + Seefeld + Garmisch
        var f5 = gen20251015(); // 3m42s Mittenwald nach Garmisch

        var joiner = new FFMpegJoiner();
        joiner.join("2025.10.tirol-und-bayern", f1, f2, f3, f4, f5);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public File gen20251011() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.10.11.stuttgart.kufstein/";
        subTitle = "Samstag 11.10.2025 Tag 1/5";
        setup();

        detailTitle = "BW - Stuttgart";
        var yaFIMnle = new YaFIMnle("2025.10.11");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC01708.jpg"));
        builders.add(img("DSC01709.jpg"));
        builders.add(vid("GX012302.MP4"));
        builders.add(img("DSC01712.jpg"));
        builders.add(img("DSC01719.jpg"));
        builders.add(img("P1022266.JPG"));
        detailTitle = "Tirol - Kufstein";
        builders.add(img("DSC01722.jpg"));
        builders.add(img("DSC01724.jpg"));
        builders.add(img("DSC01731.jpg"));
        builders.add(vid("GX012305.MP4"));
        builders.add(img("P1022267.JPG").fadeType(FadeType.FADE));
        builders.add(img("DSC01745.jpg"));
        builders.add(vid("GX012307.MP4"));
        builders.add(vid("GX012314.MP4"));
        builders.add(vid("GX012315.MP4"));
        builders.add(img("DSC01752.jpg"));
        builders.add(img("DSC01753.jpg"));
        builders.add(img("DSC01756.jpg"));
        builders.add(img("DSC01762.jpg"));
        builders.add(img("DSC01766.jpg"));
        builders.add(vid("GX012317.MP4"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20251012() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.10.12.innsbruck.scharnitz/";
        subTitle = "Sonntag 12.10.2025 Tag 2/5";
        setup();

        detailTitle = "Tirol - Innsbruck";
        var yaFIMnle = new YaFIMnle("2025.10.12");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("P1022273.JPG"));
        builders.add(img("DSC01784.JPG"));
        builders.add(img("DSC01785.JPG"));
        builders.add(vid("GX012322.MP4"));
        builders.add(vid("GX012327.MP4"));
        builders.add(vid("GX012332.MP4"));
        builders.add(img("DSC01796.JPG"));
        builders.add(img("P1022281.JPG"));
        builders.add(img("DSC01799.JPG"));
        builders.add(img("P1022289.JPG"));
        builders.add(img("P1022288.JPG"));
        builders.add(img("P1022291.JPG"));
        builders.add(img("P1022294.JPG"));
        builders.add(img("P1022298.JPG"));
        detailTitle = "Tirol - Scharnitz";
        builders.add(img("DSC01814.JPG"));
        builders.add(img("DSC01815.JPG"));
        builders.add(vid("GX012347.MP4"));
        builders.add(vid("GX012349.MP4"));
        builders.add(img("DSC01826.JPG"));
        builders.add(img("DSC01829.JPG"));
        builders.add(vid("GX012350.MP4"));
        builders.add(vid("GX012353.MP4"));
        builders.add(img("DSC01851.JPG"));
        builders.add(img("DSC01856.jpg"));
        builders.add(img("DSC01858.jpg"));
        builders.add(vid("GX012356.MP4"));
        builders.add(vid("GX012358.MP4"));
        builders.add(vid("GX012360.MP4"));
        builders.add(vid("GX012365.MP4"));
        detailTitle = "Bayern - Garmisch Partenkirchen";
        builders.add(img("DSC01872.jpg"));
        builders.add(img("DSC01874.jpg"));
        builders.add(img("DSC01878.jpg"));
        builders.add(img("P1022317.JPG"));
        builders.add(img("P1022319.JPG"));
        builders.add(img("P1022320.JPG"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20251013() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.10.13.hochzirl.brixen.trento/";
        subTitle = "Montag 13.10.2025 Tag 3/5";
        setup();

        detailTitle = "Tirol - Hochzirl";
        var yaFIMnle = new YaFIMnle("2025.10.13");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC01885.jpg"));
        builders.add(vid("GX012367.MP4"));
        builders.add(img("DSC01886.jpg"));
        builders.add(vid("GX012370.MP4"));
        builders.add(img("DSC01887.jpg"));
        builders.add(vid("P1022330.MP4"));
        builders.add(img("P1022334.JPG"));
        builders.add(vid("GX012373.MP4"));
        builders.add(img("P1022341.JPG"));
        builders.add(vid("GX012371.MP4"));
        builders.add(vid("GX012375.MP4"));
        builders.add(vid("GX012377.MP4"));
        detailTitle = "Südtirol - Brixen";
        builders.add(img("DSC01889.jpg"));
        builders.add(img("DSC01891.jpg"));
        builders.add(img("DSC01893.jpg"));
        builders.add(img("DSC01895.jpg"));
        builders.add(img("DSC01897.jpg"));
        builders.add(img("DSC01898.jpg"));
        builders.add(vid("GX012385.MP4"));
        builders.add(vid("GX012386.MP4"));
        builders.add(img("DSC01900.jpg"));
        builders.add(img("DSC01903.jpg"));
        builders.add(img("DSC01904.jpg"));
        builders.add(img("DSC01909.jpg"));
        detailTitle = "Trentino - Trento";
        builders.add(img("DSC01922.jpg"));
        builders.add(img("DSC01923.jpg"));
        builders.add(vid("GX012389.MP4"));
        builders.add(img("DSC01927.jpg"));
        builders.add(img("DSC01928.jpg"));
        builders.add(img("DSC01932.jpg"));
        builders.add(img("DSC01933.jpg"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20251014() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.10.14.sterzing.seefeld.garmisch/";
        subTitle = "Dienstag 14.10.2025 Tag 4/5";
        setup();

        detailTitle = "Südtirol - Sterzing";
        var yaFIMnle = new YaFIMnle("2025.10.14");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC01936.jpg"));
        builders.add(img("DSC01938.jpg"));
        builders.add(img("DSC01941.jpg"));
        builders.add(vid("GX012391.MP4"));
        builders.add(img("DSC01944.jpg"));
        builders.add(img("DSC01945.jpg"));
        detailTitle = "Tirol - Seefeld in Tirol";
        builders.add(img("DSC01949.jpg"));
        builders.add(img("DSC01952.jpg"));
        builders.add(img("DSC01956.jpg"));
        builders.add(img("DSC01958.jpg"));
        builders.add(vid("GX012393.MP4"));
        builders.add(vid("GX012395.MP4"));
        builders.add(img("DSC01971.jpg"));
        builders.add(img("DSC01975.jpg"));
        builders.add(vid("GX012398.MP4"));
        detailTitle = "Bayern - Garmisch Partenkirchen";
        builders.add(img("DSC01977.jpg"));
        builders.add(img("DSC01983.jpg"));
        builders.add(img("DSC01986.jpg"));
        builders.add(vid("GX012401.MP4"));
        builders.add(vid("GX012405.MP4"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20251015() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.10.15.mittenwald.nach.garmisch/";
        subTitle = "Mittwoch 15.10.2025 Tag 5/5";
        setup();

        detailTitle = "Bayern - Mittenwald nach Garmisch";
        var yaFIMnle = new YaFIMnle("2025.10.15");
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("GX012411.MP4"));
        builders.add(vid("GX012412.MP4"));
        builders.add(img("DSC01990.jpg"));
        builders.add(img("DSC01992.jpg"));
        builders.add(img("DSC01997.jpg"));
        builders.add(vid("GX012416.MP4"));
        builders.add(img("DSC02003.jpg"));
        builders.add(img("DSC02004.jpg"));
        builders.add(vid("GX012418.MP4"));
        builders.add(vid("GX012421.MP4"));
        builders.add(img("DSC02014.jpg"));
        builders.add(img("DSC02018.jpg"));
        builders.add(img("DSC02020.jpg"));
        builders.add(vid("GX012432.MP4"));
        builders.add(vid("GX012434.MP4"));
        builders.add(img("DSC02028.jpg"));
        builders.add(img("DSC02030.jpg"));
        builders.add(vid("GX012439.MP4"));
        builders.add(vid("GX012440.MP4"));
        builders.add(vid("GX012442.MP4"));
        builders.add(img("P1022435.JPG"));
        builders.add(img("P1022436.JPG"));
        builders.add(img("P1022443.JPG"));
        builders.add(img("P1022445.JPG"));
        builders.add(vid("GX012445.MP4"));
        builders.add(vid("GX012448.MP4"));
        builders.add(img("DSC02037.jpg"));
        builders.add(img("DSC02038.jpg"));
        builders.add(vid("GX012450.MP4"));
        return yaFIMnle.of(builders).create();
    }
}