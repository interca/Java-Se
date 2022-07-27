package homework2;

public interface equipment {
    //设备包含U盘、MP3播放器、移动硬盘
    default public void MP3(){
        System.out.println("MP3听歌");
    }

      default public void USBflashdisk(){
          System.out.println("U盘存储");
      }

      default public void MobileHarddisk(){
          System.out.println("移动硬盘存储");
      }


}
