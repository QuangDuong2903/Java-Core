package designpattern.behavioral.template;

public class PDFDataMiner extends DataMiner {

    @Override
    void openFile(String name) {
        System.out.println("Opening pdf file: " + name);
    }

    @Override
    void extractData(String name) {
        System.out.println("Extracting pdf file: " + name);
    }

    @Override
    void closeFile(String name) {
        System.out.println("Closing pdf file: " + name);
    }
}
