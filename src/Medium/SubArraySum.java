//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions

//Indexes of Subarray Sum
//Given an unsorted array arr of size n that contains only non negative integers, find a sub-array (continuous elements) that has sum equal to s. You mainly need to return the left and right indexes(1-based indexing) of that subarray.
//
//In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.

//Input: arr[] = [1,2,3,7,5], n = 5, s = 12
//Output: 2 4
//Explanation: The sum of elements from 2nd to 4th position is 12.


//Input: arr[] = [1,2,3,4,5,6,7,8,9,10], n = 10, s = 15,
//Output: 1 5
//Explanation: The sum of elements from 1st to 5th position is 15.

//Input: arr[] = [7,2,1], n = 3, s = 2
//Output: 2 2
//Explanation: The sum of elements from 2nd to 2nd position is 2.

//Input: arr[] = [5,3,4], n = 3, s = 2
//Output: -1
//Explanation: There is no subarray with sum 2

//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)
//
//Constraints:
//
//0 <= arr[i] <= 109
//1 <= n <= 105
//0 <= s <= 109

package Medium;

//{ Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        StringBuilder sb = new StringBuilder();
        for (int e : a) sb.append(e + " ");
        System.out.println(sb);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int s = Integer.parseInt(str[1]);

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(arr, n, s);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here
        int j = 0;
        int sum = 0;
        // int left = 0;
        // int right = n-1;

        // vector<int> ans;
        ArrayList<Integer> ans = new ArrayList<>();

        System.out.print("INDEXES : ");


        for ( int i = 0; i < n; i++ ){
            sum += arr[i]; //add elem to sum


            //if sum exceeds s, remove the elem from left until sum<=s
            while ( sum > s && j <= i ) {
                sum -= arr[j];
                j++;
            }

            // If sum equals s, store the indices and break
            if(sum == s && j <= i){
                ans.add(j+1);   // 1-based index for the start
                ans.add(i+1);   // 1-based index for the end

                //ONLY PRINTING CODE
                for ( int x=0; x < ans.size(); x++){
                    System.out.print(ans.get(x) + " ");
                }

                return ans;
            }
        }

        // If ans is empty, return {-1} indicating no subarray found
        ans.add(-1);    //No subarray found

        //ONLY PRINTING CODE
        for ( int y=0; y < ans.size(); y++){
            System.out.println(ans.get(y));
        }
        return ans;

    }
}