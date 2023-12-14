package graph_by_hihony.vertex;

import graph_by_hihony.edge.Edge;

import java.util.HashSet;
import java.util.Set;

public class DefaultDirectedVertex<E extends Edge> implements DirectedVertex<E> {
    private final Set<E> outgoingEdges = new HashSet<>();
    private final Set<E> incomingEdges = new HashSet<>();

    @Override
    public Set<E> getOutgoingEdges() {
        return outgoingEdges;
    }

    @Override
    public Set<E> getIncomingEdges() {
        return incomingEdges;
    }
}
