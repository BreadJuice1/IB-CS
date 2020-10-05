import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class cool {

    public static void main(String args[]) throws IOException {
    
    int life[][] = new int[150][150];

    System.out.println("number");
    
    Scanner in = new Scanner(System.in);
    int amount = in.nextInt();

    Random rm = new Random();

        for (int i = 0; i <= amount; i++) {
            int x = rm.nextInt(150);
            int y = rm.nextInt(150);
            
                if (life[x][y] == 0) {
                        life[x][y] = 1;

                    } else {
                        amount += 1;
                    }
            System.out.println(amount);
        } // fill array

        int curX = 1;
        int curY = 1;
        int neigbors = 0;
            for (int j = 22500; j >= 0; j--) {
                System.out.println("new cell");
                if (curX < 149) {curX++;} else if (curX == 149) {curX = 0; curY++;} 

                int relLocX = -1;
                int relLocY = -1;
                neigbors = 0;
                for (int a = 0; a < 8; a++) {            
                    if (curX != 149 && curY != 149) {   
                        if (life[curX+relLocX][curY+relLocY] == 1) {neigbors++;}

                        
                    }     
                } 
                System.out.println(neigbors);
            }

    
    } // ur mum
} // end