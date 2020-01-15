package domains.farmer;

import framework.graph.Graph;
import framework.graph.Vertex;

/**
 * A graph for the FWGC problem.
 * @author Henry Keskitalo
 */
public class FarmerGraph extends Graph {
    
    public FarmerGraph() {
        F1 = new Vertex(new FarmerState("West",   
                                "West",
			        "West",          
			        "West"));
        
        F2 = new Vertex(new FarmerState("West",
                                "East",
			        "West",
			        "East"));
        
       F3 = new Vertex(new FarmerState("West",
                                "East",
			        "West",
			        "West"));
        
        F4 = new Vertex(new FarmerState("West",
                                "West",
			        "East",
			        "West"));
        
        F5 = new Vertex(new FarmerState("West",
                                "West",
			        "West",
			        "East"));
        
        F6 = new Vertex(new FarmerState("East",
                                "East",
			        "East",
			        "East"));
        
        F7 = new Vertex(new FarmerState("East",
                                "West",
			        "East",
			        "West"));
        
        F8 = new Vertex(new FarmerState("East",
                                "West",
			        "East",
			        "East"));
        
        F9 = new Vertex(new FarmerState("East",
                                "East",
			        "West",
			        "East"));

        F10 = new Vertex(new FarmerState("East",
                                "East",
			        "East",
			        "West"));
     
    super.addEdge(F1, F7);
    super.addEdge(F4, F10);
    super.addEdge(F3, F9);
    super.addEdge(F2, F7);
    super.addEdge(F7, F2);
    super.addEdge(F9, F3);
    super.addEdge(F10,F4);
    super.addEdge(F7, F1);
    }
    
   
    
    public Vertex getStart() {
        return F1;
    }
    
    public Vertex getEnd() {
        return F6;
    }
    
    private final Vertex F1;
    private final Vertex F2;
    private final Vertex F3;
    private final Vertex F4;
    private final Vertex F5;
    private final Vertex F6;
    private final Vertex F7;
    private final Vertex F8;
    private final Vertex F9;
    private final Vertex F10;
}