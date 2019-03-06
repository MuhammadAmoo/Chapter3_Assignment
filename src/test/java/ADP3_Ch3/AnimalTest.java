package ADP3_Ch3;

import static org.junit.Assert.assertTrue;

import org.junit.*;

/**
 * Unit test for simple Animal.
 */
public class AnimalTest {
    /**
     * Rigorous Test :-)
     */

    private Animal dog;

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    @Before
    public void setUp() throws Exception {
        dog = new Animal();
    }

    @After
    public void tearDown() throws Exception {
    }



    //Object Equality
    @Test
    public void animalTypeT1() {

        String animalType = dog.animalType("dog");
        Assert.assertEquals("Object Equality", "dog", animalType);

    }

    //object identity
    @Test
    public void animalTypeT2() {

        String animalType = dog.animalType("dog");
        Assert.assertSame("Object Identity", "dog", animalType);

    }


    //Failed test
    @Test
    public void animalTypeT3() {

        String animalType = dog.animalType("dog");
        Assert.assertSame("Failed test", "cat", animalType);
    }


    //Time out
    @Test(timeout = 1)
    public void animalTypeT4() {

        String animalType = dog.animalType("dog");
    }


    //Exception Test
    @Test(expected = Exception.class)
    public void animalTypeT5() {

        int value = dog.no_of_dogs("five");
        Assert.assertEquals("Exception Test", 2, value);
    }

    //exceptionTest

    @Ignore("ignore")
    @Test(expected = Exception.class)
    public void animalTypeT6() {

        int value = dog.no_of_dogs("dog");

        Assert.assertEquals("Exception Test", 2, value);
    }



}
