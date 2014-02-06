/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edwin
 */
public class DecimalToIEE754 {
    public static void main(String[]args){
        String a;
        double b;
        Binary news = new Binary(250);
        b = news.BinaryToDecimal("1011101110");
        System.out.println(b);
        a = news.DecimalToBinary();
        System.out.println(a);
    }
}
