/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author mufi
 */
public class Counting {
    private String s;
    
    
    public Counting(String s)
    {
        this.s = s;
    }
    
    public Map<String, Integer> wordCount() {
    Map<String, Integer> wordCount = new HashMap<>();
    StringTokenizer tokenizer = new StringTokenizer(s); 

    while (tokenizer.hasMoreTokens()) {
        String word = tokenizer.nextToken();
        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }

    return wordCount;
}
    
    public Map<Character, Integer> charCount()
    {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        return charCount;

    }
    
    

    
    
    
}
