package javastream.countwords;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CountWordsOfFile {
        public static void countWords(String filePath) {
            Map<String, Integer> wordCount = new HashMap<>();

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    line = line.toLowerCase().replaceAll("[^a-z ]", "");
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (!word.isEmpty()) {
                            if (wordCount.containsKey(word)) {
                                wordCount.put(word, wordCount.get(word) + 1);
                            } else {
                                wordCount.put(word, 1);
                            }
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return;
            }

            int totalWords = 0;
            for (int count : wordCount.values()) {
                totalWords += count;
            }
            System.out.println("Total words in file: " + totalWords);

            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCount.entrySet());

            for (int i = 0; i < wordList.size() - 1; i++) {
                for (int j = i + 1; j < wordList.size(); j++) {
                    if (wordList.get(i).getValue() < wordList.get(j).getValue()) {
                        Map.Entry<String, Integer> temp = wordList.get(i);
                        wordList.set(i, wordList.get(j));
                        wordList.set(j, temp);
                    }
                }
            }

            System.out.println("\nTop 5 most frequent words:");
            for (int i = 0; i < Math.min(5, wordList.size()); i++) {
                System.out.println(wordList.get(i).getKey() + " -> " + wordList.get(i).getValue());
            }
        }

    }
     class WordCountMain {
        public static void main(String[] args) {
            String filePath = "source.txt";
            CountWordsOfFile.countWords(filePath);
        }

    }

