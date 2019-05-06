import java.io.*;
import java.util.Scanner;

public class DAOHelloWorld {
    private String filename = "src/HelloWorld.txt";
    private DAOHelloWorld instance = null;

    private String helloWorldMessage = null;

    public DAOHelloWorld() throws FileNotFoundException {
        readFile();
    }

    public DAOHelloWorld getInstance() {
        return instance;
    }

    private void readFile() throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                helloWorldMessage=line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }    }


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
