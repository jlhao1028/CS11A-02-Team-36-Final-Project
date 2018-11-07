import java.util.*;
import java.io.File;
/**
* The StoryBank class functions as the storage program of all narratives that
the HickeyLibs program can call upon.
* @author Jonah Sanders, Jiale Hao, Leah Fernandez
* @version 1.0
* @since 2018-11-6
*/
public class StoryBank{
  String story = "";
  //Initialize 3-5 stories stored in arrays
  //Think of how to put them into a method to call them into main class and into
  //a new modifiable array.

  /**
  * The storyCall method choses a the narrative according to the input the user
  * gave in the HickeyLibs class or if none was given, a random one.
  * @author Jonah Sanders
  * @version 1.0
  * @since 2018-11-6
  */
  public static void storyCall(int storyNumber){
    String story = "";
    Random rand = new Random();
      switch(storyNumber){
        case 1:
          story = "StoryOne.txt";
          break;
        case 2:
           story = "StoryTwo.txt";
          break;
        case 3:
           story = "StoryThree.txt";
          break;
        default:
          //code that will chose a random text file
          storyNumber=(rand.nextInt(3)+1);
      }
  }
  /**
  * The printStory method outputs the initial story, with blanks to the user
  * before they chose the blanks to fill in.
  * @author Jonah Sanders
  * @version 1.1
  * @since 2018-11-7
  */
  public static void printStory(String story){
    storyCall(2/*INPUT)*/);
    try {
            File filename = new File(story);
            Scanner fileReader = new Scanner(filename);
            int counter=1;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.printf("%5d: %s%n",counter++,line);
            }
            fileReader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
  }
}
