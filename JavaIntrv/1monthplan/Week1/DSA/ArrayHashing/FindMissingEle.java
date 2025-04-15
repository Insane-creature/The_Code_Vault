package DSA.ArrayHashing;

import java.util.Arrays;

public class FindMissingEle {
        public static void main(String[] args) {
            int[] A = {1, 4, 2, 6, 7};
            int[] B = {2, 4, 1, 6};
    
            System.out.println("Missing element: " + findMissingElement(A, B));
        }
    
        static int findMissingElement(int[] A, int[] B) {
            Arrays.sort(A);
            Arrays.sort(B);
    
            int minLen = Math.min(A.length, B.length);
    
            for (int i = 0; i < minLen; i++) {
                if (A[i] != B[i]) {
                    // Mismatch found
                    return A.length > B.length ? A[i] : B[i];
                }
            }
    
            // If all matched, missing is the last element of the longer array
            return A.length > B.length ? A[A.length - 1] : B[B.length - 1];
        }
    }
    
//  Time complexity: O(n log n + m log m)