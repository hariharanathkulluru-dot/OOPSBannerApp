/**
 * OOPSBannerApp - UC7
 * Demonstrates storing character patterns using an Inner Static Class
 * and printing the banner for the word OOPS.
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to store a character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character Character to display
         * @param pattern   Banner pattern for the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern for a specific character
     * 
     * @param characterPatterns array of CharacterPatternMap objects
     * @param ch                character to search
     * @return pattern of the character
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] characterPatterns, char ch) {

        for (CharacterPatternMap cp : characterPatterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }

        return new String[7];
    }

    /**
     * Utility method to display banner text
     * 
     * @param text              word to display
     * @param characterPatterns array of CharacterPatternMap objects
     */
    public static void displayBanner(String text, CharacterPatternMap[] characterPatterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char ch : text.toCharArray()) {

            String[] pattern = getCharacterPattern(characterPatterns, ch);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }

    /**
     * Main Method
     */
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
                "*     ",
                "*     ",
                " ***** ",
                "     *",
                "     *",
                "***** "
        };

        CharacterPatternMap[] characterPatterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        displayBanner("OOPS", characterPatterns);
    }
}