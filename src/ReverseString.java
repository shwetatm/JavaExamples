
/**
 * @author shweta.tippanna
 *
 */
public class ReverseString {
	String reve = "";
	String revSent = "";
		public static void main(String[] args) {
			String dev = "Developer";
			String s = "Tester Developer";
			

		ReverseString reversed = new ReverseString();
		reversed.revString(dev);	
		reversed.revSentence(s);	

		}
		
		public String revString(String dev) {
			for(int i=dev.length()-1;i>=0;i--) {
				char ar = dev.charAt(i);
				reve = reve+ar;
			}
			System.out.println(reve);
			return reve;
		}
		
		public String revSentence(String s) {
			String[] atr = s.split(" ");
			for(String st : atr) {
				for(int i=st.length()-1;i>=0;i--) {
					char ar = st.charAt(i);
					revSent = revSent+ar;
				}
			}
			
			System.out.println(revSent);
			return revSent;
		}

}
