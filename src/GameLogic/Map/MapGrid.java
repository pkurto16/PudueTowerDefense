package src.GameLogic.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapGrid {
    int[][] grid;
    public void setupGrid(int size){
        grid = new int[size][size];
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                grid[i][j] = 0;
            }
        }


    }
}
