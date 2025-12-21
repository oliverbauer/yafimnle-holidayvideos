package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2023_M_04_FruehjahrsurlaubApril2023 extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2023_M_04_FruehjahrsurlaubApril2023();
        main.mainTitle = "Frühjahrsurlaub am Meer";
        main.run();
    }

    @Override
    protected void run() {
        var f1 = gen20230419();
        var f2 = gen20230420();
        var f3 = gen20230421();
        var f4 = gen20230422();
        var f5 = gen20230423();
        var f6 = gen20230424();
        var f7 = gen20230425();
        var f8 = gen20230426();

        var joiner = new FFMpegJoiner();
        joiner.join(
                "2023.04.deutschland.oesterreich.italien.monaco.frankreich.fruehjarsurlaub-hevc",
                f1, f2, f3, f4, f5, f6, f7, f8
        );
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    private File gen20230419() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.19_koblenz";
        subTitle = "2023.04.19 (1/8) Deutschland - Entspannte Anreise";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.19");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Anreise nach Koblenz";
        builders.add(img("DSCN8534.JPG"));
        builders.add(vid("DSCN8535.MP4"));
        builders.add(img("DSCN8540.JPG"));
        builders.add(img("DSCN8543.JPG"));
        builders.add(vid("DSCN8544.MP4"));
        builders.add(vid("DSCN8550.MP4"));
        detailTitle = "Übernachtung in Boppard";
        builders.add(img("DSCN8559.JPG"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20230420() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.20_mannheim_kufstein";
        subTitle = "2023.04.20 (2/8) Deutschland + Österreich - Entspannt weiter nach Kufstein";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.20");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Via Mannheim";
        builders.add(vid("DSCN8560.MP4"));
        builders.add(vid("DSCN8562.MP4"));
        builders.add(vid("DSCN8565.MP4"));
        detailTitle = "Weiter nach München";
        builders.add(img("DSCN8570.JPG"));
        detailTitle = "München";
        builders.add(img("DSCN8571.JPG"));
        builders.add(img("DSCN8572.JPG"));
        builders.add(vid("DSCN8573.MP4"));
        detailTitle = "Kufstein";
        builders.add(img("DSCN8577.JPG"));
        builders.add(vid("DSCN8579.MP4"));
        builders.add(img("DSCN8591.JPG"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20230421() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.21_pertisau_mariensteig_gardasee";
        subTitle = "2023.04.21 (3/8) Österreich + Italien - Schöne Wanderung und ab in den Süden";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.21");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Achensee - Mariensteig 9km";
        builders.add(img("DSCN8596.JPG"));
        builders.add(vid("DSCN8598.MP4"));
        builders.add(img("DSCN8604.JPG"));
        builders.add(vid("DSCN8606.MP4"));
        builders.add(img("DSCN8607.JPG"));
        builders.add(vid("DSCN8608.MP4"));
        builders.add(img("DSCN8620.JPG"));
        builders.add(img("DSCN8628.JPG"));
        builders.add(vid("DSCN8631.MP4"));
        builders.add(img("DSCN8635.JPG"));
        builders.add(vid("DSCN8640.MP4"));
        builders.add(img("DSCN8645.JPG"));
        detailTitle = "Achensee - Pertisau";
        builders.add(img("DSCN8646.JPG"));
        detailTitle = "Bozen";
        builders.add(img("DSCN8647.JPG"));
        detailTitle = "Riva del Garda";
        builders.add(vid("DSCN8658.MP4"));
        builders.add(img("DSCN8662.JPG"));
        builders.add(vid("DSCN8664.MP4"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20230422() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.22_gardasee_limone_sul_garda";
        subTitle = "2023.04.22 (4/8) Italien - Am Gardasee";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.22");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Riva del Garda";
        builders.add(img("DSCN8668.JPG"));
        detailTitle = "Sentiero ponale";
        builders.add(img("DSCN8671.JPG"));
        builders.add(img("DSCN8673.JPG"));
        builders.add(vid("DSCN8679.MP4"));
        builders.add(vid("DSCN8688.MP4"));
        builders.add(img("DSCN8691.JPG"));
        builders.add(img("DSCN8702.JPG"));
        detailTitle = "Anreise nach Limone Sul Garda";
        builders.add(vid("DSCN8708.MP4"));
        builders.add(img("DSCN8718.JPG"));
        builders.add(vid("DSCN8716.MP4"));
        detailTitle = "Limone Sul Garda";
        builders.add(img("DSCN8724.JPG"));
        builders.add(vid("DSCN8727.MP4"));
        builders.add(img("DSCN8730.JPG"));
        builders.add(img("DSCN8732.JPG"));
        builders.add(img("DSCN8737.JPG"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20230423() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.23_turin_ventimiglia";
        subTitle = "2023.04.23 (5/8) Italien + Frankreich + Italien - Grenzgänger";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.23");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Italien - Turin";
        builders.add(img("DSCN8761.JPG"));
        builders.add(vid("DSCN8765.MP4"));
        builders.add(img("DSCN8770.JPG"));
        builders.add(vid("DSCN8784.MP4"));
        builders.add(img("DSCN8786.JPG"));
        builders.add(img("DSCN8790.JPG"));
        builders.add(img("DSCN8791.JPG"));
        builders.add(vid("DSCN8793.MP4"));
        builders.add(img("DSCN8795.JPG"));
        detailTitle = "Frankreich - Limone Piemonte";
        builders.add(vid("DSCN8807.MP4"));
        builders.add(img("DSCN8808.JPG"));
        builders.add(img("DSCN8809.JPG"));
        builders.add(vid("DSCN8816.MP4"));
        detailTitle = "Italien - Ventimiglia";
        builders.add(img("DSCN8824.JPG"));
        builders.add(vid("DSCN8823.MP4"));
        builders.add(img("DSCN8827.JPG"));
        builders.add(vid("DSCN8828.MP4"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20230424() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.24_monaco";
        subTitle = "2023.04.24 (6/8) Monaco + Frankreich - Erholung pur";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.24");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Anreise nach Monaco";
        builders.add(vid("DSCN8829.MP4"));
        detailTitle = "Monaco";
        builders.add(img("DSCN8831.JPG"));
        builders.add(vid("DSCN8835.MP4"));
        builders.add(img("DSCN8837.JPG"));
        builders.add(img("DSCN8839.JPG"));
        detailTitle = "Monaco - Jardins Saint-Martin";
        builders.add(vid("DSCN8841.MP4"));
        builders.add(vid("DSCN8843.MP4"));
        builders.add(vid("DSCN8849.MP4"));
        builders.add(img("DSCN8852.JPG"));
        builders.add(vid("DSCN8855.MP4"));
        detailTitle = "Monaco - Cathédrale de Monaco";
        builders.add(vid("DSCN8858.MP4"));
        detailTitle = "Frankreich - Cap d\\u2019Ail - Sentier du littoral";
        builders.add(img("DSCN8864.JPG"));
        builders.add(vid("DSCN8867.MP4"));
        builders.add(vid("DSCN8875.MP4"));
        detailTitle = "Frankreich - Èze";
        builders.add(vid("DSCN8886.MP4"));
        builders.add(vid("DSCN8884.MP4"));
        detailTitle = "Frankreich - Beaulieu-sur-Mer";
        builders.add(img("DSCN8893.JPG"));
        builders.add(vid("DSCN8896.MP4"));
        builders.add(img("DSCN8900.JPG"));
        builders.add(img("DSCN8921.JPG"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20230425() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.25_nizza_eze";
        subTitle = "2023.04.25 (7/8) Frankreich - Wanderungen ohne Ende";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.25");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Nizza";
        builders.add(img("DSCN8922.JPG"));
        builders.add(vid("DSCN8927.MP4"));
        builders.add(img("DSCN8931.JPG"));
        detailTitle = "Sentier Nietzsche nach Èze";
        builders.add(img("DSCN8949.JPG"));
        builders.add(img("DSCN8951.JPG"));
        builders.add(vid("DSCN8953.MP4"));
        builders.add(vid("DSCN8961.MP4"));
        builders.add(img("DSCN8964.JPG"));
        builders.add(img("DSCN8974.JPG"));
        builders.add(img("DSCN8978.JPG"));
        detailTitle = "Bergdorf Èze";
        builders.add(img("DSCN8983.JPG"));
        detailTitle = "Èze";
        builders.add(vid("DSCN8991.MP4"));
        builders.add(vid("DSCN8995.MP4"));
        builders.add(vid("DSCN9013.MP4"));
        detailTitle = "Sentier du littoral";
        builders.add(img("DSCN9015.JPG"));
        builders.add(img("DSCN9020.JPG"));
        builders.add(vid("DSCN9033.MP4"));
        builders.add(img("DSCN9042.JPG"));
        builders.add(img("DSCN9043.JPG"));
        builders.add(vid("DSCN9052.MP4"));
        builders.add(vid("DSCN9053.MP4"));

        return yaFIMnle.of(builders).create();
    }

    private File gen20230426() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.04.26_genova";
        subTitle = "2023.04.26 (8/8) Italien + Schweiz - Zum Finale";
        setup();

        var yaFIMnle = new YaFIMnle("2023.04.26");

        List<Builder> builders = new ArrayList<>();

        detailTitle = "Italien - Finale Ligure";
        builders.add(img("DSCN9065.JPG"));
        builders.add(img("DSCN9066.JPG"));
        builders.add(img("DSCN9069.JPG"));
        builders.add(vid("DSCN9078.MP4"));
        detailTitle = "Italien - Basilica of San Giovanni";
        builders.add(vid("DSCN9083.MP4"));
        detailTitle = "Italien - Genua";
        builders.add(img("DSCN9085.JPG"));
        builders.add(img("DSCN9088.JPG"));
        builders.add(vid("DSCN9090.MP4"));
        builders.add(img("DSCN9093.JPG"));
        detailTitle = "Nach Milano...";
        builders.add(img("DSCN9096.JPG"));
        detailTitle = "Schweiz - Und weiter nach Lugano";
        builders.add(vid("DSCN9100.MP4"));
        builders.add(img("DSCN9101.JPG"));
        builders.add(img("DSCN9103.JPG"));

        return yaFIMnle.of(builders).create();
    }
}
