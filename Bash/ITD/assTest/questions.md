**Fields:** `ID, username, operation, status, execution Time`[cite: 2]

**(a) Write a Bash script to read the log and find:**[cite: 2]
1. Successful and failed operation counts for each user.[cite: 2]
2. The user with the greatest total execution time for successful operations.[cite: 2]
3. Users whose failures account for more than 40% of their operations.[cite: 2]
4. The longest consecutive run of FAILED records, with its starting and ending IDs.[cite: 2]

**(b) Write Linux command pipelines for the following:**[cite: 2]
1. Show the three users with the most failures; break ties alphabetically.[cite: 2]
2. Find the second-highest distinct execution time for successful UPLOADs.[cite: 2]
3. List users who have both a successful LOGIN and a failed UPLOAD (no duplicates).[cite: 2]
4. Display the last three successful entries of users with at least two failures.[cite: 2]

**(c) Write a Bash function analyze_user() that takes a username and:**[cite: 2]
1. Finds the average time of that user's successful entries (integer average is enough).[cite: 2]
2. Checks for at least three consecutive entries of alternating SUCCESS/FAILED status.[cite: 2]
3. Finds the longest run of strictly increasing execution times for that user.[cite: 2]
4. Prints that user's entries in reverse order without using tac.[cite: 2]