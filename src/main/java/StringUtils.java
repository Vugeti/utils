import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public String getShortestWord(List<String> words) {
        String shortestWords = words.get(0);
        for (int i = 0; i < words.size(); i++) {
            if (shortestWords.length() > words.get(i).length()) {
                shortestWords = words.get(i);
            }
        }
        return shortestWords;
    }

}
