package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i <=cathetusLength-1; i ++){
            for (int j = 2*(cathetusLength-i); j >=0; j--){
                System.out.print(" ");
            }
            for (int n = 0; n <=i; n++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
