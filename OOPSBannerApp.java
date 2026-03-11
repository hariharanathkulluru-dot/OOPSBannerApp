import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - UC8
 * Using HashMap to store character patterns and render banner text.
 */
public class OOPSBannerApp {

    /**
     * Utility method to build character pattern map
     * 
     * @return Map containing character and its banner pattern
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        patternMap.put('O', O);
        patternMap.put('P', P);
        patternMap.put('S', S);

        return patternMap;
    }

    /**
     * Utility method to display banner text
     * 
     * @param message   word to display
     * @param patternMap map containing character patterns
     */
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = buildCharacterPatterns();

        String message = "OOPS";

        displayBanner(message, characterPatterns);
    }
}