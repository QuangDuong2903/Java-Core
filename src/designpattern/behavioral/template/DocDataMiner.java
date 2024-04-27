package designpattern.behavioral.template;

public class DocDataMiner extends DataMiner {

    @Override
    void openFile(String name) {
        System.out.println("Opening doc file: " + name);
    }

    @Override
    void extractData(String name) {
        System.out.println("Extracting doc file: " + name);
    }

    @Override
    void closeFile(String name) {
        System.out.println("Closing doc file: " + name);
    }
}
