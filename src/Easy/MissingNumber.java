// Given an array of size n-1 such that it only contains distinct integers in the range of 1 to n. Return the missing element.

//Input: n = 5, arr[] = [1,2,3,5]
//Output: 4
//Explanation : All the numbers from 1 to 5 are present except 4.


//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)
//
//Constraints:
//1 ≤ n ≤ 106
//1 ≤ arr[i] ≤ 106

package Easy;

public class MissingNumber {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Calculate the expected sum of the first n natural numbers
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of the elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference between the expected sum and the array sum
        int missingNum = totalSum - arraySum;
        System.out.println(missingNum);
        return missingNum;

    }

}
