/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import frameapi.*;
import static frameapitest.FrameAPITest.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Tobias
 */
public class GameActions {
    
    public static void applyToFeld(){
        for(int i=0; i<feld.length; i++){
            for(int j=0; j<feld.length; j++){
                if(fox[i][j].equals("F")){
                    feld[i][j] = "F";
                } if(hasen[i][j].equals("H")){
                    feld[i][j] = "H";
                } else {
                    feld[i][j] = ".";
                }
            }
        }
    }
    
    public static void saveFeld() throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Tobias\\Documents\\ausgabe.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int j=0;j<feld.length;j++){
            for(int z=0;z<feld.length;z++){
                bw.write(feld[j][z] + ",");
            }
            bw.write("\r\n");
        }

        bw.close();
    }
    
    public static void setFelder(){
        for(int i=0; i<feld.length; i++){
            for(int j=0; j<feld.length; j++){
                feld[i][j] = ".";
            }
        }
        for(int i=0; i<hasen.length; i++){
            for(int j=0; j<hasen.length; j++){
                int r = FrameAPI.randomInt(20);
                if(r == 14){
                    hasen[i][j] = "H";
                } else {
                    hasen[i][j] = ".";
                }
            }
        }
        
        for(int i=0; i<fox.length; i++){
            for(int j=0; j<fox.length; j++){
                int r = FrameAPI.randomInt(20);
                if(r<2){
                    fox[i][j] = "F";
                } else {
                    fox[i][j] = ".";
                }
            }
        }
        
        for(int i=0; i<feld.length; i++){
            for(int j=0; j<feld.length; j++){
                if(fox[i][j] == "F"){
                    feld[i][j] = "F";
                } if(hasen[i][j] == "H"){
                    feld[i][j] = "H";
                } else {
                    feld[i][j] = ".";
                }
            }
        }
        
        
        
    }
}
