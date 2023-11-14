package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int k = 2;
        if(toBreakWith>numberToGoUntil){
            System.out.println("iterating till the end");
            for (int i = 1; i < k; i++, k++) {
                System.out.println(i);
                if(i == numberToGoUntil){
                    break;
                }
            }
        }else{
            for (int i = 1; i < k; i++, k++) {
                System.out.println(i);
                if(i == toBreakWith){
                    break;
                }
            }
        }
    }
}
