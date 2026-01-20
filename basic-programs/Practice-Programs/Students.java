class Students {
   int id;
   int age;
   String name;
   void printdetails(){
      String college ="GLA University";
      System.out.println("ID is :"+id);
      System.out.println("Name is :"+name);
      System.out.println("Collage is :"+college);
   }
   public static void main(String[] args) {
      Students s1=new Students();
      s1.id=101;
      s1.age=18;
      s1.name="Tarun";
      s1.printdetails();
   }
   }