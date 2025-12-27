package ffmpeg.privatevideos;

import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.ffmpeg.FilterComplexs;
import io.github.yafimnle.ffmpeg.VideoBuilder;
import io.github.yafimnle.ffmpeg.filtercomplex.FilterComplex;
import io.github.yafimnle.imagemagick.ImageBuilder;

public abstract class AbstractNewApproach {
    protected String sourceDir;
    protected String destinationDir = "/home/oliver/tmp";
    protected String mainTitle = "unset";
    protected String subTitle;
    protected String detailTitle = "";

    protected boolean withBox = false;

    protected ImageBuilder img(String img) {
        FilterComplex filterComplex = zoomIn();
        return YaFIMnle.img(img).filterCompex(filterComplex);
    }
    protected ImageBuilder img(String img, FilterComplex filterComplex) {
        return YaFIMnle.img(img).filterCompex(filterComplex);
    }
    protected VideoBuilder vid(String vid) {
        FilterComplex filterComplex = videoTransformation();
        return YaFIMnle.vid(vid).filterCompex(filterComplex);
    }

    protected FilterComplex videoTransformation() {
        return FilterComplexs.videoTransformation(detailTitle, subTitle, mainTitle, withBox);
    }
    protected FilterComplex zoomIn() {

        return FilterComplexs.zoomIn(detailTitle, subTitle, mainTitle, withBox);
    }
    protected FilterComplex zoomOut() {
        return FilterComplexs.zoomOut(detailTitle, subTitle, mainTitle, withBox);
    }
    protected abstract void run();
}
