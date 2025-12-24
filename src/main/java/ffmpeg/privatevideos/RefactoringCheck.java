package ffmpeg.privatevideos;

import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.utils.CLI;

import java.util.ArrayList;
import java.util.List;

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

        start = System.currentTimeMillis();
        v1(); // x264_normal_quality
        long v1 = System.currentTimeMillis()-start;

        start = System.currentTimeMillis();
        v2(); // hw_h264_nvenc
        long v2 = System.currentTimeMillis()-start;

        start = System.currentTimeMillis();
        v3(); // hw_h264_no_transformation
        long v3 = System.currentTimeMillis()-start;

        start = System.currentTimeMillis();
        v4(); // hw_h265_hevc_no_transformation
        long v4 = System.currentTimeMillis()-start;



    }

    private void v1() {
        CLI.exec("rm -rf /tmp/yafimnle/home", this);

        subTitle = "2017.05.31 (3/3) Bovec nach Kobarid";
        Presets.x264_normal_quality(sourceDir, destinationDir);
        List<Builder> builders = new ArrayList<>();
        var yaFIMnle = new YaFIMnle("x264_normal_quality");
        detailTitle = "Slap Virje";
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
        detailTitle = "Slap Virje";
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
        detailTitle = "Slap Virje";
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
        detailTitle = "Slap Virje";
        builders.add(img("06_57_39.jpg"));
        builders.add(vid("06_58_23.mp4").seconds("00:00:00", "00:00:04"));
        builders.add(img("07_00_11.jpg"));
        yaFIMnle.of(builders).create();
    }

}
