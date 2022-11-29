package dataStrucures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public class MostFrequentWord {
    public static void main(String[] args) {
        mostFrequentWord(sentence());
    }

    private static String sentence() {
        String sentence = "But then they were married (she felt awful about being pregnant before but\n" +
                "Harry had been talking about marriage for a while and anyway laughed when\n" +
                "she told him in early February about missing her period and said Great she\n" +
                "was terribly frightened and he said Great and lifted her put his arms around\n" +
                "under her bottom and lifted her like you would a child he could be so\n" +
                "wonderful when you didn’t expect it in a way it seemed important that you\n" +
                "didn’t expect it there was so much nice in him she couldn’t explain to\n" +
                "anybody she had been so frightened about being pregnant and he made her\n" +
                "be proud) they were married after her missing her second period in March\n" +
                "and she was still little clumsy dark-complected Janice Springer and her\n" +
                "husband was a conceited lunk who wasn’t good for anything in the world Daddy\n" +
                "said and the feeling of being alone would melt a little with a little drink.";
        return sentence;
    }

    private static void mostFrequentWord(String sentence) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        asList(sentence.split(" ")).forEach(s -> {
            if (wordsMap.containsKey(s)) {
                Integer count = wordsMap.get(s);
                wordsMap.put(s, count + 1);
            } else {
                wordsMap.put(s, 1);
            }
        });
        int maxValue = (Collections.max(wordsMap.values()));
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
//# Most frequent word
//
//- Write a function that receives a sentence (string) as a parameter and
//  returns the most frequent word of that sentence. If there is more
//  than one such word return any one of them.
//
//- Test the method with the sentence from John Updike’s 'Rabbit, Run':
//
//```text
//But then they were married (she felt awful about being pregnant before but
//Harry had been talking about marriage for a while and anyway laughed when
//she told him in early February about missing her period and said Great she
//was terribly frightened and he said Great and lifted her put his arms around
//under her bottom and lifted her like you would a child he could be so
//wonderful when you didn’t expect it in a way it seemed important that you
//didn’t expect it there was so much nice in him she couldn’t explain to
//anybody she had been so frightened about being pregnant and he made her
//be proud) they were married after her missing her second period in March
//and she was still little clumsy dark-complected Janice Springer and her
//husband was a conceited lunk who wasn’t good for anything in the world Daddy
//said and the feeling of being alone would melt a little with a little drink.
//```
//
//Expected result: `and`
