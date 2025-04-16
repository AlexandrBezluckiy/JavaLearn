package Calc;

public class Calculator {
        public int add(int... array){
            int sum = 0;
            for(int i : array) {
                sum += i;
            }
            return sum;
        }
}
