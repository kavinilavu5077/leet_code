public class checkIfTwoStringArraysAreEquivalent {
   
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < word1.length; i++) {
                str1.append(word1[i]);   
            }
            for (int i = 0; i < word2.length; i++) {
                str2.append(word2[i]);  
            }
            return str1.toString().equals(str2.toString());
        }
    
        public static void main(String[] args) {
            checkIfTwoStringArraysAreEquivalent solution = new checkIfTwoStringArraysAreEquivalent();
            String[] word1 = {"ab", "c"};
            String[] word2 = {"a", "bc"};
            boolean result = solution.arrayStringsAreEqual(word1, word2);
            System.out.println(result); // Output: true
    
            String[] word1b = {"a", "cb"};
            String[] word2b = {"ab", "c"};
            boolean result2 = solution.arrayStringsAreEqual(word1b, word2b);
            System.out.println(result2); // Output: false
        }
    }
    

