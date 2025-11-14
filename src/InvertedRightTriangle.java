/*
        *****   ====> 1st row - 5 star
        ****    ====> 2nd row - 4 star
        ***     ====> 3rd row - 3 star
        **      ====> 4th row - 2 star
        *       ====> 5th row - 1 star
*/

// 5 row 5 col

public class InvertedRightTriangle {
    public static void main(String arg[]) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
