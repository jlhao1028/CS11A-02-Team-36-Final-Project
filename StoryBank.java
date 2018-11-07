import java.util.*;
/**
* The StoryBank class functions as the storage program of all narratives that
the HickeyLibs program can call upon.
* @author Jonah Sanders, Jiale Hao, Leah Fernandez
* @version 1.0
* @since 2018-11-6
*/
public class StoryBank{
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
  public static int storyCall(int storyNumber){
      switch(storyNumber){
        case 1:
          //code that reads from txt file storyOne
          //System.out.println(Arrays.toString(storyOne));
          break;
        case 2:
            //code that reads from txt file storyOne
          System.out.println(Arrays.toString(storyTwo));
          break;
        case 3:
          //code that reads from txt file storyOne
          System.out.println(Arrays.toString(storyThree));
          break;
        case 4:
          //code that reads from txt file storyOne
          out.println(Arrays.toString(storyFour));
          break;
        case 5:
          //code that reads from txt file storyOne
          System.out.println(Arrays.toString(storyFive));
          break;
        default:
          //code that reads from txt file storyOne
          storyNumber=(Math.Random(4)+1);
      }
  }
}
