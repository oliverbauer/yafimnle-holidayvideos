package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

// Full (longer) version of Summary Y_2022_M_10_HarzKufsteinMittenwald
public class Y_2022_M_10_D_16_Gleirschklamm extends AbstractNewApproach {

    public static void main(String[] args) {
        var main = new Y_2022_M_10_D_16_Gleirschklamm();
        main.mainTitle = "Oktober 2022 Herbstliche Wanderungen im Harz und in den Alpen";
        main.run();
    }

    @Override
    protected void run() {
        gen20221016();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public void gen20221016() {
        sourceDir = "/media/oliver/Extreme SSD/2022/2022.10.16.scharnitz.gleirschklamm";
        subTitle = "2022-10-16 Isartal";
        setup();

        var yaFIMnle = new YaFIMnle("2022-10-16");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Scharnitz";
        builders.add(img("DSCN7835.JPG"));
        builders.add(img("DSCN7836.JPG"));
        builders.add(vid("DSCN7842.MP4"));
        builders.add(img("DSCN7843.JPG"));
        builders.add(vid("DSCN7846.MP4"));
        builders.add(img("DSCN7847.JPG"));
        builders.add(vid("DSCN7848.MP4"));
        builders.add(vid("DSCN7849.MP4"));
        builders.add(vid("DSCN7850.MP4"));
        builders.add(img("DSCN7854.JPG"));
        builders.add(vid("DSCN7855.MP4"));
        builders.add(img("DSCN7856.JPG"));
        builders.add(img("DSCN7857.JPG"));
        builders.add(img("DSCN7858.JPG"));
        builders.add(img("DSCN7859.JPG"));
        builders.add(img("DSCN7860.JPG"));
        builders.add(vid("DSCN7861.MP4"));
        builders.add(img("DSCN7862.JPG"));
        builders.add(img("DSCN7864.JPG"));
        builders.add(vid("DSCN7865.MP4"));
        builders.add(vid("DSCN7866.MP4"));
        builders.add(vid("DSCN7868.MP4"));
        builders.add(img("DSCN7869.JPG"));
        builders.add(img("DSCN7871.JPG"));
        builders.add(img("DSCN7872.JPG"));
        builders.add(vid("DSCN7876.MP4"));
        builders.add(img("DSCN7877.JPG"));
        builders.add(img("DSCN7879.JPG"));
        builders.add(vid("DSCN7880.MP4"));
        builders.add(img("DSCN7881.JPG"));
        builders.add(img("DSCN7882.JPG"));
        builders.add(img("DSCN7883.JPG"));
        builders.add(img("DSCN7884.JPG"));
        builders.add(vid("DSCN7885.MP4"));
        builders.add(vid("DSCN7890.MP4"));
        builders.add(vid("DSCN7892.MP4"));
        builders.add(vid("DSCN7893.MP4"));
        builders.add(img("DSCN7895.JPG"));
        builders.add(vid("DSCN7898.MP4"));
        builders.add(vid("DSCN7899.MP4"));
        builders.add(img("DSCN7902.JPG"));
        builders.add(img("DSCN7903.JPG"));
        builders.add(vid("DSCN7905.MP4"));
        builders.add(img("DSCN7906.JPG"));
        builders.add(img("DSCN7907.JPG"));
        builders.add(vid("DSCN7908.MP4"));
        builders.add(img("DSCN7909.JPG"));
        builders.add(img("DSCN7911.JPG"));
        builders.add(img("DSCN7912.JPG"));
        builders.add(img("DSCN7914.JPG"));
        builders.add(vid("DSCN7915.MP4"));
        builders.add(img("DSCN7917.JPG"));
        builders.add(img("DSCN7918.JPG"));
        builders.add(img("DSCN7920.JPG"));
        builders.add(img("DSCN7921.JPG"));
        builders.add(img("DSCN7922.JPG"));
        builders.add(vid("DSCN7924.MP4"));
        builders.add(img("DSCN7925.JPG"));
        builders.add(vid("DSCN7926.MP4"));
        builders.add(img("DSCN7927.JPG"));
        builders.add(img("DSCN7928.JPG"));
        builders.add(vid("DSCN7929.MP4"));
        builders.add(vid("DSCN7930.MP4"));
        builders.add(img("DSCN7931.JPG"));
        builders.add(img("DSCN7932.JPG"));
        builders.add(img("DSCN7934.JPG"));
        builders.add(vid("DSCN7935.MP4"));
        builders.add(img("DSCN7936.JPG"));
        builders.add(img("DSCN7937.JPG"));
        builders.add(img("DSCN7939.JPG"));
        builders.add(img("DSCN7940.JPG"));
        builders.add(vid("DSCN7941.MP4"));
        builders.add(vid("DSCN7943.MP4"));
        builders.add(img("DSCN7946.JPG"));
        builders.add(img("DSCN7947.JPG"));
        detailTitle = "Mittenwald";
        builders.add(img("DSCN7948.JPG"));
        builders.add(img("DSCN7949.JPG"));
        builders.add(img("DSCN7950.JPG"));
        builders.add(img("DSCN7951.JPG"));
        builders.add(img("DSCN7952.JPG"));
        builders.add(img("DSCN7953.JPG"));
        builders.add(img("DSCN7954.JPG"));

        yaFIMnle.of(builders).create();
    }

}
