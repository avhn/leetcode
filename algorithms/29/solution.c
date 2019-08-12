#include <limits.h>

/**
 * Helper function for divide.
 */
int unsignedDivision(unsigned int dividend, unsigned int divisor) {
  if (dividend < divisor) return 0;
  
  unsigned int sum = divisor;
  unsigned int quotient = 1;
  // sum != INT_MAX + 1, is guard for uint overflow
  while (sum != INT_MAX + 1 && sum + sum <= dividend) {
    sum += sum;
    quotient += quotient;
    /*
     sum <<= 1;
     quotient <<= 1;
     */
  }
  int diff = dividend - sum;
  return quotient + unsignedDivision(diff, divisor);
}

/**
 * Time complexity: O(log(dividend))
 * Space complexity: O(1)
 */
int divide(int dividend, int divisor){
  if (divisor == 1) return dividend;
  if (divisor == -1 && dividend == INT_MIN) return INT_MAX;
  
  unsigned int udividend = (dividend < 0) ? ((unsigned int) -(dividend + 1)) + 1 : dividend;
  unsigned int udivisor = (divisor < 0) ? ((unsigned int) -(divisor + 1)) + 1 : divisor;
  int result = unsignedDivision(udividend, udivisor);
  int positive = (dividend < 0 && divisor < 0)
    || (dividend > 0 && divisor > 0);
  return (positive) ? result : -result;
}
