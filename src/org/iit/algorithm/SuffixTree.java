/**
 * Suffix tree
 */
package org.iit.algorithm;

import java.util.ArrayList;

/**
 * @author tawsif
 *
 */
public class SuffixTree {

	public static void main(String[] args) {
		
	}
}

class Node 
{
	public String index ;
	public String Key ;
	
	
	public ArrayList<Node> nodes ;
	public ArrayList<Edge> edges ;
	
	public Node (String key)
	{
		Key = key ;
		nodes = new ArrayList<Node>() ;
		edges = new ArrayList<Edge>() ;
	}
}

class Edge
{
	public int Index ;
	public  String Label ;
	public Node Source ;
	public Node Terminal ;
	
	public Edge (int index , String label , Node source , Node terminal )
	{
		Index = index ;
		Label = label ;
		Source = source ;
		Terminal = terminal ;
		
	}
}

class Tree 
{
	public Node Root ;
}

