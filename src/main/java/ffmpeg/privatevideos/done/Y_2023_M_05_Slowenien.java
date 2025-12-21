package ffmpeg.privatevideos.done;

import ffmpeg.privatevideos.AbstractNewApproach;
import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.common.Builder;
import io.github.yafimnle.config.Presets;
import io.github.yafimnle.ffmpeg.FFMpegJoiner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Y_2023_M_05_Slowenien extends AbstractNewApproach {
    public static void main(String[] args) {
        var main = new Y_2023_M_05_Slowenien();
        main.mainTitle = "2023.05 Wanderurlaub in den Alpen";
        main.run();
    }

    @Override
    public void run() {
        var f1 = gen20230527();
        var f2 = gen20230528();
        var f3 = gen20230529();
        var f4 = gen20230530();
        var f5 = gen20230531();
        var f6 = gen20230601();
        var f7 = gen20230602();

        var joiner = new FFMpegJoiner();
        joiner.join("2023.05.wanderurlaub-in-slowenien-hevc", f1, f2, f3, f4, f5, f6, f7);
    }

    private void setup() {
        Presets.hw_h265_hevc(sourceDir, destinationDir);
    }

    public File gen20230527() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.05.27_drachenfeld_stuttgart";
        subTitle = "2023.05.27 Drachenfels und Stuttgart";
        setup();

        var yaFIMnle = new YaFIMnle("2023.05.27");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Drachenfels";
        builders.add(img("DSCN9104.JPG"));
        builders.add(vid("DSCN9107.MP4"));
        builders.add(img("DSCN9119.JPG"));
        builders.add(vid("GH010046.MP4"));
        builders.add(img("DSCN9126.JPG"));
        builders.add(vid("DSCN9130.MP4"));
        builders.add(vid("GH010048.MP4"));
        builders.add(img("DSCN9143.JPG"));
        builders.add(img("DSCN9146.JPG"));
        detailTitle = "Stuttgart";
        builders.add(vid("DSCN9159.MP4"));
        builders.add(vid("DSCN9160.MP4"));
        builders.add(img("DSCN9161.JPG"));
        builders.add(vid("DSCN9166.MP4"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20230528() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.05.28_tarvis";
        subTitle = "2023.05.29 Tarvisio";
        setup();

        var yaFIMnle = new YaFIMnle("2023.05.28");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Arnoldstein nach Tarvisio";
        builders.add(img("DSCN9171.JPG"));
        builders.add(img("DSCN9175.JPG"));
        builders.add(img("DSCN9192.JPG"));
        detailTitle = "Sentiero Orrido dello Slizza";
        builders.add(img("DSCN9196.JPG"));
        builders.add(vid("GH010050.MP4").seconds("00:00:00", "00:00:05").as("GH010050-0000-0005.mp4"));
        builders.add(vid("GH010050.MP4").seconds("00:00:15", "00:00:19").as("GH010050-0015-0019.mp4"));
        builders.add(vid("GH010050.MP4").seconds("00:00:53", "00:01:01").as("GH010050-0053-0101.mp4"));
        builders.add(vid("GH010050.MP4").seconds("00:01:40", "00:01:48").as("GH010050-0140-0148.mp4"));
        builders.add(vid("GH010050.MP4").seconds("00:02:22", "00:02:41").as("GH010050-0222-0241.mp4"));
        builders.add(vid("GH010050.MP4").seconds("00:02:46", "00:02:52").as("GH010050-0246-0252.mp4"));
        builders.add(vid("GH010052.MP4").seconds("00:00:00", "00:00:08"));
        builders.add(vid("GH010052.MP4").seconds("00:00:35", "00:00:53").as("GH010052-0035-0053.mp4"));
        builders.add(vid("GH010053.MP4").seconds("00:00:17", "00:00:26").as("GH010053-0017-0026.mp4"));
        builders.add(vid("GH010053.MP4").seconds("00:01:01", "00:01:13").as("GH010053-0101-0113.mp4"));
        builders.add(vid("GH010054.MP4"));
        builders.add(vid("GH010055.MP4"));
        builders.add(vid("GH010056.MP4").seconds("00:00:05", "00:00:10").as("GH010056-0005-0010.mp4"));
        builders.add(img("DSCN9215.JPG"));
        detailTitle = "Spomenik avstrijskemu granatniku";
        builders.add(img("DSCN9217.JPG"));
        builders.add(img("DSCN9226.JPG"));
        builders.add(img("DSCN9227.JPG"));
        return yaFIMnle.of(builders).create(); // 2m11s
    }

    public File gen20230529() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.05.29_slap_pericnik";
        subTitle = "2023.05.29 Mojstrana";
        setup();

        var yaFIMnle = new YaFIMnle("2023.05.29");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Pot Triglavske Bistrice nach Slap Peričnik";
        builders.add(img("DSCN9253.JPG"));
        detailTitle = "Kreda";
        builders.add(img("DSCN9257.JPG"));
        builders.add(vid("DSCN9259.MP4"));
        detailTitle = "Nach Slap Peričnik";
        builders.add(vid("DSCN9269.MP4"));
        detailTitle = "Slap Peričnik";
        builders.add(img("DSCN9274.JPG"));
        builders.add(vid("GH010062.MP4").seconds("00:00:03", "00:00:12"));
        builders.add(vid("GH010064.MP4"));
        builders.add(vid("GH010066.MP4"));
        builders.add(img("DSCN9296.JPG"));
        builders.add(img("DSCN9302.JPG"));
        detailTitle = "Martuljški slapovi (spodnji slap)";
        builders.add(img("DSCN9305.JPG"));
        builders.add(vid("GH010076.MP4"));
        builders.add(vid("GH010080.MP4"));
        builders.add(vid("GH010081.MP4"));
        builders.add(vid("GH010085.MP4"));
        builders.add(vid("GH010087.MP4").seconds("00:00:00", "00:00:10"));
        builders.add(vid("DSCN9333.MP4"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20230530() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.05.30_bohinj";
        subTitle = "2023.05.30 Bled";
        setup();

        var yaFIMnle = new YaFIMnle("2023.05.30");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Vintgar";
        builders.add(img("DSCN9342.JPG"));
        builders.add(img("DSCN9346.JPG"));
        builders.add(vid("GH010088.MP4"));
        builders.add(vid("GH010089.MP4").seconds("00:00:08", "00:00:26"));
        builders.add(vid("GH010093.MP4").seconds("00:00:02", "00:00:10").as("GH010093-0002-0010.mp4"));
        builders.add(vid("GH010093.MP4").seconds("00:00:20", "00:00:25").as("GH010093-0020-0025.mp4"));
        builders.add(vid("GH010094.MP4").seconds("00:00:00", "00:00:05"));
        builders.add(vid("GH010096.MP4").seconds("00:00:09", "00:00:22"));
        detailTitle = "Bohin";
        builders.add(img("DSCN9392.JPG"));
        builders.add(img("DSCN9396.JPG"));
        builders.add(vid("DSCN9400.MP4"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20230531() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.05.31_korita_mostnice";
        subTitle = "2023.05.31 Korita mostnice";
        setup();

        var yaFIMnle = new YaFIMnle("2023.05.31");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "";
        builders.add(img("DSCN9477.JPG"));
        builders.add(vid("DSCN9484.MP4"));
        builders.add(vid("DSCN9486.MP4"));
        builders.add(vid("DSCN9494.MP4"));
        detailTitle = "Vogel";
        builders.add(img("DSCN9498.JPG"));
        builders.add(img("DSCN9507.JPG"));
        builders.add(vid("GH010117.MP4").seconds("00:00:12", "00:00:25"));
        detailTitle = "Korita";
        builders.add(img("DSCN9515.JPG"));
        builders.add(vid("GH010121.MP4").seconds("00:00:07", "00:00:17"));
        builders.add(vid("GH010126.MP4"));
        builders.add(vid("GH010127.MP4").seconds("00:00:00", "00:00:05"));
        builders.add(vid("GH010128.MP4"));
        builders.add(img("DSCN9533.JPG"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20230601() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.06.01_slap_sobota_slap_beri";
        subTitle = "2023.06.01 Slowenien";
        setup();

        var yaFIMnle = new YaFIMnle("2023.06.01");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Bohinjska Bistrica nach Podmelec";
        builders.add(img("DSCN9557.JPG"));
        builders.add(img("DSCN9560.JPG"));
        detailTitle = "Trainstation Bohinjska Bistrica";
        builders.add(img("DSCN9562.JPG"));
        detailTitle = "Trainride";
        builders.add(vid("GH010131.MP4"));
        detailTitle = "Podmelec";
        builders.add(img("DSCN9565.JPG"));
        detailTitle = "Podmelec nach Slap Sopota";
        builders.add(img("DSCN9567.JPG"));
        builders.add(img("DSCN9569.JPG"));
        detailTitle = "Župnijska cerkev Marijinega vnebovzetja";
        builders.add(img("DSCN9570.JPG"));
        detailTitle = "Slap Sopota";
        builders.add(img("DSCN9573.JPG"));
        builders.add(vid("GH010134.MP4"));
        builders.add(vid("GH010135.MP4"));
        builders.add(img("DSCN9579.JPG"));
        detailTitle = "Slap Sopota nach Slap Beri";
        builders.add(img("DSCN9592.JPG"));
        builders.add(img("DSCN9606.JPG"));
        builders.add(vid("GH010139.MP4"));
        builders.add(img("DSCN9610.JPG"));
        detailTitle = "Slap Beri";
        builders.add(img("DSCN9616.JPG"));
        builders.add(vid("GH010144.MP4"));
        builders.add(vid("DSCN9625.MP4"));
        builders.add(img("DSCN9628.JPG"));
        builders.add(img("DSCN9629.JPG"));
        return yaFIMnle.of(builders).create();
    }

    public File gen20230602() {
        sourceDir = "/media/oliver/Extreme SSD/2023/2023.06.02_tolmin";
        subTitle = "2023.06.02 Tolmin";
        setup();

        var yaFIMnle = new YaFIMnle("2023.06.02");
        List<Builder> builders = new ArrayList<>();
        detailTitle = "Gorge";
        builders.add(img("DSCN9650.JPG"));
        builders.add(img("DSCN9662.JPG"));
        builders.add(vid("DSCN9679.MP4"));
        builders.add(vid("DSCN9682.MP4"));
        builders.add(vid("DSCN9686.MP4"));
        builders.add(img("DSCN9687.JPG"));
        builders.add(img("DSCN9701.JPG"));
        builders.add(img("DSCN9702.JPG"));
        builders.add(img("DSCN9714.JPG"));
        builders.add(img("DSCN9731.JPG"));
        builders.add(vid("DSCN9736.MP4"));
        builders.add(vid("GH010158.MP4"));
        return yaFIMnle.of(builders).create();
    }
}
