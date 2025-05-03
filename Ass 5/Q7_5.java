//************** Q7 ***************/


public class Q7_5 {
    public static void main(String[] args) {
        
        String paragraph = "The sun rises in the east. The sun is bright. sun";
        String word = "sun";

        paragraph = paragraph.toLowerCase();
        word = word.toLowerCase();

        int count = countWordOccurrences(paragraph, word);
        System.out.println("The word '" + word + "' appears " + count + " times.");
    }

    static int countWordOccurrences(String text, String word) {
        String[] words = text.split("\\s+");  
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}

