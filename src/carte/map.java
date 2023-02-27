package carte;
import java.util.Scanner;

public class map {
    public static int[][] map1 = new int[15][15];
    public static int posX = 0;//position du hero 
    public static int posY = 0;
    
    public map(){
        for(int i=0;i<map1.length;++i) {
            for(int j=0;j<map1.length;++j) {
                map1[i][j]=0;
            }
        }
        map1[12][0]=3;
        map1[13][0]=4;
        map1[4][7]=1;
        map1[14][6]=5;
    }

    public static void showMap() {
        for(int i=0;i<map1.length;++i) {
            System.out.print('|');
            for(int j=0;j<map1.length-1;++j) {
                System.out.print("\t");
                if(map1[i][j]==0) { //case vide
                    System.out.print('-');
                }
                else if(map1[i][j]==1) { //obstacle
                    System.out.print('/');
                }
                else if(map1[i][j]==2) { //héros
                    System.out.print('0');
                }
                else if(map1[i][j]==3) { //ennemi
                    System.out.print('x');
                }
            	else if(map1[i][j]==5) { //Boss
            		System.out.print('X');
            	}
                else if(map1[i][j]==4) { //item
                    System.out.print('#');
                }
            }
            System.out.print("\t");
            System.out.println('|');
        }
        System.out.println();
    }
    
    public static void direction(char direction) {
        if (direction == 'z' && posX > 0 && map1[posX-1][posY] != 1) { // direction du hero vers le haut
            map1[posX][posY] = 0;
            posX--;
            map1[posX][posY] = 2;
        } else if (direction == 's' && posX < map1.length-1 && map1[posX+1][posY] != 1) {// direction du hero vers le bas
            map1[posX][posY] = 0;
            posX++;
            map1[posX][posY] = 2;
        }
         else if(direction == 'd' && posY < 14 && map1[posX][posY+1] != 1) {// direction du hero vers la droite
        	 map1[posX][posY] = 0;
             posY++;
             map1[posX][posY] = 2;
            }
         else if(direction == 'q' && posY > 0 && map1[posX][posY-1] != 1) {// direction du hero vers la gauche
        	 map1[posX][posY] = 0;
             posY--;
             map1[posX][posY] = 2;
            }
        }
      }
