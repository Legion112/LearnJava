package ru.fearofcode.learn.io.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created by maks on 6/16/2017.
 */
public class BufferedFileInput {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();

        FileInputStream isFile = null;
        BufferedInputStream buff = null;
        byte array[] = new byte[Settings.interactional];
        try {
            isFile = new FileInputStream(Settings.nameFile);
            buff = new BufferedInputStream(isFile);
            buff.read(array);
            System.out.println("I finished read in array");

            /*for (int i = 0; i < Settings.interactional; i++){
                System.out.print(array[i]);
            }*/
        }catch(Exception e){
            System.out.println("\nCould not read file: " + e.toString());
        }finally{
            try{
                if (isFile != null) isFile.close();
                if (buff != null)   buff.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        long timeFinish = System.currentTimeMillis();
        System.out.println("\nTime of work " + BufferedFileInput.class + " " + (timeFinish - timeStart) / 1000 + " second");
    }
}