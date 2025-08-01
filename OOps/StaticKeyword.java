//  package OOps;
class StaticKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.school = "ABC High School";
        System.out.println("School: " + s1.school);
        Students s2 = new Students();
        System.out.println("from s2"+s2.school);
    }
}

class Students {
    public String school;

    static  int returnPercentage(int math, int phy, int chem) {
      return (math + phy + chem) / 3;
//      String name;
//      int rollNo;
//      String school;
  }
}
