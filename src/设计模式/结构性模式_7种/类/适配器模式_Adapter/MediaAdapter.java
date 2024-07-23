package 设计模式.结构性模式_7种.类.适配器模式_Adapter;

// 适配器 MediaAdapter
class MediaAdapter implements MediaPlayer {
    private AdavancedMediaPlayer adavancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            adavancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            adavancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            adavancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            adavancedMediaPlayer.playMp4(fileName);
        }
    }
}

