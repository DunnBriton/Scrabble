import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bag {
    // Variable used to store domino tiles in a draw pile.
    static ArrayList<Tiles> bagTiles = new ArrayList<>();

    /**
     * main fills the bag players will draw from
     * Returns void.
     */
    public static void main(){
        // A - 9 Tiles.
        for(int i=0;i<9;i++){ bagTiles.add(new Tiles('a')); }
        // B - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('b')); }
        // C - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('c')); }
        // D - 4 Tiles.
        for(int i=0;i<4;i++){ bagTiles.add(new Tiles('d')); }
        // E - 12 Tiles.
        for(int i=0;i<12;i++){ bagTiles.add(new Tiles('e')); }
        // F - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('f')); }
        // G - 3 Tiles.
        for(int i=0;i<3;i++){ bagTiles.add(new Tiles('g')); }
        // H - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('h')); }
        // I - 9 Tiles.
        for(int i=0;i<9;i++){ bagTiles.add(new Tiles('i')); }
        // J - 1 Tile.
        bagTiles.add(new Tiles('j'));
        // K - 1 Tile.
        bagTiles.add(new Tiles('k'));
        // L - 4 Tiles.
        for(int i=0;i<4;i++){ bagTiles.add(new Tiles('l')); }
        // M - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('m')); }
        // N - 6 Tiles.
        for(int i=0;i<6;i++){ bagTiles.add(new Tiles('n')); }
        // O - 8 Tiles.
        for(int i=0;i<8;i++){ bagTiles.add(new Tiles('o')); }
        // P - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('p')); }
        // Q - 1 Tile.
        bagTiles.add(new Tiles('q'));
        // R - 6 Tiles.
        for(int i=0;i<6;i++){ bagTiles.add(new Tiles('r')); }
        // S - 4 Tiles.
        for(int i=0;i<4;i++){ bagTiles.add(new Tiles('s')); }
        // T - 6 Tiles.
        for(int i=0;i<6;i++){ bagTiles.add(new Tiles('t')); }
        // U - 4 Tiles.
        for(int i=0;i<4;i++){ bagTiles.add(new Tiles('u')); }
        // V - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('v')); }
        // W - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('w')); }
        // X - 1 Tile.
        bagTiles.add(new Tiles('x'));
        // Y - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('y')); }
        // Z - 1 Tile.
        bagTiles.add(new Tiles('z'));
        // Blank - 2 Tiles.
        for(int i=0;i<2;i++){ bagTiles.add(new Tiles('*')); }

        // Shuffles the tiles so draw is random.
        Collections.shuffle(bagTiles);
    }

    /**
     * draw adds a tile to given tray and removes it from the Bag.
     * @param tray - The user tray to add to.
     * Return void.
     */
    public static void draw(ArrayList<Tiles> tray){
        Random random = new Random();
        int i;
        // Makes sure correct call is used based on boneyard size.
        if(bagTiles.size() > 1){
            i = random.nextInt(0, bagTiles.size()-1);
        }
        else{
            i = random.nextInt(0, bagTiles.size());
        }
        // Pulls tile, adds to tray, removes from boneyard, returns tray.
        tray.add(bagTiles.get(i));
        bagTiles.remove(i);
    }

    /***
     * exchangeAll is used to replace tiles in given tray with the
     * same number of new tiles.
     * @param tray - The tray that needs tiles exchanged.
     * @return     - Returns the modified tray.
     */
    public static ArrayList<Tiles> exchangeAll(ArrayList<Tiles> tray){
        // Add tiles from tray back into the bag and shuffle.
        bagTiles.addAll(tray);
        Collections.shuffle(bagTiles);
        // Saves the size of given tray and removes all tiles from tray.
        int hold = tray.size();
        tray.clear();
        // Draw tiles to tray until equivalent number is drawn.
        for(int i = 0; i < hold; i++){
            draw(tray);
        }
        // Returns modified tray.
        return tray;
    }

    /**
     * exchangeOne is used to replace a specific tile in given tray
     * with a new random tile.
     * @param tray - The tray that needs a tile replaced.
     * @param x    - The tile index that needs to be replaced.
     * @return     - Returns the modified tray.
     */
    public static ArrayList<Tiles> exchangeOne(ArrayList<Tiles> tray, int x){
        // Stores tile, removes tile, and replaces with new tile.
        Tiles holder = tray.get(x);
        tray.remove(x);
        draw(tray);
        // Adds stored tile to the bag and shuffles tiles.
        bagTiles.add(holder);
        Collections.shuffle(bagTiles);
        // Returns modified tray.
        return tray;
    }
}