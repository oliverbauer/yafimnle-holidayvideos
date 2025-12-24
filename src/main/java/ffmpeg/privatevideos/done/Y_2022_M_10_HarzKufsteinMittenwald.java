package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;
import io.github.yafimnle.video.filter.VidStab;
import io.github.yafimnle.video.filter.VideoFilter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2022_M_10_HarzKufsteinMittenwald extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2022_M_10_HarzKufsteinMittenwald();
        main.mainTitle = "Oktober 2022 Herbstliche Wanderungen im Harz und in den Alpen";
        main.run();
    }

    @Override
    protected void run() {
        var f1 = gen20221014(); // 4m52s
        var f2 = gen20221015(); // 3m34s
        var f3 = gen20221016(); // 5m31s
        var f4 = gen20221017(); // 4m13s
        var f5 = gen20221018(); // 1m32s

        var joiner = new FFMpegJoiner();
        joiner.join("2022.10.harz_kufstein_mittenwald", f1, f2, f3, f4, f5);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public File gen20221014() {
        sourceDir = "/media/oliver/Extreme SSD/2022/2022.10.14.thale.harzer.hexenstieg";
        subTitle = "2022-10-14 Harz";
        setup();

        var yaFIMnle = new YaFIMnle("2022-10-14");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Goslar";
        builders.add(img("DSCN7675.JPG"));
        builders.add(img("DSCN7676.JPG"));
        builders.add(img("DSCN7678.JPG"));
        builders.add(img("DSCN7679.JPG"));
        builders.add(vid("DSCN7686.MP4"));
        builders.add(img("DSCN7691.JPG"));
        builders.add(img("DSCN7692.JPG"));
        builders.add(img("DSCN7694.JPG"));
        builders.add(img("DSCN7695.JPG"));
        builders.add(img("DSCN7697.JPG"));
        detailTitle = "Wernigerode";
        builders.add(img("DSCN7701.JPG"));
        builders.add(img("DSCN7703.JPG"));
        builders.add(img("DSCN7704.JPG"));
        builders.add(img("DSCN7705.JPG"));
        builders.add(img("DSCN7706.JPG"));
        builders.add(img("DSCN7707.JPG"));
        builders.add(img("DSCN7708.JPG"));
        builders.add(img("DSCN7709.JPG"));
        builders.add(img("DSCN7710.JPG"));
        builders.add(img("DSCN7712.JPG"));
        builders.add(img("DSCN7713.JPG"));
        detailTitle = "Thale";
        builders.add(img("DSCN7714.JPG"));
        builders.add(img("DSCN7715.JPG"));
        builders.add(vid("DSCN7717.MP4"));
        builders.add(img("DSCN7718.JPG"));
        builders.add(img("DSCN7719.JPG"));
        builders.add(img("DSCN7720.JPG"));
        builders.add(vid("DSCN7722.MP4"));
        builders.add(img("DSCN7723.JPG"));
        builders.add(vid("DSCN7724.MP4"));
        builders.add(vid("DSCN7725.MP4"));
        builders.add(img("DSCN7726.JPG"));
        builders.add(img("DSCN7727.JPG"));
        builders.add(vid("DSCN7729.MP4"));
        builders.add(img("DSCN7731.JPG"));
        builders.add(img("DSCN7732.JPG"));
        builders.add(vid("DSCN7734.MP4"));
        builders.add(img("DSCN7735.JPG"));
        builders.add(vid("DSCN7736.MP4"));
        builders.add(img("DSCN7738.JPG"));
        builders.add(vid("DSCN7739.MP4"));
        builders.add(img("DSCN7742.JPG"));
        builders.add(img("DSCN7744.JPG"));
        builders.add(vid("DSCN7745.MP4"));
        builders.add(vid("DSCN7746.MP4"));
        builders.add(img("DSCN7747.JPG"));
        builders.add(vid("DSCN7749.MP4"));
        builders.add(img("DSCN7751.JPG"));
        builders.add(img("DSCN7752.JPG"));
        builders.add(img("DSCN7756.JPG"));
        builders.add(img("DSCN7757.JPG"));
        builders.add(img("DSCN7759.JPG"));
        builders.add(img("DSCN7760.JPG"));
        builders.add(img("DSCN7761.JPG"));
        builders.add(img("DSCN7764.JPG"));
        builders.add(img("DSCN7765.JPG"));
        builders.add(img("DSCN7766.JPG"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20221015() {
        sourceDir = "/media/oliver/Extreme SSD/2022/2022.10.15";
        subTitle = "2022-10-15 Tirol";
        setup();

        var yaFIMnle = new YaFIMnle("2022-10-15");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Oberaudorf";
        builders.add(img("DSCN7771.JPG"));
        builders.add(img("DSCN7772.JPG"));
        builders.add(img("DSCN7773.JPG"));
        builders.add(img("DSCN7774.JPG"));
        builders.add(vid("DSCN7775.MP4"));
        builders.add(img("DSCN7776.JPG"));
        builders.add(img("DSCN7777.JPG"));
        builders.add(img("DSCN7778.JPG"));
        builders.add(img("DSCN7779.JPG"));
        builders.add(img("DSCN7780.JPG"));
        builders.add(vid("DSCN7782.MP4"));
        builders.add(img("DSCN7783.JPG"));
        builders.add(img("DSCN7784.JPG"));
        builders.add(img("DSCN7785.JPG"));
        detailTitle = "Kufstein";
        builders.add(img("DSCN7786.JPG"));
        builders.add(img("DSCN7787.JPG"));
        builders.add(img("DSCN7788.JPG"));
        builders.add(vid("DSCN7789.MP4"));
        builders.add(img("DSCN7790.JPG"));
        builders.add(img("DSCN7792.JPG"));
        builders.add(vid("DSCN7793.MP4"));
        builders.add(img("DSCN7795.JPG"));
        builders.add(img("DSCN7796.JPG"));
        builders.add(img("DSCN7798.JPG"));
        builders.add(img("DSCN7800.JPG"));
        builders.add(img("DSCN7801.JPG"));
        builders.add(img("DSCN7802.JPG"));
        builders.add(vid("DSCN7804.MP4"));
        builders.add(img("DSCN7805.JPG"));
        builders.add(img("DSCN7806.JPG"));
        builders.add(img("DSCN7809.JPG"));
        builders.add(vid("DSCN7810.MP4"));
        builders.add(img("DSCN7811.JPG"));
        builders.add(vid("DSCN7813.MP4"));
        builders.add(img("DSCN7815.JPG"));
        builders.add(img("DSCN7816.JPG"));
        builders.add(img("DSCN7817.JPG"));
        builders.add(vid("DSCN7818.MP4"));
        builders.add(img("DSCN7821.JPG"));
        builders.add(img("DSCN7822.JPG"));
        builders.add(img("DSCN7823.JPG"));
        builders.add(img("DSCN7824.JPG"));
        builders.add(img("DSCN7825.JPG"));
        builders.add(img("DSCN7827.JPG"));
        builders.add(vid("DSCN7828.MP4"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20221016() {
        sourceDir = "/media/oliver/Extreme SSD/2022/2022.10.16.scharnitz.gleirschklamm";
        subTitle = "2022-10-16 Isartal";
        setup();

        VideoFilter videoFilter = new VidStab();
        var yaFIMnle = new YaFIMnle("2022-10-16");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Scharnitz";
        builders.add(img("DSCN7835.JPG"));
        builders.add(img("DSCN7836.JPG"));
        builders.add(vid("DSCN7848.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7849.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7850.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7854.JPG"));
        builders.add(img("DSCN7859.JPG"));
        builders.add(img("DSCN7860.JPG"));
        builders.add(vid("DSCN7865.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7868.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7869.JPG"));
        builders.add(img("DSCN7872.JPG"));
        builders.add(img("DSCN7877.JPG"));
        builders.add(img("DSCN7883.JPG"));
        builders.add(img("DSCN7884.JPG"));
        builders.add(vid("DSCN7890.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7892.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7893.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7895.JPG"));
        builders.add(vid("DSCN7898.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7899.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7902.JPG"));
        builders.add(vid("DSCN7905.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7906.JPG"));
        builders.add(vid("DSCN7908.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7912.JPG"));
        builders.add(img("DSCN7914.JPG"));
        builders.add(vid("DSCN7915.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7917.JPG"));
        builders.add(img("DSCN7920.JPG"));
        builders.add(img("DSCN7921.JPG"));
        builders.add(img("DSCN7922.JPG"));
        builders.add(vid("DSCN7924.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7925.JPG"));
        builders.add(img("DSCN7927.JPG"));
        builders.add(vid("DSCN7929.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7930.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7931.JPG"));
        builders.add(img("DSCN7932.JPG"));
        builders.add(img("DSCN7934.JPG"));
        builders.add(vid("DSCN7935.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7936.JPG"));
        builders.add(img("DSCN7940.JPG"));
        builders.add(vid("DSCN7941.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(vid("DSCN7943.MP4").appendVideoFilterBeforeEncoding(videoFilter));
        builders.add(img("DSCN7946.JPG"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20221017() {
        sourceDir = "/media/oliver/Extreme SSD/2022/2022.10.17.mittenwald.elmau.garmisch";
        subTitle = "2022-10-17 Bayern";
        setup();

        var yaFIMnle = new YaFIMnle("2022-10-17");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Mittenwald nach Garmisch";
        builders.add(vid("DSCN7960.MP4"));
        builders.add(vid("DSCN7961.MP4"));
        builders.add(img("DSCN7962.JPG"));
        builders.add(img("DSCN7963.JPG"));
        builders.add(img("DSCN7965.JPG"));
        builders.add(img("DSCN7966.JPG"));
        builders.add(vid("DSCN7967.MP4"));
        builders.add(vid("DSCN7969.MP4"));
        builders.add(vid("DSCN7971.MP4"));
        builders.add(vid("DSCN7974.MP4"));
        builders.add(img("DSCN7975.JPG"));
        builders.add(img("DSCN7978.JPG"));
        builders.add(img("DSCN7979.JPG"));
        builders.add(img("DSCN7981.JPG"));
        builders.add(img("DSCN7987.JPG"));
        builders.add(img("DSCN7991.JPG"));
        detailTitle = "Schloß Elmau";
        builders.add(img("DSCN7992.JPG"));
        builders.add(img("DSCN7993.JPG"));
        builders.add(img("DSCN7994.JPG"));
        builders.add(img("DSCN7996.JPG"));
        detailTitle = "Mittenwald nach Garmisch";
        builders.add(img("DSCN7999.JPG"));
        builders.add(vid("DSCN8000.MP4"));
        builders.add(img("DSCN8001.JPG"));
        builders.add(vid("DSCN8002.MP4"));
        builders.add(vid("DSCN8003.MP4"));
        builders.add(img("DSCN8006.JPG"));
        builders.add(img("DSCN8008.JPG"));
        builders.add(img("DSCN8011.JPG"));
        builders.add(img("DSCN8013.JPG"));
        builders.add(vid("DSCN8014.MP4"));
        builders.add(img("DSCN8015.JPG"));
        builders.add(img("DSCN8017.JPG"));
        builders.add(vid("DSCN8018.MP4"));
        builders.add(img("DSCN8020.JPG"));
        builders.add(img("DSCN8021.JPG"));
        builders.add(vid("DSCN8023.MP4"));
        builders.add(img("DSCN8025.JPG"));
        builders.add(img("DSCN8026.JPG"));
        builders.add(img("DSCN8028.JPG"));
        builders.add(vid("DSCN8030.MP4"));
        builders.add(img("DSCN8033.JPG"));
        builders.add(img("DSCN8034.JPG"));
        builders.add(vid("DSCN8039.MP4"));
        builders.add(vid("DSCN8041.MP4"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20221018() {
        sourceDir = "/media/oliver/Extreme SSD/2022/2022.10.18.fuessen.schwangau";
        subTitle = "2022-10-18 Bayern";
        setup();

        var yaFIMnle = new YaFIMnle("2022-10-18");
        detailTitle = "Füßen und Alpsee";
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSCN8049.JPG"));
        builders.add(img("DSCN8050.JPG"));
        builders.add(img("DSCN8052.JPG"));
        builders.add(img("DSCN8053.JPG"));
        builders.add(img("DSCN8054.JPG"));
        builders.add(img("DSCN8056.JPG"));
        builders.add(vid("DSCN8057.MP4"));
        builders.add(img("DSCN8058.JPG"));
        builders.add(img("DSCN8061.JPG"));
        builders.add(img("DSCN8062.JPG"));
        builders.add(img("DSCN8064.JPG"));
        builders.add(vid("DSCN8065.MP4"));
        builders.add(vid("DSCN8067.MP4"));
        builders.add(img("DSCN8071.JPG"));
        builders.add(img("DSCN8072.JPG"));
        builders.add(img("DSCN8074.JPG"));
        builders.add(vid("DSCN8076.MP4"));
        builders.add(img("DSCN8077.JPG"));
        builders.add(img("DSCN8080.JPG"));
        return yaFIMnle.of(builders).create();
    }
}
