class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False
        
        lettersA = dict()
        lettersB = dict()

        for i in range(len(s)):
            lettersA[s[i]] = lettersA.get(s[i], 0) + 1
            lettersB[t[i]] = lettersB.get(t[i], 0) + 1
            
        return lettersA == lettersB

        
        