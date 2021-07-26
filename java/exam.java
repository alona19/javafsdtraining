package com.ust.examples;
import java.util.*;
 class genericstack <E> 
{
   Stack <E> stk = new Stack <E>();
public void push(E obj)
   {
       stk.push(obj);
}
public E pop()
   {
       E obj = stk.pop();
 return obj;
}
}


public class exam {

	public static void main(String[] args) {
        genericstack <Integer> gs = new genericstack<Integer>();
        gs.push(36);
        System.out.println(gs.pop());




	}

}
