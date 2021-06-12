****Palindrome Timestamps****

Create a function that takes two times of day (hours, minutes, seconds)
and returns the amount of occurences of palendrome timestamps.

A palendrome timestamp should be read the same (hours : minutes : seconds as seconds : minutes : hours),
 keeping in mind the second's and hour's digits will reverse. For example, 02 : 11 : 20 is a palendrome timestamp.

Examples
palendromeTimestamps(2, 12, 22, 4, 35, 10) ➞ 14

palendromeTimestamps(12, 12, 12, 13, 13, 13) ➞ 6

palendromeTimestamps(6, 33, 15, 9, 55, 10) ➞ 0

Notes
Expect military time.
Include the given time parameters if they happen to be palendromes.
The parameter timestamps are chronological.