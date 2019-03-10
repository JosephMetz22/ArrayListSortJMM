//Package

import java.util.Scanner;

//Class

public class SortStudents {

   public static void main(String[] args) {

       char ch;
       int n;
       Scanner sc = new Scanner(System.in);

       do {

           System.out.println("Enter list size");
           n = sc.nextInt();
           String[] studentArray = new String[n];
           System.out.println("Enter student names");
           for (int i = 0; i < n; i++)
               studentArray[i] = sc.next();

        SortStrings(studentArray);

        System.out.println("List Before Sorting");
           for (int i = 0; i < n; i++)
               System.out.println(studentArray[i]);

           System.out.println("List After Sorting");
           for (int i = 0; i < n; i++)
               System.out.println(studentArray[i]);

           System.out.println("Do you want to continue press y or Y");
           ch = sc.next().charAt(0);
       } while (ch == 'y' || ch == 'Y');

   }

public static void SortStrings(String[] studentArray) {
       // Applying bubble Sort Logic
    for (int i = 0; i < studentArray.length - 1; i++) {
           for (int j = i + 1; j < studentArray.length; j++) {
               if (studentArray[i].compareTo(studentArray[j]) > 0) {
                   String temp = studentArray[i];
                   studentArray[i] = studentArray[j];
                   studentArray[j] = temp;
               }
           }
       }

}

}
