package assignment1B;


public class LengthOfLine {
	public static void main(String[] args) {
    int x1,x2,y1,y2;
     x1=1;x2=4;y1=1;y2=4;
     double dis;
     double length;
     length=Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
     dis=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
     System.out.println("length of two points:" +length);
System.out.println("the length of the line is:"+"("+x2+","+x1+"),"+"("+y2+","+y1+")====>" +dis);

}
}
