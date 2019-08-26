/**
 * Time and space complexity: O(1)
 */
var toHex = function(n) {
    const charCodeOfa = 'a'.charCodeAt(0);
    var result = '';
    do {
        const digit = n & 15; // 1111 = 15, a hex digit
        result = (digit < 10 ? digit : String.fromCharCode(charCodeOfa + digit % 10)) + result;
        n >>>= 4;
    } while (n !== 0);
    return result;
};
