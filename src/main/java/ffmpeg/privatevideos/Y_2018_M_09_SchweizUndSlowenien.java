package ffmpeg.privatevideos;

import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// TODO img+vid: Die Dateien heißen nicht mehr so!
public class Y_2018_M_09_SchweizUndSlowenien extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2018_M_09_SchweizUndSlowenien();
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20180922();
        var f2 = gen20180923();
        var f3 = gen20180924();
        var f4 = gen20180925();
        var f5 = gen20180926();
        var f6 = gen20180927();

        var joiner = new FFMpegJoiner();
        joiner.join("2018.09.schweiz_und_slowenien.mp4", f1, f2, f3, f4, f5, f6);
    }

    private File gen20180922() {
        sourceDir = "/media/oliver/Extreme SSD/2018/09/22_fiesch_landschaftspark_binntal";
        subTitle = "2018.09.22 Landschaftspark Binntal + Twingischlucht";
        Presets.x264_normal_quality(sourceDir, destinationDir);

        var yaFIMnle = new YaFIMnle("2018.09.22");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise nach Fiesch";
        builders.add(vid("DSCN2903.MP4"));
        detailTitle = "Kanton Wallis";
        builders.add(img("12_33_43.jpg"));
        builders.add(img("12_47_02.jpg"));
        builders.add(img("13_16_12.jpg"));
        builders.add(img("13_16_18.jpg"));
        builders.add(vid("13_44_18.mp4"));
        builders.add(img("13_54_36.jpg"));
        builders.add(img("14_11_05.jpg"));
        builders.add(vid("14_39_28.mp4"));
        builders.add(img("14_50_43.jpg"));
        builders.add(vid("14_56_42.mp4"));
        builders.add(img("15_00_40.jpg"));
        builders.add(vid("15_08_57.mp4"));
        builders.add(vid("15_17_06.mp4"));
        builders.add(img("15_27_59.jpg"));
        builders.add(img("15_29_23.jpg"));
        builders.add(img("15_30_31.jpg"));
        builders.add(img("15_49_35.jpg"));
        builders.add(img("15_50_25.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180923() {
        sourceDir = "/media/oliver/Extreme SSD/2018/09/23_zermatt";
        subTitle = "2018.09.23 Kanton Wallis";
        Presets.x264_normal_quality(sourceDir, destinationDir);

        var yaFIMnle = new YaFIMnle("2018.09.23");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Zermatt (1600m) nach Ritti (1906m)";
        builders.add(img("09_39_47.jpg"));
        builders.add(vid("09_49_14.mp4"));
        builders.add(img("09_49_31.jpg"));
        builders.add(vid("10_11_53.mp4"));
        builders.add(vid("11_30_25.mp4"));
        builders.add(img("11_38_33.jpg"));
        builders.add(img("11_54_46.jpg"));
        builders.add(vid("11_57_04.mp4"));
        builders.add(img("11_58_36.jpg"));
        builders.add(vid("12_17_05.mp4"));
        builders.add(vid("12_26_42.mp4"));
        builders.add(img("12_35_43.jpg"));
        builders.add(img("12_38_47.jpg"));
        builders.add(img("12_47_06.jpg"));
        builders.add(vid("13_11_14.mp4"));
        builders.add(vid("14_21_17.mp4"));
        builders.add(img("16_06_57.jpg"));
        builders.add(img("18_09_34.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180924() {
        sourceDir = "/media/oliver/Extreme SSD/2018/09/24_zermatt_zug_zuerich";
        subTitle = "2018.09.24 Luzern und Zürich";
        Presets.x264_normal_quality(sourceDir, destinationDir);

        var yaFIMnle = new YaFIMnle("2018.09.24");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Luzern";
        builders.add(vid("14_59_19.mp4"));
        builders.add(img("14_59_43.jpg"));
        builders.add(img("15_02_47.jpg"));
        builders.add(img("15_08_44.jpg"));
        builders.add(img("15_21_13.jpg"));
        builders.add(vid("15_22_35.mp4"));
        builders.add(img("15_27_13.jpg"));
        builders.add(vid("15_28_39.mp4"));
        detailTitle = "Anreise nach Zürich";
        builders.add(img("17_48_32.jpg"));
        builders.add(img("17_48_42.jpg"));
        builders.add(img("17_48_51.jpg"));
        builders.add(vid("18_09_11.mp4"));
        builders.add(img("18_11_03.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180925() {
        sourceDir = "/media/oliver/Extreme SSD/2018/09/25_Planica_valley_kranjska_gora_slap_nadiza";
        subTitle = "2018.09.25 Slap Nadiža (Planica valley)";
        Presets.x264_normal_quality(sourceDir, destinationDir);

        var yaFIMnle = new YaFIMnle("2018.09.25");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Wanderung zum Slap Nadiža";
        builders.add(vid("08_44_22.mp4"));
        builders.add(img("09_01_48.jpg"));
        builders.add(img("09_11_16.jpg"));
        builders.add(img("09_25_23.jpg"));
        builders.add(vid("09_32_26.mp4"));
        builders.add(img("10_02_48.jpg"));
        builders.add(vid("10_16_40.mp4"));
        builders.add(img("10_27_32.jpg"));
        builders.add(vid("10_33_29.mp4"));
        builders.add(vid("10_36_07.mp4"));
        builders.add(img("11_13_52.jpg"));
        builders.add(vid("12_08_26.mp4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180926() {
        sourceDir = "/media/oliver/Extreme SSD/2018/09/26_kranjska_gora_lago_di_fusine_weissenfelser_seen";
        subTitle = "2018.09.26 Lago di Fusine";
        Presets.x264_normal_quality(sourceDir, destinationDir);

        var yaFIMnle = new YaFIMnle("2018.09.26");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Weissenfelser Seen";
        builders.add(img("09_23_55.jpg"));
        builders.add(img("09_40_21.jpg"));
        builders.add(img("10_02_08.jpg"));
        builders.add(vid("10_15_54.mp4"));
        builders.add(img("10_16_47.jpg"));
        builders.add(img("10_35_05.jpg"));
        builders.add(img("10_47_50.jpg"));
        builders.add(img("10_55_31.jpg"));
        builders.add(vid("10_55_44.mp4"));
        detailTitle = "Kranjska Gora";
        builders.add(img("14_43_03.jpg"));
        builders.add(vid("14_55_38.mp4"));
        builders.add(vid("15_05_10.mp4"));
        builders.add(vid("15_13_24.mp4"));
        builders.add(vid("15_32_33.mp4"));
        builders.add(img("15_40_55.jpg"));
        builders.add(img("16_00_50.jpg"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20180927() {
        sourceDir = "/media/oliver/Extreme SSD/2018/09/27_np_hohe_tauern_sportgastein_Seebachtal_Boeckstein";
        subTitle = "2018.09.27 Mallnitz (Kärnten)";
        Presets.x264_normal_quality(sourceDir, destinationDir);

        var yaFIMnle = new YaFIMnle("2018.09.27");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Seebachtal";
        builders.add(vid("09_55_18.mp4"));
        builders.add(img("10_23_24.jpg"));
        builders.add(img("10_37_28.jpg"));
        builders.add(img("10_38_29.jpg"));
        detailTitle = "Schleierwasserfall";
        builders.add(vid("11_03_13.mp4"));
        builders.add(vid("11_14_33.mp4"));
        builders.add(img("11_19_33.jpg"));
        builders.add(img("12_31_11.jpg"));
        detailTitle = "Sportgastein nach Böckstein";
        builders.add(img("14_18_20.jpg"));
        builders.add(vid("14_20_53.mp4"));
        builders.add(img("14_26_23.jpg"));
        builders.add(img("14_37_33.jpg"));
        builders.add(img("15_34_57.jpg"));
        builders.add(vid("15_45_01.mp4"));
        builders.add(img("15_47_39.jpg"));
        builders.add(vid("15_47_43.mp4"));
        builders.add(img("15_57_42.jpg"));
        builders.add(img("16_01_23.jpg"));
        builders.add(img("16_37_23.jpg"));
        builders.add(img("16_47_16.jpg"));
        builders.add(img("17_58_48.jpg"));
        return yaFIMnle.of(builders).create();
    }
}
