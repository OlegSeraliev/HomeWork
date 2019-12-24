package ru.geekbrains;
import java.util.Scanner;
import java.util.Random;

public class ForthLesson {

    public static int SIZE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

   /* public static boolean checkWin(char symb) {
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }*/

   public static boolean checkWin(char symb) {

       // FlagWin - инликатор наличия выигрышной комбинации
       boolean FlagWin = false;
       // Цикл проперки поля
       for (int i = 0; i < SIZE; i++) {
           // Провера по строкам
           if (checkRow(i, symb)) {
               FlagWin = true;
               break;
           }
           // Проверка по колонкам
           if (checkColumn(i, symb)) {
               FlagWin = true;
               break;
           }
       }
       // Если нет выигрышной комбинации ни по строкам, ни по столбцам
       // Выполняется проверка по диагоналям поля
       if (!FlagWin) {
           FlagWin = checkDiagonals(symb);
       }

       return FlagWin;
   }
    /*
    * Метод checkRow(row, mark)
    * Выполняет проверку наличия выигрышной комбинации в указанной строке
    * row - номер строки
    * mark - проверяемый символ игрока
    * Возвращаемое значение:
    * true - строка row заполнена символами mark
    * false - в противном случае
    */
   public static boolean checkRow(int row, char mark) {

       boolean flag = true;
       int j = 0;
       while (flag && (j < SIZE)){
           if (map[row][j] != mark)
               flag = false;
           j++;
       }
       return flag;
   }
    /*
     * Метод checkColumn(col, mark)
     * Выаолняет проверку наличия выигрышной комбинации в указанном столбце
     * col - номер столбца
     * mark - проверяемый символ игрока
     * Возвращаемое значение:
     * true - колонка col заполнена символами mark
     * false - в противном случае
    */
   public static boolean checkColumn(int col, char mark) {

       boolean flag = true;
       int i = 0;
       while (flag && (i < SIZE)) {
           if (map[i][col] != mark)
               flag = false;
           i++;
       }
       return flag;
   }
    /*
    * Метод checkDiagonals(mark)
    * Выполняет проверку наличия выигрышной комбинации в диагоналях поля
    * mark -проверяемый символ игрока
    * Возвращаемое значение:
    * true - найдена выгрышная комбинация в одной из диагоналей поля
    * false - выигрышная комбинация не найдена
     */
   public static boolean checkDiagonals(char mark) {
       boolean flag1 = true;
       boolean flag2 = true;
       int i = 0;
       int j = SIZE-1;
       while ((flag1 || flag2) && (i < SIZE)) {
           if (map[i][i] != mark)
               flag1 = false;
           if (map[j][j] != mark)
               flag2 = false;
           i++;
           j--;
       }
       return flag1 || flag2;
   }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[x][y] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
