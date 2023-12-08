package com.mkpits.typecasting;

public class Explicit_Betw_Primitive {
//it is known as narrowing
// datatype variable =(datatype) typecasting_variable;
	public static void main(String[] args) {
		
		Explicit_Betw_Primitive obj = new Explicit_Betw_Primitive();
		obj.shortToByte();
		obj.intToShort(1);
		obj.intToLong(89);
		obj.floatToLong(384.766f);
		obj.floatTodouble(67.868f);
		obj.doubleToFloat(54654.6565);
	}

private void doubleToFloat(double d) {
	 float typeCastingVar = (float) d;
	  System.out.println(typeCastingVar);
	
}

private void floatTodouble(float f) {
	 double typeCastingVar = (double) f;
	  System.out.println(typeCastingVar);
		
	
}

private void floatToLong(float l) {
    long typeCastingVar = (long) l;
    System.out.println(typeCastingVar);
	
}

private void intToShort(int s) {
	//short i = 12;
	 short typeCastingVar = (short) s;
	 System.out.println(typeCastingVar);
	
}

public void shortToByte() {
	short b= 1;
	  byte typeCastingVar = (byte) b;
	 System.out.println(typeCastingVar);
	
}

private void intToLong(int i) {
	 long typeCastingVar = (long) i;
	 System.out.println(typeCastingVar);
}

}
