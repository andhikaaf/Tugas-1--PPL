package com.rpl.tugasppl1;

import java.util.Vector;
/**
 * @author Esa Fauzi
 * @since 23/02/2014
 * @version 1.0
 *
 */
public class MainProg implements X{
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
    
    @Override
    public int w() {
	return 2;
    }
}
