package graph_by_hihony.graph;

import graph_by_hihony.vertex.DirectedVertex;
import graph_by_hihony.edge.DirectedWeightedEdge;

public class DefaultDirectedWeightedGraph<V extends DirectedVertex<E>, E extends DirectedWeightedEdge> extends DefaultDirectedGraph<V, E> {
    private void test() {
        findPass(null, null);
    }

    public Integer findBestPassWeight(V from, V to) {
        // TODO: 20.11.2023 алгоритм Дейкстры
        return 10;
    }
}
