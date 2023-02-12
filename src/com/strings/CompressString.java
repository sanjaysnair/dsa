package com.strings;

public class CompressString {
    public static String getCompressedString(String str) {
        String ans="";
        int cnt = 0;
        char prev = ' ';
        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);;
            //System.out.println(curr);
            if (prev==' '){
                ans += curr;
                cnt++;
                prev = curr;;
            } else if (prev==curr) {
                //System.out.println("cnt:" + cnt);
                cnt++;
            } else {
                //System.out.println("else block");
                prev=curr;
                if (cnt!=1) {//end of same chars
                    ans += cnt;//append the count
                }
                ans += curr;
                cnt=1;
            }
        }
        if (cnt!=1) {
            ans += cnt;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aaabbccdsa";
        String ans = getCompressedString(str);
        System.out.println(ans);
    }
}
