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
public class AB extends A implements B, C {

    /**
     *ctor hanya print: ctor-AB
     */
    public AB() {
		System.out.println("ctor-AB");
	}

    /**
     *prosedur f() override f di Bapaknya dengan menulis : AB
     */
    @Override
	public void f() {
		System.out.println("AB");
	}

    /**
     *prosedur v() implementasi dari prosedur di interface B dengan menulis: AB.v() 
     */
    @Override
	public void v() {
		System.out.println("AB.v()");
	}

    /**
     *prosedur g() implementasi dari prosedur di interface C dengan menulis: AB.g()
     */
    @Override
	public void g() {
		System.out.println("AB.g()");
	}
	
}
