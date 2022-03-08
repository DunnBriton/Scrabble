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
        humanTurn();

        Board.newBoard();

        exit();
    }

    public void humanTurn(){
        System.out.println("Human's Turn - " + humanPlayer.humanTray.hand);
        System.out.println("""
                Select choice from given options.
                1 - Play
                2 - Exchange
                3 - Pass
                """);
        // Do Stuff.
        String in = input.next();
        switch (in){
            case "1" -> {
                System.out.println("Chose Play");
            }
            case "2" -> {
                System.out.println("""
                        Chose Exchange -
                        How many would you like to exchange.
                        1 - All
                        2 - One
                        3 - None
                        """);
                in = input.next();
                switch (in){
                    case "1" -> {
                        if(Bag.bagTiles.size() > 0){
                            Bag.exchangeAll(humanPlayer.humanTray.hand);
                            System.out.println(humanPlayer.humanTray.hand);
                        }
                        else{
                            System.out.println("Bag is empty, unable to " +
                                    "draw. Restarting turn.");
                            humanTurn();
                        }
                    }
                    case "2" -> {
                        // Do something to exchange one tile.
                        System.out.println("Which tile to replace? - (0-" + (humanPlayer.humanTray.hand.size()-1) + ")");
                        System.out.println(humanPlayer.humanTray.hand);
                        int inInt = input.nextInt();

                        if(inInt >= 0 && inInt <= humanPlayer.humanTray.hand.size()-1){
                            // CREATE SINGLE EXCHANGE FUNCTION AND DO EXCHANGE.
                        }
                        else{
                            // DO INVALID SELECTION (COULD MAKE INVALID METHOD TO SAVE TYPING.
                        }
                    }
                    case "3" -> {
                        System.out.println("User chose to not exchange " +
                                "tiles.\nRestarting turn.");
                        humanTurn();
                    }
                    default  -> {
                        System.out.println("Incorrect input, turn " +
                                "restarting.\n");
                        humanTurn();
                    }
                }
            }
            case "3" -> {
                System.out.println("Chose Pass");
            }
            default  -> {
                System.out.println("Incorrect input, turn restarting.\n");
                humanTurn();
            }
        }

        // Call Computer Turn
        computerTurn();
    }

    public void computerTurn(){
        // Stuff for testing
        System.out.println("Got to computer turn.");
        exit();

        // Do Stuff.

        // Call Human Turn.
        //humanTurn();
    }
}