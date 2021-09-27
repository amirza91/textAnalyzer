import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader inputs = new BufferedReader(new FileReader("input.txt"));
        HashMap<String, Integer> words = new HashMap<>();
        ArrayList<String> order = new ArrayList<>();
        String line = "";
        while((line = inputs.readLine())!= null){
            line = line.replaceAll("(\\.|,|;|:|\\?|\\!)", "");
            line = line.replaceAll("( )+", " ");
            line = line.toLowerCase(Locale.ROOT);
            String[] lineWords = line.split(" ");
            for(String word: lineWords){
                if(words.containsKey(word)){
                    words.put(word, words.get(word) + 1);

                }
                else
                    words.put(word, 1);

            }




        }
        List<Map.Entry<String, Integer> >
                list = new LinkedList<>(words.entrySet());

        // Sort the list
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        System.out.println(list);
        // use put and gets. put adds to hashmap and establishes initial value. get returns value for a specific key.


    }
}
