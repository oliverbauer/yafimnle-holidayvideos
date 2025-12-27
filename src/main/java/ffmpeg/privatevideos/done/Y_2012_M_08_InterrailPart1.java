package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Config;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;
import io.github.yafimnle.imagemagick.filter.ImageFilters;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2012_M_08_InterrailPart1 extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2012_M_08_InterrailPart1();
        main.mainTitle = "August 2012\\: Interrail Europa Tour"; // TODO Recheck escaping
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    protected void run() {
        File f1 = prag("/media/oliver/Extreme SSD/2012/08_Interrail_Europa/mp3/yt5s.com_-_Kristina_-_Pri_oltari_128_kbps.mp3");
        File f2 = budapest("/home/oliver/ffmpeg-video-gen/mp3/ungarisch/ByeAlex_és_a_Slepp_-_Még_mindig.mp3");
        File f3 = belgrad("/home/oliver/ffmpeg-video-gen/mp3/serbien/DraganaMirkovic_-_Sama.mp3");
        File f4 = montenegroAnreise("/home/oliver/ffmpeg-video-gen/mp3/Bojana_i_Nikola_Pekovic_-_Deda_i_unuk.mp3");
        File f5 = kotorBudva("/home/oliver/ffmpeg-video-gen/mp3/balkan_allgemein/MilicaTodorovic-NikadNecesZnati.mp3");
        File f6 = hercegNovi("/home/oliver/ffmpeg-video-gen/mp3/balkan_allgemein/CvijaXEditaFilmONnama-trimmed.mp3");
        File f7 = mostar("/home/oliver/ffmpeg-video-gen/mp3/balkan_allgemein/SelmaCavkicIKemalMalovcic-KaziMeniKazi.mp3");
        File f8 = sarajevo("/home/oliver/ffmpeg-video-gen/mp3/balkan_allgemein/BAKA_PRASE_x_VOYAGE_-_VVS.mp3");
        File f9 = zagreb("/home/oliver/ffmpeg-video-gen/mp3/Halid_Beslic_-_Kad_zaigra_srce_od_meraka.mp3");
        File f10 = salzburgZuerich(""); // TODO Audio

        var joiner = new FFMpegJoiner();
        joiner.join("2012.08.interrail-part01", f1, f2, f3, f4, f5, f6, f7, f8, f9, f10);
    }

    public File prag(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/01_Prag";
        subTitle = "2012.08.01 Tschechische Republik - Prag";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.01.tschechischerepublik.prag");

        // TODO recheck, add detailTitle
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("CLIP0019_Dortmund_CNL_arrives.AVI"));
        builders.add(vid("CLIP0026_Trainride_to_Praha.AVI"));
        builders.add(vid("CLIP0031_prag_uhr.AVI"));
        builders.add(img("09_55_42.jpg"));
        builders.add(img("10_44_28.jpg"));
        builders.add(img("10_47_12.jpg"));
        builders.add(img("11_02_37.jpg"));
        builders.add(img("11_05_24.jpg"));
        builders.add(img("11_05_33.jpg"));
        builders.add(img("11_21_09.jpg"));
        builders.add(img("11_21_27.jpg"));
        builders.add(img("12_12_15.jpg"));
        builders.add(img("12_12_32.jpg"));
        builders.add(img("12_13_35.jpg"));
        builders.add(img("12_36_15.jpg"));
        builders.add(img("12_38_20.jpg"));
        builders.add(img("12_40_01.jpg"));
        builders.add(img("13_35_45.jpg"));
        builders.add(img("15_05_31.jpg"));
        builders.add(vid("CLIP0033.AVI").seconds("00:00:06", "00:00:17"));
        builders.add(img("15_13_03.jpg"));
        builders.add(img("15_14_29.jpg"));
        builders.add(img("23_56_51.jpg"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File budapest(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/02_Budapest";
        subTitle = "2012.08.02 Ungarn - Budapest";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.02.ungarn.budapest");
        var suffix = Config.instance().resolution().apprev();

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Prag nach Budapest (Tschechische Republik nach Ungarn)";
        builders.add(img("08_35_18.jpg"));
        builders.add(vid("CLIP0041_Arriving_Budapest.AVI").seconds("00:00:06", "00:00:12").as("CLIP0041-0006-0012-" + suffix + ".mp4"));
        builders.add(vid("CLIP0041_Arriving_Budapest.AVI").seconds("00:00:30", "00:00:35").as("CLIP0041-0030-0035-" + suffix + ".mp4"));
        detailTitle = "Parlamentsgebäude (Országház)";
        builders.add(img("10_39_24.jpg"));
        builders.add(img("13_51_37.jpg"));
        detailTitle = "";
        builders.add(img("10_40_00.jpg"));
        detailTitle = "Fischereibastei (Halászbástya)";
        builders.add(img("11_01_53.jpg"));
        builders.add(img("11_20_47.jpg"));
        builders.add(img("11_09_23.jpg"));
        builders.add(vid("CLIP0043_Budapest_360grad_Fischerbastei.AVI"));
        builders.add(img("11_20_47.jpg"));
        builders.add(vid("CLIP0045_Budapest_Fischerbastei_Musik.AVI"));
        detailTitle = "";
        builders.add(img("11_40_56.jpg"));//.comment(" ")); // Museum?
        builders.add(img("13_10_50.jpg")); // Museum?
        detailTitle = "Zitadelle";
        builders.add(vid("CLIP0048_Budapest_HedgeBerg_oder_so_aehnlich.AVI").seconds("00:00:03", "00:00:08"));
        detailTitle = "Heldenplatz (Hősök tere)";
        builders.add(img("14_20_45.jpg"));
        builders.add(img("14_23_25.jpg"));
        builders.add(img("14_22_57.jpg"));
        detailTitle = "Bahnfahrt durch Budapest";
        builders.add(vid("CLIP0051_Budapest_Downstairs_to_the_Metro.AVI").seconds("00:00:02", "00:00:06").as("CLIP0051-0002-0006.mp4"));
        builders.add(vid("CLIP0051_Budapest_Downstairs_to_the_Metro.AVI").seconds("00:00:41", "00:00:52").as("CLIP0051-0041-0052.mp4"));
        builders.add(vid("CLIP0055_Budapest_metro_arrives.AVI").seconds("00:00:18", "00:00:25"));
        builders.add(vid("CLIP0057_Tramride_Budapest.AVI").seconds("00:02:14", "00:02:20").as("CLIP0057-0214-0220.mp4"));
        builders.add(vid("CLIP0057_Tramride_Budapest.AVI").seconds("00:04:19", "00:04:25").as("CLIP0057-0419-0425.mp4"));
        detailTitle = "";
        builders.add(img("16_50_52.jpg"));
        detailTitle = "Ethnografisches Museum (Néprajzi Múzeum)";
        builders.add(img("17_34_10.jpg"));
        builders.add(img("17_37_17.jpg"));
        detailTitle = "Budapest Ostbf. (Keleti pályaudvar)";
        builders.add(img("19_35_10.jpg"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File belgrad(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/03_Belgrad";
        subTitle = "2012.08.03 Serbien - Belgrad";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.03.serbien.belgrad");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Budapest nach Belgrad (Ungarn nach Serbien)";
        builders.add(img("05_56_56-1.jpg"));
        builders.add(img("06_01_39-1.jpg"));
        detailTitle = "Hauptbahnhof (bis 30.06.2018) - Железничка станица Београд";
        builders.add(vid("CLIP0066_Trainride_to_Belgrade.AVI").seconds("00:00:24", "00:00:29"));
        detailTitle = "Dom des Heiligen Sava - Храм светог Саве Hram svetog Save";
        builders.add(img("07_17_09-1.jpg"));
        builders.add(img("07_25_35.jpg"));
        detailTitle = "Haus der Nationalversammlung der Republik Serbien - Дом Народне скупштине Републике Србије";
        builders.add(img("08_38_35.jpg"));
        builders.add(img("08_40_41.jpg"));
        detailTitle = "Hotel Moskva - Хотел Москва";
        builders.add(img("08_47_34.jpg"));
        detailTitle = "";
        builders.add(img("09_12_37.jpg"));
        detailTitle = "Kalemegdan Park - Калемегдан";
        builders.add(img("09_59_44.jpg"));
        builders.add(img("10_01_40.jpg"));
        builders.add(vid("CLIP0068_Belgrade_Panorama.avi"));
        detailTitle = "Mittagessen im Bahnhof";
        builders.add(img("12_27_28.jpg"));
        builders.add(img("12_56_31.jpg"));
        detailTitle = "Stadtzentrum";
        builders.add(vid("CLIP0067_Belgrade_260grad.AVI"));
        detailTitle = "Kalemegdan Park - Калемегдан";
        builders.add(img("10_50_20.jpg"));
        builders.add(img("10_52_45.jpg"));
        builders.add(img("10_57_11.jpg"));
        detailTitle = "NATO-Bombardierung";
        builders.add(img("15_27_14.jpg"));
        builders.add(img("15_23_29.jpg"));
        builders.add(img("15_22_28.jpg"));
        detailTitle = "Hauptbahnhof (bis 30.06.2018) - Железничка станица Београд";
        builders.add(vid("CLIP0072_Belgrade_Hbf.AVI"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File montenegroAnreise(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/04_Sutomore_Budva_Kotor";
        subTitle = "2012.08.04 Montenegro";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.04.montenegro.anreise");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Belgrad nach Sutomore (Serbien nach Montenegro)";
        builders.add(vid("CLIP0077_Trainride_To_Sutomore.AVI").seconds("00:00:00", "00:00:05").as("CLIP0077-01.mp4"));
        builders.add(vid("CLIP0077_Trainride_To_Sutomore.AVI").seconds("00:00:36", "00:00:43").as("CLIP0077-02.mp4"));
        builders.add(vid("CLIP0078_Trainride_To_Sutomore.AVI").seconds("00:02:05", "00:02:11").as("CLIP0078-01.mp4"));
        builders.add(vid("CLIP0078_Trainride_To_Sutomore.AVI").seconds("00:03:48", "00:03:58").as("CLIP0078-02.mp4"));
        builders.add(vid("CLIP0078_Trainride_To_Sutomore.AVI").seconds("00:04:25", "00:04:32").as("CLIP0078-03.mp4"));
        builders.add(vid("CLIP0081_Trainride_To_Sutomore.AVI").seconds("00:02:08", "00:02:15").as("CLIP0081-01.mp4"));
        builders.add(vid("CLIP0081_Trainride_To_Sutomore.AVI").seconds("00:06:27", "00:07:04").as("CLIP0081-02.mp4"));// Mala Rijeka Viadukt
        builders.add(vid("CLIP0081_Trainride_To_Sutomore.AVI").seconds("00:07:16", "00:07:23").as("CLIP0081-03.mp4"));
        builders.add(vid("CLIP0081_Trainride_To_Sutomore.AVI").seconds("00:07:29", "00:07:42").as("CLIP0081-04.mp4"));
        builders.add(vid("CLIP0081_Trainride_To_Sutomore.AVI").seconds("00:10:49", "00:10:57").as("CLIP0081-05.mp4"));
        builders.add(vid("CLIP0081_Trainride_To_Sutomore.AVI").seconds("00:13:56", "00:14:06").as("CLIP0081-06.mp4"));
        builders.add(vid("CLIP0081_Trainride_To_Sutomore.AVI").seconds("00:15:11", "00:15:30").as("CLIP0081-07.mp4"));
        builders.add(vid("CLIP0082_Trainride_To_Sutomore.AVI").seconds("00:01:47", "00:01:53").as("CLIP0082-01.mp4"));
        builders.add(vid("CLIP0082_Trainride_To_Sutomore.AVI").seconds("00:04:05", "00:04:10").as("CLIP0082-02.mp4"));
        builders.add(vid("CLIP0084_Trainride_To_Sutomore.AVI").seconds("00:00:00", "00:00:06").as("CLIP0084-01.mp4"));
        builders.add(vid("CLIP0085_Trainride_To_Sutomore.AVI").seconds("00:00:00", "00:00:10").as("CLIP0084-01.mp4"));
        builders.add(vid("CLIP0087_Trainride_To_Sutomore.AVI").seconds("00:00:30", "00:00:42").as("CLIP0087-01.mp4"));
        builders.add(vid("CLIP0087_Trainride_To_Sutomore.AVI").seconds("00:01:02", "00:01:20").as("CLIP0087-02.mp4"));
        builders.add(vid("CLIP0089_Trainride_To_Sutomore.AVI").seconds("00:00:13", "00:00:31").as("CLIP0089-01.mp4"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File kotorBudva(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/04_Sutomore_Budva_Kotor";
        subTitle = "2012.08.04 Montenegro\\: Bucht von Kotor";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.04.montenegro.sutomore.budva.kotor");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Sutomore";
        builders.add(img("08_06_17.jpg"));
        builders.add(img("08_30_12.jpg"));
        builders.add(img("09_34_02.jpg"));
        builders.add(vid("CLIP0091_Sutomore.AVI").seconds("00:00:16", "00:00:32").as("CLIP0091_Sutomore-000016-000032.mp4"));
        detailTitle = "Budva";
        builders.add(img("13_24_51.jpg"));
        builders.add(img("13_36_46.jpg"));
        builders.add(img("13_42_38.jpg"));
        builders.add(img("13_43_12.jpg"));
        detailTitle = "Kotor";
        builders.add(img("16_59_53.jpg"));
        builders.add(img("17_05_43.jpg"));
        builders.add(vid("CLIP0096_Kotor_260grad.AVI"));
        builders.add(img("17_11_39.jpg"));
        builders.add(img("17_26_42.jpg"));
        builders.add(img("18_23_46.jpg"));
        builders.add(img("20_44_10.jpg"));
        builders.add(vid("CLIP0103.AVI").seconds("00:00:00", "00:00:06").as("CLIP0103-000000-000006.mp4"));
        builders.add(vid("CLIP0107_Walk_through_Kotor_Karnival.AVI").seconds("00:02:23", "00:02:33").as("CLIP0107_Walk_through_Kotor_Karnival-000223-000233.mp4"));
        builders.add(vid("CLIP0107_Walk_through_Kotor_Karnival.AVI").seconds("00:04:27", "00:04:37").as("CLIP0107_Walk_through_Kotor_Karnival-000427-000437.mp4"));
        builders.add(vid("CLIP0109.AVI").seconds("00:01:07", "00:01:16").as("CLIP0109-000107-000116.mp4"));
        builders.add(vid("CLIP0111.AVI").seconds("00:02:11", "00:02:18").as("CLIP0111-000211-000218.mp4"));
        builders.add(vid("CLIP0112.AVI").seconds("00:00:05", "00:00:10").as("CLIP0112-000005-000010.mp4"));
        builders.add(vid("CLIP0112.AVI").seconds("00:00:33", "00:00:43").as("CLIP0112-000033-000043.mp4"));
        builders.add(vid("CLIP0112.AVI").seconds("00:02:30", "00:02:38").as("CLIP0112-000230-000238.mp4"));
        builders.add(vid("CLIP0115.AVI").seconds("00:00:15", "00:00:30").as("CLIP0115-000015-000030.mp4"));
        builders.add(vid("CLIP0117_Beautiful_music.AVI").seconds("00:00:10", "00:00:18").as("CLIP0117_Beautiful_music-000010-000018.mp4"));
        builders.add(vid("CLIP0117_Beautiful_music.AVI").seconds("00:01:02", "00:01:23").as("CLIP0117_Beautiful_music-000102-000123.mp4"));
        builders.add(vid("CLIP0118_Beautiful_music.AVI"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File hercegNovi(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/05_Herceg_Novi";
        subTitle = "2012.08.05 - Montenegro";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.05.montenegro.herceg_novi");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Kotor nach Herceg Novi";
        builders.add(vid("CLIP0120.AVI").seconds("00:00:23", "00:00:33").as("CLIP0120-000023-000033.mp4"));
        builders.add(vid("CLIP0121_Busride_Kotor_to_Herceg_Novi.AVI").seconds("00:08:28", "00:08:38").as("CLIP0121_Busride_Kotor_to_Herceg_Novi-000828-000838.mp4"));
        builders.add(vid("CLIP0122.AVI").seconds("00:01:43", "00:01:52").as("CLIP0122-000143-000152.mp4"));
        detailTitle = "Herceg Novi";
        builders.add(img("11_30_40-1.jpg"));
        builders.add(img("11_47_28-1.jpg"));
        builders.add(img("12_18_13-1.jpg"));
        builders.add(img("12_25_03-1.jpg"));
        builders.add(vid("CLIP0127_Herceg_Novi_360grad.AVI"));
        builders.add(img("12_32_12-1.jpg"));
        builders.add(img("14_20_15-1.jpg"));
        builders.add(img("16_54_07.jpg"));
        builders.add(vid("CLIP0130_Herceg_Novi_360grad.AVI").seconds("00:00:33", "00:00:43").as("CLIP0130-000033-000043.mp4"));
        builders.add(vid("CLIP0132_Walk_to_my_Hotel_Room_Herceg_Novi.AVI"));
        builders.add(vid("CLIP0134_Walk_to_my_Hotel_Room_Herceg_Novi.AVI").seconds("00:00:18", "00:00:25").as("CLIP0134-000018-000025.mp4"));
        builders.add(img("11_30_18-1.jpg"));
        builders.add(img("11_30_31-1.jpg"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File mostar(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/06_Mostar";
        subTitle = "2012.08.06 Bosnien und Herzegovina - Mostar";
        setup();

        var resultName = "2012.08.06.bosnien.mostar";

        var yaFIMnle = new YaFIMnle(resultName);

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise aus Crna Gora";
        builders.add(img("07_26_46.jpg")
                .appendImageFilterBeforeCrop(ImageFilters.partialBlur(675, 400, 350, 60, 10)) // blur my name on ticket
        ); // TODO Does not work anymore since pre-upscale and wrong position!
        builders.add(vid("CLIP0135_Busride_Herceg_Novi_to_Mostar.AVI").seconds("00:07:13", "00:07:40"));
        builders.add(img("09_06_42.jpg")); // noch im bus
        builders.add(vid("CLIP0136.AVI").seconds("00:01:57", "00:02:03"));
        detailTitle = "Bahnhof Mostar";
        builders.add(img("12_00_17.jpg"));
        detailTitle = "";
        builders.add(img("11_23_10.jpg"));
        builders.add(img("11_34_32.jpg"));
        builders.add(vid("CLIP0002_Mostar_360grad.AVI").seconds("00:00:11", "00:00:17"));
        builders.add(img("11_22_45.jpg")); // blick auf brücke
        builders.add(img("13_40_25.jpg"));
        builders.add(img("13_40_34.jpg"));
        builders.add(img("13_44_46.jpg"));
        builders.add(img("13_47_41.jpg"));
        builders.add(img("13_49_44.jpg"));
        builders.add(vid("CLIP0010_Mostar_Gang_durch_die_Stadt.AVI").seconds("00:01:30", "00:01:40").as("CLIP0010-000130-000140.mp4")); // gang durch die stadt
        builders.add(vid("CLIP0010_Mostar_Gang_durch_die_Stadt.AVI").seconds("00:02:30", "00:02:35").as("CLIP0010-000230-000235.mp4")); // gang durch die stadt
        builders.add(vid("CLIP0010_Mostar_Gang_durch_die_Stadt.AVI").seconds("00:05:09", "00:05:19").as("CLIP0509-000130-000519.mp4")); // gang durch die stadt
        detailTitle = "Mittagessen";
        builders.add(img("15_46_12.jpg"));
        detailTitle = "";
        builders.add(img("17_04_13.jpg"));
        builders.add(img("18_55_52.jpg"));
        builders.add(vid("CLIP0004_Mostar_360grad.AVI"));
        builders.add(vid("CLIP0007_Mostar360grad_Sprung_von_Bruecke.AVI").seconds("00:00:00", "00:00:30").as("CLIP0007-000000-000030.mp4"));
        builders.add(img("18_56_02.jpg"));
        builders.add(vid("CLIP0007_Mostar360grad_Sprung_von_Bruecke.AVI").seconds("00:00:45", "00:01:20").as("CLIP0007-000045-000120.mp4"));
        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File sarajevo(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/07_Sarajevo";
        subTitle = "2012.08.07 Bosnien und Herzegovina - Sarajevo";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.07.bosnien.sarajevo");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Mostar nach Sarajevo";
        builders.add(vid("CLIP0011_Mostar_Train_to_Sarajevo_arrives.AVI")
                .seconds("00:00:05", "00:00:13")
                .as("CLIP0011-000005-000013.mp4"));
        builders.add(img("08_52_46.jpg"));
        builders.add(img("09_07_05.jpg"));
        builders.add(vid("CLIP0012_Mostar_in_Train_to_Saraevo.AVI").seconds("00:00:55", "00:00:58").as("CLIP0012-000055-000058.mp4"));
        builders.add(vid("CLIP0012_Mostar_in_Train_to_Saraevo.AVI").seconds("00:01:03", "00:01:07").as("CLIP0012-000103-000107.mp4"));
        builders.add(vid("CLIP0016_mostar_sarajevo_train.AVI").seconds("00:02:40", "00:02:45").as("CLIP0016-000240-000245.mp4"));
        builders.add(vid("CLIP0018_mostar_sarajevo_train.AVI").seconds("00:00:14", "00:00:20").as("CLIP0018-000014-000020.mp4"));
        builders.add(vid("CLIP0020_mostar_sarajevo_train_arrive_sarajevo.AVI").seconds("00:03:58", "00:04:08").as("CLIP0020-000355-000410.mp4"));
        detailTitle = "Sarajevo";
        builders.add(vid("CLIP0021_Sarajevo_Tower.AVI").seconds("00:00:00", "00:00:06").as("CLIP0021-000000-000006.mp4"));
        builders.add(vid("CLIP0021_Sarajevo_Tower.AVI").seconds("00:00:48", "00:00:54").as("CLIP0021-000048-000054.mp4"));
        builders.add(img("11_53_29.jpg"));
        builders.add(img("12_22_31.jpg"));
        builders.add(img("12_31_42.jpg"));
        builders.add(img("12_50_27.jpg"));
        builders.add(img("12_53_44.jpg"));
        builders.add(img("13_14_11.jpg"));
        builders.add(img("13_14_20.jpg"));
        builders.add(img("13_43_48.jpg"));
        builders.add(vid("CLIP0024_sarajevo_birds.AVI"));
        builders.add(vid("CLIP0025_Sarajevo_Walk_through_old_town.AVI").seconds("00:00:02", "00:00:08").as("CLIP0025-000000-000010.mp4"));
        builders.add(vid("CLIP0025_Sarajevo_Walk_through_old_town.AVI").seconds("00:02:08", "00:02:14").as("CLIP0025-000206-000216.mp4"));
        builders.add(vid("CLIP0025_Sarajevo_Walk_through_old_town.AVI").seconds("00:04:18", "00:04:42").as("CLIP0025-000415-000445.mp4"));
        builders.add(img("16_52_09.jpg"));
        builders.add(img("17_07_47.jpg"));
        builders.add(img("17_35_10.jpg"));
        builders.add(img("17_49_23.jpg"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File zagreb(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/08_Zagreb";
        subTitle = "2012.08.08 Kroatien - Zagreb";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.08.kroatien.zagreb");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Sarajevo nach Zagreb";
        builders.add(img("06_43_26.jpg"));
        detailTitle = "Zagreb";
        builders.add(img("08_03_06.jpg"));
        builders.add(img("08_08_36.jpg"));
        builders.add(img("08_28_14.jpg"));
        builders.add(img("08_30_40.jpg"));
        builders.add(img("08_48_00.jpg"));
        builders.add(img("09_08_41.jpg"));
        builders.add(vid("CLIP0034_zagreb_graffiti.AVI").seconds("00:00:03", "00:00:50").as("CLIP0034-000003-000050.mp4"));
        builders.add(vid("CLIP0035_zagreb_graffiti.AVI"));
        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File salzburgZuerich(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/09_Salzburg_Zuerich";
        subTitle = "2012.08.09 Österreich und Schweiz - Salzburg und Zürich";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.09.oesterreich-und-schweiz.salzburg-und-zuerich");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Salzburg";
        builders.add(img("05_43_09.jpg"));
        builders.add(img("06_12_01.jpg"));
        builders.add(img("06_23_34.jpg"));
        builders.add(img("06_37_40.jpg"));
        builders.add(img("06_46_33.jpg"));
        builders.add(vid("CLIP0038_salzburg_360grad.AVI").seconds("00:00:00", "00:00:15"));
        detailTitle = "Innsbruck";
        builders.add(img("10_04_01.jpg"));
        builders.add(img("10_29_30.jpg"));
        builders.add(img("10_31_21.jpg"));
        builders.add(vid("CLIP0052_trainride_to_zuerich.AVI").seconds("00:00:05", "00:00:25"));
        detailTitle = "Zürich";
        builders.add(img("15_42_15.jpg"));
        builders.add(img("16_03_19.jpg"));
        builders.add(img("16_20_53.jpg"));
        builders.add(img("16_36_48.jpg"));
        builders.add(img("18_52_14.jpg"));
        builders.add(img("20_11_07.jpg"));
        builders.add(vid("CLIP0058_Zuerich_CNL_arrives.AVI").seconds("00:00:24", "00:00:40"));
        return yaFIMnle
                .of(builders)
//                .overlayMp3(new File(audio))
                .create();
    }
}
