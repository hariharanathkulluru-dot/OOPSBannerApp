/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern using Inner Static Class
 *
 * @author Varun
 * @version 7.0
 */
public class OOPSBannerApp {

    // Inner Static Class
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create O Pattern
    public static CharacterPatternMap createO() {
        return new CharacterPatternMap('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });
    }

    // Create P Pattern
    public static CharacterPatternMap createP() {
        return new CharacterPatternMap('P', new String[]{
                "******* ",
                "*     * ",
                "*     * ",
                "******* ",
                "*       ",
                "*       ",
                "*       "
        });
    }

    // Create S Pattern
    public static CharacterPatternMap createS() {
        return new CharacterPatternMap('S', new String[]{
                "******* ",
                "*       ",
                "*       ",
                "******* ",
                "      * ",
                "      * ",
                "******* "
        });
    }

    public static void main(String[] args) {

        CharacterPatternMap[] letters = {
                createO(),
                createO(),
                createP(),
                createS()
        };

        for (int row = 0; row < 7; row++) {

            StringBuilder builder = new StringBuilder();

            for (CharacterPatternMap letter : letters) {
                builder.append(letter.getPattern()[row]).append(" ");
            }

            System.out.println(builder.toString());
        }
    }
}