package exercise.chapter1_1;

import tools.StdIn;

/**
 * Created by 94760 on 2017/1/17.
 */

/**
 * some errors:0,1,2.
 */
public class EX30 {
    public static int euclid(int p,int q){
        if(p==0||q==0)
            return 1;
        if(p<q){
            int t=p;
            p=q;
            q=t;
        }
        if(p%q==0)
            return q;
        else
            return euclid(q,p%q);
    }
    public static int gcd(int p,int q){
        if (q==0) return p;
        int r=p%q;
        return gcd(q,r);
    }
    public static void main(String[] args){
        int N= StdIn.readInt();
        boolean[][] a=new boolean[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                a[i][j]=gcd(i,j)==1;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
