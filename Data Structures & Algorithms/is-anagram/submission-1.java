class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) 
            return false;

        HashMap<Character, Integer> sCount = new HashMap();
        HashMap<Character, Integer> tCount = new HashMap();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char b = t.charAt(i);
            sCount.put(c, sCount.getOrDefault(c, 0) + 1);
            tCount.put(b, tCount.getOrDefault(b, 0) + 1);
        }

        for (char k : sCount.keySet()) {
            if (!sCount.get(k).equals(tCount.getOrDefault(k, -1))) {
                return false;
            }
        }

        return true;
    }
}
