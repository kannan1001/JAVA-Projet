

public class MyStringBuilder {
   private StringBuilder sb;
   
   MyStringBuilder(){
	   sb=new StringBuilder();
   }
   MyStringBuilder(CharSequence cs){
	  sb=new StringBuilder(cs);
   }
   MyStringBuilder(int initCapacity){
	   
	   sb=new StringBuilder(initCapacity);
   }
   MyStringBuilder(String s){
	   
	   sb=new StringBuilder(s);
   }
   public int capacity(){
	   return sb.capacity();
   }
   public char charAt(int index){
	   return sb.charAt(index);
   }
   public void ensureCapacity(int minimumCapacity){
	   sb.ensureCapacity(minimumCapacity);
   }
   public void getChars(int srcBegin, int srcEnd,char[] dst,int dstBegin){
	   sb.getChars(srcBegin,srcEnd,dst,dstBegin);
   }
   public int indexOf(String str){
	   return sb.indexOf(str);
   }
   
   public int indexOf(String str,int fromIndex){
	   return sb.indexOf(str,fromIndex);
   }
   public int length(){
	   return sb.length();
   }
   public void setCharAt(int index,char ch){
	   sb.setCharAt(index ,ch);
   }
   public void setLength(int newLength){
	   sb.setLength(newLength);
   }
   public String substring(int start){
	   return sb.substring(start);
   }
   public String substring(int start,int end){
	   return sb.substring(start, end);
   }
   public String toString(){
	   return sb.toString();
	}
   public void trimToSize(){
	   sb.trimToSize();
   }
   public MyStringBuilder append(boolean b){
	   sb.append(b);
	   return this;
   }
   public MyStringBuilder append(char c){
	   sb.append(c);
	   return this;
   }
   
   public MyStringBuilder append(char[] str){
	   sb.append(str);
	   return this;
   }
   public MyStringBuilder append(char[] str, int offset, int len){
	   sb.append(str, offset, len);
	   return this;
   }
   public MyStringBuilder append(double d){
	   sb.append(d);
	   return this;
   }
   public MyStringBuilder append(float f){
	   sb.append(f);
	   return this;
   }
   public MyStringBuilder append(int i){
	   sb.append(i);
	   return this;
   }
   public MyStringBuilder append(long lng){
	   sb.append(lng);
	   return this;
   }
   public MyStringBuilder append(Object obj){
	   sb.append(obj);
	   return this;
   }
   public MyStringBuilder append(String s){
	   sb.append(s);
	   return this;
   }
   public MyStringBuilder delete(int start, int end){
	   sb.delete(start, end);
	   return this;
   }
   public MyStringBuilder deleteCharAt(int index){
	   sb.deleteCharAt(index);
	   return this;
   }
   public MyStringBuilder insert(int offset, boolean b){
	   sb.insert(offset, b);
	   return this;
   }
   public MyStringBuilder insert(int offset, char c){
	   sb.insert(offset, c);
	   return this;
   }
   public MyStringBuilder insert(int offset, char[] str){
	  sb.insert(offset, str);
	  return this;
   }
   public MyStringBuilder insert(int index, char[] str, int offset, int len){
	   sb.insert(index, str, offset, len);
	   return this;
   }
   public MyStringBuilder insert(int offset, double d){
	   sb.insert(offset, d);
	   return this;
   }
   public MyStringBuilder insert(int offset, float f){
	   sb.insert(offset, f);
	   return this;
   }
   public MyStringBuilder insert(int offset, int i){
	   sb.insert(offset, i);
	   return this;
   }
   public MyStringBuilder insert(int offset, long lng){
	   sb.insert(offset, lng);
	   return this;
   }
   public MyStringBuilder insert(int offset, Object obj){
	   sb.insert(offset, obj);
	   return this;
   }
   public MyStringBuilder insert(int offset, String s){
	    sb.insert(offset, s);
	    return this;
   }
   public MyStringBuilder replace(int start, int end, String s){
	   sb.replace(start, end, s);
	   return this;
   }
   public MyStringBuilder reverse(){
	   sb.reverse();
	   return this;
   }
   public boolean equals(Object o)
   {
	   if(o instanceof MyStringBuilder)
	   {
		   MyStringBuilder msb=(MyStringBuilder) o;
		       
		       
		       
		       for(int i=0;i<this.length();i++)
		       {
			       if(this.charAt(i)!=msb.charAt(i))
			       {
				      return false;
				   }
			       continue;
		       }
		       return true;
		  
	   }
	return false;
    }
   public boolean equalsIgnoreCase(Object o)
   {
	   if(o instanceof MyStringBuilder)
	   {
		   MyStringBuilder msb=(MyStringBuilder) o;
		       
		   
		       for(int i=0;i<this.length();i++)
		       {
			       if(Character.toUpperCase(this.charAt(i))!=Character.toUpperCase(msb.charAt(i)))
			       {
				      return false;
				   }
			       continue;
		       }
		       return true;
		   
		   
	   }
	   return false;
    }
   public int compareTo(Object o) {
		if (o instanceof MyStringBuilder) {
			MyStringBuilder msb = (MyStringBuilder) o;
			int val = 0;
               for (int i = 0; i < this.length(); i++) {
					val=(Character.valueOf(this.charAt(i))- Character.valueOf(msb.charAt(i))); 
						
					 if (val== 0) {
						
					}
					 else{
						 System.out.println(val);
						 return val;
					 }

				}
				return val;
		}
		return -1000;//Return -1000 just to indicate that there is an error
	}
   public int compareToIgnoreCase(Object o) {
		if (o instanceof MyStringBuilder) {
			MyStringBuilder msb = (MyStringBuilder) o;
			int val = 0;
			
		       int len=0;
		       if(this.length()>msb.length()){
		    	   len=msb.length();
		       }
		       else if(this.length()<msb.length()){
		    	   len=this.length();
		       }
		       else if(this.length()==msb.length()){
		    	   len=this.length();
		       }
			for (int i = 0; i < len; i++) {
				 val = (Character.valueOf(Character.toUpperCase(this
						.charAt(i))) - Character.valueOf(Character
						.toUpperCase(msb.charAt(i))));
				if(val == 0)
				{
					
				}
				else
				{
					
					return val;
				}
			}
			return val;
		}
		return -1000; //Return -1000 just to indicate that there is an error
	}
   
   public MyStringBuilder trim() {
		if (sb.length() > 0) {
			for (int i= 0;i<=sb.length()-1; i++) 
			{
				if (Character.isWhitespace(sb.charAt(0))) 
				{
					sb.deleteCharAt(0);					
				} 
				else 
				{
					break;
				}
			}
			

			for (int j = sb.length() - 1; j >= 0; j--) 
			{
				if (Character.isWhitespace(sb.charAt(j)))
						
				{
					sb.deleteCharAt(j);
				} 
				else 
				{
					break;
				}
			}
			
		}
			return this;
	}
   public MyStringBuilder removeWhiteSpaces() {
		if (sb.length() > 0) {
			for (int j = sb.length() - 1; j >= 0; j--) {
				if (Character.isWhitespace(sb.charAt(j))) {
					sb.deleteCharAt(j);
				}
			}
		}
		return this;
	}
   public MyStringBuilder removeNonCharacters(){
	   if(sb.length()>0){
		   for (int j = sb.length() - 1; j >= 0; j--) {
				if (Character.isLetter(sb.charAt(j))) {
					sb.deleteCharAt(j);
				}
			}
		   
	   }
	   return this;
   }
}
