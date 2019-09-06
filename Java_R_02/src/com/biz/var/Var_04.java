package com.biz.var;

public class Var_04 {

	public static void main(String[] args) {

		int n1 = 3;
		int n2 = 4;
		
		// 정수형 변수 n1과 n2의 값을 덧셈하여
		// 문자열형 변수 s에 담아라
		// 이럴경우 숫자를 문자열형으로 변경해 주어야 한다.
		
		// 1. ""을 계산식에 포함하는 방법
		// 이 계산식은
		//	가. n1을 문자열로 바꾸고
		//	나. n2를 문자열로 바꾸고
		//	다. 두개의 문자열을 연결하여 s에 저장
		// 결국 "3" + "4" 와 같은 연산을 수행한다
		//  s에 담긴 값은 34 가 된다.
		String s = "" + n1 + n2 ;
		System.out.println(s);
		
		// 2. 숫자변수 n1, n2에 담긴 값을 
		//  수학의 덧셈 계산으로 수행하여
		//	결과인 7을 s 변수에 담고 싶으면
		// 	계산식을 () 묶어주어야 한다.
		s = (n1 + n2) + "";

		// 3. 연산 우선 순위에서
		// n1 + n2가 계산되고 결과를 문자열로 변환
		// s에는 문자열 7이 저장
		s = n1 + n2 + "";
		

		
	}

}