import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("two");
        stringList.add("one");
        stringList.add("three");
        stringList.add("three");
        stringList.add("three1");


        System.out.println(stringList);

        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.getShortestWord(stringList));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(3);
        integerList.add(2);
        integerList.add(7);
        integerList.add(6);
        System.out.println(stringList);

        NumberUtils numberUtils = new NumberUtils();
        System.out.println(numberUtils.getSum(integerList));
        System.out.println(numberUtils.getMultiplyOddNumber(integerList));
    }
}
