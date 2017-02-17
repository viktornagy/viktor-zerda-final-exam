import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Viktor on 2017.02.17..
 */
public class FinalExam {

    static List<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
    static int howManyOddNumbers=0;
    static int sumOfOddNumbers=0;
    public static void main(String[] args) {

        for (int number: listOfNumbers) {
            if (number % 2 == 0) {
                howManyOddNumbers++;
                sumOfOddNumbers+=number;
            }
        }
        System.out.println(sumOfOddNumbers/howManyOddNumbers);
    }
}
