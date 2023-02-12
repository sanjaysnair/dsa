package com.strings;

public class AsgnHighestOccuringCharacter {
    public static char highestOccuringChar(String str) {
        int[] freqTable = new int[123];
        for (int i=0;i<str.length();i++){
            freqTable[(int)str.charAt(i)]+=1;
        }
        int max = 0;
        char maxChar = ' ';
        for (int i=97;i<=122;i++){
            if (freqTable[i]>max){
                max=freqTable[i];
                maxChar = (char)i;
            }
        }
        return maxChar;
    }
    public static void main(String[] args) {
        String str = "xy";
        char ch = highestOccuringChar(str);
        System.out.println(ch);
    }
}
