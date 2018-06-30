package book;

import java.util.Scanner;

public class book1 {
    private String title;
    private String nameAuther;
    private int pages;
    private int year;
    private double price;
    
    public String getTitleInTitleCase(){
    Scanner line = new Scanner(title);
    String TitleCase="";
    while(line.hasNext()){
        String word = line.next();
        TitleCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
    }
    return TitleCase ; 
}
    public boolean contains(String str){
        if(title.indexOf(str) != -1)
            return false;
        return true;
    }
    
    public void getShortTitle(){
        if(title.length() < 50){
            System.out.println(title);
        }
        else{
            System.out.println(title.substring(0,50));
        }
    }
    
    public void printAuthor(){
        int i =0;
        int sw=1;
        int length = title.length();
        int count = title.indexOf(",");
        while(count <length +1 && sw==1){
            String word = title.substring(i,count);
            System.out.println("word");
            i = count +1 ; 
            count = title.indexOf(",",i);
            if(count != -1){
                count = length;    
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameAuther() {
        return nameAuther;
    }

    public void setNameAuther(String nameAuther) {
        this.nameAuther = nameAuther;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
