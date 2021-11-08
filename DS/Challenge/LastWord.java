public class LastWord {
  public void lastWordLength(String s) {
    if (s == null) {
     System.out.println("No String");
    }
    int count = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        if (count > 0) {
          break;
        }
      } else {
        count++;
      }
    }
	System.out.println(count);
  }
  
  public static void main(String args[]){
	  LastWord lw=new LastWord();
	  String str="Nilesh Khot";
	  lw.lastWordLength(str);
  }
}