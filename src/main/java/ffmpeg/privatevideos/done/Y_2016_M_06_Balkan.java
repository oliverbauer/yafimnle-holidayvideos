package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2016_M_06_Balkan extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2016_M_06_Balkan();
        main.mainTitle = "Balkan 2016";
        main.run();
    }

    @Override
    public void run() {
        var f1 = get20160618();
        var f2 = get20160619();
        var f3 = get20160620();
        var f4 = get20160621();
        var f5 = get20160622();
        var f6 = get20160623();
        var f7 = get20160624();
        var f8 = get20160625();
        var f9 = get20160626();
        var f10 = get20160627();
        var f11 = get20160629();

        var joiner = new FFMpegJoiner();
        joiner.join("2016.06.balkan.mp4", f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File get20160618() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.18_Ljubljana";
        subTitle = "2016.06.18 Ljubljana";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.18.ljubljana");
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("06_12_26.mts").seconds("00:00:00", "00:00:05"));
        builders.add(vid("07_10_04.mts").seconds("00:00:00", "00:00:05"));
        builders.add(vid("07_36_02.mts").seconds("00:00:00", "00:00:10"));
        builders.add(img("08_31_07.nef"));
        builders.add(img("08_31_15.nef"));
        builders.add(vid("08_37_42.mts").seconds("00:00:00", "00:00:10")); // Wasserfall
        detailTitle = "Villach Hbf Zug nach Ljubljana";
        builders.add(vid("10_26_42.mts"));
        builders.add(img("12_38_29.nef"));
        builders.add(img("12_38_39.nef"));
        builders.add(vid("15_19_02.mts"));
        builders.add(vid("15_34_32.mts"));
        builders.add(img("15_56_04.nef"));
        builders.add(img("15_56_14.nef"));
        builders.add(img("15_59_47.nef"));
        builders.add(img("16_00_36.nef"));
        builders.add(img("16_02_07.nef"));
        builders.add(img("16_02_46.nef"));
        builders.add(img("16_04_59.nef"));
        builders.add(img("16_06_00.nef"));
        builders.add(img("16_08_18.nef"));
        builders.add(img("16_11_13.nef"));
        builders.add(img("16_12_44.nef"));
        builders.add(img("16_13_09.nef"));
        builders.add(img("16_13_48.nef"));
        builders.add(img("16_13_56.nef"));
        builders.add(img("16_15_36.nef"));
        builders.add(img("16_19_16.nef"));
        builders.add(img("16_19_50.nef"));
        builders.add(img("16_21_09.nef"));
        builders.add(img("16_23_45.nef"));
        builders.add(img("16_24_38.nef"));
        builders.add(img("16_26_38.nef"));
        builders.add(img("16_27_33.nef"));
        builders.add(img("16_27_45.nef"));
        builders.add(img("16_29_24.nef"));
        builders.add(img("16_30_55.nef"));
        builders.add(img("16_30_59.nef"));
        builders.add(img("16_31_38.nef"));
        builders.add(img("16_34_43.nef"));
        builders.add(img("16_39_42.nef"));
        builders.add(img("16_39_52.nef"));
        builders.add(img("16_50_07.nef"));
        builders.add(img("16_51_17.nef"));
        builders.add(img("16_53_05.nef"));
        builders.add(img("16_54_26.nef"));
        builders.add(img("16_56_32.nef"));
        builders.add(img("16_56_51.nef"));
        builders.add(img("17_08_30.nef"));
        builders.add(img("17_08_42.nef"));
        builders.add(img("17_47_20.nef"));
        builders.add(img("20_22_34.nef"));
        builders.add(img("20_22_41.nef"));

        return yaFIMnle.of(builders).create();
    }

    private File get20160619() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.19_Belgrad";
        subTitle = "2016.06.19 Belgrad";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.19.belgrad");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Belgrad";
        builders.add(vid("04_42_20.mts").seconds("00:00:00", "00:00:05").as("04_42_20-000000-000005.mp4")); // ersten paar sekunden hochhaussiedliung, später über brücke
        builders.add(vid("04_42_20.mts").seconds("00:03:10", "00:03:20").as("04_42_20-000310-000320.mp4"));
        detailTitle = "Belgrad";
        builders.add(vid("07_09_46.mts"));
        builders.add(img("07_45_16.nef"));
        builders.add(img("07_45_44.nef"));
        builders.add(img("08_01_21.nef"));
        builders.add(img("08_01_45.nef"));
        builders.add(img("08_03_53.nef"));
        builders.add(img("08_04_00.nef"));
        builders.add(img("08_04_18.nef"));
        builders.add(img("08_06_31.nef"));
        builders.add(img("08_07_39.nef"));
        builders.add(img("08_12_38.nef"));
        builders.add(img("08_18_43.nef"));
        builders.add(img("08_20_14.nef"));
        builders.add(img("08_20_26.nef"));
        builders.add(img("08_28_44.nef"));
        builders.add(img("08_29_05.nef"));
        builders.add(img("08_30_03.nef"));
        builders.add(img("08_31_52.nef"));
        builders.add(img("08_33_40.nef"));
        builders.add(img("08_36_33.nef"));
        builders.add(img("08_44_21.nef"));
        builders.add(img("09_07_24.nef"));
        builders.add(img("09_08_55.nef"));
        builders.add(img("09_10_03.nef"));
        builders.add(img("09_10_52.nef"));
        builders.add(img("09_13_52.nef"));
        builders.add(img("09_14_57.nef"));
        builders.add(img("09_18_21.nef"));
        builders.add(img("09_19_00.nef"));
        builders.add(img("09_20_17.nef"));
        builders.add(img("09_23_28.nef"));
        builders.add(img("09_26_28.nef"));
        builders.add(img("09_28_02.nef"));
        builders.add(img("09_28_09.nef"));
        builders.add(img("09_30_31.nef"));
        builders.add(img("09_33_42.nef"));
        builders.add(img("09_35_35.nef"));
        builders.add(img("09_36_24.nef"));
        builders.add(img("09_38_30.nef"));
        builders.add(img("09_43_02.nef"));
        builders.add(img("10_08_54.nef"));
        builders.add(img("10_17_21.nef"));
        builders.add(img("10_17_55.nef"));
        builders.add(img("10_19_35.nef"));
        builders.add(img("10_24_29.nef"));
        builders.add(img("10_25_15.nef"));
        builders.add(img("10_26_15.nef"));
        builders.add(img("10_31_54.nef"));
        builders.add(img("10_39_02.nef"));
        builders.add(img("10_45_09.nef"));
        builders.add(img("10_47_54.nef"));
        builders.add(img("10_56_57.nef"));
        builders.add(img("10_57_09.nef"));
        builders.add(img("10_57_48.nef"));
        builders.add(img("10_59_11.nef"));
        builders.add(img("11_01_09.nef"));
        builders.add(img("11_21_05.nef"));
        builders.add(img("11_21_12.nef"));
        builders.add(img("11_22_53.nef"));
        builders.add(img("11_22_58.nef"));
        builders.add(img("11_49_12.nef"));
        builders.add(img("11_50_02.nef"));
        builders.add(img("11_53_20.nef"));
        builders.add(img("11_54_00.nef"));
        builders.add(img("11_55_15.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160620() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.20_ohrid_tirana";
        subTitle = "2016.06.20 Ohrid und Tirana";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.20");
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("10_05_50.mts")); // Auszüge
        builders.add(vid("10_18_44.mts")); // Ohrid
        builders.add(img("11_19_03.nef"));
        builders.add(img("11_19_20.nef"));
        builders.add(img("11_20_54.nef"));
        builders.add(img("11_24_29.nef"));
        builders.add(img("12_02_32.nef"));
        builders.add(img("12_02_46.nef"));
        builders.add(img("12_03_21.nef"));
        builders.add(vid("12_06_04.mts"));
        builders.add(img("12_06_07.nef"));
        builders.add(vid("12_06_30.mts"));
        builders.add(img("12_07_40.nef"));
        builders.add(img("12_18_04.nef"));
        builders.add(img("13_06_44.nef"));
        builders.add(img("13_06_52.nef"));
        builders.add(img("13_08_48.nef"));
        builders.add(img("13_08_55.nef"));
        builders.add(img("13_13_29.nef"));
        builders.add(img("13_13_38.nef"));
        builders.add(img("13_16_30.nef"));
        builders.add(img("13_24_13.nef"));
        builders.add(img("13_25_23.nef"));
        builders.add(img("13_28_35.nef"));
        builders.add(img("13_32_57.nef"));
        builders.add(img("13_33_03.nef"));
        builders.add(img("13_36_45.nef"));
        builders.add(img("14_46_28.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160621() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.21_durres";
        subTitle = "2016.06.21 Durres";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.21");
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("00131_durres.mp4"));
        builders.add(vid("05_39_02.mts"));
        builders.add(vid("05_46_36.mts"));
        builders.add(vid("05_50_48.mts"));
        builders.add(vid("06_18_22.mts"));
        builders.add(vid("06_23_48.mts"));
        builders.add(vid("06_48_56.mts"));
        builders.add(vid("06_50_58.mts"));
        builders.add(img("08_50_14.nef"));
        builders.add(img("08_50_48.nef"));
        builders.add(img("08_50_55.nef"));
        builders.add(img("08_51_25.nef"));
        builders.add(img("08_52_50.nef"));
        builders.add(img("08_52_54.nef"));
        builders.add(img("09_45_07.nef"));
        builders.add(img("10_19_33.nef"));
        builders.add(img("10_19_40.nef"));
        builders.add(img("10_21_49.nef"));
        builders.add(img("10_21_58.nef"));
        builders.add(img("10_22_23.nef"));
        builders.add(img("10_24_17.nef"));
        builders.add(img("10_39_37.nef"));
        builders.add(img("10_57_10.nef"));
        builders.add(img("11_02_39.nef"));
        builders.add(img("11_13_06.nef"));
        builders.add(img("11_13_15.nef"));
        builders.add(img("11_14_36.nef"));
        builders.add(img("11_14_40.nef"));
        builders.add(img("12_01_26.nef"));
        builders.add(img("12_37_54.nef"));
        builders.add(img("12_38_24.nef"));
        builders.add(img("12_39_04.nef"));
        builders.add(img("14_19_37.nef"));
        builders.add(img("14_19_43.nef"));
        builders.add(img("DSC_0767.NEF.jpg"));
        builders.add(img("DSC_0768.NEF.jpg"));
        builders.add(img("DSC_0769.NEF.jpg"));
        builders.add(img("DSC_0770.NEF.jpg"));
        builders.add(img("DSC_0771.NEF.jpg"));
        builders.add(img("DSC_0772.NEF.jpg"));
        builders.add(img("DSC_0773.NEF.jpg"));
        builders.add(img("DSC_0774.NEF.jpg"));
        builders.add(img("DSC_0775.NEF.jpg"));
        builders.add(img("DSC_0776.NEF.jpg"));
        builders.add(img("DSC_0777.NEF.jpg"));
        builders.add(img("DSC_0778.NEF.jpg"));
        builders.add(img("DSC_0779.NEF.jpg"));
        builders.add(img("DSC_0780.NEF.jpg"));
        builders.add(img("DSC_0781.NEF.jpg"));
        builders.add(img("DSC_0782.NEF.jpg"));
        builders.add(img("DSC_0783.NEF.jpg"));
        builders.add(img("DSC_0784.NEF.jpg"));
        builders.add(img("DSC_0785.NEF.jpg"));
        builders.add(img("DSC_0786.NEF.jpg"));
        builders.add(img("DSC_0787.NEF.jpg"));
        builders.add(img("DSC_0788.NEF.jpg"));
        builders.add(img("DSC_0789.NEF.jpg"));
        builders.add(img("DSC_0790.NEF.jpg"));
        builders.add(img("DSC_0791.NEF.jpg"));
        builders.add(img("DSC_0792.NEF.jpg"));
        builders.add(img("DSC_0793.NEF.jpg"));
        builders.add(img("DSC_0794.NEF.jpg"));
        builders.add(img("DSC_0795.NEF.jpg"));
        builders.add(img("DSC_0796.NEF.jpg"));
        builders.add(img("DSC_0797.NEF.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160622() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.22_shkodra";
        subTitle = "2016.06.22 Shkodra";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.22");
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("08_01_02.mts"));
        builders.add(img("08_33_31.nef"));
        builders.add(img("08_33_36.nef"));
        builders.add(img("08_33_48.nef"));
        builders.add(img("08_33_52.nef"));
        builders.add(img("09_06_32.nef"));
        builders.add(img("09_06_38.nef"));
        builders.add(img("09_06_44.nef"));
        builders.add(img("09_18_32.nef"));
        builders.add(img("09_22_52.nef"));
        builders.add(img("09_39_35.nef"));
        builders.add(img("09_44_15.nef"));
        builders.add(img("09_52_40.nef"));
        builders.add(img("09_54_37.nef"));
        builders.add(img("09_55_21.nef"));
        builders.add(img("09_58_11.nef"));
        builders.add(img("10_01_09.nef"));
        builders.add(img("10_24_30.nef"));
        builders.add(img("10_24_54.nef"));
        builders.add(img("10_25_38.nef"));
        builders.add(img("10_33_49.nef"));
        builders.add(img("10_43_16.nef"));
        builders.add(img("10_45_53.nef"));
        builders.add(img("10_46_08.nef"));
        builders.add(img("10_47_35.nef"));
        builders.add(img("10_47_43.nef"));
        builders.add(img("11_40_51.nef"));
        builders.add(img("11_59_33.nef"));
        builders.add(img("13_18_01.nef"));
        builders.add(img("17_20_37.nef"));
        builders.add(img("17_21_39.nef"));
        builders.add(img("17_25_09.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160623() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.23_Shkodra";
        subTitle = "2016.06.23 Shkodra";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.23");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("07_05_03.nef"));
        builders.add(img("07_05_10.nef"));
        builders.add(img("11_19_23.nef"));
        builders.add(img("11_19_36.nef"));
        builders.add(img("11_22_46.nef"));
        builders.add(img("11_23_18.nef"));
        builders.add(img("11_24_06.nef"));
        builders.add(img("11_43_57.nef"));
        builders.add(img("11_45_17.nef"));
        builders.add(img("11_54_24.nef"));
        builders.add(img("12_02_56.nef"));
        builders.add(img("12_03_00.nef"));
        builders.add(img("12_04_29.nef"));
        builders.add(img("12_05_51.nef"));
        builders.add(img("12_07_02.nef"));
        builders.add(img("12_07_18.nef"));
        builders.add(img("12_09_05.nef"));
        builders.add(vid("12_15_38.mts"));
        builders.add(img("12_45_33.nef"));
        builders.add(img("12_46_01.nef"));
        builders.add(img("12_47_20.nef"));
        builders.add(img("12_48_13.nef"));
        builders.add(img("12_49_01.nef"));
        builders.add(img("12_49_56.nef"));
        builders.add(img("12_50_24.nef"));
        builders.add(img("12_51_24.nef"));
        builders.add(vid("13_52_44.mts"));
        builders.add(vid("14_10_52.mts"));
        builders.add(img("14_48_50.nef"));
        builders.add(img("14_49_29.nef"));
        builders.add(img("15_01_27.nef"));
        builders.add(img("15_52_08.nef"));
        builders.add(img("16_42_01.nef"));
        builders.add(img("16_42_05.nef"));
        builders.add(img("16_47_57.nef"));
        builders.add(img("16_48_49.nef"));
        builders.add(img("16_51_58.nef"));
        builders.add(img("16_52_30.nef"));
        builders.add(img("17_07_46.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160624() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.24_Ulcinj";
        subTitle = "2026.06.24 Ulcinj";
        setup();

        var yaFIMnle = new YaFIMnle("2026.06.24");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("09_41_53.nef"));
        builders.add(img("10_18_05.nef"));
        builders.add(img("10_18_16.nef"));
        builders.add(vid("15_40_08.mts"));
        builders.add(img("16_19_34.nef"));
        builders.add(img("16_19_41.nef"));
        builders.add(img("16_22_51.nef"));
        builders.add(img("16_29_26.nef"));
        builders.add(img("16_29_36.nef"));
        builders.add(img("16_35_40.nef"));
        builders.add(img("16_39_35.nef"));
        builders.add(img("16_39_45.nef"));
        builders.add(img("16_40_48.nef"));
        builders.add(img("16_43_45.nef"));
        builders.add(img("16_48_36.nef"));
        builders.add(img("16_49_23.nef"));
        builders.add(img("16_51_06.nef"));
        builders.add(img("16_51_16.nef"));
        builders.add(img("16_51_27.nef"));
        builders.add(img("20_04_48.nef"));
        builders.add(img("20_05_10.nef"));
        builders.add(img("20_05_27.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160625() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.25_Herceg_Novi";
        subTitle = "2026.06.25 Herceg Novi";
        setup();

        var yaFIMnle = new YaFIMnle("2026.06.25");
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("13_41_46.mts")); // Auszüge
        builders.add(vid("16_11_26.mts"));
        builders.add(img("16_25_15.nef"));
        builders.add(img("16_34_13.nef"));
        builders.add(img("16_36_26.nef"));
        builders.add(img("16_49_09.nef"));
        builders.add(img("16_49_18.nef"));
        builders.add(img("16_50_44.nef"));
        builders.add(img("16_51_41.nef"));
        builders.add(img("16_52_11.nef"));
        builders.add(img("16_53_03.nef"));
        builders.add(img("16_53_31.nef"));
        builders.add(img("16_56_09.nef"));
        builders.add(img("16_58_18.nef"));
        builders.add(img("16_59_17.nef"));
        builders.add(img("17_02_47.nef"));
        builders.add(img("17_03_04.nef"));
        builders.add(img("17_04_09.nef"));
        builders.add(img("17_06_14.nef"));
        builders.add(img("17_06_34.nef"));
        builders.add(img("17_08_01.nef"));
        builders.add(img("17_39_56.nef"));
        builders.add(img("17_44_52.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160626() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.26_Dubrovnik";
        subTitle = "2026.06.26 Dubrovnik";
        setup();

        var yaFIMnle = new YaFIMnle("2026.06.26");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("10_25_51.nef"));
        builders.add(img("10_52_56.nef"));
        builders.add(img("10_55_22.nef"));
        builders.add(img("11_01_41.nef"));
        builders.add(img("11_05_34.nef"));
        builders.add(img("11_06_01.nef"));
        builders.add(img("11_07_34.nef"));
        builders.add(img("11_26_27.nef"));
        builders.add(img("12_45_30.nef"));
        builders.add(img("13_20_41.nef"));
        builders.add(img("15_19_56.nef"));
        builders.add(img("15_20_07.nef"));
        builders.add(vid("16_03_30.mts"));
        builders.add(vid("16_38_12.mts"));
        builders.add(vid("16_44_14.mts"));
        builders.add(vid("16_50_00.mts"));
        builders.add(vid("17_21_02.mts"));
        builders.add(img("17_52_05.nef"));
        builders.add(img("17_52_34.nef"));
        builders.add(img("17_53_07.nef"));
        builders.add(img("18_05_12.nef"));
        builders.add(vid("19_25_24.mts"));
        builders.add(img("20_01_24.nef"));
        builders.add(img("20_02_54.nef"));
        builders.add(img("20_03_42.nef"));
        builders.add(img("20_03_50.nef"));
        builders.add(img("20_05_54.nef"));
        builders.add(img("20_07_24.nef"));
        builders.add(img("20_09_38.nef"));
        builders.add(img("20_09_48.nef"));
        builders.add(img("20_19_26.nef"));
        builders.add(img("20_24_28.nef"));
        builders.add(img("20_24_56.nef"));
        builders.add(img("20_25_50.nef"));
        builders.add(img("20_28_40.nef"));
        builders.add(img("20_29_38.nef"));
        builders.add(img("20_30_39.nef"));
        builders.add(img("20_30_46.nef"));
        builders.add(img("20_33_56.nef"));
        builders.add(img("20_34_30.nef"));
        builders.add(img("20_35_20.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160627() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.27_Hvar_Zadar";
        subTitle = "2016.06.27 Hvar und Zadar";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.27");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("05_57_26.nef"));
        builders.add(vid("06_53_44.mts"));
        builders.add(img("07_51_06.nef"));
        builders.add(img("07_51_14.nef"));
        builders.add(img("07_51_52.nef"));
        builders.add(img("07_51_58.nef"));
        builders.add(img("07_52_37.nef"));
        builders.add(img("07_57_05.nef"));
        builders.add(img("07_57_29.nef"));
        builders.add(img("08_09_30.nef"));
        builders.add(img("08_09_36.nef"));
        builders.add(img("08_11_07.nef"));
        builders.add(img("09_22_46.nef"));
        builders.add(img("09_22_58.nef"));
        builders.add(img("09_47_38.nef"));
        builders.add(img("10_03_48.nef"));
        builders.add(vid("10_04_42.mts"));
        builders.add(img("10_43_40.nef"));
        builders.add(img("10_43_49.nef"));
        builders.add(img("10_43_57.nef"));
        builders.add(img("10_45_03.nef"));
        builders.add(img("11_53_10.nef"));
        builders.add(img("19_58_30.nef"));
        builders.add(img("20_08_00.nef"));
        builders.add(img("20_11_40.nef"));
        builders.add(img("20_15_13.nef"));
        builders.add(img("20_15_29.nef"));
        builders.add(img("20_20_25.nef"));
        builders.add(img("20_20_42.nef"));
        builders.add(img("20_22_45.nef"));
        return yaFIMnle.of(builders).create();
    }

    private File get20160629() {
        sourceDir = "/media/oliver/Extreme SSD/2016/2016.06.29_Kranjska_Gora";
        subTitle = "2016.06.29 Kranjska gora";
        setup();

        var yaFIMnle = new YaFIMnle("2016.06.29.kranjskagora");
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("05_14_06.mts"));
        builders.add(vid("14_08_40.mts"));
        builders.add(vid("14_14_28.mts"));
        builders.add(vid("14_16_20.mts"));
        builders.add(vid("14_21_14.mts"));
        builders.add(img("15_11_10.nef"));
        builders.add(img("15_11_16.nef"));
        builders.add(img("15_13_59.nef"));
        builders.add(img("15_21_28.nef"));
        builders.add(img("15_23_56.nef"));
        builders.add(img("15_24_05.nef"));
        builders.add(img("15_25_29.nef"));
        builders.add(img("15_25_36.nef"));
        builders.add(img("15_26_07.nef"));
        builders.add(img("15_26_16.nef"));
        builders.add(img("15_26_29.nef"));
        builders.add(img("15_27_06.nef"));
        builders.add(img("15_33_09.nef"));
        builders.add(img("15_33_15.nef"));
        builders.add(img("15_33_39.nef"));
        builders.add(img("15_33_53.nef"));
        builders.add(img("15_51_47.nef"));
        builders.add(img("15_51_57.nef"));
        builders.add(img("15_52_14.nef"));
        builders.add(img("17_07_04.nef"));
        builders.add(img("17_07_09.nef"));
        builders.add(img("17_41_13.nef"));
        builders.add(img("17_52_16.nef"));
        return yaFIMnle.of(builders).create();
    }
}
