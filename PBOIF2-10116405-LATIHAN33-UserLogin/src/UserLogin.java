/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * 
 */
public class UserLogin {
private static String usName;
    private static String passWord;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);
    }
    
}
