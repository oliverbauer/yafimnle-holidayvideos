package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2018_M_03_FranzoesicheAlpenUndCinqueTerre extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2018_M_03_FranzoesicheAlpenUndCinqueTerre();
        main.mainTitle = "2018 Frühling in den französischen Alpen und in Cinque Terre";
        main.run();
    }

    @Override
    public void run() {
        Presets.x264_normal_quality(sourceDir, destinationDir);

        var f1 = gen20180323();
        var f2 = gen20180324();
        var f3 = gen20180325();
        var f4 = gen20180326();
        var f5 = gen20180327();
        var f6 = gen20180328();
        var f7 = gen20180329();

        var joiner = new FFMpegJoiner();
        joiner.join("2018.03.franzoesische_alpen_und_cinque_terre", f1, f2, f3, f4, f5, f6, f7);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20180323() {
        sourceDir = "/media/oliver/Extreme SSD/2018/03/23_lauterbrunnen_wengen";
        subTitle = "2018.03.23 Lauterbrunnen (802m) / Wengen(1274m)";
        setup();

        var yaFIMnle = new YaFIMnle("2018.03.23");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Lauterbrunnen";
        builders.add(vid("13_47_47.mp4"));
        builders.add(img("13_48_46-1.jpg"));
        detailTitle = "Wanderung nach Wengen";
        builders.add(img("14_19_44-1.jpg"));
        builders.add(img("14_25_56-1.jpg"));
        builders.add(vid("14_31_02.mp4"));
        builders.add(img("14_47_45-1.jpg"));
        builders.add(img("14_57_32-1.jpg"));
        builders.add(vid("15_08_35.mp4"));
        builders.add(img("15_19_46-1.jpg"));
        detailTitle = "Wengen";
        builders.add(vid("15_46_16.mp4"));
        builders.add(img("15_41_46-1.jpg"));
        builders.add(img("15_48_33-1.jpg"));
        builders.add(vid("16_05_29.mp4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180324() {
        sourceDir = "/media/oliver/Extreme SSD/2018/03/24_muerren_milano";
        subTitle = "2018.03.24 Mürren (1650m) / Interlaken(568m) / Kandersteg(1174m)";
        setup();

        var yaFIMnle = new YaFIMnle("2018.03.24");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Mürren";
        builders.add(vid("08_59_25.mp4"));
        builders.add(vid("09_05_57.mp4"));
        builders.add(img("09_13_14-1.jpg"));
        builders.add(img("09_29_08-1.jpg"));
        detailTitle = "Interlaken";
        builders.add(img("11_12_30-1.jpg"));
        builders.add(img("11_17_08-1.jpg"));
        builders.add(vid("11_35_40.mp4"));
        detailTitle = "Kandersteg";
        builders.add(img("12_37_18-1.jpg"));
        builders.add(img("13_32_38-1.jpg"));
        builders.add(vid("12_43_33.mp4"));
        builders.add(vid("13_39_36.mp4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180325() {
        sourceDir = "/media/oliver/Extreme SSD/2018/03/25_livorno_roma";
        subTitle = "2018.03.25 Roma und Livorno";
        setup();

        var yaFIMnle = new YaFIMnle("2018.03.25");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Roma";
        builders.add(vid("08_18_23.mp4"));
        builders.add(img("08_28_58-1.jpg"));
        builders.add(img("08_42_11-1.jpg"));
        builders.add(vid("08_39_27.mp4"));
        builders.add(img("08_46_57-1.jpg"));
        builders.add(img("09_13_13-1.jpg"));
        builders.add(img("09_13_37-1.jpg"));
        builders.add(img("09_18_09-1.jpg"));
        builders.add(vid("10_27_46.mp4"));
        builders.add(vid("10_30_27.mp4"));
        detailTitle = "Livorno";
        builders.add(img("14_51_59-1.jpg"));
        builders.add(img("15_28_33-1.jpg"));
        builders.add(img("15_29_49-1.jpg"));
        builders.add(vid("15_44_17.mp4"));
        builders.add(img("15_50_49-1.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180326() {
        sourceDir = "/media/oliver/Extreme SSD/2018/03/26_cinque_terre";
        subTitle = "2018.03.26 Cinque Terre";
        setup();

        detailTitle = "Vernezza";
        var yaFIMnle = new YaFIMnle("2018.03.26");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("10_43_57-1.jpg"));
        builders.add(img("10_54_57-1.jpg"));
        builders.add(vid("10_39_37.mp4"));
        builders.add(img("11_17_30-1.jpg"));
        builders.add(img("11_29_18-1.jpg"));
        builders.add(img("12_17_17-1.jpg"));
        builders.add(img("12_26_34-1.jpg"));
        builders.add(img("12_29_01-1.jpg"));
        builders.add(img("12_32_09-1.jpg"));
        builders.add(vid("12_31_33.mp4"));
        builders.add(vid("12_32_14.mp4"));
        builders.add(img("12_40_22-1.jpg"));
        builders.add(img("12_40_32-1.jpg"));
        builders.add(img("12_44_45-1.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180327() {
        sourceDir = "/media/oliver/Extreme SSD/2018/03/27_annot";
        subTitle = "2018.03.27 Annot (680m)";
        setup();

        var yaFIMnle = new YaFIMnle("2018.03.27");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Annot";
        builders.add(img("12_20_48-1.jpg"));
        builders.add(vid("13_49_58.mp4"));
        builders.add(img("13_51_04-1.jpg"));
        builders.add(img("14_39_40-1.jpg"));
        detailTitle = "Annot";
        builders.add(img("15_16_32-1.jpg"));
        builders.add(img("15_34_31-1.jpg"));
        builders.add(vid("15_43_09.mp4"));
        builders.add(img("16_16_46-1.jpg"));
        builders.add(vid("16_20_34.mp4"));
        builders.add(img("17_00_24-1.jpg"));
        builders.add(vid("17_05_00.mp4"));
        builders.add(img("17_29_42-1.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180328() {
        sourceDir = "/media/oliver/Extreme SSD/2018/03/28_castellane";
        subTitle = "2018.03.28 Wandern Saint_André les Alpes nach Castellane (722m)";
        setup();

        var yaFIMnle = new YaFIMnle("2018.03.28");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Saint_André";
        builders.add(img("08_43_30-1.jpg"));
        builders.add(img("09_42_07-1.jpg"));
        builders.add(vid("09_58_53.mp4"));
        builders.add(img("10_39_11-1.jpg"));
        builders.add(img("10_51_09-1.jpg"));
        builders.add(img("11_35_59-1.jpg"));
        builders.add(vid("11_50_30.mp4"));
        builders.add(vid("12_16_56.mp4"));
        builders.add(img("13_46_10-1.jpg"));
        detailTitle = "Castellane";
        builders.add(img("14_26_20-1.jpg"));
        builders.add(img("14_31_22-1.jpg"));
        builders.add(img("17_54_58-1.jpg"));
        builders.add(img("18_15_49-1.jpg"));
        builders.add(img("18_22_31-1.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180329() {
        sourceDir = "/media/oliver/Extreme SSD/2018/03/29_sisteron";
        subTitle = "2018.03.29 Sisteron";
        setup();

        var yaFIMnle = new YaFIMnle("2018.03.29");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Sisteron";
        builders.add(img("11_32_03-1.jpg"));
        builders.add(img("11_32_30-1.jpg"));
        builders.add(img("11_34_44-1.jpg"));
        builders.add(vid("12_17_14.mp4"));
        return yaFIMnle.of(builders).create();
    }
}
