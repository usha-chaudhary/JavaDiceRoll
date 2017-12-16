package com.kist.dicerolling;

import java.util.Random;

public class RandomCount {
	int count1=0,count2=0;
public void count(){
	Random r= new Random();
	for(int i=1;i<1000;i++){
	int a=r.nextInt(6)+1;
	int b=r.nextInt(6)+1;
	if(a+b==2){
		count1++;
}
	if(a+b==12){
		
		count2++;
	}
	
	}
	System.out.println("2:"+" "+count1+"times");
	System.out.println("12:"+" "+count2+"times");
}}