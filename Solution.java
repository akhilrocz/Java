public class Solution {
    public static void staircase(int n) {
        // Loop for each level of the staircase
        for (int symbols = 1; symbols <= n; symbols++) {
            // Calculate spaces
            int spaces = n - symbols;   //4-1=> 3,2,1,0
            
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            
            // Print hashes
            for (int j = 0; j < symbols; j++) {    //0<4  //1<4
                System.out.print('#');
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(6);  // Example call to the staircase function with n = 6
    }
}
