class App {
    
    public static void main(String[] args) {
        String s1 = "codewars";
        String s2 = "hackerrank";
        int lettersToCross = 0;
        int res = compareStrings(s1, s2);
        lettersToCross = s1.length() + s2.length() - res;
        System.out.println("Crossed letters: " + lettersToCross);
        

    }



    public static int compareStrings(String s1, String s2) {
        int finalRes = 0;
        int maxLength = Math.max(s1.length(), s2.length());
        int minLength = Math.min(s1.length(), s2.length());
        String smallerWord, biggerWord;
        if(s1.length() <= s2.length()) {
            smallerWord = String.valueOf(s1);
            biggerWord = String.valueOf(s2);
        } else {
            smallerWord = String.valueOf(s2);
            biggerWord = String.valueOf(s1);
        }


        for(int i = 0; i < minLength; i++) {
        int asciOf1 = (int) smallerWord.charAt(i);

        for(int j = 0; j < maxLength; j++) {
            int asciOf2 = (int) biggerWord.charAt(j);
            if(asciOf1 == asciOf2) {
                finalRes++;
                finalRes++;
                break;
            }

        }
        }
        
        
        
    


  return finalRes;
    }
}
