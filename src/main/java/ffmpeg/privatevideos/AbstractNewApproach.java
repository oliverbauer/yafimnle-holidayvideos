package ffmpeg.privatevideos;

import io.github.yafimnle.YaFIMnle;
import io.github.yafimnle.image.ImageBuilder;
import io.github.yafimnle.transformation.Transformation;
import io.github.yafimnle.transformation.Transformations;
import io.github.yafimnle.video.VideoBuilder;

public abstract class AbstractNewApproach {
    protected String sourceDir;
    protected String destinationDir = "/home/oliver/tmp";
    protected String mainTitle = "unset";
    protected String subTitle;
    protected String detailTitle = "";

    protected boolean withBox = false;

    protected ImageBuilder img(String img) {
        return YaFIMnle.img(img, zoomIn());
    }
    protected ImageBuilder img(String img, Transformation transformation) {
        return YaFIMnle.img(img, transformation);
    }
    protected VideoBuilder vid(String vid) {
        return YaFIMnle.vid(vid, videoTransformation());
    }
    protected Transformation videoTransformation() {
        return Transformations.videoTransformation(detailTitle, subTitle, mainTitle, withBox);
    }
    protected Transformation zoomIn() {
        return Transformations.zoomIn(detailTitle, subTitle, mainTitle, withBox);
    }
    protected Transformation zoomOut() {
        return Transformations.zoomOut(detailTitle, subTitle, mainTitle, withBox);
    }
    protected abstract void run();
}
