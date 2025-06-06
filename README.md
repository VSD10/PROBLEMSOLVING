# PROBLEM SOLVING

This repository contains solutions to various algorithmic problems, organized by data structure categories. Each solution is implemented in Java and includes detailed comments explaining the approach.

## Overview
- **Purpose**: Practice and demonstrate problem-solving skills using various data structures and algorithms
- **Language**: Java
- **Organization**: Solutions are grouped by the primary data structure they utilize
- **Documentation**: Each solution includes time complexity analysis and approach description

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

## Two Pointer Problems
1. **Happy Number** (`happynumber.java`)
   - Determines if a number is "happy" using Floyd's Cycle-Finding Algorithm
   - Uses fast and slow pointers to detect cycles in the sequence
   - Time Complexity: O(log n)

## Linked List Problems
1. **ListNode Class** (`ListNode.java`)
   - Defines the basic node structure used in linked list implementations
   - Contains constructors for creating nodes with different initialization options
   - Also includes a RemoveNthFromEnd implementation as an alternative to Removenth.java
   - Time Complexity: O(1) for node creation, O(n) for the RemoveNthFromEnd operation

2. **Delete Duplicates** (`deleteDuplicates.java`)
   - Removes duplicates from a sorted linked list
   - Iterates through the list and removes nodes with duplicate values
   - Time Complexity: O(n)

3. **Has Cycle** (`hasCycle.java`)
   - Detects if a cycle exists in a singly-linked list using Floyd's Cycle-Finding Algorithm
   - Uses two pointers moving at different speeds to determine if a cycle is present
   - Time Complexity: O(n)

4. **Detect Cycle** (`detectcycle.java`)
   - Not only detects if a cycle exists but also returns the node where the cycle begins
   - Uses Floyd's Cycle-Finding Algorithm with two phases
   - Time Complexity: O(n)

5. **Intersection of Two Linked Lists** (`intersectionoftwoll.java`)
   - Finds the intersection node of two singly-linked lists
   - Uses two pointers to traverse the lists and find the intersection point
   - Time Complexity: O(n + m)

6. **Delete the Middle Node** (`deleteatmid.java`)
   - Removes the middle node from a linked list
   - Uses fast and slow pointer technique to find the middle node
   - Time Complexity: O(n)

7. **Remove Nth Node From End** (`Removenth.java`)
   - Removes the nth node from the end of a linked list
   - Uses two pointers with a gap of n nodes to find the target node
   - Time Complexity: O(n)

8. **Singly Linked List Implementation** (`sll.java` and `SinglyLinkedList.java`)
   - Complete implementation of a singly linked list with insertion (FIRST, END, MID), deletion (FIRST, END, MID), finding the middle element, length calculation, and traversal operations
   - Provides the foundation for other linked list problems
   - Interactive menu-driven implementation in `SinglyLinkedList.java`
   - Time Complexity: O(n) for insertion and printing

9. **Doubly Linked List Implementation** (`Doublylinkedlist.java`)
   - Complete implementation of a doubly linked list with bidirectional traversal
   - Features insertion operations at the beginning, end, and at specific positions
   - Features deletion operations at the beginning, end, and at specific positions, also the entire list
   - Maintains both head and tail pointers for efficient operations at both ends
   - Includes methods for traversal in both forward and reverse directions
   - Time Complexity: O(1) for insertions, deletion at beginning/end, O(n) for insertions, deletion at specific positions

10. **Reverse Linked List** (`Reverse.java`)
   - Reverses an entire linked list in-place
   - Uses iterative approach with three pointers (prev, current, next)
   - Time Complexity: O(n)

11. **Reverse Linked List Between Positions** (`ReverseBetweenDemo.java`)
    - Reverses a portion of a linked list between specified positions (left to right)
    - Uses iterative approach with pointer manipulation to reverse the sublist in-place
    - Handles edge cases with a dummy node
    - Time Complexity: O(n)

12. **Sort Linked List** (`sort.java`)
    - Sorts a linked list using merge sort algorithm
    - Uses fast and slow pointers to find the middle of the list for splitting
    - Recursively divides the list and merges sorted sublists
    - Time Complexity: O(n log n)

13. **Reorder Linked List** (`REORDER.java`)
    - Reorders a linked list such that L₀ → L₁ → ... → Lₙ₋₁ → Lₙ becomes L₀ → Lₙ → L₁ → Lₙ₋₁ → ...
    - Uses fast and slow pointers to find the middle of the list
    - Reverses the second half of the list and then merges the two halves
    - Time Complexity: O(n)

14. **Add Two Numbers** (`AddTwoNumbers.java`)
    - Adds two numbers represented by linked lists where each node contains a single digit
    - Numbers are stored in reverse order (least significant digit first)
    - Handles carry propagation during addition
    - Includes helper methods for building and printing linked lists
    - Time Complexity: O(max(m,n)) where m and n are the lengths of the two lists

15. **Circular Linked List** (`Circularll.java`)
    - Implementation of a circular linked list where the last node points back to the first node
    - Supports insertion at the beginning and end of the list
    - Includes traversal method that handles the circular nature of the list
    - Maintains both head and tail pointers for efficient operations
    - Time Complexity: O(1) for insertions, O(n) for traversal

16. **Rotate Linked List** (`Rotate.java`)
    - Rotates a linked list to the right by k places
    - Efficiently handles large rotation values by using modulo operation
    - Finds the new head and tail positions after rotation
    - Reconnects the list to achieve the rotation effect
    - Time Complexity: O(n) where n is the length of the list


## Algorithmic Techniques Used
- **Sliding Window**: Used for finding subarrays or substrings that satisfy certain conditions
- **Two Pointers**: Efficient technique for processing arrays and linked lists
- **Fast & Slow Pointers**: Special two-pointer technique for cycle detection and finding middle elements
- **Binary Search**: Efficient searching in sorted arrays and matrices
- **Sorting**: Pre-processing technique to simplify problem-solving
- **Hash Tables**: For O(1) lookups and tracking frequencies or positions
- **Array Manipulation**: In-place modifications and traversal techniques
- **Linked List Manipulation**: Operations like insertion, deletion, and traversal
- **Merge Sort**: Divide and conquer algorithm for efficient sorting
- **Floyd's Cycle-Finding Algorithm**: For detecting cycles in sequences or linked lists
- **Recursion**: Self-referential problem-solving technique
- **Dummy Node Technique**: For simplifying edge cases in linked list operations

## Time Complexity Analysis
Each solution includes its time complexity analysis to demonstrate efficiency considerations. The implementations focus on optimizing for:
- Time efficiency
- Space efficiency
- Edge case handling