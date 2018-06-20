package ch03;

import java.util.Arrays;
import java.util.Scanner;
 
public class Ch03Adv02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
         
        int GCD = 0, LCM = 0 ;
        for(int i = 0 ; i < N; ++i)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        GCD = arr[N-1];
        LCM = arr[N-1];
 
        for(int i = N-2 ; i >= 0; --i)
        {
            int x, y;
            if(GCD > arr[i]){
                x = GCD; y = arr[i];
            }
            else{
                y = GCD; x = arr[i];
            }
            GCD = getGcd(x, y);
             
            if(LCM > arr[i]){
                x = LCM; y = arr[i];
            }
            else{
                y = LCM; x = arr[i];
            }
 
            LCM = (x * y) /  getGcd(x, y);
 
        }
        System.out.println(GCD + " " + LCM);        
    }
     
    public static int getGcd(int x, int y)
    {
        if(x % y == 0) return y;
        return getGcd(y, x%y);
    }
}



