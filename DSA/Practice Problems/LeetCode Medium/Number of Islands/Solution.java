class Solution {
    public int numIslands(char[][] grid) {
        //we need a counter
        int count = 0;
        //check if the array is not empty
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;//empty grid
        }
        //else if the grid has values
        //iterate through each cell and visit all possible directions 
        int numrows = grid.length;
        int numcols = grid[0].length;
        for(int r = 0; r < numrows; r++){
            for(int c = 0; c < numcols;c++){
                if(grid[r][c] == '1'){
                //dfs search on the current cell
                dfsearch(grid,r,c); 
                //an island will be found
                count++;
                }
               
            }
        }
        return count;
    }

    public void dfsearch(char[][] grid, int current_row, int current_col){
        //base case -> //validating the boundries and cell value
        if( 
        current_row < 0 
        || current_row >= grid.length 
        || current_col < 0 
        || current_col >= grid[0].length
        || grid[current_row][current_col] == '0'){
            return;
        }
        //mark the current cell as visited
        grid[current_row][current_col] = '0';//marking it as an water
        dfsearch(grid,current_row+1,current_col);//next row search
        dfsearch(grid,current_row-1,current_col);
        dfsearch(grid,current_row,current_col+1);//next column search
        dfsearch(grid,current_row,current_col-1);

    }
}
