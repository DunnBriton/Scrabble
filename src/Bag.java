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
     * draw adds a tile to given hand and removes it from the Bag.
     * @param hand - The user hand to add to.
     * Return void.
     */
    public static void draw(ArrayList<Tiles> hand){
        Random random = new Random();
        int i;
        // Makes sure correct call is used based on boneyard size.
        if(bagTiles.size() > 1){
            i = random.nextInt(0, bagTiles.size()-1);
        }
        else{
            i = random.nextInt(0, bagTiles.size());
        }
        // Pulls tile, adds to hand, removes from boneyard, returns hand.
        hand.add(bagTiles.get(i));
        bagTiles.remove(i);
    }
}