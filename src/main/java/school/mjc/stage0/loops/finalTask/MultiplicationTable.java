package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int sum = 0;
        for (int i = 1; i <=10; i++){
            sum = numberTableToPrint * i;
            System.out.println(numberTableToPrint + "*" + i + "=" + sum);
        }
    }
}
