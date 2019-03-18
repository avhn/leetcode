class Solution:

    """
    Algorithm's time complexity is O(n).

    LeetCode:
    - Runtime: 40 ms, faster than 79.69% of Python3 online submissions for Two Sum.
    - Memory Usage: 14.2 MB, less than 6.64% of Python3 online submissions for Two Sum.
    """

    def twoSum(self, nums, target):

        """
        :type nums: iterable
        :type target: int
        :rtype: iterable
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
