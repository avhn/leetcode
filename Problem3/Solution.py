class Solution:

    def lengthOfLongestSubstring(self, s):

        """
        Time complexity: O(n).
        Runtime: 76 ms, faster than 89.92% of Python3 online submissions for Longest Substring Without Repeating Characters.
        Memory Usage: 13.2 MB, less than 5.31% of Python3 online submissions for Longest Substring Without Repeating Characters.

        args:
            s: str

        returns: int, length of longest non-recurring substring.
        """

        hashtable = dict()
        l = len(s)

        # [i,j), sliding window indexes
        i, j, result = 0, 0, 0

        while j < l:
            if s[j] in hashtable and i < hashtable[s[j]] + 1:
                # slide i
                i = hashtable[s[j]] + 1

            # override
            hashtable[s[j]] = j
            j += 1

            # update result
            if result < j - i:
                result = j - i

        return result
