package ffmpeg.privatevideos.done;


import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2024_M_04_D_27_Huettlebackklamm extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2024_M_04_D_27_Huettlebackklamm();
        main.mainTitle = "2024.04.26 Kesselgraben und Hüttlebachklamm";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    public void run() {
        sourceDir = "/media/oliver/Extreme SSD/2024/2024.04.27_kesselgraben_wasserfall_kruen_huettlebachklamm";
        subTitle = "2024.04.26 Kesselgraben und Hüttlebachklamm";
        setup();

        var yaFIMnle = new YaFIMnle("2024.04.27-1");
        detailTitle = "Anreise nach Garmisch-Partenkirchen";
        List<Builder> builders = new ArrayList<>();
        builders.add(vid("GX010464.MP4"));
        builders.add(vid("GX010465.MP4"));
        detailTitle = "Garmisch";
        builders.add(img("DSCN0785.JPG"));
        builders.add(img("DSCN0786.JPG"));
        builders.add(img("DSCN0787.JPG"));
        builders.add(img("DSCN0788.JPG"));
        builders.add(vid("GX010466.MP4"));
        builders.add(vid("GX010467.MP4"));
        builders.add(img("DSCN0789.JPG"));
        builders.add(vid("GX010468.MP4"));
        builders.add(vid("GX010469.MP4"));
        builders.add(img("DSCN0790.JPG"));
        builders.add(vid("GX010470.MP4"));
        builders.add(vid("GX010471.MP4"));
        builders.add(img("DSCN0793.JPG"));
        builders.add(vid("GX010472.MP4"));
        builders.add(vid("GX010473.MP4"));
        detailTitle = "Krün";
        builders.add(vid("GX010474.MP4"));
        builders.add(img("DSCN0794.JPG"));
        builders.add(vid("GX010475.MP4"));
        builders.add(img("DSCN0799.JPG"));
        builders.add(vid("GX010476.MP4"));
        builders.add(vid("GX010477.MP4"));
        builders.add(img("DSCN0806.JPG"));
        builders.add(vid("GX010478.MP4"));
        builders.add(img("DSCN0808.JPG"));
        builders.add(vid("GX010480.MP4"));
        builders.add(img("DSCN0811.JPG"));
        builders.add(img("DSCN0812.JPG"));
        builders.add(vid("GX010481.MP4"));
        builders.add(img("DSCN0815.JPG"));
        builders.add(vid("GX010482.MP4"));
        detailTitle = "Mittenwald";
        builders.add(img("DSCN0816.JPG"));
        yaFIMnle.of(builders).create();
    }
}
