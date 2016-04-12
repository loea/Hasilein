/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameapitest;

import static actions.GameActions.*;
import static actions.FoxActions.*;
import static actions.HasenActions.*;
import frameapi.*;
import java.util.Random;


// grün: #81d269

public class FrameAPITest {
    
    public static String[][] feld = new String[14][14];
    public static String[][] hasen = new String[14][14];
    public static String[][] fox = new String[14][14];

    public static void main(String[] args) {
        
        //setFelder();
        FrameAPI.initFrame();
        FrameAPI.initString(feld.length, feld);
        FrameAPI.setPlayground();
       
        do {
            if(FrameAPI.newRound){
                
               // mHasen();
               // moveFoxes();
               // applyToFeld();
               
                
                
                FrameAPI.initString(feld.length, feld);
                FrameAPI.setPlayground();
            } else {
                System.out.println();
            }
        } while(!FrameAPI.allDead);
        
    }

    
   
