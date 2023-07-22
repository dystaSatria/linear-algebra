/* Cikarma */

import java.util.Scanner;

public class Main
{
	public static void main(String [] args) {
	     
		 Scanner klavye=new Scanner(System.in);
		 System.out.println("Matriks a");
		 System.out.println("Matrislerin satır satısı kaç olsun?");
		 int satir=klavye.nextInt();
		 
		 System.out.println("Matrislerin sutun satısı kaç olsun?");
		 int sutun=klavye.nextInt();
		 
		 int[][] matris1=new int[satir][sutun];
		 int[][] matris2=new int[satir][sutun];
		 
		 for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("satir(a) " + i + " sutun(a) "+j+":");
                matris1[i][j] = klavye.nextInt();
            }
        }
		 System.out.println();
		 
        
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                
            }
            
        }
        
        System.out.println(" Matriks b: ");
      
		 System.out.println("Matrislerin satır satısı kaç olsun?");
		 int satir2=klavye.nextInt();
		 
		 System.out.println("Matrislerin sutun satısı kaç olsun?");
		 int sutun2=klavye.nextInt();
		 
		 
		 
		 
		 for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(" satir(a) " + i + " sutun(b) "+j+":");
                matris2[i][j] = klavye.nextInt();
            }
        }
		 System.out.println();
		 
        System.out.println("Toplama:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                
            }
           
        }
        
       
     for (int i=0; i<satir;i++){
        for (int j =0;j<sutun;j++){
            int elem = matris1[i][j] - matris2[i][j]; 
            System.out.print( elem + " ");
        }       
        System.out.println();
    }
       
    }
		 
	    
}

