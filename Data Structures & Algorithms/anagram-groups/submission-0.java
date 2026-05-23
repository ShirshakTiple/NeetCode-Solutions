class Solution {
    // ----- better approach ------

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            // str = xbca
            // take a string -- convert to character array
            char[] arr = str.toCharArray();
            // arr = ['x', 'b', 'c', 'a']

            // sort that 
            Arrays.sort(arr);
            // arr = ['a','b','c','x']

            // create a key of the sorted char array that we sorted just now
            String key = new String(arr);
            // key = abcx

            // if key does not exist, create a new list
            map.putIfAbsent(key, new ArrayList<>());
            
            // add the original str to the sorted key 
            map.get(key).add(str);
            // (key)abcx --> (value)xbca
        }
        //create a final solution with all the keys present in the map 
        return new ArrayList<>(map.values());
    }
}
