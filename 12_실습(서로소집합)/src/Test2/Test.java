package Test2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int N=10;
        UF uf=new UF(N);
        System.out.println(uf);
        uf.union(0,1);
        uf.union(2,3);
        uf.union(4,5);
        uf.union(6,7);
        uf.union(8,9);
        uf.union(0,2);
        uf.union(4,6);
        uf.union(0,4);
        System.out.println(uf);
        System.out.println(uf.find(1)==uf.find(6));
        System.out.println("연결요소 개수 = "+uf.count);
    }
}
class UF {
    int parent[], rank[], count;
    public UF(int N) {
        parent=new int[N];
        rank=new int[N];
        for (int i = 0; i < parent.length; i++){
            parent[i]=i;
        }
        //count값을 N으로 설정을 해준다
        count = N;  //2-1
    }
    public void union(int i, int j) { // union by rank
        //유니온을 한번 하면 연결요소가 하나씩 줄어든다
        i=find(i);
        j=find(j);
        if(i==j) return;
        if(rank[i]<rank[j]) parent[i]=j;
        else if(rank[i]>rank[j]) parent[j]=i;
        else{
            parent[i]=j;
            rank[j]++;
        }
        count--;//유니온을 한번 하면 연결요소가 하나씩 줄어든다 2-1
    }
    public int find(int i) { // path compression
        if(i!=parent[i]) parent[i]=find(parent[i]);
        return parent[i];
    }
    @Override
    public String toString() {
        return Arrays.toString(parent);
    }
}