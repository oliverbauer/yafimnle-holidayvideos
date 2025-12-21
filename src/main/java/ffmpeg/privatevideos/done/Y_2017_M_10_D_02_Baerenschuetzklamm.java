package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2017_M_10_D_02_Baerenschuetzklamm extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2017_M_10_D_02_Baerenschuetzklamm();
        main.mainTitle = "2017.10.02 Österreich";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    protected void run() {
        sourceDir = "/media/oliver/Extreme SSD/2017/2017.10.02_Baerenschuetzklamm";
        subTitle = "Kärnten Mixnitz";
        setup();

        detailTitle = "Bärenschützklamm";

        var resultName = "2017.10.02.oesterreich.baerenschuetzklamm";
        var yaFIMnle = new YaFIMnle(resultName);

        List<Builder> builders = new ArrayList<>();
        builders.add(img("10_20_34-1.jpg"));
        builders.add(img("10_28_19-1.jpg"));
        builders.add(img("10_35_24-1.jpg"));
        builders.add(img("10_36_18-1.jpg"));
        builders.add(vid("10_41_39.mp4"));
        builders.add(vid("10_45_03.mp4"));
        builders.add(img("10_45_23-1.jpg"));
        builders.add(img("10_50_05-1.jpg"));
        builders.add(img("10_50_46-1.jpg"));
        builders.add(img("10_53_09-1.jpg"));
        builders.add(img("10_58_06-1.jpg"));
        builders.add(img("10_58_18-1.jpg"));
        builders.add(img("11_15_41-1.jpg"));
        builders.add(img("11_16_07-1.jpg"));
        builders.add(img("11_16_12-1.jpg"));
        builders.add(vid("11_16_18.mp4"));
        builders.add(img("11_20_35-1.jpg"));
        builders.add(img("11_20_43-1.jpg"));
        builders.add(img("11_23_03-1.jpg"));
        builders.add(img("11_23_35-1.jpg"));
        builders.add(vid("11_24_34.mp4"));
        builders.add(img("11_25_13-1.jpg"));
        builders.add(img("11_26_57-1.jpg"));
        builders.add(img("11_29_18-1.jpg"));
        builders.add(img("11_31_43-1.jpg"));
        builders.add(vid("11_32_34.mp4"));
        builders.add(img("11_32_58-1.jpg"));
        builders.add(img("11_33_17-1.jpg"));
        builders.add(img("11_33_55-1.jpg"));
        builders.add(img("11_35_08-1.jpg"));
        builders.add(vid("11_36_06.mp4"));
        builders.add(img("11_36_40-1.jpg"));
        builders.add(img("11_36_46-1.jpg"));
        builders.add(img("11_38_23-1.jpg"));
        builders.add(img("11_39_41-1.jpg"));
        builders.add(img("11_43_06-1.jpg"));
        builders.add(vid("11_44_22.mp4"));
        builders.add(img("11_45_56-1.jpg"));
        builders.add(img("11_46_50-1.jpg"));
        builders.add(img("11_47_36-1.jpg"));
        builders.add(img("11_47_45-1.jpg"));
        builders.add(vid("11_48_58.mp4"));
        builders.add(img("11_50_40-1.jpg"));
        builders.add(img("11_52_39-1.jpg"));
        builders.add(img("11_53_45-1.jpg"));
        builders.add(vid("11_53_59.mp4"));
        builders.add(img("11_59_02-1.jpg"));
        builders.add(img("12_09_14-1.jpg"));
        builders.add(img("12_12_08-1.jpg"));
        builders.add(img("12_15_34-1.jpg"));
        builders.add(img("12_19_56-1.jpg"));
        builders.add(img("12_36_49-1.jpg"));
        builders.add(img("13_12_17-1.jpg"));
        builders.add(vid("13_23_46.mp4"));
        builders.add(img("13_25_25-1.jpg"));
        builders.add(img("13_29_12-1.jpg"));
        builders.add(img("13_29_22-1.jpg"));
        builders.add(img("13_29_34-1.jpg"));
        builders.add(img("13_34_46-1.jpg"));
        builders.add(vid("13_34_51.mp4"));
        builders.add(img("13_36_44-1.jpg"));
        builders.add(img("13_36_56-1.jpg"));
        builders.add(vid("13_37_02.mp4"));
        builders.add(img("13_55_32-1.jpg"));
        builders.add(img("14_01_01-1.jpg"));
        builders.add(img("14_04_33-1.jpg"));
        builders.add(img("14_10_59-1.jpg"));
        builders.add(vid("14_12_35.mp4"));
        builders.add(img("14_13_45-1.jpg"));
        builders.add(img("14_38_49-1.jpg"));
        builders.add(img("14_46_47-1.jpg"));
        builders.add(img("14_55_21-1.jpg"));
        builders.add(img("15_05_31-1.jpg"));

        yaFIMnle.of(builders).create();
    }
}
