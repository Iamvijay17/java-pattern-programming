
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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
