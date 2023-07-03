# non-repeated-char-in-String

# Algorithm
Create an empty ArrayList called list to store the characters.
Iterate over each character c in the input string s.
If list already contains the character c, remove it from list using list.remove((Character) c).
Add the character c to list using list.add(c).
After iterating over all characters in the input string, the first non-repeated character should be at index 0 in list.
Print the first character in list using System.out.println(list.get(0)).
