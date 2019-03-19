class Solution:

    def twoSum(self, nums, target):

        """
        Time complexity: O(n).
        Runtime: 40 ms, faster than 80.17% of Python3 online submissions for Two Sum.
        Memory Usage: 14.2 MB, less than 7.51% of Python3 online submissions for Two Sum.

        args:
            nums: iterable
            target: int

        returns: iterable or None
        """

        # store pairs (number, index)
        hashtable = dict()

        for i, num in enumerate(nums):
            diff = target - num
            if diff in hashtable:
                # hashtable[diff] < i
                # thus the order of list
                return [hashtable[diff], i]

            hashtable[num] = i
