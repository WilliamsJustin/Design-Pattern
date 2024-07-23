package 设计模式.结构性模式_7种.类.适配器模式_Adapter;

//原始接口的实现类 VlcPlayer
class VlcPlayer implements AdavancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}

