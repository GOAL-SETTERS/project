/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Megha Patel
 * @modified by @Kamalpreet Kaur
 */
public class Card implements Vali1, Vali2 {

    @Override
    public boolean checklength(String s) {

        return s.length() >= 8;// return valye if s is atleast 8

    }
    //method that check password contain atleast one uppercase character

    @Override
    public boolean checkUppercase(String s) {

        String upperCaseChars = "(.*[A-Z].*)";
        return s.matches(upperCaseChars); //return true if s matches to uppercaseChars

    }
    //  method password contain atleast one special character

    public boolean checkSpecialCharacter(String s) {

        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        return s.matches(specialChars);  //return true if s matches to specialChars

    }

}
