class Solution:

    def twoSum(self, nums, target):

        """
        Time complexity: O(n).

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
