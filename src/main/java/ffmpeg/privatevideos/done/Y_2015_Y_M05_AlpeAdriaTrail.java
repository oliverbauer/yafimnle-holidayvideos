package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2015_Y_M05_AlpeAdriaTrail extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2015_Y_M05_AlpeAdriaTrail();
        main.mainTitle = "2015.05 Alpe Adria Trail";
        main.run();
    }

    @Override
    protected void run() {
        // Last QS: 2025.12.21
        var f1 = part1(); // 2m58s
        var f2 = part2(); // 2m36s
        var f3 = part3(); // 2m05s
        var f4 = part4(); // 3m55s

        var joiner = new FFMpegJoiner();
        joiner.join("2015.05.alpa-adria-trail", f1, f2, f3, f4); // 11m35s
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public File part1() {
        sourceDir = "/media/oliver/Extreme SSD/2015/05_Alpe_Adria_Trail/10_kranjska_gora-trenta";
        subTitle = "Alpe Adria Trail (1/4) 10.05.2015";
        setup();

        detailTitle = "Kranjska Gora nach Trenta";
        var resultName = "2015.05.slowenien.alpe-adria-trail-day1";
        var yaFIMnle = new YaFIMnle(resultName);
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC_0431.NEF.jpg"));
        builders.add(img("DSC_0435.NEF.jpg"));
        builders.add(img("DSC_0437.NEF.jpg"));
        builders.add(img("DSC_0453.NEF.jpg"));
        builders.add(img("DSC_0459.NEF.jpg"));
        builders.add(vid("00079_10.05.2015_kranjska_gora_berge.avi"));
        builders.add(img("DSC_0478.NEF.jpg"));
        builders.add(img("DSC_0484.NEF.jpg"));
        builders.add(vid("00085_10.05.2015_kranjska_gora-trenta_harter_wanderweg.avi"));
        builders.add(img("DSC_0494.NEF.jpg"));
        builders.add(img("DSC_0496.NEF.jpg"));
        builders.add(img("DSC_0505.NEF.jpg"));
        builders.add(vid("00087_10.05.2015_berge.avi"));
        builders.add(img("DSC_0513.NEF.jpg"));
        builders.add(img("DSC_0530.NEF.jpg"));
        builders.add(img("DSC_0546.NEF.jpg"));
        builders.add(img("DSC_0596.NEF.jpg"));
        builders.add(vid("00094_10.05.2015_.avi"));
        builders.add(vid("00099_10.05.2015_socabruecke.avi").seconds("00:00:11", "00:00:26"));
        builders.add(img("DSC_0645.NEF.jpg"));
        return yaFIMnle.of(builders).create();
    }

    public File part2() {
        sourceDir = "/media/oliver/Extreme SSD/2015/05_Alpe_Adria_Trail/11_trenta_bovec";
        subTitle = "Alpe Adria Trail (2/4) 11.05.2015";
        setup();

        detailTitle = "Trenta nach Bovec";
        var resultName = "2015.05.slowenien.alpe-adria-trail-day2";
        var yaFIMnle = new YaFIMnle(resultName);
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC_0701.NEF.jpg"));
        builders.add(img("DSC_0712.NEF.jpg"));
        builders.add(img("DSC_0729.NEF.jpg"));
        builders.add(img("DSC_0745.NEF.jpg"));
        builders.add(img("DSC_0762.NEF.jpg"));
        builders.add(vid("00112_11.05.2015_blumenwiese_soca.avi").seconds("00:00:20", "00:00:38").as("00112_part1.mp4"));
        builders.add(vid("00112_11.05.2015_blumenwiese_soca.avi").seconds("00:00:57", "00:01:03").as("00112_part2.mp4"));
        builders.add(vid("00112_11.05.2015_blumenwiese_soca.avi").seconds("00:01:22", "00:01:27").as("00112_part3.mp4"));
        builders.add(vid("00112_11.05.2015_blumenwiese_soca.avi").seconds("00:01:39", "00:01:47").as("00112_part4.mp4"));
        builders.add(vid("00112_11.05.2015_blumenwiese_soca.avi").seconds("00:02:07", "00:02:21").as("00112_part5.mp4"));
        builders.add(img("DSC_0770.NEF.jpg"));
        builders.add(vid("00115_11.05.2015_socatal.avi").seconds("00:00:30", "00:00:52"));
        builders.add(img("DSC_0817.NEF.jpg"));
        builders.add(img("DSC_0822.NEF.jpg"));
        builders.add(img("DSC_0850.NEF.jpg"));
        builders.add(vid("00118_11.05.2015_socatal.avi"));
        builders.add(img("DSC_0895.NEF.jpg"));
        builders.add(vid("00123_11.05.2015_harter_wanderweg_kanufahrer.avi").seconds("00:00:00", "00:00:07").as("00123_part1.mp4"));
        builders.add(vid("00123_11.05.2015_harter_wanderweg_kanufahrer.avi").seconds("00:00:26", "00:00:34").as("00123_part2.mp4"));
        builders.add(img("DSC_0899.NEF.jpg"));
        builders.add(img("DSC_0919.NEF.jpg"));
        return yaFIMnle.of(builders).create();
    }

    public File part3() {
        sourceDir = "/media/oliver/Extreme SSD/2015/05_Alpe_Adria_Trail/12_bovec_kobarid";
        subTitle = "Alpe Adria Trail (3/4) 12.05.2015";
        setup();

        detailTitle = "Bovec nach Kobarid";
        var resultName = "2015.05.slowenien.alpe-adria-trail-day3";
        var yaFIMnle = new YaFIMnle(resultName);
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC_0948.NEF.jpg"));
        builders.add(img("DSC_0953.NEF.jpg"));
        builders.add(img("DSC_0955.NEF.jpg"));
        builders.add(img("DSC_0960.NEF.jpg"));
        builders.add(vid("00125_12.05.2015_sloweniens_hoechster_wasserfall.avi").seconds("00:00:00", "00:00:13"));
        builders.add(img("DSC_0972.NEF.jpg"));
        builders.add(img("DSC_0980.NEF.jpg"));
        builders.add(img("DSC_0016.NEF.jpg"));
        builders.add(img("DSC_0032.NEF.jpg"));
        builders.add(img("DSC_0048.NEF.jpg"));
        builders.add(img("DSC_0050.NEF.jpg"));
        builders.add(img("DSC_0053.NEF.jpg"));
        builders.add(img("DSC_0060.NEF.jpg"));
        builders.add(vid("00127_12.05.2015_NP_wasserfall.avi"));
        builders.add(img("DSC_0071.NEF.jpg"));
        builders.add(vid("00129_12.05.2015_soca_bruecke.avi"));
        builders.add(img("DSC_0089.NEF.jpg"));
        builders.add(img("DSC_0086.NEF.jpg"));
        return yaFIMnle.of(builders).create();
    }

    public File part4() {
        sourceDir = "/media/oliver/Extreme SSD/2015/05_Alpe_Adria_Trail/13_kobarid_tolmin";
        subTitle = "Alpe Adria Trail (4/4) 13.05.2015";
        setup();

        detailTitle = "Kobarid nach Tolmin";
        var resultName = "2015.05.slowenien.alpe-adria-trail-day4";
        var yaFIMnle = new YaFIMnle(resultName);
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSC_0099.NEF.jpg"));
        builders.add(img("DSC_0107.NEF.jpg"));
        builders.add(img("DSC_0143.NEF.jpg"));
        builders.add(vid("00131_13.05.2015_.avi"));
        builders.add(img("DSC_0153.NEF.jpg"));
        builders.add(img("DSC_0160.NEF.jpg"));
        builders.add(img("DSC_0175.NEF.jpg"));
        builders.add(img("DSC_0179.NEF.jpg"));
        builders.add(img("DSC_0184.NEF.jpg"));
        builders.add(vid("00132_13.05.2015_im_nationalpark.avi"));
        builders.add(img("DSC_0204.NEF.jpg"));
        return yaFIMnle.of(builders).create();
    }
}
