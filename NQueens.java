/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ajedrezmain;

/**
 *
 * @author Arturo González
 * que se le esta indicando
 * @param row fila a evaluar
 * 
 */
public class NQueens {
    static int N = 8;
    static int[] board = new int[8];
    static int tablero = 1;
    
    /**
     * Imprime el tablero
     */
    static void printBoard(){
    System.out.println("Tablero: " + tablero);
    tablero++;
    for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (board[i] == j){
                    System.out.print("s:Q");
                }
                else { System.out.print("s:. ");}
            }
        }   System.out.println();
    }
    /**
     * Resuelve
     * @param row 
     */
    public static void solve(int row){
       if (row == N){
           printBoard();
           return;
       }
        for (int col = 0; col < N; col++){
            if (isSafe(row, col)){
                board[row] = col;
                solve(row + 1);
            }
        }
    }
    
    /*
    * Verifica si no colisiona con otra reina
    *@param row fila
    *@param col columna
    *@return regresa True si no colisiona.
    */
    static boolean isSafe(int row, int col){
       for (int i = 0; i < row; i++){
           if(board[i] == col 
           || Math.abs(board[i] - col ) == row - i){
                   return false;
            }
       }
        return true;
   }
    
    public static void main(String[] args){
        solve(row:0);
    }
}
