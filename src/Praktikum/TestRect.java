/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author User
 */
public class TestRect {
    public static void main(String[] args) //method utama
    {
    Rect nilai1=new Rect(1,1,4,4); //membuat objek baru dengan nama nilai1
    Rect nilai2=new Rect(2,3,4,4); //membuat objek baru dengan nama nilai2
    Rect nilai3=new Rect(2,3,5,6);
    int x=2;
    int y=3;
    if(nilai1.isInside(x,y)){
    System.out.println( x+","+y+" Is Inside The Union"); //output program
    } 
    else{
    System.out.println( x+","+y+" Is Outside The Union"); //output program}
    } 
    System.out.println("\n");
    System.out.println( nilai1.toString()+" Union " + nilai3.toString()+ "= " +nilai1.union(nilai2));
    System.out.println("\n");
    System.out.println(   nilai1.toString()+"   Intersect   "   +nilai3.toString()+ " = " +nilai1.intersection(nilai2));
    Rect nilai4 = nilai1.intersection(nilai2);nilai4.move(3,3);
    System.out.println("\n");System.out.println(   nilai1.intersection(nilai2)+   "   Digeser   Sejauh(3,3) = " +nilai4.toString());
    }   
}
