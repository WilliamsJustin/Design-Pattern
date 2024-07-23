package 设计模式.结构性模式_7种.类.适配器模式_Adapter;

// 原始接口的实现类 Mp4Player
class Mp4Player implements AdavancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name:" + fileName);
    }
}

