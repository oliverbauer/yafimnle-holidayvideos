package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;

import java.util.ArrayList;
import java.util.List;

public class Y_2022_M_07_D_18_Raggaschlucht_und_Groppensteinschlucht extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2022_M_07_D_18_Raggaschlucht_und_Groppensteinschlucht();
        main.mainTitle = "Juli 2022 Österreich";
        main.run();
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    @Override
    protected void run() {
        sourceDir = "/media/oliver/Extreme SSD/2022/2022.07.18.raggaschlucht.groppensteinschlucht";
        subTitle = "Kärnten";
        detailTitle = "Raggaschlucht";

        setup();

        var yaFIMnle = new YaFIMnle("2022.07.18.osterreich.raggaschlucht_und_groppensteinschlucht");

        List<Builder> builders = new ArrayList<>();
        builders.add(img("DSCN7061.JPG"));
        builders.add(img("DSCN7062.JPG"));
        builders.add(img("DSCN7063.JPG"));
        builders.add(img("DSCN7064.JPG"));
        builders.add(img("DSCN7065.JPG"));
        builders.add(img("DSCN7066.JPG"));
        builders.add(img("DSCN7067.JPG"));
        builders.add(img("DSCN7068.JPG"));
        builders.add(img("DSCN7069.JPG"));
        builders.add(img("DSCN7070.JPG"));
        builders.add(img("DSCN7071.JPG"));
        builders.add(img("DSCN7072.JPG"));
        builders.add(img("DSCN7073.JPG"));
        builders.add(vid("DSCN7074_Raggaschlucht.MP4"));
        builders.add(img("DSCN7075.JPG"));
        builders.add(img("DSCN7076.JPG"));
        builders.add(vid("DSCN7077_Raggaschlucht.MP4"));
        builders.add(img("DSCN7078.JPG"));
        builders.add(img("DSCN7079.JPG"));
        builders.add(vid("DSCN7080_Raggaschlucht.MP4"));
        builders.add(img("DSCN7081.JPG"));
        builders.add(vid("DSCN7082_Raggaschlucht.MP4"));
        builders.add(vid("DSCN7083_Raggaschlucht.MP4"));
        builders.add(img("DSCN7084.JPG"));
        builders.add(img("DSCN7085.JPG"));
        builders.add(img("DSCN7086.JPG"));
        builders.add(vid("DSCN7087_Raggaschlucht.MP4"));
        builders.add(img("DSCN7090.JPG"));
        builders.add(img("DSCN7091.JPG"));
        builders.add(img("DSCN7092.JPG"));
        builders.add(img("DSCN7093.JPG"));
        builders.add(img("DSCN7094.JPG"));
        builders.add(img("DSCN7095.JPG"));
        detailTitle = "Groppensteinschlucht";
        builders.add(img("DSCN7096.JPG"));
        builders.add(img("DSCN7097.JPG"));
        builders.add(img("DSCN7098.JPG"));
        builders.add(img("DSCN7099.JPG"));
        builders.add(img("DSCN7100.JPG"));
        builders.add(img("DSCN7101.JPG"));
        builders.add(img("DSCN7102.JPG"));
        builders.add(img("DSCN7103_Groppensteinschlucht.JPG"));
        builders.add(img("DSCN7104.JPG"));
        builders.add(img("DSCN7105.JPG"));
        builders.add(vid("DSCN7106_Groppensteinschlucht.MP4"));
        builders.add(vid("DSCN7107_Groppensteinschlucht.MP4"));
        builders.add(img("DSCN7108.JPG"));
        builders.add(vid("DSCN7109_Groppensteinschlucht.MP4"));
        builders.add(img("DSCN7111.JPG"));
        builders.add(vid("DSCN7112_Groppensteinschlucht.MP4"));
        builders.add(img("DSCN7114.JPG"));
        builders.add(img("DSCN7115.JPG"));
        builders.add(vid("DSCN7116_Groppensteinschlucht.MP4"));
        builders.add(img("DSCN7117.JPG"));
        builders.add(img("DSCN7118.JPG"));
        builders.add(img("DSCN7119.JPG"));
        builders.add(img("DSCN7120.JPG"));
        builders.add(img("DSCN7121.JPG"));
        builders.add(img("DSCN7122.JPG"));
        builders.add(vid("DSCN7123_Groppensteinschlucht.MP4"));
        builders.add(img("DSCN7124.JPG"));
        builders.add(img("DSCN7125.JPG"));
        builders.add(img("DSCN7126.JPG"));
        builders.add(vid("DSCN7127_Groppensteinschlucht.MP4"));
        builders.add(img("DSCN7128.JPG"));
        builders.add(img("DSCN7129.JPG"));
        builders.add(vid("DSCN7130_Groppensteinschlucht.MP4"));
        builders.add(img("DSCN7131.JPG"));
        builders.add(img("DSCN7132.JPG"));
        builders.add(img("DSCN7133.JPG"));
        builders.add(img("DSCN7134.JPG"));
        builders.add(img("DSCN7135.JPG"));
        yaFIMnle.of(builders).create();
    }
}
