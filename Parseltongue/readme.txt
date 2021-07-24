Parseltongue
Hermione has come up with a precise formula for determining whether or
not a phrase was ssspoken by a parssseltongue (a reference from the Harry Potter universe;
the language of ssserpents and those who can converse with them).

Each word in a sssentence must contain either:

Two or more consecutive instances of the letter "s" (i.e. must be together ss..), or...
Zero instances of the letter "s" by itself.
Examples
isParselTongue("Sshe ssselects to eat that apple. ") ➞ true

isParselTongue("She ssselects to eat that apple. ") ➞ false
// "She" only contains one "s".

isParselTongue("Beatrice samples lemonade") ➞ false
// While "samples" has 2 instances of "s", they are not together.

isParselTongue("You ssseldom sssspeak sso boldly, ssso messmerizingly.") ➞ true