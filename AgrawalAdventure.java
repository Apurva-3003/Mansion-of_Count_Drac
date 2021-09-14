/*
This program is a game where you, the user, make your own decisions.
Depending on your answer you will either live or die.
Welcome to the mansion of the one and only..... Count DRACULA
 */
package agrawaladventure;
import java.util.Scanner;

public class AgrawalAdventure {

    public static void main(String[] args) {
        
        //declare variable which stores the user's value(their choice)
        String choice;
        
        //Intro to the story
        System.out.println("Welcome to the mansion of Count Dracula! Don't fret,"
                + " as long\nas the count likes you nothing could possibly "
                + "happen...right?:-)\nMake the right choices and you may live "
                + "to see the light of day again\n\n**************************"
                + "*********************************************");
        
        //Creates new Scanner class to take the user's input
        Scanner keyedInput = new Scanner(System.in);
        
        //Asks the user a questions and prompts for a yes or no response
        System.out.println("\nCount invites you to dinner, accept?(yes) or (no)");
        choice = keyedInput.nextLine();
        
        //Following lines will execute depending on what the user enters as the
        //value for choice
        if(choice.equals("yes")){
            System.out.println("The count and you have a wonderful time, he asks if "
                    + "you're ready for a round of chess? (yes or no)");
            choice = keyedInput.nextLine();
            if(choice.equals("yes")){
                System.out.println("The count and you have a wonderful time playing chess,"
                        + "ready for bed? (yes or no)");
                choice = keyedInput.nextLine();
                if(choice.equals("yes")){
                    System.out.println("You head to bed in a very sweet room,"
                            + "the count was very considerate. \nYou wake up early "
                            + "and are all ready to leave. Do you want to? (yes or no)");
                    choice = keyedInput.nextLine();
                    if(choice.equals("yes")){
                        System.out.println("You forgot to say your farewell!! Count Dracula"
                                + "is furious! \nHe picks you up by the neck and... You Die!!!");
                    }else if(choice.equals("no")){
                        System.out.println("You say your farewells to the count and leave."
                                + "\nCongratulations! You have succesfully left the mansion!");
                    }
                }else if(choice.equals("no")){
                    System.out.println("You play chase throughout the night. The count likes you!\n"
                            + "He says he won't let go of you and you are locked in a cell for "
                            + "the rest of your life!!!");
                }
            } else if(choice.equals("no")){
                System.out.println("Pssshh, the count thinks you're no fun...you shall die!!!");
            }
        }else if(choice.equals("no")){
            System.out.println("Do you want to leave the mansion ASAP? (yes or no)");
            choice = keyedInput.nextLine();
            if(choice.equals("yes")){
                System.out.println("The count catches you on the way out, and observing your intention"
                        + ", \nhe locks you in a cell.You have failed and are left to die");
            }else if(choice.equals("no")){
                System.out.println("You go straight to bed. The count knocks on "
                        + "the door. Do you answer? (yes or no)");
                choice = keyedInput.nextLine();
                if(choice.equals("yes")){
                    System.out.println("The count is furious by your behaviour.\n"
                            + "He slices you up and feeds you to the rats. You have died");
                }else if(choice.equals("no")){
                    System.out.println("The count is furious by your behavious.\n "
                            + "He breaks down the door and kills you. You die!");
                }
            }
        }
        //hope that was fun!
    }
}
