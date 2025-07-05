package com.codegnan.practice;

import java.util.Scanner;

public class MovieTheatre {
    String MovieName;
    String Director;
    int ReleaseYear;
    public static void DisplayDetails(String movie,String director,int Year){
        System.out.print(movie+"\n"+director+"\n"+Year+"\n");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MovieTheatre ob=new MovieTheatre();
        System.err.print("Enter Movie Name : ");
        ob.MovieName=sc.nextLine();
        //sc.nextLine();
        System.out.print("Enter Director Name : ");
        ob.Director=sc.nextLine();
        System.out.print("Enter Released Year : ");
        ob.ReleaseYear=sc.nextInt();
        DisplayDetails(ob.MovieName,ob.Director,ob.ReleaseYear);
        DisplayDetails("Evadu","Vasu",2003);
    }
}
