package designpattern.structural.proxy;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public void getVideo(String url) {
        System.out.println("Downloading: " + url);
    }
}
