import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] arg) throws FileNotFoundException {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view,model);
        controller.run();
    }
}