package CH02;

/*
 * 	컴퓨터(CPU)는 구조상 덧셈연살을 할 수 있다.(o)
 * 	컴퓨터(CPU)는 구조상 뺄셈연살을 할 수 있다.(x)
 * 	컴퓨터(CPU)에서 뺄셈 요청시 뺄셈처리는 할 수 있다.(o)
 * 	보수개념을 도입해서 뺄셈 처리를 수행하기 때문에 가능
 * 
 * 	7 - 4 = 3
 * 
 * 	7 + 6 = '1' 3
 * 
 * 	77 - 32 = 45
 * 	77 + 68 = '1'45
 * 
 * 	00000101 = 5
 *  11111010 = -6 (1의 보수)
 *  00000001 = -5 (2의 보수)
 * +11111011 = -5 (2의 보수)
 * ---------------
 * 	00000000 = 0
 * 
 * ------------
		00000000 = 0
		00000001 = 1
		00000010 = 2
		00000011 = 3
		..
		01111111 = 127
		10000000 = -128 
		10000001 = -128+1
		10000010 = -128+2
		10000011 = -128+3
		..
		11111111 = -128+127 = -1
		00000001 = 1    
    

    
    		//문제
		//음수값임을 고려하여 풉니다
		//10 진수 	-> 2진수
		//111 		-> 01101111
		//-111 		-> 10010001
		//96		-> 01100000
		//-96		-> 10100000
		//31 		-> 00011111
		//-31		-> 11100001
		
		//2진수		-> 10진수
		//10101111 	-> -81
		//00110101	-> 53
		//11001100	-> -52
		//10101010	-> -86

 */
public class C02음수 {
	public static void main(String[] args) {

	}
}
