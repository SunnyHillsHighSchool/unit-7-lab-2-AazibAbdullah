//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aazib Abdullah
//Date - 2 / 3 / 21

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    // Declare a boolean variable and set it to false
		boolean last = false;
    // Activate the for loop and start from ray.size()-2 and go down to 0.
    for (int i = ray.size()-2; i >= 0; i--)
    {
      // If the contidion is true, return the value.
      if (ray.get(ray.size()-1) == ray.get(i))
      {
        // Last becomes true
        last = true;
      }
    }
    // Return last
    return last;
	}
}