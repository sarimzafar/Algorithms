
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sarim on 15-05-06.
 */

public class QuickFind {

    private int[] id;

    public QuickFind(int N){
        id = new int[N];
        for(int i = 0; i<N ; i++)
            id[i]=i;
    }

    public boolean Connected(int p, int q){
        return id[p] == id[q];
    }

    public void Union(int p, int q){

        if(Connected(p,q)){return ;}

        int pid = id[p];
        int qid = id[q];
        for(int i = 0 ; i<id.length; i++){
            if(id[i] == pid) id[i] = qid;
        }

    }

    public static void main (String args[]) throws IOException
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the count of array");
        int N = obj.nextInt();

        QuickFind QF = new QuickFind(N);
        QF.Union(3,4);
        QF.Union(8,9);
        QF.Union(0, 9);
        System.out.print(QF.Connected(7,0));


    }

}
