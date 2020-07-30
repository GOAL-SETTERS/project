/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;
import java.util.Random;


/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 * @modified by Lovepreet Kaur 
 * @date 30 july 2020
 */
public class GroupOfCards {
//The group of cards, stored in an ArrayList
    public String color;
    public int value;
    private Random rand;
    private String face;

    public GroupOfCards(int v, String c) {
        value = v;
        color = c;
    }

    // to Creates a random card
    public GroupOfCards() {
        rand = new Random();
        value = rand.nextInt(28); // 108 cards in a standard Uno deck. Can be reduced to 27 (disregarding colors)
        //conditions with crad number
        if (value >= 14) 
        {
            value -= 14;
        }
        // case with card colour
        rand = new Random();
        switch (rand.nextInt(4)) {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Yellow";
                break;
        }
        // For wild cards
        if (value >= 13) {
            color = "none";
        }
    }

    public String getFace() {
        //face cards
        face = "[";
        if (color != "none") {
            face += this.color + " ";
        }

        switch (this.value) {
            default:
                face += String.valueOf(this.value);
                break;
            case 10:
                face += "Skip";
                break;
            case 11:
                face += "Reverse";
                break;
            case 12:
                face += "Draw 2";
                break;
            case 13:
                face += "Wild";
                break;
            case 14:
                face += "Wild Draw 4";
                break;
        }
        face += "]";
        return face;
    }

    
    public boolean canPlace(GroupOfCards o, String c) {
        if (this.color == c) {
            return true;
        } else if (this.value == o.value) {
            return true;
        } else if (this.color == "none") // Wild cards
        {
            return true;
        }
        return false;
    }

}//end class
