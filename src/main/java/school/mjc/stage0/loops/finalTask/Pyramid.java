package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <=cathetusLength ; i++) {
            for (int j = 1; j <=cathetusLength*2-1 ; j++) {
                if(j<=cathetusLength-i || j>=cathetusLength+i){
                    System.out.print(" ");
                }else{
                    if(j==cathetusLength){
                        System.out.print(1);
                    }
                    if(j>cathetusLength){
                        System.out.print(1+(j-cathetusLength));
                    }
                    if(j<cathetusLength){
                        System.out.print(cathetusLength-j+1);
                    }
                }

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(0);
    }
}
