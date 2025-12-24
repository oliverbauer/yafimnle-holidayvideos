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

public class Y_2024_M_04_Klammen_in_Bayern_und_Oesterreich extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2024_M_04_Klammen_in_Bayern_und_Oesterreich();
        main.mainTitle = "Klammen in Bayern und Österreich";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20240427();
        var f2 = gen20240428();
        var f3 = gen20240429();
        var f4 = gen20240430();
        var f5 = gen20240501();

        var joiner = new FFMpegJoiner();
        joiner.join(
                "2024.04+05.klammen-in-bayern-und-oesterreich",
                f1, f2, f3, f4, f5
        );
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20240501() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.05.01_koessen_eibenschlucht_schmugglerweg_und_entenlochklamm/";
        subTitle = "2024.05.01 Österreich - Tirol";
        setup();

        var yaFIMnle = new YaFIMnle("2024.05.01");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Schmugglerweg und Entenlochklamm bei Kössen";
        builders.add(img("DSCN1005.JPG"));
        builders.add(img("DSCN1010.JPG"));
        builders.add(vid("GX010530.MP4").seconds("00:00:00", "00:00:10").as("GX010530-000000-000010.mp4"));
        builders.add(vid("GX010531.MP4"));
        builders.add(vid("GX010534.MP4"));
        builders.add(img("DSCN1022.JPG"));
        builders.add(img("DSCN1024.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240430() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.04.30_schneizelreuth_weißbach_wasserfall_reit_im_winkel/";
        subTitle = "2024.04.30 Deutschland - Bayern";
        setup();

        var yaFIMnle = new YaFIMnle("2024.04.30");
        List<Builder> builders = new ArrayList<>();
        subTitle = "Weißenbach Wasserfall bei Inzell";
        builders.add(img("DSCN0958.JPG"));
        builders.add(img("DSCN0960.JPG"));
        builders.add(vid("GX010514.MP4").seconds("00:00:00", "00:00:10").as("GX010514-000000-000010.mp4"));
        builders.add(vid("GX010515.MP4").seconds("00:00:55", "00:01:04").as("GX010515-000055-000104.mp4"));
        builders.add(img("DSCN0966.JPG"));
        builders.add(vid("GX010516.MP4"));
        builders.add(vid("GX010517.MP4"));
        builders.add(vid("GX010519.MP4"));
        builders.add(img("DSCN0978.JPG"));
        builders.add(img("DSCN0980.JPG"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240429() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.04.29_bluntautal_lammerklamm/";
        subTitle = "2024.04.29 Österreich - Salzburger Land";
        setup();

        var yaFIMnle = new YaFIMnle("2024.04.29");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Bluntautal mit Wasserfall bei Golling";
        builders.add(img("DSCN0861.JPG"));
        builders.add(img("DSCN0862.JPG"));
        builders.add(vid("GX010496.MP4").seconds("00:00:07", "00:00:16").as("GX010496-000007-000016.mp4"));
        builders.add(vid("GX010496.MP4").seconds("00:00:34", "00:00:54").as("GX010496-000034-000054.mp4"));
        builders.add(img("DSCN0877.JPG"));
        builders.add(vid("GX010499.MP4"));
        builders.add(img("DSCN0890.JPG"));
        builders.add(vid("GX010502.MP4"));
        builders.add(img("DSCN0909.JPG"));
        detailTitle = "Lammer Klamm bei Oberscheffau";
        builders.add(vid("GX010503.MP4"));
        builders.add(img("DSCN0923.JPG"));
        builders.add(img("DSCN0926.JPG"));
        builders.add(vid("GX010508.MP4").seconds("00:00:00", "00:00:15").as("GX010508-000000-000015.mp4"));
        builders.add(vid("GX010508.MP4").seconds("00:00:40", "00:00:55").as("GX010508-000040-000055.mp4"));
        builders.add(img("DSCN0936.JPG"));
        builders.add(vid("GX010511.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240427() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.04.27_kesselgraben_wasserfall_kruen_huettlebachklamm/";
        subTitle = "2024.04.27 Deutschland - Bayern";
        setup();

        var yaFIMnle = new YaFIMnle("2024.04.27");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Kesselgraben Wasserfall bei Garmisch-Partenkirchen";
        builders.add(img("DSCN0788.JPG"));
        builders.add(img("DSCN0789.JPG"));
        builders.add(vid("GX010468.MP4").seconds("00:00:00", "00:00:05").as("GX010468-000000-000005.mp4"));
        builders.add(vid("GX010468.MP4").seconds("00:00:26", "00:00:32").as("GX010468-000026-000032.mp4"));
        builders.add(img("DSCN0790.JPG"));
        builders.add(vid("GX010470.MP4").seconds("00:00:00", "00:00:15").as("GX010470-000000-000015.mp4"));
        builders.add(vid("GX010471.MP4").seconds("00:00:00", "00:00:06").as("GX010471-000000-000006.mp4"));
        builders.add(img("DSCN0805.JPG"));
        detailTitle = "Hüttlebachklamm bei Krün";
        builders.add(img("DSCN0808.JPG"));
        builders.add(vid("GX010480.MP4"));
        builders.add(img("DSCN0812.JPG"));
        builders.add(vid("GX010481.MP4"));
        return yaFIMnle.of(builders).create();
    }

    private File gen20240428() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.04.28_ehnbachklamm/";
        subTitle = "2024.04.28 Österreich - Tirol";
        setup();

        var yaFIMnle = new YaFIMnle("2024.04.28");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Ehnbachklamm in Zirl bei Innsbruck";
        builders.add(img("DSCN0817.JPG").fadeType(FadeType.FADE));
        builders.add(img("DSCN0820.JPG"));
        builders.add(vid("GX010484.MP4"));
        builders.add(img("DSCN0830.JPG").fadeType(FadeType.WIPELEFT));
        builders.add(vid("GX010486.MP4").seconds("00:00:05", "00:00:20").as("GX010486-000005-000020.mp4"));
        builders.add(vid("GX010486.MP4").seconds("00:00:48", "00:01:10").as("GX010486-000048-000110.mp4"));
        builders.add(img("DSCN0832.JPG"));
        builders.add(vid("GX010488.MP4").seconds("00:00:30", "00:00:50").as("GX010488-000030-000050.mp4"));
        builders.add(img("DSCN0839.JPG"));
        builders.add(img("DSCN0847.JPG"));
        builders.add(vid("GX010490.MP4"));
        builders.add(vid("GX010492.MP4"));
        builders.add(vid("GX010493.MP4").seconds("00:00:00", "00:00:10").as("GX010493-000000-000010.mp4"));
        builders.add(img("DSCN0854.JPG"));
        return yaFIMnle.of(builders).create();
    }
}
