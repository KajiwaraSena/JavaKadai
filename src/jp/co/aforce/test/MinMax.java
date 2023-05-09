package jp.co.aforce.test;

public class MinMax {
	  int getMaxValue(int a, int b, int c) {
		 
	int Max = a;
	
	if(Max < b)  Max= b;
	if(Max < c) Max = c;
	return Max;
	}
	
	int getMinValue(int a, int b, int c) {
		 
	int Min = a;			
	if(Min > b) Min = b;
	if(Min > c) Min = c;
	return Min;
	}
}
