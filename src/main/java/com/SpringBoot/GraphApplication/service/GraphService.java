package com.SpringBoot.GraphApplication.service;

import org.springframework.stereotype.Service;
import com.assignment.models.Graph;

import java.util.List;

@Service
public class GraphService {
  Graph graph = new Graph();

  public void addNode(int nodeId) {
    graph.addNode(nodeId);
  }

  public void addDependency(int par, int chi) {
    graph.addDependency(par, chi);
  }

  public void deleteNode(int nodeId) {
    graph.deleteNode(nodeId);
  }

  public void deleteDependency(int par, int chi) {
    graph.deleteDependency(par, chi);
  }

  public List<Integer> getDescendants(int nodeId) {
    return graph.getDescendants(nodeId);
  }

  public List<Integer> getAncestors(int nodeId) {
    return graph.getAncestors(nodeId);
  }

  public List<Integer> getImmediateChildren(int nodeId) {
    return graph.getImmediateChildren(nodeId);
  }

  public List<Integer> getImmediateParents(int nodeId) {
    return graph.getImmediateParents(nodeId);
  }
}

