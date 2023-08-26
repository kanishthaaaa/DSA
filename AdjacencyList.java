import java.util.ArrayList;
import java.util.Scanner;
public class AdjacencyList {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertex");
        int v = sc.nextInt();
        ArrayList<Integer> graph = new ArrayList<Integer>();
        System.out.println("Enter number of edges");
        int edges = sc.nextInt();
        for(int i = 0 ; i < edges ; i ++){
            System.out.println("Enter Source to destination for node "+ (i+1));
            int s = sc.nextInt();
            int d = sc.nextInt();
            graph[s].add(d);
        }
    }
}
