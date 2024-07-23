package 设计模式.设计原则.接口隔离原则_ISP;

// 在使用这些类的时候，我们可以像下面这样来使用：
public class Client {
    public static void main(String[] args) {
        MutimediaPlayer mixPlayer = new MixPlayer();
        mixPlayer.playMusic("music.mp3");
        mixPlayer.playVideo("video.mp4");
        mixPlayer.play("movie.avi");
    }
}
