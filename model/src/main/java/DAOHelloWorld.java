import java.io.*;
import java.util.Scanner;

public class DAOHelloWorld {
    private String filename = "Hello World.txt";
    private DAOHelloWorld instance = null;

    private String helloWorldMessage = null;

    private DAOHelloWorld(){

    }

    public DAOHelloWorld getInstance() {
        return instance;
    }

    private void readFile() throws FileNotFoundException {
        helloWorldMessage = new Scanner(new FileReader(filename)).toString();
    }


    public void setInstance(DAOHelloWorld instance) {
        this.instance = instance;
    }

    public String getHelloWorldMessage() {
        return helloWorldMessage;
    }
    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}
