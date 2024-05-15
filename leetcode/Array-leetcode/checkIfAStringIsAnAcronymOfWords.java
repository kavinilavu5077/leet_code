import java.util.List;
import java.util.Arrays;
public class checkIfAStringIsAnAcronymOfWords {


    public boolean isAcronym(List<String> words, String s) {
        StringBuilder nm = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            nm.append(words.get(i).charAt(0));
        }
        return nm.toString().equals(s);
    }

    public static void main(String[] args) {
        checkIfAStringIsAnAcronymOfWords solution = new checkIfAStringIsAnAcronymOfWords();
        
        List<String> words1 = Arrays.asList("National", "Aeronautics", "Space", "Administration");
        String s1 = "NASA";
        boolean result1 = solution.isAcronym(words1, s1);
        System.out.println(result1); // Output: true

        List<String> words2 = Arrays.asList("Light", "Amplification", "by", "Stimulated", "Emission", "of", "Radiation");
        String s2 = "LASER";
        boolean result2 = solution.isAcronym(words2, s2);
        System.out.println(result2); // Output: true

        List<String> words3 = Arrays.asList("Random", "Access", "Memory");
        String s3 = "RAM";
        boolean result3 = solution.isAcronym(words3, s3);
        System.out.println(result3); // Output: true

        List<String> words4 = Arrays.asList("Central", "Processing", "Unit");
        String s4 = "CPU";
        boolean result4 = solution.isAcronym(words4, s4);
        System.out.println(result4); // Output: true

        List<String> words5 = Arrays.asList("Graphical", "User", "Interface");
        String s5 = "GUI";
        boolean result5 = solution.isAcronym(words5, s5);
        System.out.println(result5); // Output: true

        List<String> words6 = Arrays.asList("Hypertext", "Markup", "Language");
        String s6 = "XML";
        boolean result6 = solution.isAcronym(words6, s6);
        System.out.println(result6); // Output: false
    }
}

