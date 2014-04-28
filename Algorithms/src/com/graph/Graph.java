package com.graph;

import java.util.ArrayList;
import java.util.List;


/*
 * 
 */
public class Graph {

	List<Vertex> vertices;
	
  
	private class Vertex {
		int key;
		List<Vertex> adj;
		
		
	public Vertex(int key){
		this.key = key;
	   }
	
	
	
	}

	public Graph(){
	    vertices =new ArrayList<Vertex>();
		vertices.add(new Vertex(5));
		vertices.add(new Vertex(10));
		vertices.add(new Vertex(8));
		vertices.add(new Vertex(15));
		vertices.add(new Vertex(25));
		vertices.add(new Vertex(2));
		vertices.add(new Vertex(14));
		
	}
     	
	/*public List<Vertex> getVertex(int key){
		return vertices.iterator();
	}*/
	/*public void addEdge(int skey,int dkey){
		getVertex(skey).adj.add(getVertex(dkey));
		getVertex(dkey).adj.add(getVertex(skey));
	}*/
	
	
	public void print(){
		
		for(Vertex v : vertices){
			System.out.println("Vertex : "+ v.key);
			
			for(Vertex adjv: v.adj){
				System.out.println(" Adjacent Vertex : "+adjv.key);
			}
		}
	}
	
	public static void main(String args[]){
		
		
		Graph g =new Graph();
	/*	g.addEdge(5, 10);
		g.addEdge(8, 10);
		g.addEdge(5, 15);
		g.addEdge(25, 10);
		g.addEdge(15, 2);
		g.addEdge(25, 2);
		g.addEdge(14, 2);*/
		g.print();
	}
	
}
