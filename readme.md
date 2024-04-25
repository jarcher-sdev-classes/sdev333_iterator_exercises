# Individual Programming Assignment: Implementing Iterators

## Overview
In this assignment, you will develop four different iterators in Java that demonstrate your understanding of the iterator design patterns. This assignment is designed to reinforce concepts in data structures and give you practical experience with file operations, string manipulations, and mathematical sequences in Java.

### Objectives
- Implement custom iterators for various data structures.
- Gain proficiency with the `Iterable` interface.
- Apply iterator patterns to solve practical problems involving file reading, text processing, and generating sequences.

## Assignment Details

### 1. FileReader Iterator
Create a `FileReader` class. This class should be capable of being used in a for-each loop to read lines from a text file.

#### Requirements:
- The `FileReader` class should accept a file path as a parameter.
- Implement an iterator that returns one line of the file at a time.

### 2. LineReader Iterator
Develop a `LineReader` class to iterate over words in a given string.

#### Requirements:
- The `LineReader` class should accept a string as a parameter.
- Implement an iterator that returns each word in the string, assuming words are separated by spaces and contain no punctuation.

### 3. Fibonacci Iterator
Implement a `Fibonacci` class that generates a sequence of Fibonacci numbers up to a specified `n`.

#### Requirements:
- The `Fibonacci` class should accept a positive integer `n`.
- The iterator should return each Fibonacci number sequentially from the first to the nth number.

### 4. DataGrid Iterator
Create a `DataGrid` class that stores a 2D array of `double` values to iterate over each element row-by-row.

#### Requirements:
- The `DataGrid` class should accept a 2D array of `double` values as a parameter.
- Implement an iterator that returns each number in the grid, moving through each row sequentially.
