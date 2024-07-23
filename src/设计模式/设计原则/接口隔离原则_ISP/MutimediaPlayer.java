package 设计模式.设计原则.接口隔离原则_ISP;

// MultimediaPlayer接口（多媒体播放器）的代码如下：
public interface MutimediaPlayer extends MediaPlayer, VideoPlayer {
    void play(String media);
}
