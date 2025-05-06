class RectArea{
static int length;
static int breadth;
static int area;

static{
length=5;
breadth=3;
}
static int areaOfRect(){
area=length*breadth;
return area;
}
public static void main(String[] args){
System.out.print(RectArea.areaOfRect());
}
}