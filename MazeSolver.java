/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mazesolver;

/**
 *
 * @author Arturo González
 */
public class MazeSolver {
    static int[][] maze = {
     {1, 0, 0, 0},
     {1, 1, 0, 1},
     {0, 1, 0, 0},
     {1, 1, 1, 1},
    };
    /**
     * @param args the command line arguments
     */
    static int[][] solution = new int[4][4];
        // TODO code application logic here
    }
    
   public static boolean solve(int x, int y){
   if (x == 3 &&  y == 3){
       solution[x][y] = 1;
       return true;
    }
    if (isSafe(x, y)){
        solution[x][y] = 1;
        if (solve(x + 1, y)) return true;
        if (solve(x, y + 1)) return true;
        solution[x][y] = 0; // backtrack;
    }
    return false;
    }
  static boolean isSafe(int x, int y){
      return x >= 0 && y >= 0 &&
             x < 4 && y < 4 &&
             maze[x][y] == 1;
    }

    static void printSolution(){
       for (int[] row : solution){
            for (int cell : row){
                System.out.print(cell + " ");

            }
        System.out.println();
        }
       
    }

    public static void main(String[] args){
        if (solve(x:0,y:0)){
            printSolution();
        }
        else {
            System.out.println("x:No encontre el camino");
        }
    }
