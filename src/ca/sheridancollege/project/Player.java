/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 * @modified by Arshpreet Kaur
 */

    /**
     * A class that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    
 
   
public class Player implements Vali1 {

    @Override
    public boolean checklength(String s) {

        return s.length() >= 5;// return true if s is atleast 8

    }

    @Override
    public boolean checkSpecialCharacter(String s) {

        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        return s.matches(specialChars);  //return true if s matches to specialChars

    }

}

