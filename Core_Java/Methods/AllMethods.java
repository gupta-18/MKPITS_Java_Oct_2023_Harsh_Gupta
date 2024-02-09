package com.mkpits.Methods;

public class AllMethods {

	public static void main(String[] args) {
		AllMethods obj = new AllMethods();
		
		//non-staic call can be only possible by making object
		obj.getName("Harsh gupta");
		System.out.println(obj.getNumber(6394550077l));
		obj.getEmail();
		System.out.println(obj.getGender());
		//static call diectly
		getId(35);
		//static call with classname.methodname
		AllMethods.getId(567);
		//static call with making obj
		obj.getId(28);
	}
	
//return type with no parameter	
    public  char getGender() {
    char ch = 'M';
    return ch;	
	}
//no return type with no parameter
	public void getEmail() {
		 String mail = "harshg1807@gmail.com";
		System.out.println( mail);
	}
//return type with parameter
	public  long getNumber(long number) {
		return  number;	
	}
//no return type with parameter
	public  void getName(String name) {
		System.out.println(name);
	}
// static method with return type and parameter
	public static int getId(int id) {
		System.out.println(id);
		return id;
	}
}
