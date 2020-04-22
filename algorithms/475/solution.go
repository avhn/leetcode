package main

import (
	"math"
	"sort"
)

// Time complexity: O((n+m)logm) where m is the amount of
// heaters and n is the mount of houses
func findRadius(houses []int, heaters []int) int {
	sort.Ints(heaters)
	var maxDist float64
	for _, hl := range houses {
		dist := math.Abs(float64(hl - closestHeater(hl, heaters[:], maxDist)))
		maxDist = math.Max(maxDist, dist)
	}
	return int(maxDist)
}

// Return closest heater's location with binary search
// Cut down search if goes below currMaxDist
func closestHeater(hl int, heaters []int, currMaxDist float64) int {
	if len(heaters) == 1 {
		return heaters[0]
	}
	midPoint := len(heaters) / 2
	midRightDiff := math.Abs(float64(heaters[midPoint] - hl))
	if midRightDiff < currMaxDist { // nullify
		return hl
	}
	leftDiff := math.Abs(float64(heaters[midPoint-1] - hl))
	if leftDiff < midRightDiff {
		return closestHeater(hl, heaters[:midPoint], currMaxDist)
	} else {
		return closestHeater(hl, heaters[midPoint:], currMaxDist)
	}
}
