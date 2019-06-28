/*

   use case: function returns smallest and largest elements of an array

   possible scenarios for testing:

        1.verify the function if an array is null
        2.verify the function for an empty array
        3.verify the function if an array has single element
        4.verify the function if an array has two elements
        5.verify the function for sorted array
        6.verify the function for unsorted array

*/

import org.testng.annotations.Test;

public class FindLargestAndSmallestElement {
        //this function will return smallest and largest numbers of an array
        public int[] findLargestAndSmallestElement(int[] arr1) {
            //base case
            if (arr1 == null || arr1.length<3) {
                System.out.println("Array is not valid");
                return null;
            }
            int largest = arr1[0];
            int smallest = arr1[0];
            int[] arr = new int[2];

            for (int i = 1; i < arr1.length; i++) {
                    if (arr1[i] > largest) {
                        largest = arr1[i];
                    }
                    if (arr1[i] < smallest) {
                        smallest = arr1[i];
                    }
                }
                arr[0] = largest;
                arr[1] = smallest;
                return arr;
            }


            @Test
            //testing for a null array
            public void verifyNullArray () {
                    int[] arr = null;
                    int[] largestSmallestNumbers = findLargestAndSmallestElement(arr);
                    if(largestSmallestNumbers != null)
                    System.out.println("largest: "+largestSmallestNumbers[0]+"\nsmallest: "+largestSmallestNumbers[1]);
            }

            @Test
            //testing for Empty array
             public void verifyEmptyArray () {
                    int[] arr = { };
                    int[] largestSmallestNumbers = findLargestAndSmallestElement(arr);
                    if(largestSmallestNumbers != null)
                    System.out.println("largest: "+largestSmallestNumbers[0]+"\nsmallest: "+largestSmallestNumbers[1]);
             }

            @Test
            //testing for a single element array
            public void verifySingleElementArray () {
                    int[] arr = {1};
                    int[] largestSmallestNumbers = findLargestAndSmallestElement(arr);
                    if(largestSmallestNumbers != null)
                     System.out.println("largest: "+largestSmallestNumbers[0]+"\nsmallest: "+largestSmallestNumbers[1]);
            }

            @Test
            //testing for a two elements array
            public void verifyTwoElementsArray () {
                    int[] arr = {5,9};
                    int[] largestSmallestNumbers = findLargestAndSmallestElement(arr);
                    if(largestSmallestNumbers != null)
                    System.out.println("largest: "+largestSmallestNumbers[0]+"\n smallest: "+largestSmallestNumbers[1]);
            }

            @Test
            //testing for a sorted array
            public void verifySortedArray () {
                    int[] arr = {1,2,3,4,5};
                    int[] largestSmallestNumbers = findLargestAndSmallestElement(arr);
                    System.out.println("largest: "+largestSmallestNumbers[0]+ "\nsmallest: "+largestSmallestNumbers[1]);
            }

            @Test
            //testing for an unsorted array
            public void verifyUnSortedArray () {
                    int[] arr = {9,7,3,4,5};
                    int[] largestSmallestNumbers = findLargestAndSmallestElement(arr);
                    System.out.println("largest: "+largestSmallestNumbers[0]+ "\nsmallest: "+largestSmallestNumbers[1]);
            }

            @Test
             //testing for an array with negative numbers
            public void verifyArraywithNegativeNumbers () {
                     int[] arr = {1,-2,3,4,-5,0, 18};
                     int[] largestSmallestNumbers = findLargestAndSmallestElement(arr);
                     System.out.println("largest: "+largestSmallestNumbers[0]+ "\nsmallest: "+largestSmallestNumbers[1]);

             }



}



