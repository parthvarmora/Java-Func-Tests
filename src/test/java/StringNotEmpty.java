/*
Java Program to check if String is empty or not
*/


import org.testng.annotations.Test;

public class StringNotEmpty {

    private static boolean stringNotEmpty(String str){

        if(str!=null && !str.isEmpty())
            return true;
            else
                return false;

    }

    @Test
    public void testStringNotEmpty(){
        System.out.println(stringNotEmpty(""));
        System.out.println(stringNotEmpty(null));
        System.out.println(stringNotEmpty(" "));
        System.out.println(stringNotEmpty("parth"));

    }
}
