package de.oth.pg2.grosseUebung.aufgabe3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String _name;
    private String _text;

    private List<String> _likesList = new ArrayList<String>();
    private List<String> _lovesList = new ArrayList<String>();
    private List<String> _hatesList = new ArrayList<String>();
    

    public Person(String text) {
        String[] verbs = new String[] { "likes", "hates", "loves", "and" };
        
        // example "Jim likes Larry and Jean, loves Tom, but hates Kim"
        this._text = text;
        
        // ["Jim likes Larry and Jean", "loves Tom", "but hates Kim"]
        String[] split_text = text.split(",");
        
        // ["Jim", "likes", "Larry", "and", "Jean"] => "Jim"
        this._name = split_text[0].split(" ")[0];
          
        for (String s : split_text) {
            String[] words = s.trim().split(" ");
            String verb = "";
            
            for (int index = 0; index < words.length; index = index + 2) {
                // "likes", "loves", "hates" appears either on first or second place
  
                 if (
                        // the verb is on the second place
                        index + 1 < words.length && (Arrays.asList(verbs).contains(words[index + 1]))
                        // or the first word is "and"
                        || index == 0 && words[index] == "and"
                  ) {
                    
                    // save the verb for this part in case there is an "and" later
                    // x ? a : b is a short form for the if else clause. ("if x then a else b)
                    verb = verb == "" ? words[index + 1] : verb;
                    
                    // verb is on second place, e.g. "but hates Kim" or "Jim likes Larry and Jean"
                    addToList(verb, words[index + 2]);

                }  else if (Arrays.asList(verbs).contains(words[index])) {
                    // and only for not first index
                    
                    // save the verb for this part in case there is an "and" later
                    // x ? a : b is a short form for the if else clause. ("if x then a else b)
                    verb = verb == "" ? words[index] : verb;
                    
                    // verb is on first place, e.g. "loves Tom"
                    addToList(verb, words[index + 1]);
                }
            }
        }
    }
    
    private void addToList(String verb, String name) {
        switch (verb) {
            case "likes":   this._likesList.add(name);
                            break; 
                            
            case "loves":   this._lovesList.add(name);
                            break;
            
            case "hates":   this._hatesList.add(name);
                            break;
                      
            default:        break;
        }
    }
    
    public void print() {
        System.out.println(
            this._name + 
            " likes: " + this._likesList + 
            " loves: " + this._lovesList + 
            " hates: " + this._hatesList
        );
    }
}