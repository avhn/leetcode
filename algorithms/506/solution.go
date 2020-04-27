package main

import (
	"fmt"
	"sort"
)

type Record struct {
	Index int
	Val   int
}

// Time complexity, O(nlogn) where n is the length of records
// Space complexity, O(n)
func findRelativeRanks(nums []int) []string {
	records := make([]Record, len(nums))
	ranks := make([]string, len(nums))
	for i, v := range nums {
		records[i] = Record{Index: i, Val: v}
	}
	sort.Slice(records, func(i, j int) bool {
		return records[i].Val > records[j].Val
	})
	for rank, record := range records {
		var label string
		if 2 < rank {
			label = fmt.Sprintf("%d", rank+1)
		} else {
			switch rank {
			case 0:
				label = "Gold Medal"
			case 1:
				label = "Silver Medal"
			case 2:
				label = "Bronze Medal"
			}
		}
		ranks[record.Index] = label
	}
	return ranks
}
