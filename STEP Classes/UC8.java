import java.util.HashMap;
import java.util.Map;


public class UC8 {

    
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

  
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 7; // Each character has 7 rows

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                } else {
                    line.append("       ").append("  ");
                }
            }

            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        renderBanner("OOPS", patternMap);
    }
}