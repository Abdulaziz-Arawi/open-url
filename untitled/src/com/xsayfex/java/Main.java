package com.xsayfex.java;

import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Code();

    }
    public static void Code(){

        String ch = JOptionPane.showInputDialog("Enter");

        if(ch.equals("code")) {

            logo();

            Scanner input = new Scanner(System.in);

            System.out.print("Enter you Code~~$ ");
            String code = input.next();

            if (code.equals("azouz")) {

                System.out.println("\n");
                System.out.print("Enter you Pass ~~$ ");
                int pass = input.nextInt();

                if (pass == 123) {

                    JOptionPane.showMessageDialog(null, "title");


                }


            } else {

                Desktop desktop = Desktop.getDesktop();


                try {
                    desktop.browse(new URI("https://www.instagram.com/direct/t/340282366841710300949128190891297536387"));
                } catch (Exception ex) {

                    System.out.println(ex);

                }
            }
        }
    }
    public static void logo(){

        System.out.println("\n");
        System.out.println("###########################\n");
        System.out.println("##           3z        ##\n");
        System.out.println("#####################\n");
        System.out.println("                    ################################\n");
        System.out.println("                   ##                           ##\n");
        System.out.println("                  ##            3z            ##\n");
        System.out.println("               ###########################\n");


        System.out.println("\n");

        System.out.println("Hi Welcome IN My Tool");

        System.out.println("\n");

        System.out.println("                programmer Xsayfex");
        System.out.println("\n");

    }

}
