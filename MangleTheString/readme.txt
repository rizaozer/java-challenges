Mangle the String
Create a function that takes a string and replaces every letter with the letter
following it in the alphabet ("c" becomes "d", "z" becomes "a", "b" becomes "c", etc).
Then capitalize every vowel (a, e, i, o, u) and return the new modified string.

Examples:
mangle("Fun times!") ➞ "GvO Ujnft!"

mangle("The quick brown fox.") ➞ "UIf rvjdl cspxO gpy."

mangle("Omega") ➞ "Pnfhb"

Notes:
If a letter is already uppercase, return it as uppercase (regardless of being a vowel).
"y" is not considered a vowel.