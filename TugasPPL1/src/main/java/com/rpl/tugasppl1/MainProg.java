package com.rpl.tugasppl1;

import java.util.Vector;
/**
 * @author Esa Fauzi
 * @since 23/02/2014
 * @version 1.0
 *
 */
public class MainProg implements X{

    /**
     * Prosedur Main dari ProjekTugasPPL1 
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        ABB a = new ABB();
        P p = new P();
        Q q = new Q();
        int N = 3;
        Vector<Integer>[] v = new Vector[N];
        a.f();
        for(int i=1;i<=N;i++){
            v[i-1] = new Vector();
            v[i-1].add(i);
            System.out.println("Nilai Vector-"+i+"= "+v[i-1]);
        }
        
    }
    
    /**
     * fungsi w() override dari interface X, hanya mengembalikan 2 
     * @return 2
     */
    @Override
    public int w() {
	return 2;
    }
}
