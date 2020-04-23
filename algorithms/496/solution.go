package main

// Time complexity, O(n*m) where n is the length of the superset
// and m is the length of subset
// Space complexity, O(m)
func nextGreaterElement(nums1 []int, nums2 []int) []int {
	res := make([]int, len(nums1))
	for i := 0; i < len(nums1); i++ {
		for j := 0; ; j++ {
			if nums1[i] == nums2[j] {
				for j++; j < len(nums2) && nums2[j] < nums1[i]; j++ {
				}
				if j < len(nums2) {
					res[i] = nums2[j]
				} else {
					res[i] = -1
				}
				break
			}
		}
	}
	return res
}
