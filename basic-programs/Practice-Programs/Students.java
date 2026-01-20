class Students {
   int id;
   int age;
   String name;
   void printdetails(){
      String college ="GLA University";
      System.out.println("ID :"+id);
      System.out.println("Name :"+name);
      System.out.println("Collage :"+college);
   }
   public static void main(String[] args) {
      Students s1=new Students();
      s1.id=101;
      s1.age=18;
      s1.name="Tarun Kumar";
      s1.printdetails();
   }
   }