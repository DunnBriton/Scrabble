import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;
import static javafx.application.Platform.exit;

public class MainGameLoop extends Application{
    // Human player object.
    static Human humanPlayer;
    // Computer player object.
    static Computer computerPlayer;
    // General input scanner.
    static Scanner input = new Scanner(System.in);

    @Override
    public void start(Stage primaryStage) {
        // Creates bag "draw pile" for tiles to come from.
        Bag.main();

        // Create objects for human and computer player.
        humanPlayer = new Human();
        computerPlayer = new Computer();

        // Human player goes first.
        //humanTurn();

        // Used to troubleshoot Bag contents.
        System.out.println(Bag.bagTiles.toString());
        exit();
    }

    public void humanTurn(){
        // Do Stuff.
        String in = input.next();
        switch (in){
            case "a" -> {}
            case "b" -> {}
            default  -> {}
        }

        // Call Computer Turn
        computerTurn();
    }

    public void computerTurn(){
        // Do Stuff.
        // Call Human Turn.
        humanTurn();
    }
}