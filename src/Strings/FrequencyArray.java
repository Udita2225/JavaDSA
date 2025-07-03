package Strings;

import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //Frequency Array
        int[] freq = new int[26];
        //0->a 1->b 2->c 3->d
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            int idx = ascii - 97;
            freq[idx]++;
        }
        int maxFreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
            System.out.print(freq[i] + " ");
        }
        System.out.println();
        System.out.println(maxFreq);
        for(int i=0; i<freq.length; i++){
            if(freq[i]==maxFreq)
                System.out.print((char)(97+i) + " ");
        }
        /*
        aabbccdefghijklmnopqrstuvwxyz
        2 2 2 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
        2
        a b c
        */
    }

}
