class studentImpl{
public static void main(String ar []){
 student s =new student("james","1232");
 s.display();
}
}
class student{
 String nam,rn;
 student(String name,String rno){
 nam=name;
 rn=rno;
}
public void  display(){
  System.out.printf("welcome %s rno is %s \n",nam,rn);
}
}
