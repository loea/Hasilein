/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import frameapi.*;
import static frameapitest.FrameAPITest.*;

/**
 *
 * @author Tobias
 */

public class FoxActions {
    
    private static String[][] nfoxes = new String[14][14];
    
    public static void moveFoxes(){
        for(int i = 0; i<nfoxes.length; i++){
            for(int j = 0; j<nfoxes.length; j++){
                if(fox[i][j].equals("F")){
                    nfoxes[i][j] = "F";
                } else{
                    nfoxes[i][j] = ".";
                }
            }
        }
        
        for(int i = 0; i<nfoxes.length; i++){
            for(int j = 0; j<nfoxes.length; j++){
                if(nfoxes[i][j].equals("F")){
                    int r = FrameAPI.randomInt(11);
                    int x =0;
                    int y =0;
                    //nach links
                    if(r == 10 || r == 6){
                        x=i;
                        y=j--;
                        
                        if(y>=0 && y<15){
                            fox[x][y] = "F";
                        }
                        
                    }
                    
                    //nach rechts
                    else if(r == 9 || r == 7){
                        x=i;
                        y=j++;
                        
                        if(y>=0 && y<15){
                            fox[x][y] = "F";
                        }
                    }
                    
                    //nach nach oben
                    else if(r == 5 || r == 8){
                        x=i--;
                        y=j;
                        
                        if(x>=0 && x<15){
                            fox[x][y] = "F";
                        }
                    }
                    
                    //nach unten
                    else if(r == 1 || r == 3){
                        x=i++;
                        y=j;
                        
                        if(x>=0 && x<15){
                            fox[x][y] = "F";
                        }
                    }
                    
                    //nach stehen bleiben
                    else if(r == 4 || r == 2){
                        fox[i][j] = "F";
                    }
                } else{
                    fox[i][j] = ".";
                }
            }
        }
        
        for(int i=0; i<nfoxes.length; i++){
            for(int j=0; j<nfoxes.length; j++){
                nfoxes[i][j] = ".";
            }
        }
       
    }
}
