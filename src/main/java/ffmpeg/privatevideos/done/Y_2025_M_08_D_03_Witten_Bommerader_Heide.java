package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_08_D_03_Witten_Bommerader_Heide extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_08_D_03_Witten_Bommerader_Heide();
        main.mainTitle = "2025.08.03 Tageswanderung";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    protected void run() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.08.03.witten.bommerader.heide/";
        subTitle = "Witten";
        detailTitle = "Bommerader Heide";
        setup();

        var yaFIMnle = new YaFIMnle("2025.08.03.bommerader.heide");
        List<Builder> builders = new ArrayList<>();
        builders.add(img("P1011334.JPG"));
        builders.add(img("P1011336.JPG"));
        builders.add(img("P1011339.JPG"));
        builders.add(img("P1011347.JPG"));
        builders.add(img("P1011352.JPG"));
        builders.add(img("P1011362.JPG"));
        builders.add(img("P1011368.JPG"));
        builders.add(img("P1011376.JPG"));
        builders.add(img("P1011377.JPG"));
        builders.add(img("P1011381.JPG"));
        builders.add(vid("GX012003.MP4"));
        builders.add(img("P1011390.JPG"));
        builders.add(img("P1011392.JPG"));
        builders.add(vid("GX012005.MP4"));
        builders.add(img("P1011401.JPG"));
        builders.add(vid("GX012007.MP4"));
        builders.add(img("P1011410.JPG"));
        builders.add(img("P1011414.JPG"));
        builders.add(img("P1011422.JPG"));
        builders.add(img("P1011424.JPG"));
        builders.add(img("P1011431.JPG"));

        yaFIMnle
                .of(builders)
                .overlayMp3(new File("/media/oliver/Extreme SSD/2025/2025.08.03.witten.bommerader.heide/P1011154.MP4_05m.00s.mp3"))
                .create();
    }
}
