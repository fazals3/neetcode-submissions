class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        lettersA = self.charCount(s)
        lettersB = self.charCount(t)

        if (len(lettersA) != len(lettersB)):
            return False

        return self.compareDicts(lettersA, lettersB) and self.compareDicts(lettersB, lettersA)

    def compareDicts(self, dict1: dict, dict2: dict) -> bool:
        for c in dict1:
            if c not in dict2:
                return False
            else:
                if dict1[c] != dict2[c]:
                    return False
        return True

    def charCount(self, s: str) -> dict:
        chars = dict()
        for c in s:
            if c in chars:
                chars[c] = chars[c] + 1 
            else:
                chars[c] = 1
        return chars
        