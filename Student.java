class Student{
String name;
int num;
double percent10;
double percent12;

Student(String name, int num, double percent10){
this.name=name;
this.num=num;
this.percent10=percent10;
}

Student(String name, int num, double percent10, double percent12){
this.name=name;
this.num=num;
this.percent10=percent10;
this.percent12=percent12;
}

void display(){
System.out.print(name+"\n"+num+"\n"+percent10+"\n");
if(percent12!=0){
System.out.print(percent12);
}
System.out.print("\n\n");
}

public static void main(String[] args){
Student stu10 = new Student("Gowtham", 785748, 56);
Student stu12 = new Student("Maanav", 999999, 100, 100);
stu10.display();
stu12.display();
}
}