# PROBLEM SOLVING

This repository contains my solutions to various algorithmic problems, organized by data structure categories.

## String Problems
1. **Longest Substring Without Repeating Characters** (`longestsusbtring.java`)
   - Uses a sliding window approach with a HashSet to find the longest substring without repeating characters
   - Time Complexity: O(n)

2. **Sentence Similarity** (`sentencesimilarity.java`)
   - Determines if two sentences are similar by checking if one is a prefix or suffix of the other
   - Time Complexity: O(n)

3. **String Multiplication** (`stringmultiply.java`)
   - Implements multiplication of two large numbers represented as strings
   - Time Complexity: O(m*n)

4. **String Reverse** (`stringreverse.java`)
   - Reverses a character array in-place using two pointers
   - Time Complexity: O(n)

## Array Problems
1. **Contains Duplicate II** (`containsduplicate2.java`)
   - Checks if an array contains duplicates within a given distance k
   - Uses HashMap to track indices
   - Time Complexity: O(n)

2. **Contains Duplicate III** (`containsduplicate3.java`)
   - Checks if an array contains duplicates within a given index difference and value difference
   - Time Complexity: O(n)

3. **Find Maximum Average** (`findmaxaverage.java`)
   - Uses sliding window technique to find the maximum average of a subarray of size k
   - Time Complexity: O(n)

4. **Four Sum** (`foursum.java`)
   - Finds all unique quadruplets in an array that sum up to a target value
   - Uses sorting and two pointers technique
   - Time Complexity: O(n³)

5. **Median of Two Sorted Arrays** (`Mediantwoarray.java`)
   - Calculates the median of two sorted arrays by merging them
   - Time Complexity: O(m+n)

6. **Search in Rotated Sorted Array** (`searchinrotatedarray.java`)
   - Uses modified binary search to find a target value in a rotated sorted array
   - Time Complexity: O(log n)

7. **Three Sum** (`ThreeSum.java`)
   - Finds all unique triplets in an array that sum up to zero
   - Uses sorting and two pointers technique
   - Time Complexity: O(n²)

8. **Three Sum Closest** (`Threesumclosest.java`)
   - Finds the sum of three integers in an array that is closest to a target value
   - Uses sorting and two pointers technique
   - Time Complexity: O(n²)

## 2D Array Problems
1. **Merge Intervals** (`mergeintervals.java`)
   - Merges overlapping intervals in a 2D array
   - Uses sorting by start time
   - Time Complexity: O(n log n)

2. **Search in a 2D Matrix** (`SearchInArrayBS.java`)
   - Uses binary search to efficiently search for a target value in a sorted 2D matrix
   - Time Complexity: O(log(m*n))

## Linked List Problems
1. **Delete Duplicates** (`deleteDuplicates.java`)
   - Removes duplicates from a sorted linked list
   - Iterates through the list and removes nodes with duplicate values
   - Time Complexity: O(n)

2. **Has Cycle** (`hasCycle.java`)
   - Detects if a cycle exists in a singly-linked list using Floyd's Cycle-Finding Algorithm
   - Uses two pointers moving at different speeds to determine if a cycle is present
   - Time Complexity: O(n)

## Algorithmic Techniques Used
- Sliding Window
- Two Pointers
- Binary Search
- Sorting and Searching
- Hash Tables
- Array Manipulation