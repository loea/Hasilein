/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import frameapi.*;
import static frameapitest.FrameAPITest.*;
import java.io.*;

/**
 *
 * @author Tobias
 */
public class HasenActions {
    
    private static String[][] nhasen = new String[14][14];
    
    public static void moveHasen(){
        for(int i = 0; i<nhasen.length; i++){
            for(int j = 0; j<nhasen.length; j++){
                if(hasen[i][j].equals("H")){
                    nhasen[i][j] = "H";
                } else{
                    nhasen[i][j] = ".";
                }
            }
        }
        
        for(int i = 0; i<nhasen.length; i++){
            for(int j = 0; j<nhasen.length; j++){
                if(nhasen[i][j].equals("H")){
                    int r = FrameAPI.randomInt(11);
                    int x =0;
                    int y =0;
                    //nach links
                    if(r == 10 || r == 6){
                        x=i;
                        y=j--;
                        
                        if(y>=0 && y<15){
                            hasen[x][y] = "H";
                        } else{
                            hasen[i][j] = "H";
                        }
                        
                    }
                    
                    //nach rechts
                    else if(r == 9 || r == 7){
                        x=i;
                        y=j++;
                        
                        if(y>=0 && y<15){
                            hasen[x][y] = "H";
                        } else{
                            hasen[i][j] = "H";
                        }
                    }
                    
                    //nach nach oben
                    else if(r == 5 || r == 8){
                        x=i--;
                        y=j;
                        
                        if(x>=0 && x<15){
                            hasen[x][y] = "H";
                        } else{
                            hasen[i][j] = "H";
                        }
                    }
                    
                    //nach unten
                    else if(r == 1 || r == 3){
                        x=i++;
                        y=j;
                        
                        if(x>=0 && x<15){
                            hasen[x][y] = "H";
                        } else{
                            hasen[i][j] = "H";
                        }
                    }
                    
                    //nach stehen bleiben
                    else if(r == 4 || r == 2){
                        hasen[i][j] = "H";
                    }
                } else{
                    hasen[i][j] = ".";
                }
            }
        }
        
        for(int i=0; i<nhasen.length; i++){
            for(int j=0; j<nhasen.length; j++){
                nhasen[i][j] = ".";
            }
        }
       
    }
    
    public static void mHasen(){
        int x,y;
        for(int i = 0; i<hasen.length; i++){
            for(int j = 0; j<hasen.length; j++){
                int direction = FrameAPI.randomInt(5);
                if(hasen[i][j].equals("H")){
                    if(direction == 1){
                        x=i; 
                        y=(j+1);
                        if(y>=0 && y<15){
                            hasen[i][j] = ".";
                            nhasen[x][y] = "H";
                        }
                    } else if(direction == 2){
                        x=(i+1); 
                        y=j;
                        if(x>=0 && x<15){
                            hasen[i][j] = ".";
                            nhasen[i][j] = "H";
                        }
                    } else if(direction == 3){
                        x=i; 
                        y=(j+1);
                        if(y>=0 && y<15){
                            hasen[i][j] = ".";
                            nhasen[i][j] = "H";
                        }
                    } else if(direction == 4){
                        x=(i-1); 
                        y=j;
                        if(x>=0 && x<15){
                            hasen[i][j] = ".";
                            nhasen[x][y] = "H";
                        }
                    } else if(direction == 0) {
                        nhasen[i][j] = "H";
                    }
                }
            }
        }
        
        for(int j=0;j<hasen.length;j++){
            for(int z=0;z<hasen.length;z++){
                hasen[j][z] = ".";
            }
        }
        for(int j=0;j<hasen.length;j++){
            for(int z=0;z<hasen.length;z++){
                if("H".equals(nhasen[j][z])){
                    hasen[j][z] = "H";
                }
            }
        }
        
        for(int j=0;j<nhasen.length;j++){
            for(int z=0;z<nhasen.length;z++){
                nhasen[j][z] = ".";
            }
        }
    }
}
