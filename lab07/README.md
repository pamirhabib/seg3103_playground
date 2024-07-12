1 - Useless conditions:

Lines 76, 78, 80 in CalCFrame.java: These conditions are always true or false (unnecessary), so they can be removed or refactored.

2 - Missing Default Case in Switch Statement:

Lines 329-346 in CalCFrame.java: add default case to handle unexpected outputs

3 - String Comparison using == or !=:

Line 373 in CalCFrame.java: Use .equals() method for string comparison

4 - Duplicate Code in Constructor:

Line 81 in CalCFrame.java: Refactor duplicate code into a common method and call it from the constructor.

5 - Unread Fields:

Line 37 in CalCFrame.java: fields are not used anywhere in the code. They should either be removed if unnecessary or marked as static if they are constants.
