import java.util.Scanner;
public class DirectedGraph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int node = sc.nextInt();
        int[][] graph = new int[node][node];
        for(int i = 0 ; i < node ; i++){
            for(int j = 0 ; j < node ; j ++){
                graph[i][j] = 0;
            }
        }
        System.out.println("Enter numner of edges:");
        int edge = sc.nextInt();
        for(int i = 0 ; i < edge ; i++){
            System.out.println("Enter source to destination for edge : " + (i+1));
            int s = sc.nextInt();
            int d = sc.nextInt();
            graph[s][d] = 1 ;
        }
        for (int i = 0 ; i < node; i ++){
            for(int j = 0 ; j < node ; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
