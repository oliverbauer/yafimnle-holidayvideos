package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2014_M_02_D_13_Nationalpark_Krka extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2014_M_02_D_13_Nationalpark_Krka();
        main.mainTitle = "Gespanschaft Šibenik-Knin";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    public void run() {
        subTitle = "2014.02.13 Kroatien im Winter";
        sourceDir = "/media/oliver/Extreme SSD/2014/02_Marokko_NP_Krka/13_nationalpark_krka";
        detailTitle = "Nationalpark Krka";
        setup();

        YaFIMnle yaFIMnle = new YaFIMnle("2014.02.13");
        List<Builder> builders = new ArrayList<>();

        builders.add(img("10_08_56.jpg"));
        builders.add(img("10_11_21.jpg"));
        builders.add(img("10_15_17.jpg"));
        builders.add(img("10_48_56.jpg"));
        builders.add(img("10_50_16.jpg"));
        builders.add(img("10_50_22.jpg"));
        builders.add(img("10_52_41.jpg"));
        builders.add(img("10_52_49.jpg"));
        builders.add(img("10_55_21.jpg"));
        builders.add(img("10_55_34.jpg"));
        builders.add(img("10_55_44.jpg"));
        builders.add(img("10_56_52.jpg"));
        builders.add(img("10_58_02.jpg"));
        builders.add(img("11_03_31.jpg"));
        builders.add(img("11_04_40.jpg"));
        builders.add(img("11_13_46.jpg"));
        builders.add(vid("09_43_42.mts"));
        builders.add(img("11_15_26.jpg"));
        builders.add(img("11_29_24.jpg"));
        builders.add(img("11_33_11.jpg"));
        builders.add(img("11_41_45.jpg"));
        builders.add(img("11_44_47.jpg"));
        builders.add(img("11_44_54.jpg"));
        builders.add(img("11_51_55.jpg"));
        builders.add(vid("10_26_52.mts"));
        builders.add(img("11_55_28.jpg"));
        builders.add(img("11_55_43.jpg"));
        builders.add(img("11_58_55.jpg"));
        builders.add(img("11_59_06.jpg"));
        builders.add(img("11_59_17.jpg"));
        builders.add(img("11_59_26.jpg"));
        builders.add(img("11_59_58.jpg"));
        builders.add(img("12_00_11.jpg"));
        builders.add(img("12_01_36.jpg"));
        builders.add(img("12_04_55.jpg"));
        builders.add(img("12_05_04.jpg"));
        builders.add(img("12_07_10.jpg"));
        builders.add(img("12_07_24.jpg"));
        builders.add(img("12_07_37.jpg"));
        builders.add(img("12_11_16.jpg")); // Schmetterling
        builders.add(vid("10_44_16.mts").seconds("00:00:17", "00:00:32"));              // Schmetterling
        builders.add(img("12_15_10.jpg"));
        builders.add(img("12_20_47.jpg"));
        builders.add(vid("11_04_30.mts"));
        builders.add(img("12_22_12.jpg"));
        builders.add(img("12_28_00.jpg"));
        builders.add(img("12_29_51.jpg"));
        builders.add(img("12_40_01.jpg"));
        builders.add(img("12_40_08.jpg"));
        builders.add(img("12_40_39.jpg"));
        builders.add(img("12_40_47.jpg"));
        builders.add(img("12_42_34.jpg"));
        builders.add(img("12_42_41.jpg"));
        builders.add(img("12_42_49.jpg"));
        builders.add(img("12_43_43.jpg"));
        builders.add(img("12_48_37.jpg"));
        builders.add(vid("11_47_20.mts"));
        builders.add(img("13_06_10.jpg"));
        builders.add(img("13_06_18.jpg"));
        builders.add(img("13_18_56.jpg"));
        builders.add(img("13_19_07.jpg"));
        builders.add(img("13_21_57.jpg"));
        builders.add(img("13_41_29.jpg"));
        builders.add(img("13_41_35.jpg"));
        builders.add(img("13_41_53.jpg"));
        builders.add(img("13_43_04.jpg"));
        builders.add(img("13_43_13.jpg"));
        builders.add(img("13_46_31.jpg"));
        builders.add(vid("12_33_22.mts"));
        builders.add(img("13_54_45.jpg"));
        builders.add(img("13_54_53.jpg"));
        builders.add(img("13_55_19.jpg"));
        builders.add(img("13_55_52.jpg"));
        builders.add(img("13_56_01.jpg"));
        builders.add(img("13_56_26.jpg"));
        builders.add(img("13_56_36.jpg"));
        builders.add(img("13_56_45.jpg"));
        builders.add(img("13_57_02.jpg"));
        builders.add(img("14_30_04.jpg"));
        builders.add(img("14_35_07.jpg"));
        builders.add(img("14_35_48.jpg"));
        builders.add(img("14_35_57.jpg"));
        builders.add(img("14_57_38.jpg"));
        builders.add(img("14_57_47.jpg"));
        builders.add(img("14_58_22.jpg"));
        builders.add(img("14_59_28.jpg"));
        builders.add(img("15_00_15.jpg"));
        builders.add(img("15_00_47.jpg"));
        builders.add(img("15_01_45.jpg"));
        builders.add(img("15_05_25.jpg"));
        builders.add(img("15_08_45.jpg"));
        builders.add(img("15_58_21.jpg"));
        builders.add(img("15_58_28.jpg"));
        builders.add(img("15_58_35.jpg"));

        yaFIMnle.of(builders).create();
    }
}
