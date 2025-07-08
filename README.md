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

5. **First and Last Occurrence** (`firstandlastocc.java`)
   - Finds the first and last occurrence of each character in a string using HashMap
   - Stores indices as arrays for efficient tracking
   - Time Complexity: O(n)

6. **Character Occurrence Count** (`occurrence.java`)
   - Counts occurrences of each character in a string using array hashing
   - Uses character offset technique for efficient counting
   - Time Complexity: O(n)

7. **String to Integer (ATOI)** (`ATOI.java`)
   - Converts string to integer with proper handling of edge cases
   - Handles whitespace, signs, and integer overflow/underflow
   - Time Complexity: O(n)

8. **Pangram Checker** (`Main.java`)
   - Checks if a given string contains all letters from 'a' to 'z'
   - Uses boolean array for efficient letter tracking
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

9. **Subarray Sum Equals Zero** (`SubArrayzero.java`)
   - Checks if there exists a subarray with sum equal to zero
   - Uses prefix sum technique with HashSet to detect zero-sum subarrays
   - Time Complexity: O(n)

## Binary Search Problems
1. **Binary Search** (`binarysearch.java`)
   - Classic binary search implementation to find a target element in a sorted array
   - Uses left and right pointers to divide search space
   - Time Complexity: O(log n)

2. **Lower Bound** (`lowerbounnd.java`)
   - Finds the first position where target can be inserted to maintain sorted order
   - Returns index of first element >= target
   - Time Complexity: O(log n)

3. **Upper Bound** (`upperbound.java`)
   - Finds the last position where target can be inserted to maintain sorted order
   - Returns index of first element > target
   - Time Complexity: O(log n)

## 2D Array Problems
1. **Merge Intervals** (`mergeintervals.java`)
   - Merges overlapping intervals in a 2D array
   - Uses sorting by start time
   - Time Complexity: O(n log n)

2. **Search in a 2D Matrix** (`SearchInArrayBS.java`)
   - Uses binary search to efficiently search for a target value in a sorted 2D matrix
   - Time Complexity: O(log(m*n))

3. **Set Matrix Zeros** (`setmatrixzero.java`)
   - Sets entire row and column to zero if any element in that row/column is zero
   - Uses boolean arrays to mark rows and columns to be zeroed
   - Time Complexity: O(m*n)

4. **Matrix Boundary Traversal** (`boundaary.java`)
   - Traverses and prints the boundary elements of a 2D matrix
   - Time Complexity: O(m+n)

5. **Diagonal and Anti-diagonal Sum** (`digandantidig.java`)
   - Calculates sum of main diagonal and anti-diagonal elements
   - Time Complexity: O(n)

6. **Row and Column Sum** (`rcsum.java`)
   - Calculates sum of each row and column in a matrix
   - Time Complexity: O(m*n)

7. **Matrix Addition** (`sumofmat.java`)
   - Adds two matrices element by element
   - Time Complexity: O(m*n)

8. **Matrix Subtraction** (`suboftwomat.java`)
   - Subtracts one matrix from another element by element
   - Time Complexity: O(m*n)

9. **Matrix Min/Max** (`minmax.java`)
   - Finds minimum and maximum elements in a 2D matrix
   - Time Complexity: O(m*n)

10. **Matrix Sorting** (`sorting.java`)
    - Sorts elements of a 2D matrix
    - Time Complexity: O(m*n*log(m*n))

11. **Symmetric Matrix Check** (`symmetric.java`)
    - Checks if a matrix is symmetric (equal to its transpose)
    - Time Complexity: O(n²)

12. **Upper and Lower Triangular** (`utlt.java`)
    - Separates matrix into upper and lower triangular parts
    - Time Complexity: O(n²)

13. **Zigzag Pattern Traversal** (`zigzagpattern.java`)
    - Traverses matrix in zigzag pattern (alternating left-right and right-left)
    - Time Complexity: O(m*n)

## Stack and Queue Problems
1. **Stack Implementation** (`stack.java`)
   - Array-based stack implementation with push, pop, top, and size operations
   - Demonstrates basic stack operations with fixed-size array
   - Time Complexity: O(1) for all operations

2. **Queue Implementation** (`queue.java`)
   - Array-based queue implementation with enqueue, dequeue, front, and rear operations
   - Demonstrates basic queue operations with circular array approach
   - Time Complexity: O(1) for all operations

3. **Balanced Parentheses** (`balancedparen.java`)
   - Checks if parentheses, brackets, and braces are balanced in a string
   - Uses stack to match opening and closing brackets
   - Time Complexity: O(n)

4. **Infix to Postfix Conversion** (`infixtopostfix.java`)
   - Converts infix expressions to postfix notation using stack
   - Handles operator precedence and associativity
   - Time Complexity: O(n)

5. **Postfix to Infix Conversion** (`postfixtoinfix.java`)
   - Converts postfix expressions back to infix notation using stack
   - Reconstructs the original expression format
   - Time Complexity: O(n)

6. **Stack/Queue Utility** (`a.java`)
   - Additional utility functions for stack and queue operations
   - Provides helper methods for advanced stack/queue manipulations
   - Time Complexity: Varies based on operation

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

17. **Merge Nodes Between Zeros** (`MergeNodes.java`)
    - Merges nodes between zeros in a linked list by summing values between zero nodes
    - Creates new nodes with the sum of values between consecutive zeros
    - Handles linked lists that start and end with zero
    - Time Complexity: O(n)

18. **Reverse Nodes in k-Group** (`ReverseKnode.java`)
    - Reverses nodes of a linked list k at a time
    - If remaining nodes are less than k, they remain unchanged
    - Uses helper functions to find kth node and reverse sublists
    - Time Complexity: O(n)

## Recursion and Backtracking Problems
1. **Generate All Subsets** (`subset.java`)
   - Generates all possible subsets of a given array using backtracking
   - Handles duplicates by sorting and skipping duplicate elements
   - Uses recursive approach with inclusion/exclusion decisions
   - Time Complexity: O(2^n)

2. **Combination Sum** (`Combinationsum.java`)
   - Finds all unique combinations that sum to a target value
   - Elements can be used multiple times
   - Uses backtracking with recursive exploration
   - Time Complexity: O(2^target)

3. **Combination Sum II** (`CombinationsumII.java`)
   - Finds all unique combinations that sum to a target value
   - Each element can be used only once
   - Handles duplicates in input array
   - Time Complexity: O(2^n)

4. **Combination Sum III** (`combinationsum3.java`)
   - Finds all combinations of k numbers that sum to n
   - Uses digits 1-9 only, each digit used at most once
   - Uses backtracking with constraint checking
   - Time Complexity: O(C(9,k))

5. **Generate Parentheses** (`generateparen.java`)
   - Generates all valid combinations of n pairs of parentheses
   - Uses backtracking with balance tracking
   - Ensures proper opening and closing of parentheses
   - Time Complexity: O(4^n/√n) - Catalan number

6. **Subset Sum Equal to Target** (`subequ.java` and `subequal.java`)
   - Determines if there exists a subset with sum equal to target
   - Uses dynamic programming and backtracking approaches
   - Time Complexity: O(n*sum) for DP, O(2^n) for backtracking

7. **Count Subsequences** (`subsequence_num.java`)
   - Counts the number of subsequences that satisfy certain conditions
   - Uses recursive approach with memoization
   - Time Complexity: O(2^n)

8. **Phone Letter Combinations** (`phonelettercomb.java`)
   - Generates all possible letter combinations from a phone number
   - Uses backtracking to explore all possible combinations
   - Time Complexity: O(4^n)

9. **Letter Combinations of a Phone Number** (`lettercombination.java`)
   - Maps digits to letters and generates all possible combinations
   - Uses recursive approach with digit-to-letter mapping
   - Time Complexity: O(4^n)

10. **Palindrome Partitioning** (`PalindromePartitioning.java`)
    - Partitions a string into palindromic substrings
    - Uses backtracking with palindrome checking
    - Time Complexity: O(2^n)

11. **Test Recursion** (`test.java`)
    - Test implementation for recursion problems
    - Demonstrates basic recursive problem-solving patterns
    - Time Complexity: Varies based on implementation

12. **Pattern Printing** (`test.c`)
    - C program for printing triangular patterns with letters
    - Demonstrates nested loop patterns and character manipulation
    - Time Complexity: O(n²)

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
- **Backtracking**: Systematic exploration of solution space with pruning
- **Dynamic Programming**: Optimizing recursive solutions with memoization
- **Matrix Traversal**: Various patterns for processing 2D arrays
- **Dummy Node Technique**: For simplifying edge cases in linked list operations
- **Character Hashing**: Array-based frequency counting for character problems
- **Boundary Marking**: Technique for matrix problems to avoid modifying original data
- **Modular Arithmetic**: For handling large numbers and rotations efficiently
- **Stack Operations**: LIFO operations for expression evaluation and bracket matching
- **Queue Operations**: FIFO operations for level-order processing and scheduling
- **Prefix Sum**: Efficient technique for subarray sum problems
- **String Parsing**: Handling edge cases in string-to-number conversion
- **Pattern Matching**: Recursive and iterative approaches for pattern generation
- **Cycle Detection**: Floyd's algorithm for detecting cycles in sequences

## Problem Categories Summary
- **String Problems**: 8 problems covering substring operations, character counting, string manipulation, and conversion
- **Array Problems**: 9 problems including duplicates detection, sum problems, search algorithms, and subarray operations
- **Binary Search Problems**: 3 problems covering basic search, lower bound, and upper bound implementations
- **2D Array/Matrix Problems**: 13 problems covering various matrix operations and traversal patterns
- **Stack and Queue Problems**: 6 problems covering basic data structure operations, expression conversion, and bracket matching
- **Two Pointer Problems**: 1 problem demonstrating cycle detection techniques
- **Linked List Problems**: 18 comprehensive problems covering all major linked list operations and algorithms
- **Recursion and Backtracking Problems**: 12 problems exploring combinatorial algorithms, pattern generation, and recursive solutions

**Total Problems Solved: 70**

## Time Complexity Analysis
Each solution includes its time complexity analysis to demonstrate efficiency considerations. The implementations focus on optimizing for:
- Time efficiency
- Space efficiency  
- Edge case handling
- Clean, readable code structure
- Comprehensive problem coverage from basic to advanced levels

## Learning Outcomes
This repository demonstrates proficiency in:
- **Data Structure Manipulation**: Arrays, Strings, Linked Lists, Matrices
- **Algorithm Design Patterns**: Two Pointers, Sliding Window, Binary Search, Backtracking
- **Problem-Solving Approaches**: Iterative, Recursive, Dynamic Programming
- **Optimization Techniques**: Space-time tradeoffs, Early termination, Constraint handling
- **Code Quality**: Clean implementations, Edge case handling, Comprehensive testing


## Problem Categories Summary
- **String Problems**: 8 problems covering substring operations, character counting, string manipulation, and conversion
- **Array Problems**: 9 problems including duplicates detection, sum problems, search algorithms, and subarray operations
- **Binary Search Problems**: 3 problems covering basic search, lower bound, and upper bound implementations
- **2D Array/Matrix Problems**: 13 problems covering various matrix operations and traversal patterns
- **Stack and Queue Problems**: 6 problems covering basic data structure operations, expression conversion, and bracket matching
- **Two Pointer Problems**: 1 problem demonstrating cycle detection techniques
- **Linked List Problems**: 18 comprehensive problems covering all major linked list operations and algorithms
- **Recursion and Backtracking Problems**: 12 problems exploring combinatorial algorithms, pattern generation, and recursive solutions

   **🎯 Total Problems Solved: 70** 🚀🎉