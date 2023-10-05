package task4;

 public class Computer {
    private String name;

    public Computer(String newName) {
         name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public static void main(String[] args) {
         Computer[] computers = new Computer[5];

         for (int i = 0; i < 5; i++) {
             computers[i] = new Computer("Computer " + (i + 1));
         }

         // Виводимо імена комп'ютерів
         for (int i = 0; i < 5; i++) {
             System.out.println("Computer " + (i + 1) + ": " + computers[i].getName());
         }
     }
 }
