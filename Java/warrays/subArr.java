// package warrays;

public class subArr {
    public static void subAr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static int maxSubArrBruteForce(int arr[]) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > l) l = sum;
            }
        }
        return l;
    }
    public static int  maxSubArrPrefixSum(int arr[]) {
        int s[] = new int[arr.length];
        int sum, l = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            s[i] = i == 0 ? arr[i] : s[i-1] + arr[i];
        }
        for (int j = 0; j < s.length; j++) {
            for (int k = j; k < s.length; k++) {
                sum = j == 0 ? s[k] : s[k] - s[j - 1];
                if (sum > l) l = sum;
            }
        }
        return l;
    }
    public static int maxSubArrSumKadane(int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9};
        System.out.println(maxSubArrSumKadane(arr));
        System.out.println(maxSubArrSumKadane(arr2));
        

        
        // String g = Arrays.toString(arr);
        // System.out.println(g);

        // String g = Arrays.toString(arr);
        // System.out.println(g);
    }
}

/*
1️⃣ What is a subarray?

A subarray is:

a continuous chunk of the array.

Given:

arr = [1, 2, 3]

✅ Valid subarrays
[1]
[1, 2]
[1, 2, 3]
[2]
[2, 3]
[3]

❌ NOT subarrays
[1, 3]   ❌ (not continuous)

2️⃣ How many subarrays exist?

For an array of length n:

Total subarrays = n(n + 1) / 2


For n = 3:

3 × 4 / 2 = 6


Matches the list above.

3️⃣ Why do we need 3 loops?

Each subarray is defined by two things:

Start index i

End index j

But to calculate the sum, we must add elements between i and j.

That’s why:

Loop 1 → choose start

Loop 2 → choose end

Loop 3 → add elements

4️⃣ Meaning of each loop (THIS IS KEY)
🔹 First loop → i (start index)
for (int i = 0; i < arr.length; i++)


This decides where the subarray starts.

For arr = [1,2,3]:

i = 0 → subarrays starting at 1
i = 1 → subarrays starting at 2
i = 2 → subarrays starting at 3

🔹 Second loop → j (end index)
for (int j = i; j < arr.length; j++)


This decides where the subarray ends.

For i = 0:

j = 0 → [1]
j = 1 → [1,2]
j = 2 → [1,2,3]


For i = 1:

j = 1 → [2]
j = 2 → [2,3]


For i = 2:

j = 2 → [3]


👉 This generates all possible (i, j) pairs.

🔹 Third loop → k (actual elements)
for (int k = i; k <= j; k++)


This loop walks through the subarray and adds elements.

Example:

i = 1, j = 3
subarray = arr[1] to arr[3]


So:

k = 1 → arr[1]
k = 2 → arr[2]
k = 3 → arr[3]

5️⃣ Full flow example (step-by-step)

Let:

arr = [1, 2, 3]

i = 0

j = 0 → sum = 1

j = 1 → sum = 1 + 2 = 3

j = 2 → sum = 1 + 2 + 3 = 6

i = 1

j = 1 → sum = 2

j = 2 → sum = 2 + 3 = 5

i = 2

j = 2 → sum = 3

All subarrays checked ✔

6️⃣ Why j must start at i (your earlier confusion)

If you do:

j = i + 1


Then you skip:

[i..i] → single element subarrays


Which breaks cases like:

[-5, -2, -3]


Correct max subarray is:

[-2]


But your code never checks it ❌

7️⃣ Mental model (remember this)

Think of it like this:

i → where do I start?
j → where do I stop?
k → what do I add?


Or visually:

[ i -------- j ]
  k k k k k

8️⃣ Why this is IMPORTANT

This pattern appears in:

Max subarray

Subarray sum = K

Print all subarrays

Count subarrays

Sliding window (optimized version)

Once this clicks → arrays become easy mode.
*/