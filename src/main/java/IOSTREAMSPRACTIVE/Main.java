package IOSTREAMSPRACTIVE;

import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.print("Enter some characters");
//            int chars = isr.read();
//            while(isr.ready()){
//                System.out.print((char) chars + " -> ");
//                chars = isr.read();
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        System.out.println();



//        try(FileReader fr = new FileReader("src/main/java/IOSTREAMSPRACTIVE/example.txt")){
//            int words = fr.read();
//            while (fr.ready()){
//                System.out.println( words);
//                words = fr.read();
//            }
//            System.out.println();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        try(FileWriter fr = new FileWriter("example2.txt",true)){
//            fr.write(" ujjwal");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        try {
//            FileInputStream fis = new FileInputStream("src/main/java/IOSTREAMSPRACTIVE/example.txt");
//            int chars;
//            while((chars = fis.read()) != -1){
//                System.out.println((char)chars);
//            }
//            System.out.println();
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            System.out.println(br.readLine());
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        FileReader
//
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            int word = isr.read();
//            while(isr.ready()){
//                System.out.println((char)word);
//                word = isr.read();
//            }
//            System.out.println();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try(FileReader isr = new FileReader("src/main/java/IOSTREAMSPRACTIVE/example.txt")){
//            int word = isr.read();
//            while(isr.ready()){
//                System.out.println((char)word);
//                word = isr.read();
//            }
//            System.out.println();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        try(OutputStreamWriter osr = new OutputStreamWriter(System.out)){
//            osr.write('A');
//            osr.write("abcsd");
//            osr.write(100);
//        }catch (IOException e){
//            e.printStackTrace();
//        }


//        try(FileWriter fr = new FileWriter("src/main/java/IOSTREAMSPRACTIVE/example2.txt",true)){
//            fr.write("This was how it was goin to be \n");
//            fr.write("LOL");
//
//        }catch (IOException e ){
//            e.printStackTrace();
//        }
//
//        try(BufferedReader br = new BufferedReader(new FileReader("src/main/java/IOSTREAMSPRACTIVE/example2.txt"))){
//            while(br.ready()){
//                System.out.println(br.readLine());
//            }
//        }catch (IOException e){
//
//        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/IOSTREAMSPRACTIVE/example2.txt"))){

            bw.write("Everything will be fine");

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
