class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ""
        for s in strs:
            length = len(s)
            encoded += str(length) + "#" + s
        return encoded

    def decode(self, s: str) -> List[str]:
        i = 0
        strings = []
        while i < len(s):

            j = i
            while s[j] != '#':
                j += 1 

            length = int(s[i:j])

            start_index = j + 1
            end_index = length + start_index 

            strings.append(self.getString(s, start_index, end_index))
            
            i = end_index
        return strings

    def getString(self, s: str, start: int, end: int) -> str:
        return s[start:end]
