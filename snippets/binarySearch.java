/* 
Author: Mwiza Chiwale
Date created: 25/03/2022 06: 00 am
Last modified: 25/03/22 06: 59 am

This program searches for an integer x using the binary search algorithm in a list of integers sorted in ascending order and returns the position of x in the list if x has been found, if x is not present it returns 0.
The first position is given the index or location of zero, meaning counting locations starts from zeror "0" going up (e.g 0, 1, 2, ...)
*/
import java.util.*;
class BinarySearch {
    // Main method
    public static void main(String[] args) {
        // You can call the search method in here
    }
    
    /*
      The search method recieves two arguments/parameters: the 1st parameter is the integer you want to search for or look up, the 2nd argument is a list of integers where you want to find it in.
      Note: This list must be a list of integers in ascending(increasing)* order, if not the function will crash
    */
    public static int search(int lookUp, int[] in) {
        int leftEndPoint, rightEndPoint, midPoint, location;
        double midPointDouble; // Contains the mid point as a double
        leftEndPoint = 0;
        // Since we are starting from zero we set the right end point equal to one less the total number of elements in the list.
        rightEndPoint = in.length - 1; 

        while (leftEndPoint < rightEndPoint){
            /* Dividing the sum of the left end point and right end point by 2 can result in a double so we store this value as the mid point in doouble format */
            midPointDouble = (leftEndPoint + rightEndPoint)/2;
            midPoint = (int) Math.floor(midPointDouble); // we cast the mid point to an integer but first we round it off
            if (lookUp > in[midPoint]) {
                leftEndPoint = midPoint + 1;
            } else {
                rightEndPoint = midPoint;
            }
        }
        if (lookUp == in[leftEndPoint]) {
            location = leftEndPoint;
        } else {
            location = 0;
        }
        return location; // location is the position of the integer we are looking for, it is not present location we be 0
    }
}

