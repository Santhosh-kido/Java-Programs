import java.util.HashMap;
import java.util.Map;

public class HighLowFrequencyChars {
    public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder highFreq = new StringBuilder();
        StringBuilder lowFreq = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
                highFreq.append(key + " ");
            } else {
                lowFreq.append(key + " ");
            }
        }
        System.out.println("Highest frequency characters : " + highFreq);
        System.out.println("Lowest frequency characters : " + lowFreq);
    }
}
