/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
public class cobalahh {
    public static void main(String[] args) {
        Line coba = new Line(3,4,5,6);
        Line pertama = new Line(3,4,5,6);
        coba.getLength();
        pertama.getLength();
     coba.isGreater(coba, pertama);
        System.out.println(coba.isGreater(coba, pertama));
     coba.isLess(coba, pertama);
        System.out.println(coba.isLess(coba, pertama));
     coba.isEqual(coba, pertama);
        System.out.println(coba.isEqual(coba, pertama));
    }   
}
