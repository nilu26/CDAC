public class ZigZagString {
    public void convert(String s, int rows) {
        if(rows==1) 
			System.out.println(s);
        StringBuilder[] sb=new StringBuilder[rows];
        for(int i=0;i<sb.length;i++) sb[i]=new StringBuilder();
        int index=-1;
        int st=1;
        for(int i=0;i<s.length();i++){
            index +=st;
            if(index==rows){
                index=rows-2;
                st=-1;
            }else if(index==-1){
                index=1;
                st=1;
            }
            sb[index].append(s.charAt(i));
        }
        String ret="";
        for(int i=0;i<rows;i++) ret+=sb[i].toString();
			System.out.println(ret);
    }
	
	public static void main(String args[]){
		ZigZagString z=new ZigZagString();
		z.convert("PAYPALISHIRING",3);
	}
}