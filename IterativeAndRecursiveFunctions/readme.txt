Your task is to implement solutions for the following problems:

1. Given an array of ints, compute if the array contains a 6.

* 0 - parameter might is needed for recursive solution here. Also, you can try solving
this problem without this parameter.

array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true

2. Given a string, compute a new string where all the adjacent chars and not separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"

3. Given a non-negative int n, return the sum of its digits.

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3

Each problem should have 2 solutions (1 iterative and one using recursion meaning there should be 6 solutions
in total (6 functions)).