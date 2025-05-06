class ParameterCon{
String num;
int id;
ParameterCon(String name, int id){
this.name=name;
this.id=id;
}
public static void main(String[] args){
ParameterCon obj= new ParameterCon("Balaji", 20);
System.out.print(obj.name);
System.out.print(obj.id);
}
}