package domains.arithmetic;

import framework.ui.ProblemGUI;

/**
 *
 * @author Henry Keskitalo
 */
public class ArithmeticGUI {

    private ProblemGUI problemGUI;

    public ArithmeticGUI() {
        problemGUI = new ProblemGUI(new ArithmeticProblem(), 600, 750);
    }
    
    public ProblemGUI getProblemGUI(){
        return problemGUI;
    }
}