package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2023_M_06_D_01_Slowenien_Slap_Sopota_Slap_Beri extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2023_M_06_D_01_Slowenien_Slap_Sopota_Slap_Beri();
        main.mainTitle = "Mai und Juni 2023 Slowenien";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    public void run() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.06.01_slap_sopota_slap_beri";
        subTitle = "Slowenien";

        setup();

        var resultName = "2023.06.21.slowenien.slap_beri_und_slap_sopota_und_tolmin";
        var yaFIMnle = new YaFIMnle(resultName);

        detailTitle = "Bohinjska Bistrica";
        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSCN9557.JPG"));
        builders.add(img("DSCN9558.JPG", zoomOut()));
        builders.add(img("DSCN9559.JPG"));
        builders.add(img("DSCN9560.JPG", zoomOut()));
        builders.add(img("DSCN9561.JPG"));
        builders.add(img("DSCN9562.JPG", zoomOut()));
        builders.add(img("DSCN9563.JPG"));
        detailTitle = "Zugfahrt nach Podmelec";
        builders.add(vid("GH010129.MP4").seconds("00:00:00", "00:00:06").as("129-part1.mp4"));
        builders.add(vid("GH010129.MP4").seconds("00:00:28", "00:00:36").as("129-part2.mp4"));
        builders.add(vid("GH010130.MP4").seconds("00:00:33", "00:00:39"));
        builders.add(vid("GH010131.MP4").seconds("00:00:20", "00:00:30"));
        builders.add(vid("GH010132.MP4").seconds("00:00:48", "00:00:54"));
        detailTitle = "Podmelec nach Slap Sopota";
        builders.add(img("DSCN9564.JPG"));
        builders.add(img("DSCN9565.JPG", zoomOut()));
        builders.add(img("DSCN9566.JPG"));
        builders.add(img("DSCN9567.JPG", zoomOut()));
        builders.add(img("DSCN9568.JPG"));
        builders.add(img("DSCN9569.JPG", zoomOut()));
        builders.add(img("DSCN9570.JPG"));
        builders.add(img("DSCN9571.JPG", zoomOut()));
        builders.add(img("DSCN9572.JPG"));
        builders.add(img("DSCN9573.JPG", zoomOut()));
        builders.add(vid("DSCN9574.MP4"));
        builders.add(img("DSCN9575.JPG"));
        detailTitle = "Slap Sopota";
        builders.add(img("DSCN9576.JPG", zoomOut()));
        builders.add(vid("DSCN9577.MP4"));
        builders.add(vid("DSCN9578.MP4"));
        builders.add(img("DSCN9579.JPG"));
        builders.add(img("DSCN9580.JPG", zoomOut()));
        builders.add(vid("DSCN9581.MP4"));
        builders.add(img("DSCN9582.JPG"));
        builders.add(img("DSCN9584.JPG", zoomOut()));
        builders.add(img("DSCN9585.JPG"));
        builders.add(img("DSCN9586.JPG", zoomOut()));
        builders.add(vid("DSCN9587.MP4"));
        detailTitle = "Richtung Slap Beri";
        builders.add(img("DSCN9588.JPG"));
        builders.add(vid("DSCN9589.MP4"));
        builders.add(img("DSCN9590.JPG"));
        builders.add(img("DSCN9591.JPG", zoomOut()));
        builders.add(img("DSCN9592.JPG"));
        builders.add(vid("DSCN9593.MP4"));
        builders.add(img("DSCN9594.JPG"));
        builders.add(img("DSCN9595.JPG", zoomOut()));
        builders.add(vid("DSCN9596.MP4"));
        builders.add(img("DSCN9597.JPG"));
        builders.add(vid("DSCN9598.MP4"));
        builders.add(img("DSCN9599.JPG"));
        builders.add(img("DSCN9600.JPG", zoomOut()));
        builders.add(img("DSCN9601.JPG"));
        builders.add(vid("DSCN9602.MP4"));
        builders.add(img("DSCN9603.JPG"));
        builders.add(img("DSCN9604.JPG", zoomOut()));
        builders.add(img("DSCN9605.JPG"));
        builders.add(img("DSCN9606.JPG", zoomOut()));
        builders.add(img("DSCN9607.JPG"));
        builders.add(img("DSCN9608.JPG", zoomOut()));
        builders.add(img("DSCN9609.JPG"));
        builders.add(img("DSCN9610.JPG", zoomOut()));
        builders.add(vid("DSCN9611.MP4"));
        builders.add(img("DSCN9612.JPG"));
        builders.add(vid("DSCN9613.MP4"));
        builders.add(img("DSCN9614.JPG"));
        builders.add(img("DSCN9615.JPG", zoomOut()));
        detailTitle = "Slap Beri";
        builders.add(img("DSCN9616.JPG"));
        builders.add(vid("DSCN9617.MP4"));
        builders.add(vid("DSCN9618.MP4"));
        builders.add(vid("DSCN9619.MP4"));
        builders.add(vid("DSCN9620.MP4"));
        builders.add(img("DSCN9622.JPG"));
        builders.add(img("DSCN9623.JPG", zoomOut()));
        builders.add(vid("DSCN9625.MP4"));
        builders.add(img("DSCN9626.JPG"));
        builders.add(vid("DSCN9627.MP4"));
        builders.add(img("DSCN9628.JPG"));
        builders.add(img("DSCN9629.JPG", zoomOut()));
        builders.add(vid("DSCN9630.MP4"));
        builders.add(img("DSCN9631.JPG"));
        builders.add(vid("DSCN9632.MP4"));
        detailTitle = "Richtung Tolmin";
        builders.add(img("DSCN9633.JPG"));
        builders.add(img("DSCN9634.JPG", zoomOut()));
        builders.add(img("DSCN9635.JPG"));
        builders.add(img("DSCN9636.JPG", zoomOut()));
        builders.add(img("DSCN9637.JPG"));
        builders.add(vid("DSCN9638.MP4"));
        builders.add(img("DSCN9639.JPG"));
        detailTitle = "Tolminska korita";
        builders.add(vid("GH010149.MP4"));
        builders.add(vid("GH010150.MP4"));
        builders.add(vid("GH010151.MP4"));
        builders.add(vid("GH010152.MP4"));
        builders.add(vid("GH010153.MP4"));
        builders.add(vid("GH010154.MP4"));
        builders.add(vid("GH010155.MP4"));
        builders.add(vid("GH010156.MP4"));

        yaFIMnle.of(builders).create();
    }
}
