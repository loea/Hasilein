
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasilein.the.original;
import frameapi.*;
import java.util.Random;
/**
 *
 * @author Laura & Lea
 */
public class HasileinTheOriginal {

public  static String[][] meinArray = new String [14][14];
     
public static int randomInt(int max) {
    Random rand = new Random();
    int randomInteger = rand.nextInt(max); //max beträgt die Zahl, die einen höher ist als die höchste die gezogen werden kann, also eine Grenze
    return randomInteger;
}

public static void main(String[] args) {
    Spielfeld();
    FrameAPI.initFrame();
    FrameAPI.initString(meinArray.length,meinArray);
    FrameAPI.setPlayground();
        
        
    do
    {
        if(FrameAPI.newRound) 
        {
            moveTiere();
            FrameAPI.initString(meinArray.length, meinArray);
            FrameAPI.setPlayground();
        }
    }
    while(!FrameAPI.allDead);
    Ende();
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
            meinArray[i][j]=  ".";    //die Tabelle geht von 0 bis 13!
            meinArray[1][1]=  "J";   
            meinArray[10][10]="H";
            meinArray[11][3]= "H";
            meinArray[3][6]=  "h";
            meinArray[12][8]= "H";
            meinArray[8][2]=  "H";
            meinArray[2][10]= "H";
            meinArray[5][1]=  "H";
            meinArray[13][5]= "H";
            meinArray[6][5]=  "H";
            meinArray[1][4]=  "H";
            meinArray[0][6]=  "H";
            meinArray[7][12]= "H";
            meinArray[4][7]=  "H";
            meinArray[12][8]= "H";
            meinArray[10][6]= "H";
            meinArray[12][12]="H";
            meinArray[5][11]= "H";
            meinArray[6][8]=  "H";
            meinArray[12][10]="J";
            meinArray[7][10]= "h";
            meinArray[3][0]=  "U";
            meinArray[3][13]= "U";
            meinArray[9][7]=  "F";
            meinArray[5][8]=  "F";
            meinArray[3][11]= "F";
            meinArray[0][3]=  "F";
            meinArray[8][4]=  "F";
            meinArray[12][1]= "F";
            meinArray[4][3]=  "F";
            meinArray[1][12]= "F";
                        
            System.out.print(meinArray[i][j]+" ");
        }
   
        System.out.println(); 
    }
}

private static void moveTiere(){

    String[][] meinArray2 = new String [14][14];
 
    for (int i=0; i<meinArray2.length; i++)
    {
        for(int j=0; j<meinArray2.length; j++)
        {
            meinArray2[i][j] = meinArray[i][j];
        }
    }

//VEHRMEHRUNG ZU BABYHASE | VERMEHRUNG ZU BABYHASE | VERMEHRUNG ZU BABYHASE |  VERMEHRUNG ZU BABYHASE | VERMEHRUNG ZU BABYHASE | VERMEHRUNG ZU BABYHASE 
                         
    for (int i=0; i<meinArray2.length; i++)
    {
        for(int j=0; j<meinArray2.length; j++)
        {
            if (meinArray2[i][j].equals("H"))
            {
                String HH = "HH";
                
                if(i<13)
                {
                    String Ergebnis = meinArray[i][j]+ meinArray[i+1][j];
                    
                    if(Ergebnis.equals(HH))
                    {
                        meinArray[i][j]= "h";
                        meinArray[i+1][j]= ".";
                    }
                }
                
                if(j<13)
                { 
                    String Ergebnis1 = meinArray[i][j] + meinArray[i][j+1];
                    
                    if(Ergebnis1.equals(HH))
                    {   
                        meinArray[i][j]= "h";
                        meinArray[i][j+1]= ".";
                    }
                }
                
                if(i>0)
                {
                    String Ergebnis2 = meinArray[i][j]+ meinArray[i-1][j];
                
                    if(Ergebnis2.equals(HH))
                    {
                        meinArray[i][j]= "h";
                        meinArray[i-1][j]= ".";
                    }
                }
                
                if(j>0)
                {
                    String Ergebnis3 = meinArray[i][j]+ meinArray[i][j-1];
                    
                    if(Ergebnis3.equals(HH))
                    {
                        meinArray[i][j]= "h";
                        meinArray[i][j-1]= ".";
                    }
                }
            }  
        }
    }

//HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN  HASEN 
    
    for (int i=0; i<meinArray2.length; i++)
    {
        for(int j=0; j<meinArray2.length; j++)
        {
            if (meinArray2[i][j].equals("H"))
            {
                int x = randomInt(4); //eine Zufallszahl zwischen 0-3 wird erstellt
         
    /*0*/       if(x==0)
                {
                    if(i==13)
                    {
                        meinArray[13][j]= ".";
                        meinArray[0][j]="H";    
                    }
                    else
                    {    
                        meinArray[i][j] = ".";
                        meinArray[i+1][j] = "H"; 
                    }    
                }
                    
                    
    /*1*/       if(x==1)
                {
                    if(j==13)
                    {
                        meinArray[i][13] = ".";
                        meinArray[i][0] = "H"; 
                    }
                    
                    else
                    {    
                        meinArray[i][j] = ".";
                        meinArray[i][j+1] = "H"; 
                    }  
                }
                    
                    
    /*2*/       if(x==2)
                {
                    if(i==0)
                    {
                        meinArray[0][j] = ".";
                        meinArray[13][j] = "H"; 
                    }
                    
                    else
                    {    
                        meinArray[i][j]= ".";
                        meinArray[i-1][j]="H"; 
                    } 
                }
          
          
    /*3*/       if(x==3)
                {
                    if(j==0)
                    {
                        meinArray[i][0] = ".";
                        meinArray[i][13] = "H"; 
                    }
                    
                    else
                    {   
                        meinArray[i][j]= ".";
                        meinArray[i][j-1]="H"; 
                    }
                }
            }
        }
    }
//BABYHASE  BABYHASE  BABYHASE   BABYHASE  BABYHASE  BABYHASE  BABYHASE  BABYHASE  BABYHASE  BABYHASE  BABYHASE  BABYHASE 

    for (int i=0; i<meinArray2.length; i++)
    {
        for(int j=0; j<meinArray2.length; j++)
        {    
            if (meinArray2[i][j].equals("h"))
            {
                int y = randomInt(4); //eine Zufallszahl zwischen 0-3 wird erstellt
    
    /*0*/       if(y==0)
                {
                    if(i==13)
                    {
                        meinArray[13][j]= ".";
                        meinArray[0][j]="h";    
                    }
                    
                    else
                    {    
                        meinArray[i][j] = ".";
                        meinArray[i+1][j] = "h"; 
                    }    
                }
                    
                    
    /*1*/       if(y==1)
                {
                    if(j==13)
                    {
                        meinArray[i][13] = ".";
                        meinArray[i][0] = "h"; 
                    }
                    
                    else
                    {    
                        meinArray[i][j] = ".";
                        meinArray[i][j+1] = "h"; 
                    }  
                }
                    
                    
    /*2*/       if(y==2)
                {
                    if(i==0)
                    {
                        meinArray[0][j] = ".";
                        meinArray[13][j] = "h"; 
                    }
                    
                    else
                    {    
                        meinArray[i][j]= ".";
                        meinArray[i-1][j]="h"; 
                    }
                }
          
          
    /*3*/       if(y==3)
                {
                    if(j==0)
                    {
                        meinArray[i][0] = ".";
                        meinArray[i][13] = "h"; 
                    }
                    
                    else
                    {    
                        meinArray[i][j]= ".";
                        meinArray[i][j-1]="h"; 
                    }
                }
             
            }    
        }
    } 
               
//FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE  FÜCHSE
    
    for (int i=0; i<meinArray2.length; i++)
    {
        for(int j=0; j<meinArray2.length; j++)
        {
            if (meinArray2[i][j].equals("F"))
            {
                int z = randomInt(4); //eine Zufallszahl zwischen 0-3 wird erstellt
    
    /*0*/       if(z==0)
                {
                    if(i==13)
                    {
                        meinArray[13][j]= ".";
                        meinArray[0][j]="F";    
                    }
                    
                    else
                    {    
                        meinArray[i][j] = ".";
                        meinArray[i+1][j] = "F"; 
                    }    
                }
                    
    /*1*/       if(z==1)
                {
                    if(j==13)
                    {
                        meinArray[i][13] = ".";
                        meinArray[i][0] = "F"; 
                    }
                    
                    else
                    {
                        meinArray[i][j] = ".";
                        meinArray[i][j+1] = "F"; 
                    }  
                }
                    
   /*2*/        if(z==2)
                {
                    if(i==0)
                    {
                        meinArray[0][j] = ".";
                        meinArray[13][j] = "F"; 
                    }
                    
                    else
                    {    
                        meinArray[i][j]= ".";
                        meinArray[i-1][j]="F"; 
                    }
                }
          
   /*3*/        if(z==3)
                {
                    if(j==0)
                    {
                        meinArray[i][0] = ".";
                        meinArray[i][13] = "F"; 
                    }
                    
                    else
                    {   meinArray[i][j]= ".";
                        meinArray[i][j-1]="F"; 
                    }
                }
             }
        }
    }
        
//JÄGER  JÄGER  JÄGER   JÄGER  JÄGER  JÄGER  JÄGER   JÄGER  JÄGER  JÄGER  JÄGER   JÄGER  JÄGER  JÄGER  JÄGER   JÄGER  JÄGER  JÄGER  JÄGER
    
    for (int i=0; i<meinArray2.length; i++)
    {
        for(int j=0; j<meinArray2.length; j++)
        {        
            if (meinArray2[i][j].equals("J"))
            {
                int a = randomInt(4); //eine Zufallszahl zwischen 0-3 wird erstellt      
    
    /*0*/       if(a==0)
                {
                    if(i==13)
                    {
                        meinArray[13][j]= ".";
                        meinArray[0][j]="J";    
                    }
                    
                    else
                    {
                        meinArray[i][j] = ".";
                        meinArray[i+1][j] = "J"; 
                    }    
                }
                    
                    
    /*1*/       if(a==1)
                {
                    if(j==13)
                    {
                        meinArray[i][13] = ".";
                        meinArray[i][0] = "J"; 
                    }
                    
                    else
                    {
                        meinArray[i][j] = ".";
                        meinArray[i][j+1] = "J";
                    } 
                }
                    
    /*2*/       if(a==2)
                {
                    if(i==0)
                    {
                        meinArray[0][j] = ".";
                        meinArray[13][j] = "J"; 
                    }
                    
                    else
                    {
                        meinArray[i][j]= ".";
                        meinArray[i-1][j]="J"; 
                    }
                }
          
    /*3*/       if(a==3)
                {
                    if(j==0)
                    {
                        meinArray[i][0] = ".";
                        meinArray[i][13] = "J"; 
                    }
                    
                    else
                    {    
                        meinArray[i][j]= ".";
                        meinArray[i][j+1]="J"; 
                    }
                }
            } 
        }
    }    
                  
//UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN  UNICORN               
    
    for (int i=0; i<meinArray2.length; i++)
    {
        for(int j=0; j<meinArray2.length; j++)
        {                         
            if (meinArray2[i][j].equals("U"))
            {
                if(i==13)
                {
                    meinArray[13][j]= ".";
                    meinArray[0][j]="U"; 
                }
                
                else
                {     
                    meinArray[i][j] = ".";
                    meinArray[i+1][j] = "U"; 
                }       
            }
        }
    }
}

private static void Ende(){  //funktioniert nur wenn alle Tiere tot sind un die 2 unicorns überleben ja immer xDDD also kommen die grabsteine nie -.-
 
    for (int i=0; i<meinArray.length; i++)
    {
        for(int j=0; j<meinArray.length; j++)
        {   
            meinArray[i][j] = "R";
            
            System.out.print(meinArray[i][j]+" ");
        }   
        System.out.println(); 
    } 
}
}                