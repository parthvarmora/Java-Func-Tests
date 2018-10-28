import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;


public class FizzBuzzTest {

    @Test
    public void testWithNumberIsDividableBy3() {
        Assert.assertTrue(fizzBuzz(3).contains("Fizz"), "Fizz");
    }

    @Test
    public void testWithNumberIsDividableBy5() {
        Assert.assertTrue(fizzBuzz(5).contains("Buzz"), "Buzz");
    }

    @Test
    public void testWithNumberIsDividableBy15() {
        Assert.assertTrue(fizzBuzz(15).contains("FizzBuzz"), "FizzBuzz");
    }

    @Test
    public void testWithOtherNumber() {
        final List<Object> list = new ArrayList<>();
        for (int i= 1; i<=list.size();i++) {
            Assert.assertEquals(fizzBuzz(13), list.get(13));
        }
    }

    public static List<String> fizzBuzz(final int number) {
        final List<String> list = new ArrayList<>(number);

        for (int i = 1; i <= number; i++) {
            final String word = (number%3 == 0 ? "Fizz" : "") +(number%5 == 0 ? "Buzz" : "");

            if(StringUtils.isEmpty(word)){
                list.add(Integer.toString(i));
            }
            else{
                list.add(word);
            }
        }
        return list;

    }

}
