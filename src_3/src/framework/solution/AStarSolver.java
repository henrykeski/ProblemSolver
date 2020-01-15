package framework.solution;

import domains.puzzle.PuzzleState;
import framework.graph.Vertex;
import framework.problem.Problem;
import framework.problem.State;
import java.util.Comparator;
import java.util.PriorityQueue;




/**
 * This class represents an A* solver by extending the StateSpaceSolver
 * class.
 * Henry Keskitalo
 */
public class AStarSolver extends StateSpaceSolver {
    
    /**
     * Creates an A* solver.
     * This constructor should set the queue to a priority queue (PQ)
     * and set the statistics header.
     * @param problem 
     */
    public AStarSolver(Problem problem) {
        super(problem, false);
//        super.setQueue(new PriorityQueue<>(11,getComparator()));
        super.getStatistics().setHeader("A* Search");
        
    }
    
    /**
     * Adds a vertex to the PQ.
     * @param v the vertex to be added
     */
    @Override
    public void add(Vertex v) {
       this.getQueue().add(v);
    }
    
    /**
     * Creates a comparator object that compares vertices for ordering
     * in a PQ during A* search.
     * This should be used when creating the PQ.
     * @return the comparator object
     */
    /*
    public final Comparator<Vertex> getComparator() {
        return new Comparator<Vertex>(){
            @Override
            public int compare(Vertex v1, Vertex v2){
                State state1 = (State) v1.getData();
                State state2 = (State) v2.getData();
                int temp1 = state1.getHeuristic(finalState)+v1.getDistance();
                int temp2 = state2.getHeuristic(finalState)+v2.getDistance();
                return (temp1>temp2)?1:(temp1<temp2)?-1:0;
            }
        };
        
    }
    public State finalState = this.getProblem().getFinalState();
*/
}