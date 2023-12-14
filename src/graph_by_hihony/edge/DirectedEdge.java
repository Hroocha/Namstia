package graph_by_hihony.edge;

import graph_by_hihony.vertex.Vertex;

public interface DirectedEdge extends Edge {
    Vertex getFrom();
    Vertex getTo();
    void setFrom(Vertex v);
    void setTo(Vertex v);
}
