import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.pushFront(0);
        myArrayList.pushBack(1);
        myArrayList.pushBack(2);
        myArrayList.pushBack(3);
        myArrayList.pushBack(4);
        myArrayList.pushBack(5);
        myArrayList.pushBack(6);
        myArrayList.trimToSize();
        myArrayList.pushBack(7);
        myArrayList.pushBack(8);
        myArrayList.pushBack(9);
        myArrayList.pushBack(10);
        myArrayList.pushBack(12);
        myArrayList.insert(11, 11);
        System.out.println(myArrayList.toString()+"insert");
        myArrayList.shuffle();
        System.out.println(myArrayList.toString()+"shuffle");
        System.out.println(myArrayList.lastIndexOf(4)+" get index");
        myArrayList.removeAt(10);
        System.out.println(myArrayList.toString()+"removeAt");
        myArrayList.remove(4);
        System.out.println(myArrayList.toString());
        myArrayList.removeAll(7);
        myArrayList.popFront();
        myArrayList.reverse();
        System.out.println(myArrayList.indexOf(2));
        System.out.println(myArrayList.toString());
        myArrayList.popBack();
        System.out.println(myArrayList.toString());
        myArrayList.clear();
        System.out.println(myArrayList.toString()+"clear");
        System.out.println(myArrayList.isEmpty());
        myArrayList.clear();
        myArrayList.pushBack(1);
        myArrayList.pushBack(2);
        myArrayList.pushBack(3);
        myArrayList.pushBack(4);
        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
        myArrayList1.pushBack(1);
        myArrayList1.pushBack(2);
        myArrayList1.pushBack(3);
        myArrayList1.pushBack(4);
        System.out.println(myArrayList.equals(myArrayList1)+" equals");
        try {
            System.out.println(myArrayList.getElementAt(3).toString());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        myArrayList.pushBack(5);
        myArrayList1.clear();
        myArrayList1 = myArrayList.clone();
        System.out.println(myArrayList1.toString());
    }



}
