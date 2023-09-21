package src.Graphics;


import javax.swing.*;
public class GridPosition extends JPanel {
    public GridPosition(int xPos, int yPos, int id){
        this.xPos=xPos;
        this.yPos=yPos;
        name+=id;
    }
    int xPos;
    int yPos;
    String name = "id:";
}
