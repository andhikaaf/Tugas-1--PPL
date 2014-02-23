/*
 * To change this license header, choose License Headers in Project Properties.

* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rpl.tugasppl1;


/**
 *
 * @author Andhika
 */
public class ABB extends AB implements B {

	private int x;

    /**
     *ctor hanya print : ctor-ABB
     */
    public ABB() {
		x = 0;
		System.out.println("ctor-ABB");
	}

    /**
     * ctor dengan parameter sebuah integer
     * @param x
     */
    public ABB(int x) {
		this.x = x;
//		System.out.println("ctor-ABB (x = " + x + ")");
	}

    /**
     *prosedur f() override f di Bapaknya dengan menullis :ABB
     */
    @Override
	public void f() {
		System.out.println("ABB");
	}

    /**
     * @return x
     */
    public int getX() {
		return x;
	}

    /**
     * Override  toString() dengan menuliskan nilai atribut x
     * @return 
     */
    @Override
	public String toString() {
		return "" + x;
	}
}
