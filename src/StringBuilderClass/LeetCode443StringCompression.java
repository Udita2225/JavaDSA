package StringBuilderClass;

public class LeetCode443StringCompression {
    public static void main(String[] args) {
        //The string should be compressed such that consecutive duplicates of characters are replaced with the character
        //and followed by the number of consecutive duplicates
        /*
        Input - aaabbbbccddde
        Output - a3b4c2d3e
         */
        /*
        ALGORITHM- In this question we need ans string ,count,  current character, previous character
        Sbse pehle hume answer string ko string ke initial character se initialize karna Hoga
        Esa humne isliye kiya hai ki hum current character ko previous character se compare kar sake aur count badha sake
        count = 1 /Count ko hum 1 se shuru karenge kyoki ans string me already 1st character hai
        Ab hum i=1 se String me travel karna shuru karenge
        i=1 hoga current chracter /  i-1 hoga previous character
        agar Current character == Previous character , so count++
        agar current character != previous character aur count>1 tab hum ans string me count add kardenge
        aur count ko fir se 1 se initialize kar denge
        aur current character ko bhi ans me add kar denge
        ab last character ke liye count to increase ho jayega but aage koi character naa hone ki wajah se ye ans me add nahi hoga
        isliye agar last character ke liye if count>1 to use ans me separately add kar denge
        Humne count>1 isliye use kiya hai kyoki jo characters ek hi baar use ho rahe hain unka hume 1 number nahi likhna hai sirf chracter hi likhna hai
         */
        //Code
        String str = "aaabbbbcdddeeeee";
        String ans = "" + str.charAt(0); //a
        int count =1;
        for(int i =1; i<str.length(); i++){
            char curr = str.charAt(i); //Current Character
            char pre = str.charAt(i-1);//Previous Character
            if(curr==pre){
                count++;
            }
            else{ //curr!=pre
                if(count>1) ans += count;
                count =1;
                ans += curr;
            }
        }
        if(count>1){
            ans += count;
        }

        System.out.println(ans);//a3b4cd3e5

    }
}
