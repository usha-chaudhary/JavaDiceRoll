package com.kist.dicerolling;

import java.util.Random;

public class SerialRandomCount {
	Random r;
	int rollingTime;
	public SerialRandomCount(int time){
		r=new Random();	
		rollingTime=time;
	}
	
	public void roll(){
	int[] counter=new int[13];
	for(int i=0;i<rollingTime;i++){
	int a=r.nextInt(6)+1;
	int b=r.nextInt(6)+1;
	int total=a+b;	
	
	for(int k=0;k<=counter.length;k++){
		if(total==k){
			counter[total]+=1;
		}
			
	}
}
	for(int j=2;j<counter.length;j++){
		System.out.println(j+"\t"+counter[j]);
	}
	
	}
 }

