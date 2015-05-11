import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sarim on 15-05-10.
 */
public class QuickUnion {

    private int[] id;

    public QuickUnion(int size){
        id = new int[size];
        for(int i = 0 ; i<size; i++){
            id[i] = i;
        }
    }

    public int root(int n){
        while(n!=id[n])
            n = id[n];
        return n;
    }

    public boolean connected(int p, int q){
        return root(p)==root(q);
    }

    public void union(int p, int q)// Make p the child of q
    {
        //find the roots first
        id[root(p)] = root(q);
    }

    public static void main(String [] args)throws IOException
    {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        QuickUnion QU = new QuickUnion(N);
        QU.union(3, 4);
        System.out.print(QU.connected(3,4));
    }
}
