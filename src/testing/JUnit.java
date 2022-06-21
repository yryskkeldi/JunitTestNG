package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit {
    public static void main(String[] args) {

    }

    public int add(int a, int b){
        return a + b;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public boolean isBishkek(String city){
        return city.equals("Bishkek");
    }
//______________________________________________________________________________________________________________________
//Анноитация Test не должен быть статичным и не должен ничегго возвращать (void)

    @Test
    public void testBishkek(){
        Assertions.assertFalse(isBishkek("bishkek"));
        Assertions.assertTrue(isBishkek("Bishkek"));
    }

    @Test // Annotation, он используется чтобы пометить метод как тест junit
    public void testAdd(){
        //5, 6
        int expectedValue = 11;
        Assertions.assertEquals(expectedValue, add(5, 6));
    }
    @Test
    public void testMinus(){
        //10, 9
        int expectedValue = 1;
        Assertions.assertEquals(expectedValue, minus(10, 9));
    }
}
