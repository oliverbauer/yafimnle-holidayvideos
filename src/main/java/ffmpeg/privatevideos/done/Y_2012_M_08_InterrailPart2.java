package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;
import io.github.yafimnle.image.ar.AR;
import io.github.yafimnle.image.enums.Gravity;
import io.github.yafimnle.image.filter.ImageFilters;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2012_M_08_InterrailPart2 extends AbstractNewApproach {
    private static final String MAIN_TITLE = "August 2012\\: Interrail Europa Tour";

    public static void main(String[] args) {
        var main = new Y_2012_M_08_InterrailPart2();
        main.mainTitle = MAIN_TITLE;
        main.run();
    }

    @Override
    protected void run() {
        var f1 = paris("/home/oliver/ffmpeg-video-gen/mp3/french/Stromae-tous_les_memes-cutted.mp3");
        var f2 = monaco("/media/oliver/Extreme SSD/2012/08_Interrail_Europa/mp3/Jude_York_-_Monaco.mp3");
        var f3 = marseille("/home/oliver/ffmpeg-video-gen/mp3/Indila_-_Dernière_Danse.mp3");
        var f4 = sansebastian("/home/oliver/ffmpeg-video-gen/mp3/latin/Maluma-Corazon-cutted.mp3");
        var f5 = lissabon("/home/oliver/ffmpeg-video-gen/mp3/latin/Carminho-As_Pedras_Da_Minha_Rua-cutted.mp3");
        var f6 = madrid("/home/oliver/ffmpeg-video-gen/mp3/AnaMoura-Ninharia.mp3");
        var f7 = valenciaalicante("/home/oliver/ffmpeg-video-gen/mp3/spain/Enrique_Iglesias_SUBEME_LA_RADIO.mp3");

        var joiner = new FFMpegJoiner();
        joiner.join("2012.08.interrail-part02", f1, f2, f3, f4, f5, f6, f7);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public File paris(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/11_Paris/";
        subTitle = "2012.08.11 Frankreich - Paris";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.11.frankreich.paris");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Thalys von Köln nach Paris";
        builders.add(vid("CLIP0001_Thalys_arrives_in_cologne.AVI")
                .seconds("00:00:00", "00:00:08")
                .as("CLIP0001-000000-000008.mp4"));
        builders.add(vid("CLIP0001_Thalys_arrives_in_cologne.AVI").seconds("00:00:20", "00:00:26").as("CLIP0001-000020-000026.mp4"));
        builders.add(vid("CLIP0002_Thalys_through_Liege_guileemins.AVI").seconds("00:00:54", "00:01:04").as("CLIP0002-000054-000104.mp4"));
        builders.add(vid("CLIP0007_Thalys.AVI").seconds("00:02:35", "00:02:45").as("CLIP0007-000235-000245.mp4"));
        detailTitle = "Gare du Nord";
        builders.add(img("DSCI0007.jpg").ar(AR.blur(20)));
        builders.add(vid("CLIP0008_Paris_Gare_du_Nord_180grad.AVI"));
        detailTitle = "";
        builders.add(img("DSCI0012.jpg").ar(AR.superzoom()));
        builders.add(img("DSCI0015.jpg"));
        builders.add(img("DSCI0017.jpg"));
        builders.add(img("DSCI0022.jpg"));
        builders.add(vid("CLIP0009_Paris_180grad.AVI"));
        builders.add(img("DSCI0027.jpg"));
        detailTitle = "Place de la Concorde - Obelisk von Luxor";
        builders.add(vid("CLIP0010_Paris_360grad.AVI"));
        detailTitle = "Arc de Triomphe de l’Étoile";
        builders.add(img("DSCI0037.jpg"));
        builders.add(img("DSCI0039.jpg").ar(AR.crop(Gravity.SOUTH, false)));
        builders.add(vid("CLIP0011_Paris_an_diesem_Turm.AVI").seconds("00:00:07", "00:00:14").as("CLIP0011-000007-000014.mp4"));
        detailTitle = "Eiffelturm";
        builders.add(
                img("DSCI0041.jpg")
                        .appendImageFilterBeforeCrop(ImageFilters.extend()) // "fromPortrait"
        );
        builders.add(
                img("DSCI0045.jpg")
                        .appendImageFilterBeforeCrop(ImageFilters.rotate(90))
                        .appendImageFilterBeforeCrop(ImageFilters.extend()) // "fromPortrait"
        );
        detailTitle = "";
        builders.add(img("DSCI0056.jpg"));
        builders.add(img("DSCI0058.jpg").ar(AR.crop(Gravity.SOUTH, false)));
        builders.add(img("DSCI0067.jpg").ar(AR.crop(Gravity.SOUTH, false)));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File monaco(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/12_Monaco_Nizza_Cannes_Cassis_Marseille/";
        subTitle = "2012.08.11 Monaco - Monaco";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.12.monaco");

        // TODO DSCI0119.jpg aufnehmen (landscape ggf rotate) + DSCI0143.jpg +
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Monte Carlo";
        builders.add(vid("CLIP0018_Train_leaving_Monaco.AVI").seconds("00:00:06", "00:00:11"));
        builders.add(img("DSCI0097.jpg"));
        builders.add(img("DSCI0102.jpg"));
        builders.add(img("DSCI0106.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("DSCI0108.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("DSCI0110.jpg").ar(AR.blur(20)));
        builders.add(img("DSCI0114.jpg"));
        builders.add(img("DSCI0122.jpg").ar(AR.blur(20)));
        builders.add(img("DSCI0125.jpg"));
        builders.add(img("DSCI0127.jpg"));
        builders.add(img("DSCI0129.jpg"));
        builders.add(vid("CLIP0020_Monaco_Casino.AVI").seconds("00:00:03", "00:00:12").as("CLIP0020-000003-000012.mp4"));
        builders.add(vid("CLIP0020_Monaco_Casino.AVI").seconds("00:00:28", "00:00:40").as("CLIP0020-000028-000040.mp4"));
        builders.add(img("DSCI0137.jpg").ar(AR.blur(20)));
        builders.add(img("DSCI0141.jpg"));
        detailTitle = "Cannes";
        builders.add(img("DSCI0170.jpg"));
        builders.add(vid("CLIP0021_Cannes.AVI").seconds("00:00:19", "00:00:31"));
        builders.add(img("DSCI0152.jpg"));
        builders.add(img("DSCI0158.jpg"));
        builders.add(vid("CLIP0022_Cannes.AVI").seconds("00:00:07", "00:00:15"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File marseille(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/13_Marseille/";
        subTitle = "2012.08.13 Frankreich - Marseille";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.13.frankreich.marseille");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Marseille";
        builders.add(img("08_29_30.jpg"));
        builders.add(img("08_31_49.jpg"));
        builders.add(img("09_14_56.jpg"));
        builders.add(img("09_19_47.jpg"));
        builders.add(img("10_14_45.jpg"));
        builders.add(img("10_01_26.jpg"));
//                builders.add(img("10_18_35-1080p.jpg"));
        builders.add(img("10_28_40.jpg"));
//                builders.add(img("10_28_54-1080p.jpg"));
//                        builders.add(vid("CLIP0031_Marseille.AVI").seconds("00:00:35", "00:00:49").as("CLIP0031-0035-0049.mp4"));
//                builders.add(img("11_01_44-1080p.jpg"));
        builders.add(img("11_06_39.jpg"));
        builders.add(img("11_21_54.jpg"));
        builders.add(img("10_17_09.jpg"));
        builders.add(vid("CLIP0032_Marseille_from_the_Catedral.AVI").seconds("00:00:15", "00:00:56").as("CLIP0032-000015-000056.mp4"));
        builders.add(img("11_57_28.jpg"));
        builders.add(img("11_59_48.jpg"));
        builders.add(img("12_02_22.jpg"));
        //img("12_04_41-1080p.jpg"));
        builders.add(vid("CLIP0033_Marseille_Moschee.AVI"));
        //img("13_05_14-1080p.jpg"));
        //img("14_49_46-1080p.jpg"));
        builders.add(img("15_08_59.jpg"));
        //img("15_16_46-1080p.jpg"));
        builders.add(img("15_16_55.jpg"));
        builders.add(img("15_21_58.jpg"));
        builders.add(img("15_22_07.jpg"));
        builders.add(img("15_22_14.jpg"));
        builders.add(img("15_22_20.jpg"));
        builders.add(vid("CLIP0040_Marseille_on_top_of_Hills_to_Calanques.AVI").seconds("00:00:09", "00:00:15").as("CLIP0040-000009-000015.mp4"));
        builders.add(vid("CLIP0040_Marseille_on_top_of_Hills_to_Calanques.AVI").seconds("00:00:22", "00:00:32").as("CLIP0050-000022-000032.mp4"));
        //img("15_22_27-1080p.jpg"));
        builders.add(img("15_22_39.jpg"));
        //img("15_26_08-1080p.jpg"));
        builders.add(img("15_29_09.jpg"));
        //img("15_55_24-1080p.jpg"));
        builders.add(img("15_55_33.jpg"));
        builders.add(img("16_05_00.jpg"));
        builders.add(vid("CLIP0041_Marseille_Calanques.AVI").seconds("00:00:00", "00:00:04").as("CLIP0041-000000-000004.mp4"));
        builders.add(vid("CLIP0041_Marseille_Calanques.AVI").seconds("00:00:10", "00:00:15").as("CLIP0041-000010-000015.mp4"));
        builders.add(vid("CLIP0041_Marseille_Calanques.AVI").seconds("00:00:22", "00:00:37").as("CLIP0041-000022-000037.mp4"));
        //img("16_20_28-1080p.jpg"));
        builders.add(img("16_20_34.jpg"));
        builders.add(img("16_31_36.jpg"));
        //img("16_32_02-1080p.jpg")
        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File sansebastian(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/14_Irun_San_Sebastian/";
        subTitle = "2012.08.14 Spanien - San Sebastian";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.14.spanien.sansebastian");

        // TODO aufnhemen 12_59_53.jpg landscape ggf. rotate + 13_22_33.jpg + 15_44_32.jpg + 21_52_57.jpg
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise";
        builders.add(img("10_41_57.jpg"));
        builders.add(vid("CLIP0047_Trainride_to_Irun.AVI").seconds("00:01:38", "00:01:58").as("CLIP0047-000138-000158.mp4"));
        builders.add(img("10_44_32.jpg"));
        builders.add(img("11_07_10.jpg"));
        builders.add(img("11_46_42.jpg"));
        detailTitle = "San Sebastian";
        builders.add(img("13_01_17.jpg"));
        builders.add(img("13_04_24.jpg"));
        builders.add(vid("CLIP0053_San_Sebastian.AVI"));
        builders.add(img("13_18_18.jpg").ar(AR.blur(20)));
        builders.add(img("13_34_04.jpg"));
        builders.add(img("13_38_06.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("13_45_22.jpg"));
        builders.add(img("14_00_24.jpg"));
        builders.add(img("14_27_26.jpg"));
        builders.add(img("14_27_57.jpg"));
        builders.add(vid("CLIP0054_San_Sebastian.AVI"));
        builders.add(img("15_20_15.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("16_01_32.jpg").ar(AR.crop(Gravity.SOUTH)));
        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File lissabon(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/15_Lissabon/";
        subTitle = "2012.08.15 Portugal - Lissabon";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.15.portugal.lissabon");

        // TODO aufnehmen landscape ggf. rotate 15_00_52.jpg + 15_04_11.jpg + 17_00_02.jpg
        // TODO schönes beispiel 19_51_30.jpg für erst unten was abschneiden und dann neu skalieren?
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise";
        builders.add(vid("CLIP0056_Trainride_to_Lissabon.AVI")
                .seconds("00:00:11", "00:00:18")
                .as("CLIP0056-000011-000018.mp4"));
        builders.add(img("11_21_11.jpg"));//.comment(" "));
        builders.add(img("12_00_01.jpg"));
        builders.add(img("12_26_17.jpg"));
        builders.add(img("12_27_34.jpg"));
        builders.add(img("13_59_38.jpg"));
        builders.add(img("14_01_54.jpg"));
        builders.add(img("14_15_51.jpg"));
        builders.add(img("14_29_26.jpg"));
        builders.add(vid("CLIP0059_Lissabon_local_Tram.AVI").seconds("00:00:28", "00:00:48").as("CLIP0059-000028-000048.mp4"));
        builders.add(img("14_31_15.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("14_31_22.jpg"));
        builders.add(img("14_46_36.jpg").ar(AR.blur(20)));
        builders.add(img("14_59_35.jpg"));
        builders.add(img("15_00_46.jpg"));
        builders.add(img("15_15_18.jpg"));
        builders.add(vid("CLIP0060_Lisboa_360grad.AVI").seconds("00:00:00", "00:00:40").as("CLIP0060-000000-000040.mp4"));
        builders.add(vid("CLIP0068_Lisboa_local_tram.AVI").seconds("00:00:00", "00:00:08").as("CLIP0068-000000-000008.mp4"));
        builders.add(vid("CLIP0069_Lisboa_local_tram.AVI").seconds("00:00:00", "00:00:10").as("CLIP0069-000000-000010.mp4"));
        builders.add(vid("CLIP0069_Lisboa_local_tram.AVI").seconds("00:00:26", "00:00:46").as("CLIP0069-000026-000046.mp4"));
        builders.add(img("15_52_26.jpg"));
        builders.add(img("15_59_00.jpg"));
        builders.add(img("16_36_14.jpg"));
        builders.add(img("16_42_52.jpg"));
        builders.add(img("16_43_51.jpg"));
        builders.add(img("16_47_59.jpg"));
        builders.add(vid("CLIP0070_Lisboa.AVI"));
        builders.add(img("17_19_29.jpg"));
        builders.add(img("17_51_00.jpg"));
        builders.add(img("18_41_06.jpg"));
        builders.add(img("19_11_32.jpg"));
        builders.add(vid("CLIP0071_Lisboa_See.AVI").seconds("00:00:25", "00:00:57").as("CLIP0071-000025-000057.mp4"));
        builders.add(img("20_13_21.jpg"));
        builders.add(vid("CLIP0075_Lisboa_mist_tram.AVI").seconds("00:00:28", "00:00:38").as("CLIP0075-000028-000038.mp4"));
        builders.add(img("19_02_22.jpg"));
        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File madrid(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/16_Madrid/";
        subTitle = "2012.08.16 Spanien - Madrid";
        setup();

        // TODO aufnhemen rotate/landscape 11_43_00.jpg + 12_03_27.jpg +

        var yaFIMnle = new YaFIMnle("2012.08.16.spanien.madrid");

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Anreise";
        builders.add(vid("CLIP0076_trainride_to_madrid.AVI")
                .seconds("00:01:57", "00:02:08")
                .as("CLIP0076-000157-000208.mp4"));
        builders.add(vid("CLIP0076_trainride_to_madrid.AVI").seconds("00:06:25", "00:06:30").as("CLIP0076-000630-000635.mp4"));
        detailTitle = "Estación de Madrid Chamartín - Clara Campoamor";
        builders.add(img("09_16_08.jpg"));
        detailTitle = "Plaza de Castilla";
        builders.add(img("09_31_42.jpg").ar(AR.enlargeByColor()));
        builders.add(img("10_32_50.jpg"));
        builders.add(img("11_09_35.jpg"));
        builders.add(vid("CLIP0081_madrid_brunnen.AVI").seconds("00:00:00", "00:00:07").as("CLIP0081-000000-000007.mp4"));
        builders.add(img("11_32_21.jpg"));
        builders.add(img("11_36_44.jpg"));
        detailTitle = "Plaza de Cibeles";
        builders.add(img("12_02_02.jpg"));
        builders.add(img("12_02_55.jpg"));
        builders.add(img("12_07_02.jpg"));
        builders.add(vid("CLIP0085_madrid_180grad.AVI"));
        detailTitle = "";
        builders.add(img("12_17_34.jpg"));
        detailTitle = "Madrid Puerta de Atocha - Almudena Grandes";
        builders.add(img("12_39_26.jpg"));
        builders.add(vid("CLIP0089_madrid_atocha_360grad.AVI").seconds("00:00:00", "00:00:20").as("CLIP0089-000000-000020.mp4"));
        builders.add(img("12_53_37.jpg"));
        builders.add(vid("CLIP0090_madrid_atocha_schildkroeten.AVI").seconds("00:00:00", "00:00:28").as("CLIP0090-000000-000028.mp4"));
        detailTitle = "";
        builders.add(img("13_10_51.jpg"));
        builders.add(img("14_04_42.jpg"));
        builders.add(vid("CLIP0091_madrid_360grad.AVI").seconds("00:00:00", "00:00:10").as("CLIP0091-000000-000010.mp4"));
        builders.add(img("14_23_57.jpg")); // Palacio Real?
        builders.add(img("14_24_11.jpg"));
        builders.add(img("14_33_19.jpg"));
        builders.add(vid("CLIP0092_madrid_360grad_mit_live_music.AVI").seconds("00:00:00", "00:01:12").as("CLIP0092-000000-000112.mp4"));
        builders.add(img("15_09_21.jpg"));
        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

    public File valenciaalicante(String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/17_Alicante_Valencia/";
        subTitle = "2012.08.17 Spanien - Alicante und Valencia";
        setup();

        var yaFIMnle = new YaFIMnle("2012.08.17.spanien.valencia.alicante");

        // TODO aufnhmen landscape/rotate 17_04_52.jpg + 16_37_44.jpg

        List<Builder> builders = new ArrayList<>();
        detailTitle = "Alicante";
        builders.add(img("09_54_05.jpg"));
        builders.add(img("09_57_50.jpg"));
        builders.add(img("10_08_54.jpg"));
        builders.add(img("10_10_08.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("10_14_37.jpg"));
        builders.add(img("10_14_54.jpg"));
        builders.add(img("10_23_30.jpg"));
        builders.add(img("11_11_35.jpg"));
        builders.add(img("12_12_22.jpg"));
        detailTitle = "Anreise nach Valencia";
        builders.add(vid("CLIP0099.AVI").seconds("00:00:23", "00:00:30").as("CLIP0099-000023-000030.mp4"));
        builders.add(vid("CLIP0102_zugfahrt.AVI").seconds("00:00:00", "00:00:05").as("CLIP0102-000000-000005.mp4"));
        builders.add(vid("CLIP0102_zugfahrt.AVI").seconds("00:01:45", "00:01:50").as("CLIP0102-000145-000150.mp4"));
        builders.add(vid("CLIP0102_zugfahrt.AVI").seconds("00:02:45", "00:02:55").as("CLIP0102-000245-000255.mp4"));
        detailTitle = "Valencia";
        builders.add(img("16_00_28.jpg"));
        builders.add(img("16_31_06.jpg"));
        builders.add(img("16_36_05.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("16_37_36.jpg").ar(AR.blur(20)));
        builders.add(vid("CLIP0103_springbrunnen.AVI"));
        builders.add(img("16_42_59.jpg"));
        builders.add(img("19_01_42.jpg"));
        builders.add(img("19_13_21.jpg"));
        builders.add(img("19_21_38.jpg"));
        builders.add(vid("CLIP0104_valencia_springbrunnen.AVI"));
        builders.add(img("19_37_20.jpg"));
        builders.add(vid("CLIP0106_valencia_180grad_architektur.AVI"));
        builders.add(img("19_42_48.jpg").ar(AR.crop(Gravity.SOUTH)));
        builders.add(img("19_46_11.jpg").ar(AR.superzoom()));
        builders.add(img("19_54_12.jpg"));
        builders.add(img("21_33_11.jpg"));
        builders.add(img("22_12_50.jpg"));
        builders.add(vid("CLIP0109_valencia_at_night_360grad.AVI"));

        return yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }

/* TODO Needs rewrite
    public void barcelona(String path18, String path19, String path20, String audio) {
        sourceDir = "/media/oliver/Extreme SSD/2012/08_Interrail_Europa/18_Barcelona/";
        subTitle = "2012.08.18-20 Spanien - Barcelona";
        setup();

        var resultName = "2012.08.181920.spanien.barcelona";

        var h264 = new YaFIMnle(resultName);

        List<Builder> builders = new ArrayList<>();

        h264.of(
                img(path18, "10_42_38.jpg"));
                        //.title("2012.08.18-20 Spanien - Barcelona")
                        //.comment("Barcelona"));
                img(path19, "09_12_41.jpg"));
                img(path19, "09_50_09.jpg"));
                img(path20, "08_59_52.jpg"));
                img(path20, "09_41_40.jpg"));
                img(path20, "10_47_00.jpg"));
                img(path20, "10_47_42.jpg"));
                img(path20, "12_03_47.jpg"));
                img(path20, "11_53_49.jpg"));
                img(path20, "12_05_05.jpg").ar(AR.crop(Gravity.SOUTH)),
                img(path20, "12_44_29.jpg").ar(AR.crop(Gravity.SOUTH)),
                img(path20, "12_55_54.jpg").ar(AR.crop(Gravity.SOUTH)),
                img(path20, "13_28_04.jpg"));
                //img(path20, "15_20_50.jpg"));
                h264.vid(path18, "CLIP0131_barcelona_360grad_Arc_del_Triomf_am_Passeig_de_Lluis_Companys.AVI").seconds("00:00:00", "00:00:29"));
                img(path20, "15_24_54.jpg"));
                img(path20, "15_31_10.jpg"));
                img(path20, "15_34_17.jpg"));
                img(path20, "15_36_54.jpg"));
                img(path20, "15_37_27.jpg"));
                h264.vid(path18, "CLIP0132_barcelona_Ciutadella_Park.AVI"));
                h264.vid(path18, "CLIP0134_barcelona_Ciutadella_Park.AVI").seconds("00:00:00", "00:00:20"));
                //img(path20, "16_51_29.jpg"));
                img(path20, "20_18_39.jpg"));
                //img(path20, "20_31_25.jpg"));
                h264.vid(path18, "CLIP0135__Barcelona_Live_music.AVI").seconds("00:00:25", "00:01:10").as("CLIP0135-000025-000110.mp4"));
                img(path19, "20_58_34.jpg"));
                img(path19, "21_03_41.jpg").ar(AR.blur(20)),
                img(path19, "21_23_55.jpg").ar(AR.crop(Gravity.SOUTH)),
                img(path18, "22_55_24.jpg"));
                img(path18, "23_08_54.jpg"));
                h264.vid(path18, "CLIP0111_Barcelona_n8_brunnen.AVI").seconds("00:00:24", "00:00:50")
               yaFIMnle
                .of(builders)
                .overlayMp3(new File(audio))
                .create();
    }
 */

}
