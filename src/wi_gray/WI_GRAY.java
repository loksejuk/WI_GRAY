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
        
        int n=wej.nextInt();
        
        int w=wej.nextInt();//liczba, a tym samym kolumna pionowa
        
        int tab[]=new int[n];
        //kolumna
        /*
        for (int i=0;i<w;i++)
            {
            int xx;
                
            int m = (int) Math.pow(2, i+1);
            int p = (int) (Math.pow(2, m-1)-1);
            //tab[i]=((-cos(((i+p)/m)*Math.PI))>=0?1:0);
            //y = (-cos(((i-p)/m)*Math.PI));
            y = (-cos((i/2)*Math.PI));
            if(y>=0.0)
                {
                xx=0;
                }
            else
                {
                xx=1;
                }
           
            
            
            System.out.println("dla "+i+": "+xx);
            }
        
         *///zle
        /*
        for(int ki=0;ki<w;ki++)
            {
            int potpow = 8;
            int par = 4;
            double di;
            
            di = (-cos((((ki)*Math.PI)/potpow-(par*Math.PI/2))));
            //raz idzie -cosinus, raz cosinus; dla nieparzystych -
            int tabi;
            if(di<0.0)
                {
                tabi=0;
                }
            else
                {
                tabi=1;
                }
            System.out.println("dla "+ki+": "+tabi);
            
            }
        */
        //wiersz!
        
        for(int i=n-1;i>=0;i--)
            {
            int poz = n-i;
            double di;
            int potpow = (int) Math.pow(2,poz);
            //int potpow = 4;
            
            int par = potpow/2;
            //int par = 2;
            if (poz%2==0)
                {
                di = (cos((((w)*Math.PI)/potpow-(par*Math.PI/2))));
                }
            else
                {
                di = (-cos((((w)*Math.PI)/potpow-(par*Math.PI/2))));
                
                }
            
            if(di<0.0)
                {
                tab[i]=0;
                }
            else
                {
                tab[i]=1;
                }
            
            //tab[i]=arccos(sin(x));
            //tab[i]=(int) (acos(cos((i/4)*Math.PI)))/3;
           // tab[i]=(int) (cos((w-8)/16*Math.PI)+1)/4;
            //int t = (int) Math.pow(2.0,(int) n-i+1);
            //if(i>t-1)
                {
            //    tab[i]=(int) (cos((w-1)/t*Math.PI)+1)/2;
                }        
            //tab[i]=(int) (cos(Math.PI*(i/32))+1)/2;//nie bangla, zrobic x>=0?0:1
            //int m = (int) Math.pow(2, i=n+1);
            //int p = (int) (Math.pow(2, m-1)-1);
            //tab[i]=((-cos(((i+p)/m)*Math.PI))>=0?1:0);
            /*y = (-cos(((i+p)/m)*Math.PI));
            if(y>=0.0)
                {
                tab[i]=0;
                }
            else
                {
                tab[i]=1;
                }
            *////Zle!
                
            //System.out.println("tab["+i+"] = "+tab[i]);
                  
            }
        
        for(int i=0;i<n;i++)
            {
            //System.out.println("dla "+i+": "+tab[i]);
                System.out.print(tab[i]);
            }
        
        }
    
    }
