package domains.dummy;

import framework.ui.ProblemGUI;

/**
 *
 * @author Henry Keskitalo
 */
public class DummyGUI {
    private ProblemGUI problemGUI;

    public DummyGUI() {
        problemGUI = new ProblemGUI(new DummyProblem(), 600, 750);
    }
    
    public ProblemGUI getProblemGUI(){
        return problemGUI;
    }
}