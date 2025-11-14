
/*
        *       ====> 1st row - 1 star
        **      ====> 2nd row - 2 star
        ***     ====> 3rd row - 3 star
        ****    ====> 4th row - 4 star
        *****   ====> 5th row - 5 star
*/

// 5 row 5 col

public class RightTriangle {
    public static void main(String arg[]) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
