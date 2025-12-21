package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_07_D_18_Witten_Elbschetal extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_07_D_18_Witten_Elbschetal();
        main.mainTitle = "2025.07.18 Sommerwanderung";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    protected void run() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.07.18.witten.elbschetal/";
        subTitle = "Witten";
        setup();

        var yaFIMnle = new YaFIMnle("2025.07.18.elbschetal");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Elbschetal";
        builders.add(vid("GX011862.MP4"));
        builders.add(vid("GX011863.MP4"));
        builders.add(vid("GX011864.MP4"));
        builders.add(vid("GX011865.MP4"));
        builders.add(vid("GX011866.MP4"));
        builders.add(vid("GX011867.MP4"));
        builders.add(vid("GX011868.MP4"));
        builders.add(vid("GX011869.MP4"));
        builders.add(vid("GX011870.MP4"));
        builders.add(vid("GX011871.MP4"));
        builders.add(vid("GX011872.MP4"));
        builders.add(vid("GX011873.MP4"));
        builders.add(vid("GX011874.MP4"));
        builders.add(vid("GX011875.MP4"));
        builders.add(vid("GX011876.MP4"));
        builders.add(vid("GX011877.MP4"));
        builders.add(vid("GX011878.MP4"));
        builders.add(vid("GX011879.MP4"));
        builders.add(vid("GX011880.MP4"));
        builders.add(vid("GX011881.MP4"));
        builders.add(vid("GX011882.MP4"));
        builders.add(vid("GX011883.MP4"));
        builders.add(vid("GX011884.MP4"));
        builders.add(vid("GX011885.MP4"));
        builders.add(vid("GX011886.MP4"));
        builders.add(vid("GX011887.MP4"));
        builders.add(vid("GX011888.MP4"));
        builders.add(vid("GX011889.MP4"));
        builders.add(vid("GX011890.MP4"));
        builders.add(vid("GX011891.MP4"));
        builders.add(vid("GX011892.MP4"));
        builders.add(vid("GX011893.MP4"));
        builders.add(vid("GX011894.MP4"));
        builders.add(vid("GX011895.MP4"));
        builders.add(vid("GX011896.MP4"));
        builders.add(vid("GX011897.MP4"));
        builders.add(vid("GX011898.MP4"));
        builders.add(vid("GX011899.MP4"));
        builders.add(vid("GX011900.MP4"));
        builders.add(vid("GX011901.MP4"));
        builders.add(vid("GX011902.MP4"));
        builders.add(vid("GX011903.MP4"));
        builders.add(vid("GX011904.MP4"));
        builders.add(vid("GX011905.MP4"));
        builders.add(vid("GX011906.MP4"));
        builders.add(vid("GX011907.MP4"));
        builders.add(vid("GX011908.MP4"));
        builders.add(vid("GX011909.MP4"));
        builders.add(vid("GX011910.MP4"));
        builders.add(vid("GX011911.MP4"));
        builders.add(vid("GX011912.MP4"));
        builders.add(vid("GX011913.MP4"));
        builders.add(vid("GX011914.MP4"));
        builders.add(vid("GX011915.MP4"));
        builders.add(vid("GX011916.MP4"));
        builders.add(vid("GX011917.MP4"));
        builders.add(vid("GX011918.MP4"));
        builders.add(vid("GX011919.MP4"));
        builders.add(vid("GX011920.MP4"));
        builders.add(vid("GX011921.MP4"));
        builders.add(vid("GX011922.MP4"));
        yaFIMnle.of(builders).create();
    }
}
