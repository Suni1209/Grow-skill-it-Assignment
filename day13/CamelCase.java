package day13;

public class CamelCase {
	public static void main (String[] args) {
		
    String str="today is tuesday";
    //str=str.replace(" ",");
    String[]words=str.split(" ");
    String camelCase="";
    int index=0;
    for(String s:words)
    {
    String upperAlpha="";
    if(index!=0) 
    {
    char firstAlpha=s.charAt(0);
    upperAlpha=(firstAlpha+"").toUpperCase();
    }
    else
    {
    	upperAlpha=s.charAt(0)+"";
    }
    camelCase=camelCase+upperAlpha+s.substring(1,s.length());
    index++;
    
    }
    System.out.println(camelCase);
    
}
}
