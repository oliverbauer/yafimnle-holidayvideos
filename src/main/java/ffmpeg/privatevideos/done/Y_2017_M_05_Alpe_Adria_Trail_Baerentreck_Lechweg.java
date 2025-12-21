package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2017_M_05_Alpe_Adria_Trail_Baerentreck_Lechweg extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2017_M_05_Alpe_Adria_Trail_Baerentreck_Lechweg();
        main.mainTitle = "Frühlingserwachen auf dem Alpe-Adria-Trail und Bärentreck und Lechweg";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20170526();  // 1m19s Heidelberg/München           ack mit Audio Aleksandra_Prijovic_-_Dam_Dam_Dam_2m20s.mp3
        var f2 = gen20170527();  // 3m30 Mojstrana/Gozd Martuljek      TODO ack mit Audio Dino_Merlin_-_Krive_Karte_4m13s.mp3
        var f3 = gen20170528();  // 3m56s Kranjska Gora                ack mit Audio unbekannt4_3m54s.mp3
        var f4 = gen20170529();  // 2m35s Alpe Adria 1/3               ack mit Audio MIRZA_SELIMOVIC_x_ILMA_KARAHMED_-_MORA_DA_JE_LJUBAV_3m48s
        var f5 = gen20170530();  // 3m32s Alpe Adria 2/3               NACK mit Aleksandra_Prijovic_-_Dam_Dam_Dam_2m20s.mp3
        var f6 = gen20170531();  // 3m11s Alpe Adria 3/3               ack mit Audio unbekannt1_4m00s.mp3
        var f7 = gen20170601();  // 3m16s Trieste/Piran                ack mit Audio Relja_-_Latino_Evropa_3m18s
        var f8 = gen20170602();  // 3m06s Piran                        ack mit Audio Buba_Corelli_-_Irina_Shayk_3m11s
        var f9 = gen20170607();  // 4m00s Meiringen                    NACK mit Audio Jala_Brat_x_Buba_Corelli_x_Hava_-_Dale_2m43s.mp3
        var f10 = gen20170608(); // 2m42s Lech                         ack mit Audio KATARINA_DIDANOVIC_x_RASTA_-_MOJ_MUSKARAC_3m22s.mp3
        var f11 = gen20170609(); // 2m39s Lech/Warth                   ack mit Audio Sanja_Vuccic_x_Nucci_-_Ruzmarin_2m43s.mp3

        var joiner = new FFMpegJoiner();
        joiner.join("2017.05+06.alpe-adria-trail-baerentreck-lechweg-v2", f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20170526() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.26_heidelberg_muenchen";
        subTitle = "2017.05.26 Anreisetag";
        setup();

        var yaFIMnle = new YaFIMnle("2017.05.26");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Heidelberg";
        builders.add(vid("12_33_33.mp4").seconds("00:00:00", "00:00:06").as("12_33_33-part.mp4"));
        builders.add(img("12_53_21.jpg"));
        builders.add(img("12_58_06.jpg"));
        builders.add(img("13_01_33.jpg"));
        builders.add(img("13_10_10.jpg"));
        builders.add(img("13_10_17.jpg"));
        builders.add(img("13_14_43.jpg"));
        builders.add(img("13_15_10.jpg"));
        detailTitle = "München";
        builders.add(img("19_11_20.jpg"));
        builders.add(vid("00118_Muenchen.MTS").seconds("00:00:08", "00:00:13").as("00118_Muenchen-part.mp4"));
        builders.add(img("19_17_02.jpg"));
        builders.add(img("19_20_43.jpg"));
        builders.add(img("19_26_48.jpg"));
        builders.add(vid("00119.MTS").seconds("00:00:06", "00:00:28").as("00119-part.mp4"));
        builders.add(img("19_31_21.jpg"));
        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/Aleksandra_Prijovic_-_Dam_Dam_Dam_2m20s.mp3"))
                .create();
    }

    private File gen20170527() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.27_mojstrana_kranjsak_gora_gozd_martuljek_telenci";
        subTitle = "2017.05.27 Nationalpark Triglav Slowenien";
        setup();

        var yaFIMnle = new YaFIMnle("2017.05.27");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Mojstrana";
        builders.add(img("05_33_54.jpg"));
        builders.add(img("06_32_42.jpg"));
        builders.add(img("06_54_29.jpg"));
        builders.add(img("06_55_38.jpg"));
        builders.add(img("06_58_42.jpg"));
        builders.add(img("07_00_15.jpg"));
        builders.add(vid("07_08_41.mp4").seconds("00:00:09", "00:00:16").as("07_08_41-part.mp4"));
        builders.add(vid("00125_Mojstrana_unterm_Wasserfall.MTS").seconds("00:00:00", "00:00:22").as("00125_Mojstrana_unterm_Wasserfall-part.mp4"));
        builders.add(img("07_38_11.jpg"));
        builders.add(img("07_58_10.jpg"));
        builders.add(img("08_21_38.jpg"));
        builders.add(img("08_27_17.jpg"));
        builders.add(img("08_54_56.jpg"));
        detailTitle = "Kranjska Gora";
        builders.add(img("10_21_11.jpg"));
        builders.add(img("10_33_03.jpg"));
        builders.add(img("10_40_56.jpg"));
        builders.add(vid("10_56_32.mp4").seconds("00:00:00", "00:00:05").as("10_56_32-part1.mp4"));
        builders.add(vid("10_56_32.mp4").seconds("00:00:10", "00:00:15").as("10_56_32-part2.mp4"));
        builders.add(vid("10_56_32.mp4").seconds("00:00:20", "00:00:25").as("10_56_32-part3.mp4"));
        builders.add(vid("10_56_32.mp4").seconds("00:00:30", "00:00:35").as("10_56_32-part4.mp4"));
        builders.add(img("11_26_16.jpg"));
        detailTitle = "Gozd Martuljek";
        builders.add(img("12_42_03.jpg"));
        builders.add(img("13_05_52.jpg")); // Wasserfall
        builders.add(vid("13_05_59.mp4").seconds("00:00:08", "00:00:17").as("13_05_59-part.mp4")); // Wasserfall
        builders.add(img("13_14_37.jpg"));
        builders.add(vid("00134.MTS").seconds("00:00:08", "00:00:22").as("00134-part.mp4"));
        builders.add(img("13_23_51.jpg"));
        builders.add(vid("13_24_41.mp4").seconds("00:00:10", "00:00:30").as("13_24_41-part1.mp4"));
        builders.add(img("13_25_31.jpg"));
        builders.add(img("13_25_41.jpg"));
        builders.add(img("13_29_26.jpg"));
        builders.add(img("13_30_03.jpg"));
        builders.add(img("13_30_42.jpg"));
        builders.add(img("13_38_14.jpg"));
        builders.add(img("14_45_15.jpg"));
        detailTitle = "Naturreservat Zelenci";
        builders.add(img("15_20_06.jpg"));
        builders.add(img("15_20_30.jpg"));
        builders.add(img("15_23_09.jpg"));
        builders.add(vid("00142_Zelenci.MTS").seconds("00:00:05", "00:00:11").as("00142_Zelenci-part1.mp4"));
        builders.add(vid("00142_Zelenci.MTS").seconds("00:00:17", "00:00:23").as("00142_Zelenci-part2.mp4"));
        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/Dino_Merlin_-_Krive_Karte_4m13s.mp3"))
                .create();
    }

    private File gen20170528() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.28_kranjska_gora";
        subTitle = "2017.05.28 Nationalpark Triglav Slowenien";
        setup();

        var yaFIMnle = new YaFIMnle("2017.05.28");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Kranjska Gora";
                builders.add(img("08_52_15.jpg"));
        builders.add(img("08_59_07.jpg"));
        builders.add(img("08_59_12.jpg"));
        builders.add(img("09_19_39.jpg"));
        builders.add(img("09_58_25.jpg"));
        builders.add(img("10_07_36.jpg"));
        builders.add(img("10_09_45.jpg"));
        builders.add(img("10_27_04.jpg"));
        builders.add(vid("00147.MTS").seconds("00:00:00", "00:01:20").as("00147-part.mp4"));
        builders.add(img("10_27_17.jpg"));
        builders.add(img("10_27_24.jpg"));
        builders.add(img("10_27_34.jpg"));
        builders.add(img("10_27_41.jpg"));
        builders.add(vid("00148.MTS").seconds("00:00:00", "00:00:38").as("00148-part.mp4"));
        detailTitle = "Gozd Martuljek";
        builders.add(vid("13_26_51.mp4"));
        builders.add(img("13_36_23.jpg"));
        builders.add(img("13_38_14.jpg"));
        builders.add(vid("13_39_49.mp4").seconds("00:00:00", "00:00:05").as("13_39_49-part.mp4"));
        builders.add(img("13_47_21.jpg"));
        builders.add(img("13_50_28.jpg"));
        builders.add(img("14_34_20.jpg"));
        builders.add(img("14_36_46.jpg"));
        builders.add(vid("14_38_35.mp4"));
        builders.add(img("14_41_01.jpg"));
        builders.add(vid("14_45_13.mp4").seconds("00:00:00", "00:00:06").as("14_45_13-part.mp4"));

        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/unbekannt4_3m54s.mp3"))
                .create();
    }

    private File gen20170529() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.29_Kranjska_Gora_nach_Trenta/";
        subTitle = "2017.05.29 Alpe Adria Trail";
        setup();

        var yaFIMnle = new YaFIMnle("2017.05.29");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Kranjska Gora nach Trenta";
        builders.add(img("08_52_42.jpg"));
        builders.add(img("09_11_12.jpg"));
        builders.add(img("09_15_19.jpg"));
        builders.add(img("09_15_27.jpg"));
        builders.add(img("10_00_03.jpg"));
        detailTitle = "Ruska kapelica";
        builders.add(img("10_07_39.jpg"));
        builders.add(img("10_08_28.jpg"));
        detailTitle = "Kranjska Gora nach Trenta";
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
        detailTitle = "Vršič";
        builders.add(img("12_07_46.jpg"));
        builders.add(img("12_11_25.jpg"));
        detailTitle = "Kranjska Gora nach Trenta";
        builders.add(img("12_19_37.jpg"));
        builders.add(img("12_20_20.jpg"));
        builders.add(img("12_29_09.jpg"));
        builders.add(img("13_46_20.jpg"));
        builders.add(img("13_46_27.jpg"));
        builders.add(vid("13_46_43.mp4").seconds("00:00:00", "00:00:06"));
        builders.add(img("13_47_19.jpg"));
        builders.add(img("13_56_56.jpg"));
        builders.add(img("13_57_07.jpg"));
        builders.add(img("14_31_38.jpg"));
        builders.add(img("14_38_39.jpg"));
        builders.add(img("14_48_19.jpg"));
        builders.add(vid("14_48_27.mp4").seconds("00:00:00", "00:00:06"));
        builders.add(img("14_54_33.jpg"));
        builders.add(img("14_57_45.jpg"));
        builders.add(img("14_57_50.jpg"));
        builders.add(img("15_06_14.jpg"));

        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/MIRZA_SELIMOVIC_x_ILMA_KARAHMED_-_MORA_DA_JE_LJUBAV_3m48s.mp3"))
                .create();
    }

    private File gen20170530() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.30_Tranta_nach_Bovec/";
        subTitle = "2017.05.30 Alpe Adria Trail";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2017.05.30");

        detailTitle = "Trenta nach Bovec";
        builders.add(img("07_07_05.jpg"));
        builders.add(img("07_27_08.jpg"));
        builders.add(img("07_46_53.jpg"));
        builders.add(img("08_12_07.jpg"));
        builders.add(img("08_12_15.jpg"));
        builders.add(img("08_35_29.jpg"));
        builders.add(img("09_08_11.jpg"));
        builders.add(img("09_08_17.jpg"));
        builders.add(img("09_16_00.jpg"));
        builders.add(img("09_30_26.jpg"));
        builders.add(img("09_30_42.jpg"));
        builders.add(img("09_32_54.jpg"));
        builders.add(vid("09_33_04.mp4").seconds("00:00:04", "00:00:17").as("09_33_04-part.mp4"));
        builders.add(img("09_41_53.jpg"));
        builders.add(img("09_45_26.jpg"));
        builders.add(img("09_48_38.jpg"));
        builders.add(img("09_58_57.jpg"));
        builders.add(img("10_03_10.jpg"));
        builders.add(img("10_10_28.jpg"));
        builders.add(img("10_28_35.jpg"));
        builders.add(img("10_29_11.jpg"));
        builders.add(vid("10_29_19.mp4"));
        builders.add(img("10_41_54.jpg"));
        builders.add(img("10_42_04.jpg"));
        builders.add(img("10_45_02.jpg"));
        builders.add(img("10_45_06.jpg"));
        builders.add(img("10_45_11.jpg"));
        builders.add(img("10_45_16.jpg"));
        builders.add(vid("10_45_23.mp4").seconds("00:00:00", "00:00:15").as("10_45_23-part.mp4"));
        builders.add(img("10_48_57.jpg"));
        builders.add(img("10_49_31.jpg"));
        builders.add(img("10_58_35.jpg"));
        builders.add(img("11_00_54.jpg"));
        builders.add(img("11_05_08.jpg"));
        builders.add(vid("11_05_13.mp4").seconds("00:00:05", "00:00:12").as("11_05_13-part.mp4"));
        builders.add(img("11_05_48.jpg"));
        builders.add(img("11_08_20.jpg"));
        builders.add(img("11_09_20.jpg"));
        builders.add(img("11_10_02.jpg"));
        builders.add(img("12_17_48.jpg"));
        builders.add(img("12_29_18.jpg"));
        builders.add(img("12_41_59.jpg"));
        builders.add(img("12_47_02.jpg"));
        builders.add(img("12_55_09.jpg"));

        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/Aleksandra_Prijovic_-_Dam_Dam_Dam_2m20s.mp3"))
                .create();

    }

    private File gen20170531() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.05.31_Bovec_nach_Kobarid/";
        subTitle = "2017.05.31 Alpe Adria Trail";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2017.05.31");

        detailTitle = "Slap Virje";
        builders.add(img("06_45_12.jpg"));
        builders.add(img("06_56_55.jpg"));
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4").seconds("00:00:00", "00:00:10").as("06_58_23-part.mp4"));
        builders.add(img("07_00_11.jpg"));
        builders.add(img("07_03_24.jpg"));
        detailTitle = "Bovec nach Kobarid";
        builders.add(img("07_44_50.jpg"));
        builders.add(img("08_50_48.jpg"));
        builders.add(img("08_51_39.jpg"));
        builders.add(img("08_52_50.jpg"));
        builders.add(img("09_04_37.jpg"));
        builders.add(vid("09_19_24.mp4").seconds("00:00:00", "00:00:06").as("09_19_24-part.mp4"));
        builders.add(img("09_46_51.jpg"));
        builders.add(img("11_32_31.jpg"));
        builders.add(img("13_18_10.jpg"));
        builders.add(img("13_38_07.jpg"));
        builders.add(img("14_06_07.jpg"));
        builders.add(img("14_14_37.jpg"));
        builders.add(img("14_21_12.jpg"));
        builders.add(img("14_21_26.jpg"));
        builders.add(img("14_22_07.jpg"));
        detailTitle = "Kobarid";
        builders.add(img("15_05_47.jpg"));
        builders.add(vid("15_05_53.mp4").seconds("00:00:07", "00:00:15").as("15_05_53-part.mp4"));
        builders.add(img("15_06_41.jpg"));
        builders.add(img("15_08_11.jpg"));
        builders.add(img("15_08_56.jpg"));
        builders.add(img("15_09_09.jpg"));
        builders.add(img("15_12_58.jpg"));
        builders.add(img("16_37_07.jpg"));
        builders.add(img("16_38_21.jpg"));
        builders.add(img("16_40_01.jpg"));
        builders.add(img("16_41_09.jpg"));
        builders.add(vid("16_49_27.mp4").seconds("00:00:00", "00:00:10").as("16_49_27-part.mp4"));
        builders.add(img("16_57_50.jpg"));
        builders.add(img("16_58_30.jpg"));
        builders.add(img("16_58_58.jpg"));
        builders.add(img("16_59_11.jpg"));
        builders.add(img("16_59_52.jpg"));
        builders.add(img("17_00_46.jpg"));
        detailTitle = "Slap Kozjak";
        builders.add(img("17_01_40.jpg"));
        builders.add(vid("17_01_59.mp4").seconds("00:00:00", "00:00:05").as("17_01_59-part.mp4"));
        builders.add(img("17_04_49.jpg"));
        builders.add(vid("17_04_56.mp4").seconds("00:00:00", "00:00:05").as("17_04_56-part.mp4"));
        detailTitle = "Bovec nach Kobarid";
        builders.add(img("17_16_24.jpg"));

        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/unbekannt1_4m00s.mp3"))
                .create();
    }

    private File gen20170601() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.06.01_Trieste";
        subTitle = "2017.06.01 Von Slowenien via Italien nach Slowenien";
        setup();

        var yaFIMnle = new YaFIMnle("2017.06.01");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Nova Gorica";
        builders.add(img("10_42_42.jpg"));
        builders.add(img("10_47_11.jpg"));
        builders.add(img("10_48_22.jpg"));
        builders.add(img("11_12_25.jpg"));
        builders.add(img("11_12_52.jpg"));
        builders.add(img("11_21_55.jpg"));
        detailTitle = "Gorizia Centrale";
        builders.add(img("11_24_44.jpg"));
        builders.add(vid("11_41_28.mp4").seconds("00:00:00", "00:00:05").as("11_41_28-part.mp4"));
        builders.add(img("11_42_08.jpg"));
        detailTitle = "Trieste";
        builders.add(img("13_19_54.jpg"));
        builders.add(img("13_20_43.jpg"));
        builders.add(img("13_22_19.jpg"));
        builders.add(img("13_22_29.jpg"));
        builders.add(img("13_25_22.jpg"));
        builders.add(img("13_26_36.jpg"));
        builders.add(img("13_26_45.jpg"));
        builders.add(img("13_29_44.jpg"));
        builders.add(img("13_30_01.jpg"));
        builders.add(img("13_30_59.jpg"));
        builders.add(vid("00192.MTS"));
        builders.add(img("13_41_05.jpg"));
        builders.add(img("13_41_49.jpg"));
        builders.add(img("13_58_06.jpg"));
        builders.add(img("14_03_25.jpg"));
        builders.add(img("14_03_32.jpg"));
        builders.add(img("14_05_18.jpg"));
        detailTitle = "Piran";
        builders.add(img("17_04_00.jpg"));
        builders.add(img("17_04_46.jpg"));
        builders.add(vid("17_04_52.mp4"));
        builders.add(img("17_20_39.jpg"));
        builders.add(img("17_24_04.jpg"));
        builders.add(img("17_24_09.jpg"));
        builders.add(img("17_24_24.jpg"));
        builders.add(img("17_29_18.jpg"));
        builders.add(img("17_29_25.jpg"));
        builders.add(img("17_32_32.jpg"));
        builders.add(img("17_38_29.jpg"));
        builders.add(img("17_48_08.jpg"));
        builders.add(img("17_56_40.jpg"));

        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/Relja_-_Latino_Evropa_3m18s.mp3"))
                .create();
    }

    private File gen20170602() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.06.02_Piran";
        subTitle = "2017.06.02 Slowenische Adria";
        setup();

        var yaFIMnle = new YaFIMnle("2017.06.02");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Piran";
        builders.add(img("06_25_28.jpg"));
        builders.add(img("07_02_25.jpg"));
        builders.add(img("07_09_34.jpg"));
        builders.add(img("07_12_14.jpg"));
        builders.add(vid("07_13_33.mp4").seconds("00:00:00", "00:00:07").as("07_13_33-part.mp4"));
        builders.add(img("07_14_27.jpg"));
        builders.add(vid("07_14_32.mp4"));
        builders.add(img("07_17_44.jpg"));
        builders.add(img("07_23_42.jpg"));
        builders.add(img("07_23_59.jpg"));
        builders.add(img("07_27_04.jpg"));
        builders.add(img("09_35_36.jpg"));
        builders.add(img("09_45_09.jpg"));
        builders.add(img("09_59_19.jpg"));
        builders.add(img("10_20_25.jpg"));
        builders.add(img("10_35_44.jpg"));
        builders.add(img("10_35_55.jpg"));
        builders.add(img("10_37_09.jpg"));
        builders.add(img("10_39_32.jpg"));
        builders.add(vid("10_39_39.mp4"));
        builders.add(img("10_40_12.jpg"));
        builders.add(img("10_45_35.jpg"));
        builders.add(img("10_45_44.jpg"));
        builders.add(img("10_45_54.jpg"));
        builders.add(img("10_46_42.jpg"));
        builders.add(vid("10_49_34.mp4"));
        builders.add(img("10_50_36.jpg"));
        builders.add(img("10_51_00.jpg"));
        builders.add(img("11_02_50.jpg"));
        builders.add(img("11_03_00.jpg"));
        builders.add(img("11_07_08.jpg"));
        builders.add(img("13_22_32.jpg"));
        builders.add(img("13_36_40.jpg"));
        builders.add(img("13_37_03.jpg"));
        builders.add(img("14_44_01.jpg"));
        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/Buba_Corelli_-_Irina_Shayk_3m11s.mp3"))
                .create();
    }

    private File gen20170607() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.06.07_meiringen_grosse_scheidegg_aaresschlucht_rosenlaui";
        subTitle = "2017.06.07 Schweiz Meiringen nach Grindelwald (mit Aaresschlucht)";
        setup();

        var yaFIMnle = new YaFIMnle("2017.06.07");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Meiringen";
        builders.add(img("08_49_13.jpg"));
        builders.add(vid("09_42_39.mp4").seconds("00:00:00", "00:00:05").as("09_42_39-part1.mp4"));
        builders.add(vid("09_42_39.mp4").seconds("00:00:08", "00:00:13").as("09_42_39-part2.mp4"));
        builders.add(vid("09_42_39.mp4").seconds("00:00:16", "00:00:25").as("09_42_39-part3.mp4"));
        builders.add(img("09_46_28.jpg"));
        builders.add(vid("10_13_54.mp4").seconds("00:00:00", "00:00:05").as("10_13_54-part.mp4"));
        builders.add(img("10_18_18.jpg"));
        builders.add(vid("10_23_00.mp4").seconds("00:00:00", "00:00:06").as("10_23_00-part.mp4"));
        builders.add(vid("10_41_40.mp4").seconds("00:00:00", "00:00:07").as("10_41_40-part.mp4"));
        builders.add(img("11_09_35.jpg"));
        builders.add(img("11_09_42.jpg"));
        builders.add(vid("11_15_28.mp4").seconds("00:00:00", "00:00:07").as("11_15_28-part.mp4"));
        builders.add(img("11_25_47.jpg"));
        builders.add(img("11_30_21.jpg"));
        builders.add(img("11_33_48.jpg"));
        builders.add(vid("12_13_57.mp4").seconds("00:00:04", "00:00:10").as("12_13_57-part.mp4"));
        builders.add(vid("12_17_42.mp4").seconds("00:00:00", "00:00:07").as("12_17_42-part.mp4"));
        builders.add(img("12_19_49.jpg"));
        builders.add(img("12_26_21.jpg"));
        builders.add(vid("12_27_21.mp4"));
        builders.add(img("12_28_25.jpg"));
        builders.add(vid("12_29_40.mp4").seconds("00:00:03", "00:00:11").as("12_29_40-part.mp4"));
        builders.add(img("12_30_42.jpg"));
        builders.add(vid("12_32_06.mp4").seconds("00:00:00", "00:00:05").as("12_32_06-part.mp4"));
        builders.add(img("12_32_20.jpg"));
        builders.add(img("12_36_23.jpg"));
        builders.add(vid("12_42_14.mp4"));
        builders.add(img("12_53_35.jpg"));
        builders.add(img("12_57_43.jpg"));
        builders.add(vid("12_59_31.mp4").seconds("00:00:00", "00:00:10").as("12_59_31-part.mp4"));
        builders.add(img("13_08_15.jpg"));
        builders.add(img("13_16_16.jpg"));
        builders.add(img("13_23_20.jpg"));
        builders.add(img("13_23_30.jpg"));
        builders.add(img("13_49_46.jpg"));
        builders.add(img("14_00_53.jpg"));
        builders.add(img("14_00_58.jpg"));
        builders.add(img("15_51_07.jpg"));
        builders.add(vid("16_11_59.mp4").seconds("00:00:00", "00:00:14").as("16_11_59-part.mp4"));
        builders.add(img("16_22_43.jpg"));
        builders.add(img("16_13_00.jpg"));
        builders.add(vid("16_32_28.mp4"));
        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/Jala_Brat_x_Buba_Corelli_x_Hava_-_Dale_2m43s.mp3"))
                .create();
    }

    private File gen20170608() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.06.08_lech_nach_warth";
        subTitle = "2017.06.08 Österreich Lechweg";
        setup();

        var yaFIMnle = new YaFIMnle("2017.06.08");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Lechweg";
        builders.add(img("08_24_10.jpg"));
        builders.add(img("08_31_06.jpg"));
        builders.add(img("08_57_43.jpg"));
        builders.add(img("08_57_52.jpg"));
        builders.add(img("09_05_01.jpg"));
        builders.add(img("09_05_11.jpg"));
        builders.add(img("09_09_14.jpg"));
        builders.add(img("09_10_32.jpg"));
        builders.add(img("09_11_32.jpg"));
        builders.add(img("13_40_57.jpg"));
        builders.add(img("13_43_53.jpg"));
        builders.add(img("13_44_37.jpg"));
        builders.add(img("13_45_18.jpg"));
        builders.add(img("13_47_41.jpg"));
        builders.add(img("13_47_55.jpg"));
        builders.add(img("13_48_54.jpg"));
        builders.add(img("15_01_52.jpg"));
        detailTitle = "Lech am Arlberg";
        builders.add(img("17_42_07.jpg"));
        builders.add(img("17_42_16.jpg"));
        builders.add(img("17_44_03.jpg"));
        builders.add(img("17_44_11.jpg"));
        builders.add(img("17_45_32.jpg"));
        builders.add(img("17_47_40.jpg"));
        builders.add(img("17_54_57.jpg"));
        builders.add(img("17_57_08.jpg"));
        builders.add(img("18_03_29.jpg"));
        builders.add(img("18_05_20.jpg"));
        builders.add(img("18_22_55.jpg"));
        builders.add(img("18_31_42.jpg"));
        builders.add(img("18_37_14.jpg"));
        builders.add(img("18_50_53.jpg"));
        builders.add(img("18_51_52.jpg"));
        builders.add(vid("18_52_56.mp4").seconds("00:00:00", "00:00:14"));
        builders.add(img("18_59_09.jpg"));
        builders.add(img("18_59_13.jpg"));
        builders.add(img("19_05_44.jpg"));
        builders.add(img("19_30_20.jpg"));
        builders.add(img("20_10_09.jpg"));
        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/KATARINA_DIDANOVIC_x_RASTA_-_MOJ_MUSKARAC_3m22s.mp3"))
                .create();
    }

    private File gen20170609() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.06.09_warth_nach_steeg";
        subTitle = "2017.06.09 Österreich Lechweg";
        setup();

        var yaFIMnle = new YaFIMnle("2017.06.09");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Lech nach Warth";
        builders.add(img("06_37_26.jpg"));
        builders.add(img("06_59_21.jpg"));
        builders.add(img("06_59_27.jpg"));
        builders.add(vid("07_22_20.mp4"));
        builders.add(img("07_26_52.jpg"));
        builders.add(img("07_27_05.jpg"));
        builders.add(img("07_31_14.jpg"));
        builders.add(img("07_31_23.jpg"));
        builders.add(img("07_32_15.jpg"));
        builders.add(img("07_32_21.jpg"));
        builders.add(img("07_35_57.jpg"));
        builders.add(img("07_36_22.jpg"));
        builders.add(img("07_48_43.jpg"));
        builders.add(img("08_05_11.jpg"));
        builders.add(img("08_18_32.jpg"));
        builders.add(img("08_26_09.jpg"));
        builders.add(img("08_26_23.jpg"));
        builders.add(img("08_26_29.jpg"));
        builders.add(vid("08_31_24.mp4"));
        builders.add(vid("08_39_17.mp4").seconds("00:00:00", "00:00:13"));
        builders.add(img("08_46_27.jpg"));
        builders.add(img("08_46_32.jpg"));
        builders.add(img("09_04_57.jpg"));
        builders.add(img("09_05_09.jpg"));
        builders.add(img("09_10_16.jpg"));
        builders.add(img("09_14_31.jpg"));
        builders.add(vid("09_14_47.mp4"));
        builders.add(img("09_30_37.jpg"));
        builders.add(img("09_30_44.jpg"));
        builders.add(img("09_32_37.jpg"));
        builders.add(img("09_32_56.jpg"));
        return yaFIMnle.of(builders)
                .overlayMp3(new File("/home/oliver/Downloads/mp3/big_fm/Sanja_Vuccic_x_Nucci_-_Ruzmarin_2m43s.mp3"))
                .create();
    }
}