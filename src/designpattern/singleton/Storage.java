package designpattern.singleton;

public class Storage {

    private static Storage instance;

    private Storage() {

    }

    public Storage getInstance() {
        if (instance == null)
            instance = new Storage();
        return instance;
    }

}
