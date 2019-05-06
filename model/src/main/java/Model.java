import java.io.FileNotFoundException;

public class Model implements IModel {

    @Override
    public String getHelloWorld() throws FileNotFoundException {
        return new DAOHelloWorld().getHelloWorldMessage();
    }
}
