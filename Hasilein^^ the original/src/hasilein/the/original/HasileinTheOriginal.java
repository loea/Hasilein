/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasilein.the.original;

import java.util.Scanner;
import frameapi.*;
/**
 *
 * @author Lea
 */
public class HasileinTheOriginal {

    /**
     * @param args the command line arguments
     */
     public  static String[][] meinArray = new String [14][14];

    public static void main(String[] args) {
        Spielfeld();
        FrameAPI.initFrame();
        FrameAPI.initString(meinArray.length,meinArray);
        FrameAPI.setPlayground();
        
        
        do{
        if(FrameAPI.newRound) {
        moveHasen();
        FrameAPI.initString(meinArray.length, meinArray);
        FrameAPI.setPlayground();
        }
        }while(!FrameAPI.allDead);
        
    }
      
   
        
    
    
   
   public static void Spielfeld(){    
       
    for (int i=0; i<meinArray.length; i++)
        {
            for(int j=0; j<meinArray.length; j++)
            {
                meinArray[i][j]=".";
            }
        }
                for (int i=0; i<meinArray.length; i++)
        {
            for(int j=0; j<meinArray.length; j++)
            {
               meinArray[i][j]=  ".";    //die Tabelle geht nur von 0 bis 13 wenn man bei for int i/j=0 einsetzt 
               meinArray[1][1]=  "H";   //wenn man von 1 bis 14 haben will setzt man 1 dort ein,hatt dann aber nur 13 zeilen
               meinArray[2][6]=  "H";
               meinArray[13][3]= "H";
               meinArray[3][6]=  "H";
               meinArray[12][8]= "H";
               meinArray[8][2]=  "H";
               meinArray[2][10]= "H";
               meinArray[5][1]=  "H";
               meinArray[13][5]= "H";
               meinArray[2][7]=  "H";
               meinArray[1][4]=  "H"; 
               meinArray[4][7]=  "H";
               meinArray[12][8]= "H";
               meinArray[13][6]= "H";
               meinArray[6][8]=  "H";
               meinArray[12][10]="F";
               meinArray[7][10]= "F";
               meinArray[3][0]=  "F";
               meinArray[5][13]= "F";
               meinArray[9][7]=  "F";
               System.out.print(meinArray[i][j]+" ");
            }
   
            System.out.println(); 
             
    }}

private static void moveHasen(){
    String[][] meinArray2 = new String [14][14];
 
   // meinArray2=meinArray.clone();
 for (int i=0; i<meinArray2.length; i++)
        {
            for(int j=0; j<meinArray2.length; j++)
            {
                meinArray2[i][j] = meinArray[i][j];
                
            }
        }
    
    
    for (int i=0; i<meinArray2.length; i++)
        {
            for(int j=0; j<meinArray2.length; j++)
            {
               if (meinArray2[i][j].equals("H") )
                {
                    meinArray[i][j]= ".";
                    meinArray[i][j+1]="H";
                    
                    
                }
            }
}
}
}
