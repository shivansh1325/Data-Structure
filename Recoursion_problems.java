public class Recoursion_problems {
    public int counter = 0;

    public void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg) {
        /* If only 1 disk, make the move and return */
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
            counter++; // Increment counter after the move
            return;
        }
        /* Move top n-1 disks from A to B, using C as auxiliary */
        TowersOfHanoi(n - 1, frompeg, auxpeg, topeg);
        /* Move remaining disk from A to C */
        System.out.println("Move disk from peg " + frompeg + " to peg " + topeg);
        counter++; // Increment counter after the move
        /* Move n-1 disks from B to C using A as auxiliary */
        TowersOfHanoi(n - 1, auxpeg, topeg, frompeg);
    }
      
    public int SortredArray(int []a, int index) {
        if (a.length <= 1 || index <= 1) {
            return 1;
        }
        return (a[index - 1] < a[index - 2] ? 0 : 1) + SortredArray(a, index - 1);
    }

    public static void main(String[] args) {
        Recoursion_problems obj = new Recoursion_problems();
        obj.TowersOfHanoi(12, 'A', 'C', 'B');
        System.out.println("Total moves: " + obj.counter);
        
        int[] a = {1, 2, 5, 8, 9, 4, 6}; // Correct array initialization
        int index = a.length; // Define index
        System.out.println("Is sorted: " + (obj.SortredArray(a, index) == 1));
    }
}