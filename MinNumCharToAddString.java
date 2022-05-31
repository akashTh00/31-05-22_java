//Complete the minimumNumber function in the editor below.

//minimumNumber has the following parameters:

//int n: the length of the password
//string password: the password to test
//Returns-

//int: the minimum number of characters to add

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        Matcher num,low,up,spec;
        num = Pattern.compile("[0123456789]").matcher(s);
        low = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]").matcher(s);
        up = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]").matcher(s);
        spec = Pattern.compile("[!@#$%^&*()-/+]").matcher(s);
        int count = 0;
        if(!num.find())
            count++;
        if(!low.find())
            count++;
        if(!up.find())
            count++;
        if(!spec.find())
            count++;
        if(n+count<6){
            count+=6-n-count;
        }
        System.out.println(count);
    }
}