package ffmpeg.privatevideos;

import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.utils.CLI;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Applies different configurations to check if refactoring (use SNAPSHOT) is successful.
 *
 * Check manually /tmp/yafimnle
 * Runtime approx: 1m21s (without v1 which takes additional 1m20s)
 */
public class RefactoringCheck extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new RefactoringCheck();
        main.sourceDir = "/home/oliver/2017.05.31_Bovec_nach_Kobarid/";
        main.mainTitle = "Refactoring Test";
        main.destinationDir = "/tmp/yafimnle";
        main.run();
    }

    @Override
    protected void run() {
        long start;

//        start = System.currentTimeMillis();
//        v1(); // x264_normal_quality
//        long v1 = System.currentTimeMillis()-start;
        start = System.currentTimeMillis();
        v2(); // hw_h264_nvenc
        long v2 = System.currentTimeMillis()-start;

        start = System.currentTimeMillis();
        v3(); // hw_h264_no_transformation
        long v3 = System.currentTimeMillis()-start;

        start = System.currentTimeMillis();
        v4(); // hw_h265_hevc_no_transformation
        long v4 = System.currentTimeMillis()-start;


        start = System.currentTimeMillis();
        v5(); // hw_h264_nvenc with audio overlay
        long v5 = System.currentTimeMillis()-start;
    }

    private void v1() {
        CLI.exec("rm -rf /tmp/yafimnle/home", this);

        subTitle = "2017.05.31 (3/3) Bovec nach Kobarid";
        Presets.x264_normal_quality(sourceDir, destinationDir);
        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("x264_normal_quality");
        detailTitle = "Slap Virje x264_normal_quality";
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4").seconds("00:00:00", "00:00:04"));
        builders.add(img("07_00_11.jpg"));
        yaFIMnle.of(builders).create();
    }

    private void v2() {
        CLI.exec("rm -rf /tmp/yafimnle/home", this);

        subTitle = "2017.05.31 (3/3) Bovec nach Kobarid";
        Presets.hw_h264_nvenc(sourceDir, destinationDir);

        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("hw_h264_nvenc");
        detailTitle = "Slap Virje hw_h264_nvenc";
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4").seconds("00:00:00", "00:00:04"));
        builders.add(img("07_00_11.jpg"));
        yaFIMnle.of(builders).create();
    }

    private void v3() {
        CLI.exec("rm -rf /tmp/yafimnle/home", this);

        subTitle = "2017.05.31 (3/3) Bovec nach Kobarid";
        Presets.hw_h264_no_transformation(sourceDir, destinationDir);

        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("hw_h264_no_transformation");
        detailTitle = "Slap Virje hw_h264_no_transformation";
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4").seconds("00:00:00", "00:00:04"));
        builders.add(img("07_00_11.jpg"));
        yaFIMnle.of(builders).create();
    }

    private void v4() {
        CLI.exec("rm -rf /tmp/yafimnle/home", this);

        subTitle = "2017.05.31 (3/3) Bovec nach Kobarid";
        Presets.hw_h265_hevc_no_transformation(sourceDir, destinationDir);

        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("hw_h265_hevc_no_transformation");
        detailTitle = "Slap Virje hw_h265_hevc_no_transformation";
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4").seconds("00:00:00", "00:00:04"));
        builders.add(img("07_00_11.jpg"));
        yaFIMnle.of(builders).create();
    }

    private void v5() {
        CLI.exec("rm -rf /tmp/yafimnle/home", this);

        subTitle = "2017.05.31 (3/3) Bovec nach Kobarid";
        Presets.hw_h264_nvenc(sourceDir, destinationDir);

        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("hw_h264_nvenc_with_audio");
        detailTitle = "Slap Virje hw_h264_nvenc with audio overlay";
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4").seconds("00:00:00", "00:00:04"));
        builders.add(img("07_00_11.jpg"));
        yaFIMnle.of(builders)
                .overlayMp3(new File("/media/oliver/Extreme SSD/2012/08_Interrail_Europa/mp3/yt5s.com_-_Kristina_-_Pri_oltari_128_kbps.mp3"))
                .create();
    }
}
