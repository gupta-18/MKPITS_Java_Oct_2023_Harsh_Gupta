package com.mkpits.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBufferDemo obj = new StringBufferDemo();
	  obj.callingMethod();	
	  System.out.println("\n");
	  obj.chnagingStringBuffertoString();
	}

	 void chnagingStringBuffertoString() {
		StringBuffer str = new StringBuffer("Apan aise bhi string buffer me string value dalte hai ");
		String immutable = new String(str);
		String name = "Harsh";
		System.out.println(immutable.replaceAll(name, immutable));//name ko immutable ne pura replace kar liya hai
	System.out.println(name);//immutable hai to name upar me change hua phir bhi yaha koi chnages nhi hai
		
		
	}

	private void callingMethod() {
		
		String sentence =" 1,2,3,4,5,6,7,8";
	
		StringBuffer bufferVar = new StringBuffer(sentence);
		String sentence2 = " rum pam pam rum pam pam rum pum";
		
	
		bufferVar.trimToSize();//void type ka hai isliye kisi chiz me hold nhi hoga ....bas storage memory kam kardega 
		System.out.println(bufferVar);
		
		System.out.println(bufferVar.capacity());//tells the capacity of the string
		
		System.out.println(bufferVar.reverse());// it is ued to reverse the string
		
	    System.out.println(bufferVar.charAt(7));//stringbuffer mutable hai isliye reverse karne se wo change ho gaya hai isliye 7 pr k aa raha hai
	    System.out.println(bufferVar.reverse());
	    System.out.println(bufferVar.append(sentence2));//add karta hai permanentally
	    System.out.println(bufferVar.insert(0, "naam jalebi bai"));//directly string pass karo ya vaibale pass kardo index k hisab se add kardega
	    System.out.println(bufferVar.codePoints());
	    System.out.println(bufferVar.indexOf("rum"));
	    System.out.println(sentence.indexOf("n",5));
	    //n mere string me 5 th index k baad  kaha aa raha hai ye pata chalega
	    System.out.println(bufferVar.delete(0, 10));//deletes from 
	    
	    
	
	
	}

}
