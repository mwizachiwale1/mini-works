/* 
@Author: Mwiza Chiwale
@Description: Program searches for an int x in an array of integers using binary search  
*/
import java.util.*;
class BinarySearch {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("{1, 2, 3, 4, 5, 6, 7} \n Please enter number to locate in the list:... ");
        int lookUp = input.nextInt();
        location = search(lookUp, numbers);
        System.out.println(location);
    }
    
    /* @param: 1st parameter = int you want to look up, 2nd parameter = list you you want to search in
       @inavariant: lookUp must be an int & in must be an array
       @pre: in[] must be sorted in ascending order
             in.length > 2    
       @post: return the location of the int in in[], from range 1 to n.length or 0 if lookUp is not in in[]   
    */ 
    public static int search(int lookUp, int[] in) {
        int leftEndPoint, rightEndPoint, midPoint, location;
        double midPointDouble;
        leftEndPoint = 0;
        rightEndPoint = in.length - 1; // array indexes start at 0, so reduce by 1 to compliment for this.

        while (leftEndPoint < rightEndPoint){
            midPointDouble = (leftEndPoint + rightEndPoint)/2;
            midPoint = (int) Math.floor(midPointDouble); // cast to int
            if (lookUp > in[midPoint]) {
                leftEndPoint = midPoint + 1;
            } else {
                rightEndPoint = midPoint;
            }
        }
        location = (lookUp == in[leftEndPoint]) ? (leftEndPoint + 1) : 0;
        return location;
    }
}
