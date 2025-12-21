package ffmpeg.privatevideos.done;


import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.image.ar.AR;
import io.github.yafimnle.image.enums.Gravity;

import java.util.ArrayList;
import java.util.List;

public class Y_2025_M_09_D_14_Witten_nach_Wetter extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2025_M_09_D_14_Witten_nach_Wetter();
        //main.mainTitle = "Witten, Stadtpark, Hammerteich, Wildgehege, Hohenstein, Ruhrhöhenweg / Ruhrtalsteig, Ender Talstraße, Gut Schede, Wetter";
        main.mainTitle = "Witten Stadtpark Hammerteich Wildgehege Hohenstein Ruhrhöhenweg / Ruhrtalsteig Ender Talstraße Gut Schede Wetter";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    protected void run() {
        sourceDir = "/media/oliver/Extreme SSD/2025/2025.09.14.witten.nach.wetter/";
        subTitle = "2025.09.14 Von Witten nach Wetter";
        setup();

        var yaFIMnle = new YaFIMnle("2025.09.14-havc-witten-nach-wetter");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Haus Witten";
        builders.add(img("DSC01400.jpg"));
        detailTitle = "Witten";
        builders.add(img("DSC01401.jpg"));
        detailTitle = "Stadtpark";
        builders.add(img("DSC01402.jpg"));
        builders.add(img("DSC01403.jpg"));
        builders.add(img("DSC01404.jpg"));
        builders.add(img("DSC01405.jpg"));
        builders.add(img("DSC01406.jpg"));
        builders.add(img("DSC01407.jpg"));
        detailTitle = "Wanderweg zum Hammerteich";
        builders.add(img("DSC01408.jpg"));
        builders.add(img("DSC01409.jpg"));
        builders.add(img("DSC01410.jpg"));
        builders.add(img("DSC01411.jpg"));
        builders.add(img("DSC01412.jpg"));
        builders.add(img("DSC01413.jpg"));
        builders.add(img("DSC01415.jpg"));
        detailTitle = "Hammerteich";
        builders.add(img("DSC01416.jpg"));
        builders.add(img("DSC01417.jpg"));
        builders.add(img("DSC01418.jpg"));
        builders.add(img("DSC01419.jpg"));
        builders.add(img("DSC01420.jpg"));
        builders.add(img("DSC01421.jpg"));
        detailTitle = "Wanderweg zum Wildgehege";
        builders.add(img("DSC01422.jpg"));
        builders.add(img("DSC01423.jpg"));
        builders.add(img("DSC01424.jpg"));
        builders.add(img("DSC01425.jpg"));
        builders.add(img("DSC01426.jpg"));
        builders.add(img("DSC01427.jpg"));
        builders.add(img("DSC01428.jpg"));
        builders.add(img("DSC01429.jpg"));
        builders.add(img("DSC01431.jpg"));
        detailTitle = "Wildgehege";
        builders.add(img("DSC01432.jpg"));
        builders.add(img("DSC01433.jpg"));
        builders.add(img("DSC01434.jpg").ar(AR.enlargeByColor()));
        detailTitle = "Hohenstein - Berger-Denkmal";
        builders.add(img("DSC01437.jpg"));
        builders.add(img("DSC01438.jpg"));
        builders.add(img("DSC01439.jpg"));
        builders.add(img("DSC01440.jpg"));
        builders.add(img("DSC01441.jpg"));
        builders.add(img("DSC01442.jpg"));
        builders.add(img("DSC01443.jpg"));
        builders.add(img("DSC01446.jpg"));
        builders.add(img("DSC01447.jpg"));
        builders.add(img("DSC01448.jpg"));
        builders.add(img("DSC01449.jpg"));
        builders.add(img("DSC01451.jpg"));
        detailTitle = "Ruhrhöhenweg / Ruhrtalsteig";
        builders.add(img("DSC01454.jpg"));
        builders.add(img("DSC01455.jpg"));
        builders.add(img("DSC01456.jpg"));
        builders.add(img("DSC01457.jpg"));
        builders.add(img("DSC01458.jpg"));
        builders.add(img("DSC01459.jpg"));
        builders.add(img("DSC01460.jpg"));
        builders.add(img("DSC01461.jpg"));
        builders.add(img("DSC01462.jpg"));
        builders.add(img("DSC01463.jpg"));
        builders.add(img("DSC01464.jpg"));
        builders.add(img("DSC01465.jpg"));
        builders.add(img("DSC01466.jpg"));
        builders.add(img("DSC01467.jpg"));
        builders.add(img("DSC01468.jpg"));
        builders.add(img("DSC01469.jpg"));
        builders.add(img("DSC01470.jpg"));
        builders.add(img("DSC01471.jpg"));
        builders.add(img("DSC01472.jpg"));
        builders.add(img("DSC01473.jpg"));
        builders.add(img("DSC01474.jpg"));
        builders.add(img("DSC01475.jpg"));
        builders.add(img("DSC01476.jpg"));
        builders.add(img("DSC01477.jpg"));
        builders.add(img("DSC01478.jpg"));
        builders.add(img("DSC01479.jpg"));
        builders.add(img("DSC01480.jpg"));
        builders.add(img("DSC01482.jpg"));
        builders.add(img("DSC01483.jpg"));
        builders.add(img("DSC01484.jpg"));
        builders.add(img("DSC01485.jpg"));
        builders.add(img("DSC01486.jpg"));
        builders.add(img("DSC01487.jpg"));
        builders.add(img("DSC01488.jpg"));
        builders.add(img("DSC01491.jpg"));
        detailTitle = "Ender Talstraße";
        builders.add(img("DSC01492.jpg"));
        builders.add(img("DSC01493.jpg"));
        builders.add(img("DSC01494.jpg"));
        builders.add(img("DSC01495.jpg"));
        builders.add(img("DSC01497.jpg"));
        builders.add(img("DSC01498.jpg"));
        builders.add(img("DSC01499.jpg"));
        builders.add(img("DSC01500.jpg"));
        builders.add(img("DSC01501.jpg"));
        builders.add(img("DSC01502.jpg"));
        detailTitle = "Gut Schede";
        builders.add(img("DSC01503.jpg"));
        builders.add(img("DSC01504.jpg"));
        builders.add(img("DSC01505.jpg"));
        builders.add(img("DSC01506.jpg"));
        builders.add(img("DSC01507.jpg"));
        builders.add(img("DSC01508.jpg").ar(AR.crop(Gravity.NORTH)));
        builders.add(img("DSC01509.jpg"));
        builders.add(img("DSC01510.jpg"));
        builders.add(img("DSC01511.jpg"));
        builders.add(img("DSC01512.jpg"));
        detailTitle = "Wetter";
        builders.add(img("DSC01513.jpg"));
        builders.add(img("DSC01514.jpg"));
        builders.add(img("DSC01515.jpg"));
        detailTitle = "Ev.-Luth. Kirchengemeinde";
        builders.add(img("DSC01516.jpg"));

        yaFIMnle.of(builders).create();
    }
}
