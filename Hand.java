import java.util.ArrayList;

public class Hand {
    // Variable for hand object.
    public ArrayList<Tiles> hand;

    /**
     * Hand used to store tiles and represent a user's hand.
     */
    public Hand(){
        this.hand = new ArrayList<>();
        fillHand(this.hand);
    }

    /**
     * fillHand used to fill a new Hand with the starting
     * number of tiles.
     * @param holder - The Hand that will be filled.
     */
    public void fillHand(ArrayList<Tiles> holder){
        // Takes seven domino tiles from boneyard and puts into new hand.
        for(int i=0;i<7;i++){
            Bag.draw(holder);
        }
    }
}