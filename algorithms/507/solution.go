package main

import "math"

func checkPerfectNumber(num int) bool {
	if num < 2 {
		return false
	}
	sum := 1
	for i := 2; i <= int(math.Sqrt(float64(num))); i++ {
		if num%i == 0 {
			sum += i + num/i
		}
	}
	return sum == num
}
