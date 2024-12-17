/**
 * 
 */

/**
 * 
 */
public class StringBuff {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("John");
		System.out.println(sb.capacity());
		sb.append("son");// Add at last
		sb.deleteCharAt(5);
		sb.insert(5, "o");
		System.out.println(sb);
				
	}

}
