
package framework.solution;

import framework.graph.Vertex;
import framework.problem.Mover;
import framework.problem.Problem;
import framework.problem.State;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a state space solver by extending the abstract
 * Solver class.
 * @author Henry Keskitalo
 */
public class StateSpaceSolver extends Solver {
    
    private final boolean bfs;

    /**
     * Creates a BFS or DFS state space solver.
     * This constructor should set the queue to a double-ended queue (DEQUE)
     * and set the statistics header.
     * @param problem the problem being solved
     * @param bfs a boolean flag indicating whether BFS is to be performed
     */
    public StateSpaceSolver(Problem problem, boolean bfs) {
         super(problem);
        super.setQueue(new LinkedList<Vertex>());
        this.bfs = bfs;
        super.getStatistics().setHeader((bfs ? "Breadth-First" : "Depth-First") + " State Space Search");
    }
    
    
    
    public boolean getBFS(){
        return this.bfs;
    }
    
    
    
    /**
     * Adds a vertex to the DEQUE.
     * If BFS is being performed, the vertex should be added to the
     * end of the DEQUE, so the DEQUE acts like an ordinary queue.
     * If DFS is being performed, the vertex should be added to the
     * front of the DEQUE, so the DEQUE acts like a stack.
     * @param v 
     */
    @Override
    public void add(Vertex v) {
	 if (this.bfs) {
            ((LinkedList)this.getQueue()).addLast(v);
        } else {
            ((LinkedList)this.getQueue()).addFirst(v);
        }
    }
    
    /**
     * This method implements the expand operation required by the 
     * state space search algorithm:

       Expand(u)
          children = {}
          for each name âˆˆ moveNames do
             child = mover.doMove(name, u)
             if child â‰  null and not OccursOnPath(child, u)
                then d[child] = d[u] + 1
                     pred[child] = u
                     add child to children
          return children

     * @param u the vertex being expanded
     * @return 
     */
    @Override
    public List<Vertex> expand(Vertex u) {
        Mover mover = this.getProblem().getMover();
        List<String> moves = mover.getMoveNames();
        LinkedList<Vertex> children = new LinkedList<Vertex>();
        for (String move : moves) {
            
            Vertex child;
            child = new Vertex(mover.doMove(move, (State)u.getData()));
            
            State next = mover.doMove(move, (State)u.getData());
            if (child.getData() != null && !StateSpaceSolver.occursOnPath(child = new Vertex(next), u)){
            child.setDistance(u.getDistance() + 1);
            child.setPredecessor(u);
            children.add(child);
            }
        }
        return children;

	/* you must provide */
    }

    /**
     * Checks whether a given vertex appears on the predecessor path
     * of a given ancestor.
     * @param v the vertex to check
     * @param ancestor the ancestor vertex of v
     * @return true if v occurs on the predecessor path of ancestor,
     * false otherwise
     */
    public static boolean occursOnPath(Vertex v, Vertex ancestor) {
        while(ancestor != null){
        if (v.equals(ancestor)) {
            return true;
        }
        else{
            ancestor = ancestor.getPredecessor();
         
        }
        }
        return false;
    }
     //   return StateSpaceSolver.occursOnPath(v, ancestor.getPredecessor());
    
    
    /* private instance fields here */


}


