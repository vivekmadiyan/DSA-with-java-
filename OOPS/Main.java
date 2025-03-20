

class Main {
public static void main(String[] args) {
  
   // int[] numbers = new int[5];

   // //store 5 names
   // String[] name=new String[5];

   // //data of 5 students:{roll no,name,marks
   //  int[] rno=new int[5];
   //  String[] names=new String[5];
   //  float[] marks=new float[5];

   //  Student[] students=new Student[5];

    Student vivek =new Student(10,"vivek",99.9f);
   //  vivek.rno=10;
   //  vivek.name="Vivek Madiyan";
   //  vivek.marks=66.77f; 

   // Student vivek =new Student();
   //  System.out.println(vivek);
    System.out.println(vivek.rno);
    System.out.println(vivek.name);
    System.out.println(vivek.marks);
   // System.out.println(vivek);
  
   // vivek.changeName("ShoeLover");
   // vivek.greetings();
  
    
   }
   
  
   
 }
 class Student{
   int rno;
   String name;
   float marks;

   void greetings(){
      System.out.println("hello my name is "+ this.name);
   }
   void changeName(String newName){
      name=newName;
   }

   Student(Student other){
      this.name=other.name;
      this.rno=other.rno;
      this.marks=other.marks;
   }

   Student(){
    //this is how you call a constructor from another constructer;
    this(13,"default person",55.6f);
   }

   Student(int rno ,String name ,float marks){
    this.rno=rno;
    this.name=name;
    this.marks=marks;
}
}