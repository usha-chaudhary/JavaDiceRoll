package com.kist.dicerolling;

import java.util.Random;

public class DiceRoll {

	public static void main(String[] args) {
		RandomCount rc=new RandomCount();
		rc.count();
		SerialRandomCount s=new SerialRandomCount(1000);
		s.roll();
		}
		
		
	}
	

