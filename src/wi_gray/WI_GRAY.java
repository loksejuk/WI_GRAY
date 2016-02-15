package wi_gray;

import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Łukasz Oksejuk
 * 
 * code firstly written for a WI_GRAY task at pl.spoj.com
 * but i've decided that this code could work as a standalone application
 */
public class WI_GRAY {
    
    
   public static void main(String[] args) 
        {
        
        //kod gui
        JFrame oknogl = new JFrame();
        JPanel p1_oknogl = new JPanel();
        oknogl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oknogl.setSize(200, 150);
        
        p1_oknogl.setLayout(new BoxLayout(p1_oknogl, BoxLayout.Y_AXIS));
        p1_oknogl.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        
        JPanel lfield = new JPanel();
        JLabel lliczba = new JLabel("Liczba: ");
        JTextField fliczba = new JTextField();
        fliczba.setSize(10,10);
        lfield.setLayout(new BoxLayout(lfield, BoxLayout.X_AXIS));
        lfield.add(lliczba);
        lfield.add(fliczba);
        
        p1_oknogl.add(lfield);
        
        JButton konwertuj = new JButton("Konwertuj");
        
        konwertuj.addActionListener((ActionEvent e)->{
        String graycode = conv(Integer.parseInt(fliczba.getText()));
        
       JOptionPane.showMessageDialog(oknogl, "Kod graya dla podanej liczby to:\n"+graycode);
        
        });
        p1_oknogl.add(konwertuj);
        oknogl.add(p1_oknogl);
        oknogl.setVisible(true);
        
        oknogl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
   
   public static String conv(int w)
        {
       //int n = wej.nextInt();
        int n=minsize(w)+1;
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
        
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
        strBuilder.append(tab[1][i]);
        }
        
        return strBuilder.toString();
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
    public static int minsize(int w)//funkcja okreslajaca minimalna dlugosc ciagu bitow potrzebna do zapisania takiej wartosci
    {
      int x=0;
      while(((int) Math.pow(2,x))<w)
        {
        x++;
        }
        
      return x;  
    }
    
    }
