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

	public ABB() {
		x = 0;
		System.out.println("ctor-ABB");
	}

	public ABB(int x) {
		this.x = x;
//		System.out.println("ctor-ABB (x = " + x + ")");
	}


	@Override
	public void f() {
		System.out.println("ABB");
	}

	public int getX() {
		return x;
	}

	@Override
	public String toString() {
		return "" + x;
	}
}
