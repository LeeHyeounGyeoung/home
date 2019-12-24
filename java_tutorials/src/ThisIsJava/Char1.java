/*
 * 변수의 타입이 char이면 유니코드에 해당하는 문자를 출력 
 * char타입 변수는 하나의 문자만 저장
 * 만약 문장을 저장하고 싶다면 'String' 변수를 선언하고 "" 큰 따옴표로 감싼 문자열을 리터널에 대입.
 * */

package ThisIsJava;

public class Char1 {
     Char1 () {
    	 char c1 = 'A';
    	 char c2 = 65;
    	 char c3 = '\u0041';
    	 char c4 = '가';
    	 char c5 = 44032;
    	 char c6 = '\uac00';
    	 
    	 int unicode = c1;
    	 
    	 System.out.println(c1);
    	 System.out.println(c2);
    	 System.out.println(c3);
    	 System.out.println(c4);
    	 System.out.println(c5);
    	 System.out.println(c6);
    	 System.out.println(unicode);
    	 
     }
     public static void main(String[] arrgs) {
    	 new Char1 ();
     }
}
