class Solution {

     private boolean checkRow(char[][] board, char ch, int rowNum, int colNum){
        for(int i = 0; i < 9; i++){
            if(colNum == i) continue;
            if(ch == board[rowNum][i]){
                return false;
            }
        }
        return true;
     }

     private boolean checkCol(char[][] board, char ch, int rowNum, int colNum){
        for(int i = 0; i < 9; i++){
            if(rowNum == i) continue;
            if(ch == board[i][colNum]){
                return false;
            }
        }
        return true;
     }

     private boolean check3by3(char[][] board, char ch, int rowNum, int colNum){
        int startRow = (rowNum/3)*3;
        int startCol = (colNum/3)*3;

        for(int i = startRow; i < startRow+3 ; i++){
            for(int j = startCol; j < startCol+3 ; j++){
                if(rowNum  == i && colNum == j) continue;
                if(ch == board[i][j]){
                    return false;
                }
            }
        }
        return true;
     }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9 ; j++){
                if (board[i][j] == '.') {
                    continue;
                }
                char ch = board[i][j];
                boolean rowCheck = checkRow(board, ch, i, j);
                boolean colCheck = checkCol(board, ch, i, j);
                boolean blockCheck = check3by3(board, ch, i, j);
                if(!rowCheck || !colCheck || !blockCheck){
                    return false;
                }
            }
        }
        return true;
    }
}
