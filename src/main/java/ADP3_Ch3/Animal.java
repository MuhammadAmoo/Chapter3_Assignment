package ADP3_Ch3;

/**
 * Muhammad Amoo
 * 216022002
 * Assignment 3
 */
public class Animal implements AnimalType
{
    public static void main( String[] args )
    {
        Animal dog = new Animal();
        dog.animalType("dog");
    }

    @Override
    public String animalType(String animal) {
        return animal;
    }


    public int no_of_dogs (String value)
    {
        return Integer.parseInt(value);
    }
}
