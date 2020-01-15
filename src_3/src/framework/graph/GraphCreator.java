package framework.graph;

import framework.problem.Problem;
import framework.problem.State;
import java.util.List;
import java.util.Stack;
import framework.problem.Mover;

/**
 * @author Henry Keskitalo
 */
public class GraphCreator {
    
    public Graph createGraphFor(Problem problem) {
        graph = new Graph();
        S = new Stack();
        start = new Vertex(problem.getInitialState());
        S.push(start);
        List <String> moves = problem.getMover().getMoveNames();
        while(!S.isEmpty()) {
            u = (Vertex) S.pop();
            for(String m:moves) {
                next = problem.getMover().doMove(m, (State) u.getData());
                if(next != null) {
                    v = new Vertex(next);
                    if(graph.getVertices().containsKey(v)) {
                        v = graph.getVertices().get(v);
                    }
                        else {
                            S.push(v);
                        }
                    graph.addEdge(u,v);
                }
            }
        }
        return graph;
    }
    
    private Graph graph = null;
    private Vertex start;
    private Stack S;
    private Vertex u;
    private State next;
    private Vertex v;
}