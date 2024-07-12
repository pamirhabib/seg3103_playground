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

<img width="1141" alt="Screenshot 2024-07-11 at 9 53 23 PM" src="https://github.com/user-attachments/assets/ec270675-4434-4392-bc53-8e2ec832fa05">

<img width="353" alt="Screenshot 2024-07-11 at 9 53 12 PM" src="https://github.com/user-attachments/assets/ac8f3f70-f7db-4371-9ca9-06c3f29f0a08">

<img width="1026" alt="Screenshot 2024-07-11 at 10 16 11 PM" src="https://github.com/user-attachments/assets/c70f4f6d-f304-4c46-ac60-d184b8bf6b1f">
