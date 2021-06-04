package com.SpringBoot.GraphApplication.controller;

import com.SpringBoot.GraphApplication.service.GraphService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GraphController {
  @Autowired
  private GraphService graphService;

  @PostMapping(value="/graph/add/node/{nodeId}")
  public void addNode(@PathVariable int nodeId){
    graphService.addNode(nodeId);
  }
  @PostMapping(value = "/graph/add/edge/{parentId}/{childId}")
  public void addDependency(@PathVariable int parentId,@PathVariable int childId){
    graphService.addDependency(parentId, childId);
  }
  @DeleteMapping(value = "/graph/delete/node/{nodeId}")
  public void deleteNode(@PathVariable int nodeId){
    graphService.deleteNode(nodeId);
  }
  @DeleteMapping(value = "/graph/delete/edge/{parentId}/{childId}")
  public void deleteDependency(@PathVariable int parentId,@PathVariable int childId){
    graphService.deleteDependency(parentId, childId);
  }
  @RequestMapping(value = "/graph/get/ancestors/{nodeId}")
  public List<Integer> getAncestors(@PathVariable int nodeId){
    return graphService.getAncestors(nodeId);
  }
  @RequestMapping(value = "/graph/get/descendants/{nodeId}")
  public List<Integer> getDescendants(@PathVariable int nodeId){
    return graphService.getDescendants(nodeId);
  }
  @RequestMapping(value = "/graph/get/children/{nodeId}")
  public List<Integer> getImmediateChildren(@PathVariable int nodeId){
    return graphService.getImmediateChildren(nodeId);
  }
  @RequestMapping(value = "/graph/get/parents/{nodeId}")
  public List<Integer> getImmediateParents(@PathVariable int nodeId){
    return graphService.getImmediateParents(nodeId);
  }
}
