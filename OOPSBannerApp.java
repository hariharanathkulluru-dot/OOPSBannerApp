import java.util.*;

/**
 * OOPSBannerApp demonstrates printing the word OOPS
 * in banner format using character pattern mappings.
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class that stores a character
     * and its corresponding banner pattern.
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         * 
         * @param character Character to be stored
         * @param pattern 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method to return the character
         * 
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method to return pattern
         * 
         * @return string array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to find pattern for a character
     * 
     * @param arr array of CharacterPatternMap objects
     * @param ch character to search
     * @return pattern array
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] arr, char ch) {

        for (CharacterPatternMap obj : arr) {
            if (obj.getCharacter() == ch) {
                return obj.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to print banner text
     * 
     * @param text word to display
     * @param arr array of CharacterPatternMap objects
     */
    public static void printBanner(String text, CharacterPatternMap[] arr) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);

                String[] pattern = getCharacterPattern(arr, ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

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

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        printBanner("OOPS", patterns);
    }
}