public class Tiles {
    // Variables to store left and right side of domino tile values.
    public char letter;

    /**
     * Tiles used to create and store a Scrabble tile.
     * @param a - The char for the individual Scrabble tile.
     */
    public Tiles(char a) {
        letter = a;
    }


    /**
     * Used to allow output of a tile's given letter.
     * @return - Converts char to string.
     */
    @Override
    public String toString() {
        return ""+letter;
    }
}