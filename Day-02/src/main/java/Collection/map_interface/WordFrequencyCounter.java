package Collection.map_interface;


import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
        public static Map<String, Integer> countWordFrequency(String filePath) throws IOException {
            Map<String, Integer> wordCountMap = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
            reader.close();
            return wordCountMap;
        }

        public static void main(String[] args) {
            String filePath = "file.txt";
            try {
                Map<String, Integer> wordFrequency = countWordFrequency(filePath);
                System.out.println(wordFrequency);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }

