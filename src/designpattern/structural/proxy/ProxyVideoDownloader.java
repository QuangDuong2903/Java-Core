package designpattern.structural.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyVideoDownloader implements VideoDownloader {

    private final RealVideoDownloader videoDownloader;

    private final Set<String> cache = new HashSet<>();

    public ProxyVideoDownloader(RealVideoDownloader videoDownloader) {
        this.videoDownloader = videoDownloader;
    }

    @Override
    public void getVideo(String url) {
        if (cache.contains(url))
            System.out.println("Using cached, receiving: " + url);
        else {
            videoDownloader.getVideo(url);
            cache.add(url);
        }
    }
}
