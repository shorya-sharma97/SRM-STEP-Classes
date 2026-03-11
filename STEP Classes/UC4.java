public class UC4 {

    
    public static void main(String[] args) {

       
        String[] O = {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };

        
        String[] P = {
            " ******* ",
            " *     * ",
            " *     * ",
            " ******* ",
            " *       ",
            " *       ",
            " *       "
        };

        
        String[] S = {
            "  *****  ",
            " *     * ",
            " *       ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        };

       
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
}
