//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Program1 {
//
//    private List<Integer> findDuplicate(List<Integer> list){
//
////        ArrayList<Integer> list = new ArrayList<>();
//
//        if (list == null || list.size() < 2)
//            return null;
//
//
//     //   int[] holderArray = new int[2];
//        int index = 0;
//
//
//        for (int i = 0; i < list.size(); i++)
//            for (int j = i + 1; j < list.size(); j++)
//                if (list.get(i) == list.get(j)) {
//                   if(list.get(index) = list.get(i));
//                    index++;
//                    if (index == 2)
//                        break;
//                }
//
//        return holderArray;
//
//    }
//
//    @Test
//    public void testFindDuplicate() {
//
//        int[] arr1={4,3,2,1,1,2};
//        int[] arr=findDuplicate(arr1);
//
//        for(int x : arr) {
//            System.out.println(x);
//        }
//
//
//    }
//
//
//}