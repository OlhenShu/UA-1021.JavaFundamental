package hw11.task1;

public class SentenceOf5Words {
    private String sentence;

    public SentenceOf5Words(String sentence) {
        this.sentence = sentence;
    }

    public String theLongestWord() {
        String [] words = sentence.split(" ");
        String theLongest = words[0];
        for (String word: words) {
            if (word.length() > theLongest.length()) {
                theLongest = word;
            }
        }
        return theLongest;
    }

    public int sizeOfTheLongest() {
        return this.theLongestWord().length();
    }

    public String reverseSecond() {
        String [] words = sentence.split(" ");
        StringBuilder secondWord = new StringBuilder(words[1]);
        return secondWord.reverse().toString();
    }
}
