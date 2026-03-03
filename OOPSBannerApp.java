/**
 * OOPSBannerApp
 *
 * UC6: Render OOPS using Helper Methods
 *
 * @author Harnath
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = new String[7];

        // Combine patterns line by line
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // O Pattern
    public static String[] getOPattern() {
        return new String[] {
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // P Pattern
    public static String[] getPPattern() {
        return new String[] {
                "******* ",
                "*     * ",
                "*     * ",
                "******* ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // S Pattern
    public static String[] getSPattern() {
        return new String[] {
                "******* ",
                "*       ",
                "*       ",
                "******* ",
                "      * ",
                "      * ",
                "******* "
        };
    }
}