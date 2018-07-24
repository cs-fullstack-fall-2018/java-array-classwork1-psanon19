import java.util.ArrayList;
//Exercise 24
//Create the array
//Print the 2nd index of the numberList.
//Delete the third index.
//Print the 2nd index again

public class ex24 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(7);

        System.out.println(numberList.get(1));
        numberList.remove(2);
        System.out.println(numberList.get(1));

    }
}
