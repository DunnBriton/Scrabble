import java.io.FileWriter;
import java.io.IOException;

public class Board {
    /**
     * newBoard is used to start the game with a proper empty board.
     * Returns void.
     */
    public static void newBoard(){
        try {
            FileWriter myWriter = new FileWriter("ScrabbleBoard.txt");
            myWriter.write("""
                    15
                    3. .. .. .2 .. .. .. 3. .. .. .. .2 .. .. 3.
                    .. 2. .. .. .. .3 .. .. .. .3 .. .. .. 2. ..
                    .. .. 2. .. .. .. .2 .. .2 .. .. .. 2. .. ..
                    .2 .. .. 2. .. .. .. .2 .. .. .. 2. .. .. .2
                    .. .. .. .. 2. .. .. .. .. .. 2. .. .. .. ..
                    .. .3 .. .. .. .3 .. .. .. .3 .. .. .. .3 ..
                    .. .. .2 .. .. .. .2 .. .2 .. .. .. .2 .. ..
                    3. .. .. .2 .. .. .. ** .. .. .. .2 .. .. 3.
                    .. .. .2 .. .. .. .2 .. .2 .. .. .. .2 .. ..
                    .. .3 .. .. .. .3 .. .. .. .3 .. .. .. .3 ..
                    .. .. .. .. 2. .. .. .. .. .. 2. .. .. .. ..
                    .2 .. .. 2. .. .. .. .2 .. .. .. 2. .. .. .2
                    .. .. 2. .. .. .. .2 .. .2 .. .. .. 2. .. ..
                    .. 2. .. .. .. .3 .. .. .. .3 .. .. .. 2. ..
                    3. .. .. .2 .. .. .. 3. .. .. .. .2 .. .. 3.""");
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}