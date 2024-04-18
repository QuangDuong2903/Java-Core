package designpattern.structural.proxy;

public class Demo {

    public static void main(String[] args) {
        ProxyVideoDownloader videoDownloader = new ProxyVideoDownloader(new RealVideoDownloader());
        videoDownloader.getVideo("java");
        videoDownloader.getVideo("python");
        videoDownloader.getVideo("spring boot");
        videoDownloader.getVideo("java");
    }
}
