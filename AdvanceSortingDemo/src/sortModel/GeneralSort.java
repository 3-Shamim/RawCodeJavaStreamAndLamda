package sortModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author SHAMIM
 */
public class GeneralSort {

    public int[] intSort(int[] intNumber)
    {
        // int sort
        System.out.println("Before Sort intNumber" + Arrays.toString(intNumber));
        Arrays.sort(intNumber);
        System.out.println("After Sort intNumber" + Arrays.toString(intNumber));
        
        return intNumber;
    }
    public String[] StringSort(String[] StringValue)
    {
        // String sort
        System.out.println("Before Sort " + Arrays.toString(StringValue));
        Arrays.sort(StringValue);
        System.out.println("After Sort " + Arrays.toString(StringValue));
        
        return StringValue;
    }
    public List ListSort(List<String> StringList)
    {
        // String sort
        System.out.println("Before Sort " + StringList.toString());
        Collections.sort(StringList);
        System.out.println("After Sort " + StringList.toString());
        
        return StringList;
    }
}
