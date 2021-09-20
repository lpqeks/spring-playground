package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WordCounter {

    public WordCounter() {
    }

    public HashMap<String, Integer> getWordCount(String sentence) {

        sentence = sentence.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = sentence.split(" ");
        List<String> wordList = new ArrayList<>(Arrays.asList(words));

        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Map<String, Integer> count = new HashMap<>();

        for (String word : wordSet) {
            count.put(word, Collections.frequency(wordList, word));

        }

        return (HashMap<String, Integer>) count;
    }
}
