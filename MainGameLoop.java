import javafx.application.Application;
import javafx.stage.Stage;
import static javafx.application.Platform.exit;

public class MainGameLoop extends Application{
    // Human player object.
    static Human humanPlayer;
    // Computer player object.
    static Computer computerPlayer;

    @Override
    public void start(Stage primaryStage) {
        // Creates bag "draw pile" for tiles to come from.
        Bag.main();

        // Create objects for human and computer player.
        humanPlayer = new Human();
        computerPlayer = new Computer();

        // Used to troubleshoot Bag contents.
        //System.out.println(Bag.bagTiles.toString());
        exit();
    }
}