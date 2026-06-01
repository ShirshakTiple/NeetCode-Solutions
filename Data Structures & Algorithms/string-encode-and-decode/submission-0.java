class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();

        for(String str : strs){
            encodedString.append(str.length()).append('#').append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedString = new ArrayList<>();
        int currentIndex = 0; 
        int totalLength = s.length();

        while(currentIndex < totalLength){
            int delimiterIndex = s.indexOf('#', currentIndex);

            int stringLength = Integer.parseInt(s.substring(currentIndex, delimiterIndex));

            int stringStartIndex = delimiterIndex+1;
            int stringEndIndex = stringStartIndex + stringLength;
            decodedString.add(s.substring(stringStartIndex, stringEndIndex));

            currentIndex = stringEndIndex;

        }
        return decodedString;
    }
}
