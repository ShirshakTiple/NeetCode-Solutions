class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        // for string 1 --> enter all the characters keep the value as 1
        // if same char occurs again increase the value by 1
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }
            else{
                int temp = map.get(c);
                map.put(c,temp+1);
            }
        }
        
        // go through the string 2 and check if it already present there
        // if not return false
        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            } 
            // if present reduce the value by 1
            else {
                int temp = map.get(c);
                map.put(c,temp-1);
            }
        }

        // check through the map if there is any non-zero value if so it is not an anagram
        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }

        // else return true. 
        return true;
    }
}
