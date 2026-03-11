public class UC6 {

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ",
                    O[i],
                    O[i],  
                    P[i],
                    S[i]
            );
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    public static String[] getOPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }

    
    public static String[] getPPattern() {
        return new String[] {
            " ******* ",
            " *     * ",
            " *     * ",
            " ******* ",
            " *       ",
            " *       ",
            " *       "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *       ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        };
    }
}