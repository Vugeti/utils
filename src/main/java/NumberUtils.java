import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = numbers.get(i) + sum;
        }
        return sum;
    }
    public List<Integer> getMultiplyOddNumber(List<Integer> numbers){
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2!=0){
                oddNums.add(numbers.get(i));
            }
        }
        return oddNums;
    }
}
