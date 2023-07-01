import java.util.Arrays;

public class PrimAlgo{
public void PrimAlgo(int graph[][],int Vertices){
	
        //initiating  the variables
        int minimumValue = Integer.MAX_VALUE;
        int edgeNumber = 0;
        int totalWeight = 0;
        boolean[] visited = new boolean[Vertices];
        //check and mark if the node has been visited, and output in the list with weight of the edges.
        Arrays.fill(visited, false);
        visited[0] = true;
System.out.println("Edges - Weight");
            //this part checks if we are still having nodes left to sort, then evaluate cost values.
           while(edgeNumber < Vertices - 1){
               minimumValue = Integer.MAX_VALUE;
               int x = 0;
               int y = 0;
               for(int i = 0; i < Vertices; i++){
                   if(visited[i] == true){
                       for(int j = 0; j < Vertices; j++){
                           if(!visited[j] && graph[i][j] != 0){
                               if(minimumValue > graph[i][j]){
                                   minimumValue = graph[i][j];
                                   x = i;
                                   y = j;
                               }
                           }
                       }
                   }
               }

               System.out.println(x + " - " + y + " : " + 
graph[x][y]);
               totalWeight += graph[x][y]; //add all the weights from the selected nodes to get MST.
               visited[y] = true;
               edgeNumber++;
           }
        System.out.println("Total weight: " + totalWeight);
    }
   public static void main(String[] args) {
       //This part builds an adjacency matrix for the graph. 

       int graph[][] = new int[][]{{0, 5, 4, 0, 0, 0, 0, 0},
    	   						   {5, 0, 2, 3, 0, 0, 0, 0},
                                   {4, 2, 0, 0, 4, 0, 0, 0},
                                   {0, 3, 0, 0, 2, 0, 6, 0},
                                   {0, 0, 4, 2, 0, 1, 0, 0},
                                   {0, 0, 0, 0, 1, 0, 8, 0},
                                   {0, 0, 0, 6, 0, 8, 0, 2},
                                   {0, 0, 0, 0, 0, 0, 2, 0}};
                                   
       PrimAlgo PrimsGreedyMST = new PrimAlgo();
       int vertices = 8;
       PrimsGreedyMST.PrimAlgo(graph, vertices);
   }
}


