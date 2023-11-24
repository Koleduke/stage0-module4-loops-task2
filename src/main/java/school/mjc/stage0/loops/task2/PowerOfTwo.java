package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        int res = 1;
        if(power==0){
        System.out.println(1);}
        if(power<0){
            System.out.println("too much power");}

        while (i<=power&&power>0){
            System.out.println(res);
            res =res*2;
            i++;
        }
    }
}
