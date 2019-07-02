import java.util.ArrayList;

public class Program {


//    public int[] findDuplicate(int[] arr){
//
//        // int [] arr = {1,2,3,6,6,7,1,5}
//


    public static void main(String[] args){

        int[] arr = {1,1,3,2,4,3};
       //ArrayList<Integer> al = new ArrayList<>();

        int[] arr1 = new int[2];

        int index = 0;

        for(int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    arr1[index]=arr[i];
                    index++;
                    if(index == 2) {
                        break;
                    }
                }

            }
        }

        for (int x : arr1){
            System.out.println(x);
        }


    }
}
