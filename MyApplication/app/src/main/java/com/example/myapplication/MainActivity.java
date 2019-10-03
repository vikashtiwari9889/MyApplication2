package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;
   public class MainActivity
   {
       public static void main(String args[]){
           Scanner Sc= new Scanner(System.in);
           System.out.println("Enter First Number");
           int a=Sc.nextInt();
           System.out.println("Enter Second Number");
           int b=Sc.nextInt();
         int c=a+b;
       System.out.println("Result=+c");

    }
}
