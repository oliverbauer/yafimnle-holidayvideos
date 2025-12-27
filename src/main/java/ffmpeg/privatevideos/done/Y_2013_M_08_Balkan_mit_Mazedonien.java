package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.*;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// TODO needs audio
// TODO not yet complete 8 days missing
public class Y_2013_M_08_Balkan_mit_Mazedonien extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2013_M_08_Balkan_mit_Mazedonien();
        main.mainTitle = "3 Wochen Balkan";
        main.run();
    }

    @Override
    protected void run() {
        File f1 = gen20130809();
        File f2 = gen20130810();
        File f3 = gen20130811();
        File f4 = gen20130812();
        File f5 = gen20130813();
        File f6 = gen20130814();
        File f7 = gen20130815();
        File f8 = gen20130816();
        File f9 = gen20130817();
        File f10 = gen20130818();
        File f11 = gen20130819();
        File f12 = gen20130820();

        var joiner = new FFMpegJoiner();
        joiner.join("2013.08.balkan-3-wochen-hevc",
                f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12
        );
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public File gen20130809() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/09_koeln_nachtzug_wien";
        subTitle = "2013.08.09 (1/20) Deutschland - Nordrheinwestfalen";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.09");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "In Wien beginnt der Balkan...";
        builders.add(img("14_59_37.jpg"));
        builders.add(vid("00131_einfahrt_koeln_hbf.avi").seconds("00:01:07", "00:01:14"));
        builders.add(img("20_02_28.jpg"));
        builders.add(img("20_00_13.jpg"));
        builders.add(vid("00141_im_CNL.avi").seconds("00:00:21", "00:00:26"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130810() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/10_wien_langenwang_graz";
        subTitle = "2013.08.10 (2/20) Austria - Steiermark";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.10");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("17_38_19.jpg"));
        detailTitle = "Graz";
        builders.add(vid("00009_muerzzuschlag_bahnhof_railjet_faehrt_ein.avi").seconds("00:00:00", "00:00:10")); // Zugeinfahrt in Mürzzuschlag
        builders.add(img("15_56_09.jpg"));
        builders.add(img("16_31_44.jpg"));
        builders.add(img("16_38_12.jpg"));
        builders.add(img("19_51_23.jpg"));
        builders.add(img("19_58_02.jpg"));
        builders.add(img("20_04_53.jpg"));
        builders.add(vid("00017_graz_skyline_abends.avi").seconds("00:00:36", "00:01:04"));
        builders.add(img("20_12_48.jpg"));
        builders.add(img("20_22_47.jpg"));
        builders.add(img("20_50_33.jpg"));
        builders.add(vid("00021_graz_museum.avi").seconds("00:00:00", "00:00:05"));
        builders.add(vid("00023_graz_konzert.avi").seconds("00:00:00", "00:00:11"));

        return yaFIMnle.of(builders).create();
    }

    public File gen20130811() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/11_graz_maribor_ljubljana";
        subTitle = "2013.08.11 (3/20) Slovenija";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.11");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("09_44_21.jpg"));
        detailTitle = "Maribor und Ljubljana";
        builders.add(vid("00028_graz_mein_zug_faehrt_ein.avi").seconds("00:00:01", "00:00:08"));
        detailTitle = "Maribor";
        builders.add(img("11_30_40.jpg"));
        builders.add(img("11_33_47.jpg"));
        builders.add(img("11_41_37.jpg"));
        builders.add(vid("00029_maribor.avi").seconds("00:00:17", "00:00:55"));
        builders.add(img("11_42_43.jpg"));
        builders.add(img("11_43_49.jpg"));
        builders.add(img("11_51_56.jpg"));
        builders.add(vid("00030_maribor.avi").seconds("00:00:00", "00:00:25"));
        builders.add(img("12_18_32.jpg"));
        detailTitle = "Ljubljana";
        builders.add(img("18_13_04.jpg"));
        builders.add(img("18_17_27.jpg"));
        builders.add(img("18_25_38.jpg"));
        builders.add(vid("00037_ljublana_skyline.avi").seconds("00:00:00", "00:00:28"));
        builders.add(img("19_14_30.jpg"));
        builders.add(vid("00040_ljubljana_shoes.avi").seconds("00:00:10", "00:00:25"));
        builders.add(img("20_44_08.jpg"));
        builders.add(img("20_56_44.jpg"));
        builders.add(vid("00044_ljubljana.avi"));
        builders.add(vid("00046_ljubljana.avi").seconds("00:00:14", "00:00:47"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130812() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/12_ljubljana_zagreb";
        subTitle = "2013.08.12 (4/20) Slovenija / Hrvatska";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.12");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Ljubljana nach Zagreb";
        builders.add(img("07_03_40.jpg"));
        builders.add(img("07_06_50.jpg"));
        builders.add(img("07_13_45.jpg"));
        builders.add(img("07_21_20.jpg"));
        builders.add(img("08_07_22.jpg"));
        builders.add(img("09_25_52.jpg"));
        builders.add(vid("00059_lkjubljana_hbf_schoener_zug.avi"));
        detailTitle = "Zagreb";
        builders.add(img("13_07_55.jpg"));
        builders.add(img("16_20_31.jpg"));
        builders.add(img("17_15_25.jpg"));
        builders.add(img("17_37_38.jpg"));
        builders.add(img("17_46_03.jpg"));
        builders.add(img("17_53_40.jpg"));
        builders.add(img("17_54_46.jpg"));
        builders.add(vid("00070_zagreb_zoom_on_hbf.avi").seconds("00:00:00", "00:00:16"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130813() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/13_zagreb_banja_luka";
        subTitle = "2013.08.13 (5/20) Bosna i Hercegovina (Босна и Херцеговина)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.13");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Banja Luka";
        builders.add(img("08_00_26.jpg"));
        builders.add(img("12_26_12.jpg"));
        builders.add(vid("00073_zagreb_banja_luka_train.avi").seconds("00:00:11", "00:00:21"));
        builders.add(img("14_41_47.jpg"));
        builders.add(img("14_45_00.jpg"));
        builders.add(img("15_13_59.jpg"));
        builders.add(img("15_16_09.jpg"));
        builders.add(img("15_24_54.jpg"));
        builders.add(vid("00080_banja_luka_festung_und_angler.avi").seconds("00:00:00", "00:00:15"));
        builders.add(img("15_45_05.jpg"));
        builders.add(img("16_18_41.jpg"));
        builders.add(img("16_38_46.jpg"));
        builders.add(img("20_23_01.jpg"));
        builders.add(vid("00091_banja_luka_church_night.avi").seconds("00:00:08", "00:00:27"));
        builders.add(vid("00098_banja_luka.avi").seconds("00:00:00", "00:00:18"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130814() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/14_banja_luka_sarajevo";
        subTitle = "2013.08.14 (6/20) Bosna i Hercegovina (Босна и Херцеговина)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.14");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Banja Luka nach Sarajevo";
        builders.add(img("08_55_16.jpg"));
        builders.add(img("07_29_18.jpg"));
        builders.add(img("08_34_19.jpg"));
        builders.add(img("14_30_02.jpg"));
        builders.add(img("15_44_17.jpg"));
        builders.add(img("16_17_00.jpg"));
        builders.add(img("19_44_06.jpg"));
        builders.add(img("19_51_13.jpg"));
        builders.add(img("20_18_25.jpg"));
        builders.add(img("20_31_05.jpg"));
        builders.add(img("20_44_11.jpg"));
        builders.add(img("20_57_20.jpg"));
        builders.add(img("21_35_03.jpg"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130815() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/15_sarajevo";
        subTitle = "2013.08.15 (7/20) Bosna i Hercegovina (Босна и Херцеговина)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.15");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Sarajevo";
        builders.add(img("08_24_19.jpg"));
        builders.add(img("08_34_49.jpg"));
        builders.add(img("08_49_59.jpg"));
        builders.add(img("09_14_00.jpg"));
        builders.add(img("09_21_16.jpg"));
        builders.add(img("09_38_15.jpg"));
        builders.add(img("09_49_45.jpg"));
        builders.add(img("14_22_46.jpg"));
        builders.add(img("17_47_04.jpg"));
        builders.add(img("17_47_13.jpg"));
        builders.add(vid("00154_sarajevo_akademija_of_fine_arts.avi").seconds("00:00:03", "00:00:13"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130816() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/16_sarajevo_mostar_trebinje";
        subTitle = "2013.08.16 (8/20) Bosna i Hercegovina (Босна и Херцеговина)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.16");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Mostar und Trebinje";
        builders.add(img("07_09_17.jpg"));
        builders.add(img("07_45_42.jpg"));
        builders.add(img("08_25_55.jpg"));
        builders.add(img("08_45_00.jpg"));
        builders.add(img("08_50_28.jpg"));
        builders.add(img("08_51_06.jpg"));
        builders.add(vid("00173_sarajevo_to_mostar_trainride.avi").seconds("00:00:00", "00:00:20").as("00173-000000-000020.mp4"));
        builders.add(vid("00173_sarajevo_to_mostar_trainride.avi").seconds("00:01:15", "00:01:33").as("00173-000115-000133.mp4"));
        detailTitle = "Mostar";
        builders.add(img("09_51_21.jpg"));
        builders.add(img("09_54_14.jpg"));
        builders.add(img("09_59_53.jpg"));
        builders.add(img("10_35_17.jpg"));
        builders.add(img("10_40_50.jpg"));
        builders.add(img("10_43_28.jpg"));
        builders.add(img("11_50_55.jpg"));
        builders.add(img("11_54_10.jpg"));
        builders.add(vid("00181_mostar_bridge.avi").seconds("00:00:00", "00:00:30"));
        builders.add(vid("00183_mostar_jumping_guy.avi").seconds("00:02:07", "00:02:48"));
        builders.add(vid("00194_mostar_to_trebinje_busride.avi").seconds("00:00:00", "00:00:10"));
        builders.add(vid("00198_mostar_to_trebinje_busride_kuehe_auf_der_strasse.avi").seconds("00:00:00", "00:00:10"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130817() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/17_trebinje";
        subTitle = "2013.08.17 (9/20) Bosna i Hercegovina (Босна и Херцеговина)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.17");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Trebinje";
        builders.add(vid("00207_trebinje.avi")
                .seconds("00:00:04", "00:00:15"));
        builders.add(img("07_17_22.jpg"));
        builders.add(img("07_23_31.jpg"));
        builders.add(img("07_26_57.jpg"));
        builders.add(img("07_28_13.jpg"));
        builders.add(img("07_28_19.jpg"));
        builders.add(vid("00211_trebinje.avi").seconds("00:00:35", "00:01:00"));
        builders.add(img("07_41_55.jpg"));
        builders.add(img("07_42_51.jpg"));
        builders.add(img("09_44_46.jpg"));
        builders.add(img("10_28_16.jpg"));
        builders.add(img("10_28_08.jpg"));
        builders.add(vid("00216_trebinje_alte_bruecke.avi").seconds("00:00:00", "00:00:06"));
        builders.add(img("13_36_34.jpg"));
        builders.add(img("13_38_42.jpg"));
        builders.add(img("16_03_23.jpg"));
        builders.add(img("19_54_56.jpg"));
        builders.add(vid("00221_trebinje_junge_spielt_geige.avi").seconds("00:00:00", "00:00:10"));
        builders.add(img("21_17_48.jpg"));
        builders.add(vid("00225_trebinje_orchester.avi").seconds("00:00:00", "00:00:10"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130818() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/18_trebinje_herceg_novi";
        subTitle = "2013.08.18 (10/20) Crna Gora (Црна Гора)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.18");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Herceg Novi";
        builders.add(img("07_00_32.jpg"));
        builders.add(vid("00236_trebinje_bus_nach_herceg_novi.avi").seconds("00:00:00", "00:00:10"));
        builders.add(img("09_59_39.jpg"));
        builders.add(img("10_19_13.jpg"));
        builders.add(vid("00240.avi").seconds("00:00:00", "00:00:10"));
        builders.add(vid("00245_herceg_novi_eidechse.avi").seconds("00:00:05", "00:00:10"));
        builders.add(img("11_03_05.jpg"));
        builders.add(img("11_09_44.jpg"));
        builders.add(img("11_21_05.jpg"));
        builders.add(img("11_53_34.jpg"));
        builders.add(img("11_56_32.jpg"));
        builders.add(img("12_20_19-1.jpg"));
        builders.add(vid("00248_herceg_novi_skyline.avi").seconds("00:00:08", "00:00:48"));
        builders.add(img("12_46_18.jpg"));
        builders.add(img("12_47_46.jpg"));
        builders.add(img("15_05_42.jpg"));
        builders.add(img("17_30_47.jpg"));
        builders.add(img("20_55_54.jpg"));
        builders.add(img("20_59_05.jpg"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130819() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/19_herceg_novi_kotor_budva_ulcinj";
        subTitle = "2013.08.19 (11/20) Crna Gora (Црна Гора)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.19");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Kotor Budva und Ulcinj";
        builders.add(img("09_10_28.jpg"));
        builders.add(vid("00271_kotor.avi").seconds("00:00:00", "00:00:16"));
        builders.add(img("10_38_24.jpg"));
        builders.add(img("10_51_26.jpg"));
        builders.add(img("10_56_09.jpg"));
        builders.add(vid("00282_budva_bus_gute_msuik.avi").seconds("00:00:15", "00:00:45"));
        detailTitle = "Budava";
        builders.add(img("12_45_22.jpg"));
        builders.add(img("12_51_02.jpg"));
        builders.add(img("13_02_54.jpg"));
        builders.add(img("13_04_24.jpg"));
        builders.add(img("13_07_41.jpg"));
        builders.add(img("13_26_15.jpg"));
        builders.add(vid("00288_busva_bus_gute_musik.avi").seconds("00:01:30", "00:01:55"));
        detailTitle = "Ulcinj";
        builders.add(img("17_21_06.jpg"));
        builders.add(img("17_45_22.jpg"));
        builders.add(vid("00296.avi").seconds("00:00:00", "00:00:34"));
        builders.add(img("18_08_27.jpg"));
        builders.add(img("18_09_49.jpg"));
        builders.add(img("19_59_41.jpg"));
        builders.add(img("20_15_54.jpg"));
        builders.add(vid("00302.avi").seconds("00:00:22", "00:00:40"));
        builders.add(vid("00303_ulcinj.avi").seconds("00:00:00", "00:00:30"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20130820() {
        sourceDir = "/media/oliver/Extreme SSD/2013/08_skopje_nis_trebinje/20_ulcinj_sutomore";
        subTitle = "2013.08.20 (12/20) Crna Gora (Црна Гора)";
        setup();

        var yaFIMnle = new YaFIMnle("2013.08.20");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Sutomore";
        builders.add(img("08_11_02.jpg"));
        builders.add(img("10_37_05.jpg"));
        builders.add(img("11_03_28.jpg"));
        builders.add(img("13_29_27.jpg"));
        builders.add(img("13_49_28.jpg"));
        builders.add(vid("00319_sutomore_skyline.avi").seconds("00:00:10", "00:00:30"));
        builders.add(img("14_06_03.jpg"));
        builders.add(img("14_18_02.jpg"));
        builders.add(img("17_43_59.jpg"));
        builders.add(img("18_32_40.jpg"));
        builders.add(img("18_55_09.jpg"));
        return yaFIMnle.of(builders).create();
    }
}
