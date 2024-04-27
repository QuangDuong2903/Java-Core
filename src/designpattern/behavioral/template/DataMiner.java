package designpattern.behavioral.template;

public abstract class DataMiner {
    void mine(String name) {
        openFile(name);
        extractData(name);
        closeFile(name);
    }

    abstract void openFile(String name);
    abstract void extractData(String name);
    abstract void closeFile(String name);
}
