/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wi_gray;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author Konserwator
 */
public class WI_GRAY {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
        {
        Scanner wej = new Scanner(System.in);
        int n = wej.nextInt();
        int w = wej.nextInt();
        int tmp = w;
        int tmp2;
        
        int tab[][] = new int[2][n];
        //Math.pow(2,n+1);6
        //System.out.println(Integer.toBinaryString(w));
        //String binary = Integer.toBinaryString(w);
        for(int i=0;i<n;i++)
            {
            tmp2=(int) Math.pow(2,n-i-1);
            if(tmp>=tmp2)
                    {
                     tab[0][i]=1;
                     tmp=tmp-tmp2;
                    }
            else
                {
                tab[0][i]=0;
                }   
                
            }//konwersja do binarnego
        for(int i=n-1;i>0;i--)
            {
            tab[1][i]=xor(tab[0][i],tab[0][i-1]);
            }
        tab[1][0]=tab[0][0];
        for(int i=0;i<n;i++)
            {
            System.out.print(tab[1][i]);
            }
        
        }
    
    
    public static int xor(int a, int b)
        {
        if (a==b)
            {
            return 0;
            }        
        else
            return 1;
        }
    
    }
