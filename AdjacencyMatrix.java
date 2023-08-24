import java.util.*;
public class AdjacencyMatrix {
    public static void main(String[] args){
        
        int v = 5;
        int[][] graph = new int[v][v];
        for(int i = 0 ; i < v ; i++){
            for(int j = 0 ; j < v ; j++){
                graph[i][j] = 0 ;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of edges:");
        int edge = sc.nextInt();
        System.out.println("Enter source to destination");
        for(int i = 0 ; i < edge ; i++){
            System.out.println("enter edge"+ (i+1));
            int s  = sc.nextInt();
            int d  = sc.nextInt();
            graph[s][d] = 1;
            graph[d][s] = 1;
        }
        System.out.println("Matrix of the graph is:");
        for(int i = 0 ; i < v ; i ++){
            for(int j = 0 ; j < v ; j ++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
