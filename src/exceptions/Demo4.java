package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        int num;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        try{

        }finally{
     bf.close(); // close resources
        }

    }





}
