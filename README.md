# getFreqWithRecursion

Find the frequency of each element in a sorted array containing duplicates

Given a sorted array containing duplicates, efficiently find each element’s frequency without traversing the whole array.
The idea is splitting the array into two halves (similar to binary search) and finding the frequencies by recursively calling the function.
You can take a look at the binary search algorithm to get an idea.

Output <br/>
Input: 1, 1, 2, 2, 2, 4, 4, 4, 4, 4, 5, 5, 6, 8, 8, 9 <br/>

Num-Freq <br/>
1	2 <br/>
2	3 <br/>
4	5 <br/>
5	2 <br/>
6	1 <br/>
8	2 <br/>
9	1 <br/>
