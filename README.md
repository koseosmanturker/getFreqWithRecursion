# getFreqWithRecursion

Find the frequency of each element in a sorted array containing duplicates

Given a sorted array containing duplicates, efficiently find each element’s frequency without traversing the whole array.
The idea is splitting the array into two halves (similar to binary search) and finding the frequencies by recursively calling the function.
You can take a look at the binary search algorithm to get an idea.

Tips
You should only change the left and right index values to split the array in half and call the “findFrequency()” function with these new values.
Be careful about the base case.
If the last element of the subarray is the same as its first element (another base case), that implies that all subarray items are similar (since the array is sorted), and we update the element frequency value by the total number of elements in the subarray.
An output example is given below.

Output
Input: 1, 1, 2, 2, 2, 4, 4, 4, 4, 4, 5, 5, 6, 8, 8, 9

Num-Freq
1	2
2	3
4	5
5	2
6	1
8	2
9	1
