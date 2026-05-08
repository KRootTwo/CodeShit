/*
Write a java method using Generics to count the occurrence of an element in an array of
any type. The signature of count method is given below.
public static <T> int count(T[] array, T item)
*/

public class A03Q06 {
    public static <T> int count(T[] arr, T item) {
        int ct = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(item)) {
                ct++;
            }
        }
        return ct;
    }
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 2, 2, 4};
        System.out.println(count(a, 2)); 
    }
}