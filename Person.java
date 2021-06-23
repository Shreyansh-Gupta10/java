class Person {
    String name;
    int age;
    int weight;

    void insertIntoState(String n, int a, int w){
        this.name = n;
        this.age = a;
        this.weight = w;
    }
   void printDetails(){
       System.out.println("Name of Person: "+ name);
       System.out.println("Age of Person: "+ age);
       System.out.println("Weight of Person: "+ weight);
       System.out.println("----------------------------------------------");
   }
    public static void main(String[] args) {
        Person ram = new Person();
        ram.insertIntoState("Ram", 30, 70);

        Person Shreyansh = new Person();
        Shreyansh.insertIntoState("Shreyansh", 21, 60);

        ram.printDetails();
        Shreyansh.printDetails();
        
        // ram.name = "Ram";
        // ram.age = 21;
        // ram.weight = 58;

        // System.out.println("Name of person:"+ram.name);
        // System.out.println("Age of person is: "+ ram.age);
        // System.out.println("Weight of person is: "+ram.weight);

        
    }
    
}
