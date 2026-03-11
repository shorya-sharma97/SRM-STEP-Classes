public class UC7 {

   
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

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patternArray) {

        for (CharacterPatternMap cp : patternArray) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }

        return new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };
    }

    
    public static void printBanner(String word, CharacterPatternMap[] patternArray) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = getCharacterPattern(ch, patternArray);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {

        CharacterPatternMap letterO = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap letterP = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap letterS = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPatternMap[] patternArray = {letterO, letterP, letterS};

        printBanner("OOPS", patternArray);
    }
}