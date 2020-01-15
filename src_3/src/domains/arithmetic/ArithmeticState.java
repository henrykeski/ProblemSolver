package domains.arithmetic;

import framework.problem.State;
import java.util.stream.Stream;
// @author 
// Henry Keskitalo
public class ArithmeticState implements State {

        public ArithmeticState(int num) {
            this.num = num;
        }
        public int getNum() {
            return num;
        }
        public void setNum(int newNum) {
            num = newNum;
        }
        @Override
        public boolean equals(Object other) {
            ArithmeticState otherArithmetic = (ArithmeticState) other;
            String aNum = String.valueOf(num);
            int a = otherArithmetic.num;
            String str = String.valueOf(a);

            return aNum.equals(str);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("The value is: ");
            sb.append(String.valueOf(num));
            return sb.toString();
        }

        private int num;

}