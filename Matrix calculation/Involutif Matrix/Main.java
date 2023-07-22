// Involutip Matris [f]

import java.util.*;
public class Main 
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       
        int mat[][] = new int[3][3];
        int satir, sutun ;
     
        System.out.println("Matris elemanlari girin :");
        for(satir=0;satir<3;satir++)
            for(sutun=0;sutun<3;sutun++){
                System.out.println(" Matrisin  satir :"+satir +" " + "sutun :" +sutun);
                mat[satir][sutun] = s.nextInt();
            }
        int res[][]=new int[3][3];
        for (int i = 0; i < 3; i++) 
            { 
                for (int j = 0; j < 3; j++) 
                    { 
                        res[i][j] = 0; 
                        for (int k = 0; k < 3; k++) 
                            res[i][j] += mat[i][k] * mat[k][j]; 
                    } 
            } 
        for (int i = 0; i < 3; i++) 
        { 
            for (int j = 0; j < 3; j++)
            { 
                if (i == j && res[i][j] != 1) 
                    {
                        System.out.println("Involutip Matris degil"); 
                        System.exit(0);  
                    }
                if (i != j && res[i][j] != 0) 
                    {
                        System.out.println("Involutip Matris degil"); 
                        System.exit(0);  
                    }
            } 
        } 
        System.out.println("Involutip Matris"); 
    } 
}
