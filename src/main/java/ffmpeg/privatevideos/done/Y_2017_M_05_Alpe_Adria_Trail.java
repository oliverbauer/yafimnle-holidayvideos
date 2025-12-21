package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2017_M_05_Alpe_Adria_Trail extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2017_M_05_Alpe_Adria_Trail();
        main.mainTitle = "Sommer 2017 Alpe Adria Trail";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20170529();
        var f2 = gen20170530();
        var f3 = gen20170531();

        var joiner = new FFMpegJoiner();
        joiner.join("2017.05.alpe-adria-trail-1080p",
                f1, f2, f3
        );
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20170529() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.29_Kranjska_Gora_nach_Trenta/";
        subTitle = "2017.05.29 (1/3) Kranjska Gora nach Trenta";
        setup();

        var yaFIMnle = new YaFIMnle("2017.05.29");

        List<Builder> builders = new ArrayList<>();

        // TODO Die auskommentierte Dinge sind nur für den Test ob das Konzept trägt...
        detailTitle = "";
        builders.add(img("08_52_42.jpg"));
        builders.add(img("09_11_12.jpg"));
        builders.add(img("09_15_19.jpg"));
        builders.add(img("09_15_27.jpg"));
        builders.add(img("10_00_03.jpg"));
        detailTitle = "Ruska kapelica";
        builders.add(img("10_07_39.jpg"));
        builders.add(img("10_08_28.jpg"));
        detailTitle = "";
        builders.add(img("10_29_54.jpg"));
        builders.add(img("10_44_18.jpg"));
        builders.add(img("10_44_27.jpg"));
        builders.add(img("11_04_20.jpg"));
        builders.add(img("11_04_26.jpg"));
        builders.add(img("11_09_00.jpg"));
        builders.add(img("11_09_08.jpg"));
        builders.add(img("11_27_25.jpg"));
        builders.add(img("11_29_54.jpg"));
        builders.add(img("11_30_17.jpg"));
        builders.add(img("11_30_50.jpg"));
        builders.add(img("11_39_10.jpg"));
        builders.add(img("11_39_18.jpg"));
        builders.add(img("12_03_00.jpg"));
        detailTitle = "Vršič";
        builders.add(img("12_07_28.jpg"));
        builders.add(img("12_07_46.jpg"));
        builders.add(img("12_11_25.jpg"));
        detailTitle = "";
        builders.add(img("12_19_37.jpg"));
        builders.add(img("12_19_50.jpg"));
        builders.add(img("12_20_20.jpg"));
        builders.add(img("12_29_09.jpg"));
        builders.add(img("13_46_20.jpg"));
        builders.add(img("13_46_27.jpg"));
        builders.add(vid("13_46_43.mp4"));
        builders.add(img("13_47_19.jpg"));
        builders.add(img("13_47_26.jpg"));
        builders.add(img("13_56_56.jpg"));
        builders.add(img("13_57_07.jpg"));
        builders.add(img("14_31_38.jpg"));
        builders.add(img("14_38_39.jpg"));
        builders.add(img("14_48_19.jpg"));
        builders.add(vid("14_48_27.mp4"));
        builders.add(img("14_54_33.jpg"));
        builders.add(img("14_57_45.jpg"));
        builders.add(img("14_57_50.jpg"));
        builders.add(img("15_06_14.jpg"));
        builders.add(img("15_33_39.jpg"));
        builders.add(img("16_25_22.jpg"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20170530() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.30_Tranta_nach_Bovec/";
        subTitle = "2017.05.30 (2/3) Trenta nach Bovec";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2017.05.30");

        detailTitle = "";
        builders.add(img("06_21_53.jpg"));
        builders.add(img("06_22_09.jpg"));
        builders.add(img("06_24_29.jpg"));
        builders.add(img("06_30_35.jpg"));
        builders.add(img("06_32_02.jpg"));
        builders.add(img("06_41_42.jpg"));
        builders.add(img("06_41_50.jpg"));
        builders.add(vid("06_51_10.mp4"));
        builders.add(img("06_55_48.jpg"));
        builders.add(img("06_58_39.jpg"));
        builders.add(img("07_00_22.jpg"));
        builders.add(img("07_07_05.jpg"));
        builders.add(img("07_27_01.jpg"));
        builders.add(img("07_27_08.jpg"));
        builders.add(img("07_34_32.jpg"));
        builders.add(img("07_34_39.jpg"));
        builders.add(img("07_40_06.jpg"));
        builders.add(img("07_46_53.jpg"));
        builders.add(img("08_12_07.jpg"));
        builders.add(img("08_12_15.jpg"));
        builders.add(img("08_28_28.jpg"));
        builders.add(img("08_35_29.jpg"));
        builders.add(img("08_54_00.jpg"));
        builders.add(img("09_08_11.jpg"));
        builders.add(img("09_08_17.jpg"));
        builders.add(img("09_08_24.jpg"));
        builders.add(img("09_16_00.jpg"));
        builders.add(img("09_16_11.jpg"));
        builders.add(img("09_30_26.jpg"));
        builders.add(img("09_30_34.jpg"));
        builders.add(img("09_30_42.jpg"));
        builders.add(img("09_32_02.jpg"));
        builders.add(img("09_32_54.jpg"));
        builders.add(vid("09_33_04.mp4"));
        builders.add(img("09_41_39.jpg"));
        builders.add(img("09_41_53.jpg"));
        builders.add(img("09_43_35.jpg"));
        builders.add(img("09_43_44.jpg"));
        builders.add(img("09_45_26.jpg"));
        builders.add(img("09_48_38.jpg"));
        builders.add(img("09_58_57.jpg"));
        builders.add(img("09_59_07.jpg"));
        builders.add(img("10_03_10.jpg"));
        builders.add(img("10_10_28.jpg"));
        builders.add(img("10_12_48.jpg"));
        builders.add(img("10_28_35.jpg"));
        builders.add(img("10_28_43.jpg"));
        builders.add(img("10_28_52.jpg"));
        builders.add(img("10_29_11.jpg"));
        builders.add(vid("10_29_19.mp4"));
        builders.add(img("10_41_54.jpg"));
        builders.add(img("10_42_04.jpg"));
        builders.add(img("10_45_02.jpg"));
        builders.add(img("10_45_06.jpg"));
        builders.add(img("10_45_11.jpg"));
        builders.add(img("10_45_16.jpg"));
        builders.add(vid("10_45_23.mp4"));
        builders.add(img("10_48_57.jpg"));
        builders.add(img("10_49_31.jpg"));
        builders.add(img("10_58_35.jpg"));
        builders.add(img("11_00_54.jpg"));
        builders.add(img("11_05_08.jpg"));
        builders.add(vid("11_05_13.mp4"));
        builders.add(img("11_05_48.jpg"));
        builders.add(img("11_07_34.jpg"));
        builders.add(img("11_08_20.jpg"));
        builders.add(img("11_09_20.jpg"));
        builders.add(img("11_10_02.jpg"));
        builders.add(img("11_20_58.jpg"));
        builders.add(img("12_17_48.jpg"));
        builders.add(img("12_17_55.jpg"));
        builders.add(img("12_29_18.jpg"));
        builders.add(img("12_41_59.jpg"));
        builders.add(img("12_47_02.jpg"));
        builders.add(img("12_55_09.jpg"));

        return yaFIMnle.of(builders).create();

    }

    private File gen20170531() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.31_Bovec_nach_Kobarid/";
        subTitle = "2017.05.31 (3/3) Bovec nach Kobarid";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2017.05.31");

        detailTitle = "";
        builders.add(img("05_36_30.jpg"));
        builders.add(img("06_08_43.jpg"));
        detailTitle = "Slap Virje";
        builders.add(img("06_31_46.jpg"));
        builders.add(img("06_45_01.jpg"));
        builders.add(img("06_45_12.jpg"));
        builders.add(img("06_56_55.jpg"));
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4"));
        builders.add(img("07_00_11.jpg"));
        builders.add(img("07_03_24.jpg"));
        detailTitle = "";
        builders.add(img("07_26_45.jpg"));
        builders.add(img("07_44_50.jpg"));
        builders.add(img("08_48_38.jpg"));
        builders.add(img("08_50_48.jpg"));
        builders.add(img("08_51_39.jpg"));
        builders.add(img("08_52_50.jpg"));
        builders.add(img("09_04_37.jpg"));
        builders.add(img("09_05_00.jpg"));
        builders.add(vid("09_19_24.mp4"));
        builders.add(img("09_46_51.jpg"));
        builders.add(img("11_32_31.jpg"));
        builders.add(img("13_18_10.jpg"));
        builders.add(img("13_36_59.jpg"));
        builders.add(img("13_38_07.jpg"));
        builders.add(img("14_06_07.jpg"));
        builders.add(img("14_14_37.jpg"));
        builders.add(img("14_21_12.jpg"));
        builders.add(img("14_21_26.jpg"));
        builders.add(img("14_21_54.jpg"));
        builders.add(img("14_22_07.jpg"));
        detailTitle = "Kobarid";
        builders.add(img("15_05_47.jpg"));
        builders.add(vid("15_05_53.mp4"));
        builders.add(img("15_06_41.jpg"));
        builders.add(img("15_08_11.jpg"));
        builders.add(img("15_08_56.jpg"));
        builders.add(img("15_09_09.jpg"));
        builders.add(img("15_09_47.jpg"));
        builders.add(img("15_11_50.jpg"));
        builders.add(img("15_12_58.jpg"));
        builders.add(img("16_37_07.jpg"));
        builders.add(img("16_38_21.jpg"));
        builders.add(img("16_40_01.jpg"));
        builders.add(img("16_41_09.jpg"));
        builders.add(img("16_43_31.jpg"));
        builders.add(img("16_49_23.jpg"));
        builders.add(vid("16_49_27.mp4"));
        builders.add(vid("16_50_54.mp4"));
        builders.add(img("16_57_50.jpg"));
        builders.add(img("16_58_30.jpg"));
        builders.add(img("16_58_58.jpg"));
        builders.add(img("16_59_11.jpg"));
        builders.add(img("16_59_52.jpg"));
        builders.add(img("17_00_01.jpg"));
        builders.add(img("17_00_46.jpg"));
        detailTitle = "Slap Kozjak";
        builders.add(img("17_01_40.jpg"));
        builders.add(vid("17_01_59.mp4"));
        builders.add(img("17_04_49.jpg"));
        builders.add(vid("17_04_56.mp4"));
        detailTitle = "";
        builders.add(img("17_16_24.jpg"));
        builders.add(img("17_16_31.jpg"));

        return yaFIMnle.of(builders).create();
    }
}