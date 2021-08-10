/*
Q/ Write a java method to implement binary search algorithm recursively.
Test your method in a complete java program. Procedure of binary search:
1.
Compare key with the middle element.
2.
If key matches with the middle element, we return the mid index.
3.
Else If key is greater than the mid element,
then key can only lie in high half sub array after the mid element.
So we recur for the high half.
4.
Else (key is smaller) recur for the low half.
*/
public class lab
{ // Returns index of x if it is present
    // in arr[l..r], else return -1
    public static int binarySearch(int arr[], int l,
                                   int r, int x)
    {
        //Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices.
        while (l<=r)
        {

            int mid =(l+r) / 2;

            // If the element is present
            // at the middle itself
            if (arr[mid] == x){
                return mid;}

            // If element is smaller than mid, then it can only
            // be present in left subarray
           if (arr[mid] > x){
                return binarySearch(arr, l, mid - 1, x);
}
            // Else the element can only be present in right
            // subarray
             if(arr[mid]<x){
            return binarySearch(arr, mid + 1, r, x);
        }}

        // We reach here when element is not present in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {

        int arr[] = { 2, 3, 4, 10, 40,134,1,12};
        int n = arr.length;
        int x = 34;
        System.out.println(binarySearch(arr, 0, n ,12));

    }
}
/* This code is contributed by Rajat Mishra */