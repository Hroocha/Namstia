package graph_by_hihony.vertex;

import graph_by_hihony.edge.Edge;

import java.util.Set;

public interface DirectedVertex <E extends Edge> extends Vertex{
    Set<E> getOutgoingEdges();
    Set<E> getIncomingEdges();
}