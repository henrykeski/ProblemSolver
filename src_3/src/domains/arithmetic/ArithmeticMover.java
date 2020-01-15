package domains.arithmetic;

import framework.problem.Mover;
import framework.problem.State;
// @author 
// Henry Keskitalo
public class ArithmeticMover extends Mover {

        public static final String ADD = "Add 3";
        public static final String SUB = "Subtract 5";
        public static final String DIV = "Divide by 2";
        public static final String MUL = "Multiply by 2";


        public ArithmeticMover() {
            super.addMove(ADD, s -> tryAdd(s));
            super.addMove(SUB, s -> trySub(s));
            super.addMove(DIV, s -> tryDiv(s));
            super.addMove(MUL, s -> tryMul(s));

        }

        private State tryAdd(State state) {
            ArithmeticState otherState = (ArithmeticState) state;
            int ans = 0;
            ans = otherState.getNum() + 3;
            return new ArithmeticState(ans);
        }

        private State trySub(State state) {
            ArithmeticState otherState = (ArithmeticState) state;
            int ans = 0;
            ans = otherState.getNum() - 5;
            return new ArithmeticState(ans);
        }

        private State tryDiv(State state) {
            ArithmeticState otherState = (ArithmeticState) state;
            int ans = 0;
            ans = otherState.getNum() / 2;
            return new ArithmeticState(ans);
        }

        private State tryMul(State state) {
            ArithmeticState otherState = (ArithmeticState) state;
            int ans = 0;
            ans = otherState.getNum() * 2;
            return new ArithmeticState(ans);
        }

    }
