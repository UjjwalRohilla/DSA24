package IOSTREAMSPRACTIVE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter some characters");
            int chars = isr.read();
            while(isr.ready()){
                System.out.print((char) chars + " -> ");
                chars = isr.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
