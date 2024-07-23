package 设计模式.设计原则.接口隔离原则_ISP;

// MixPlayer类（多媒体播放器实现类）的代码如下：
public class MixPlayer implements MutimediaPlayer {
    @Override
    public void playMusic(String music) {
        System.out.println("播放音乐：" + music);
    }

    @Override
    public void playVideo(String video) {
        System.out.println("播放音乐：" + video);
    }

    @Override
    public void play(String media) {
        if (media.endsWith(".mp3")) {
            playMusic(media);
        } else if (media.endsWith(".mp4")) {
            playVideo(media);
        } else {
            throw new IllegalArgumentException("Unsupported media type:" + media);
        }
    }
}
