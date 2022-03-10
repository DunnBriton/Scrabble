import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import static javafx.application.Platform.exit;

public class MainGameLoop extends Application{
    // Human player object.
    static Tray humanPlayer;
    // Computer player object.
    static Tray computerPlayer;
    // General input scanner.
    static Scanner input = new Scanner(System.in);

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Creates new bag and board.
        Bag.main();
        Board.newBoard();

        // Create objects for human and computer player.
        humanPlayer = new Tray();
        computerPlayer = new Tray();

        // Human player goes first.
        //humanTurn();


        Board.newBoard();

        exit();
    }

    /**
     * humanTurn used for User actions.
     * Returns void.
     */
    public void humanTurn(){
        System.out.println("Human's Turn - " + humanPlayer.hand);
        System.out.println("""
                Select choice from given options.
                1 - Play
                2 - Exchange
                3 - Pass
                """);
        // Do Stuff.
        String in = input.next();
        switch (in){
            case "1" -> System.out.println("Chose Play");
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
                            Bag.exchangeAll(humanPlayer.hand);
                            System.out.println(humanPlayer.hand);
                        }
                        else{
                            System.out.println("Bag is empty, unable to " +
                                    "draw. Restarting turn.");
                            humanTurn();
                        }
                    }
                    case "2" -> {
                        // Do something to exchange one tile.
                        System.out.println("Which tile to replace? - (0-" + (humanPlayer.hand.size()-1) + ")");
                        System.out.println(humanPlayer.hand);
                        int inInt = input.nextInt();

                        if(inInt >= 0 && inInt <= humanPlayer.hand.size()-1){
                            Bag.exchangeOne(humanPlayer.hand, inInt);
                            System.out.println(humanPlayer.hand);
                        }
                        else{
                            invalidItems();
                        }
                    }
                    case "3" -> {
                        System.out.println("User chose to not exchange " +
                                "tiles.\nRestarting turn.");
                        humanTurn();
                    }
                    default  -> invalidItems();
                }
            }
            case "3" -> System.out.println("Chose Pass");
            default  -> invalidItems();
        }
        // Call Computer Turn
        computerTurn();
    }

    /**
     * computerTurn is used for nonUser turns.
     * Returns void.
     */
    public void computerTurn(){
        // Stuff for testing
        System.out.println("Got to computer turn.");
        exit();

        // Do Stuff.

        // Call Human Turn.
        //humanTurn();
    }

    /**
     * invalidItems is used when an invalid input is given.
     * Created to make code a bit cleaner.
     * Returns void.
     */
    public void invalidItems(){
        System.out.println("Invalid input, restarting turn.\n");
        humanTurn();
    }
}