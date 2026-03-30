package HashMaps;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map1 =  new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        String[] words = s.split(" ");

        if(words.length != pattern.length()) return false;

        for(int i=0; i< pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map1.containsKey(c)){
                if(!map1.get(c).equals(words[i])) return false;
            }
            else if(map2.containsKey(words[i])){
                if(!map2.get(words[i]).equals(c)) return false;
            }else{

                map1.put(c, words[i]);
                map2.put(words[i], c);
            }
        }
        return true;
    }
}
