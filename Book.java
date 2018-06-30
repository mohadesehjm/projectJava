package book;

import java.util.Scanner;


public class Book {

    public static void main(String[] args) {
        book1 b = new book1();
        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        b.setNameAuther(input.nextLine());
    }
    
}
