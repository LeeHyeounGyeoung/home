/*
 * ������ Ÿ���� char�̸� �����ڵ忡 �ش��ϴ� ���ڸ� ��� 
 * charŸ�� ������ �ϳ��� ���ڸ� ����
 * ���� ������ �����ϰ� �ʹٸ� 'String' ������ �����ϰ� "" ū ����ǥ�� ���� ���ڿ��� ���ͳο� ����.
 * */

package ThisIsJava;

public class Char1 {
     Char1 () {
    	 char c1 = 'A';
    	 char c2 = 65;
    	 char c3 = '\u0041';
    	 char c4 = '��';
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
