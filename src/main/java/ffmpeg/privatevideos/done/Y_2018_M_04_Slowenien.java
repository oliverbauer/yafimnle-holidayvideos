package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;
import io.github.yafimnle.image.ar.AR;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2018_M_04_Slowenien extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2018_M_04_Slowenien();
        main.mainTitle = "April 2018 Frühling in den Alpen";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20180421fuessen();
        var f2 = gen20180422bohinKobarid();
        var f3 = gen20180423tolmin();
        var f4 = gen20180424();
        var f5 = gen20180425gozd();

        var joiner = new FFMpegJoiner();
        joiner.join("2018.04.fruehling-in-slowenien", f1, f2, f3, f4, f5);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20180425gozd() {
        sourceDir = "/media/oliver/Extreme SSD/2018/04/25_gozd_martuljek/";
        subTitle = "2018.04.25 Gozd Martuljek";
        setup();

        var yaFIMnle = new YaFIMnle("2018.04.25.gozd.martuljek");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Gozd Martuljek";
        builders.add(vid("738.MP4"));
        builders.add(img("739.JPG"));
        builders.add(vid("740.MP4"));
        builders.add(img("742.JPG"));
        builders.add(img("743.JPG"));
        builders.add(vid("746.MP4"));
        builders.add(vid("748.MP4"));
        builders.add(vid("752.MP4"));
        builders.add(img("758.JPG"));
        builders.add(vid("768.MP4"));
        builders.add(vid("776.MP4"));
        builders.add(img("781.JPG"));
        builders.add(vid("786.MP4"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20180424() {
        sourceDir = "/media/oliver/Extreme SSD/2018/04/24/";
        subTitle = "2018.04.24";
        setup();

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Zugfahrt nach Most na Soci";
        var yaFIMnle = new YaFIMnle("2018.04.24");
        builders.add(vid("00251.MTS").seconds("00:00:23", "00:00:43"));
        builders.add(vid("00253.MTS").seconds("00:00:00", "00:00:10").as("00253-000000-000010.mp4"));
        builders.add(vid("00253.MTS").seconds("00:01:50", "00:02:08").as("00253-000150-000208.mp4"));
        builders.add(vid("713.MP4").seconds("00:00:13", "00:00:27").as("713-000013-000027.mp4"));
        builders.add(img("716.JPG"));
        builders.add(img("719.JPG"));
        builders.add(vid("721.MP4"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20180423tolmin() {
        sourceDir = "/media/oliver/Extreme SSD/2018/04/23_tolmin/";
        subTitle = "2018.04.24 Tolmin";
        setup();

        List<Builder> builders = new ArrayList<>();

        var yaFIMnle = new YaFIMnle("2018.04.23.tolmin");
        detailTitle = "Tolmin";
        builders.add(img("645.JPG"));
        builders.add(vid("649.MP4"));
        builders.add(img("654.JPG"));
        builders.add(img("656.JPG"));
        builders.add(vid("661.MP4"));
        builders.add(img("665.JPG"));
        builders.add(vid("664.MP4"));
        builders.add(img("674.JPG"));
        builders.add(vid("672.MP4"));
        builders.add(img("686.JPG"));
        builders.add(img("691.JPG"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20180422bohinKobarid() {
        sourceDir = "/media/oliver/Extreme SSD/2018/04/22_bohin_kobarid/";
        subTitle = "2018.04.22 Bled Bohin und Kobarid";
        setup();

        var yaFIMnle = new YaFIMnle("2018.04.22.kobarid");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Bled";
        builders.add(vid("562.MP4"));
        builders.add(img("561.JPG"));

        detailTitle = "Bohin See";
        builders.add(img("589.JPG"));
        builders.add(vid("590.MP4"));
        builders.add(img("593.JPG").ar(AR.blur(20)));

        detailTitle = "Cerkev Sv. Janeza Krstnika";
        builders.add(img("600.JPG"));
        detailTitle = "Skigebiet Vogel";
        builders.add(vid("575.MP4"));
        builders.add(img("579.JPG"));
        builders.add(vid("583.MP4"));
        builders.add(img("586.JPG"));
        detailTitle = "Anreise Most na Soci";
        builders.add(img("612.JPG"));
        builders.add(vid("617.MP4"));
        builders.add(vid("622.MP4"));
        detailTitle = "Most na Soci";
        builders.add(img("626.JPG"));
        detailTitle = "Kobarid";
        builders.add(img("630.JPG"));
        builders.add(img("633.JPG"));
        builders.add(img("635.JPG"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20180421fuessen() {
        sourceDir = "/media/oliver/Extreme SSD/2018/04/21_fuessen/";
        subTitle = "2018.04.21 Füssen";
        setup();

        var yaFIMnle = new YaFIMnle("2018.04.21.fuessen");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Altstadt von Füssen";
        builders.add(img("493.JPG").ar(AR.blur(20)));
        builders.add(vid("495.MP4"));
        detailTitle = "Lechfall";
        builders.add(img("496.JPG").ar(AR.blur(20)));
        builders.add(vid("497.MP4"));
        detailTitle = "";
        builders.add(img("498.JPG"));
        detailTitle = "Schwansee";
        builders.add(vid("508.MP4").seconds("00:00:00", "00:00:23"));
        builders.add(img("510.JPG"));
        detailTitle = "Schloss Hohenschwangau";
        builders.add(img("512.JPG").ar(AR.appendFlipped(20)));
        detailTitle = "";
        builders.add(img("519.JPG"));
        detailTitle = "Ammergebirge";
        builders.add(vid("521.MP4"));
        builders.add(img("526.JPG"));
        builders.add(vid("530.MP4").seconds("00:00:00", "00:00:06").as("530-part1.mp4"));
        builders.add(vid("530.MP4").seconds("00:00:34", "00:00:49").as("530-part2.mp4"));
        builders.add(img("540.JPG"));
        builders.add(vid("541.MP4"));
        builders.add(img("545.JPG"));
        builders.add(vid("547.MP4"));
        builders.add(img("549.JPG"));
        builders.add(vid("551.MP4"));
        detailTitle = "";
        builders.add(img("557.JPG").ar(AR.appendFlipped(20)));
        detailTitle = "Nachtzug nach Slowenien";
        builders.add(img("559.JPG"));

        return yaFIMnle.of(builders).create();
    }
}
