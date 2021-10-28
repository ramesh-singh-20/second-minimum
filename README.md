# second-minimum

This project finds second minimum number from a given array of integers.

##Algorithm

First approach is to sort the input array in ascending order and return the second element. Time complexity depends upon sort algorithm used.


Second approach is to first find the smallest number and simultaneously set second smallest number in the same loop.
if a number less than the smallest number is found set second smallest number to smallest and smallest number to current number.
Else if current number is less than second smallest number set second smallest number to current number.
If none of these conditions are met, do nothing.

The second approach is better as it has time complexity of O(n).

##Testing

For unit testing Spock framework with groovy is used.



