import org.testng.Assert;
import org.testng.annotations.Test;
public class SortArraDescend {


    int[] sortArrayDescending(int[] arr) {

        //base condition
        if(arr==null || arr.length<2){
            return arr;
        }

        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] > arr[i]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }
            }
        }
        while (flag);
        return arr;
        }

        @Test
        public void verifyUnsortedArray(){
                    int[] actualArray = {8,9,3,5,2};
                    int[] expectedArray = {9,8,5,3,2};
                    sortArrayDescending(actualArray);
                    Assert.assertEquals(actualArray,expectedArray);
         }

         @Test
         public void verfiyArraywithTwoElements(){
                     int[] actualArray = {1,2};
                     int[] expectedArray = {2,1};
                     sortArrayDescending(actualArray);
                     Assert.assertEquals(actualArray,expectedArray);
          }

          @Test
          public void VerifySingleElementArray(){
                      int[] actualArray = {1};
                      int[] expectedArray = {1};
                      sortArrayDescending(actualArray);
                      Assert.assertEquals(actualArray,expectedArray);
            }

           @Test
           public void verifyNullArray(){
                       int[] actualArray = null;
                       int[] expectedArray = null;
                       sortArrayDescending(actualArray);
                       Assert.assertEquals(actualArray,expectedArray);
            }

            @Test
             public void VerifyArrayWithNegativeNumbers(){
                         int[] actualArray = {1,-2,3,4,-5};
                         int[] expectedArray = {4,3,1,-2,-5};
                         sortArrayDescending(actualArray);
                         Assert.assertEquals(actualArray,expectedArray);
             }

}
