/**
 * OOPSBannerApp displays the OOPS banner in various formats.
 * UC1: Prints the literal string "OOPS" to the console.
 * * @author User
 * @version 1.0
 */
public class UC3 {

   
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

       
        for (int i = 0; i < 7; i++) {

            String line = String.join(" ",
                    O[i],
                    O[i],
                    P[i],
                    S[i]
            );

            System.out.println(line);
        }
    }
}