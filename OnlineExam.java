// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

class OnlineExam {
   static String username = "user";
   static String password = "1234";
   static Scanner sc;

   OnlineExam() {
   }

   public static void main(String[] var0) {
      login();
   }

   static void login() {
      System.out.println("=== LOGIN ===");
      System.out.print("Enter username: ");
      String var0 = sc.nextLine();
      System.out.print("Enter password: ");
      String var1 = sc.nextLine();
      if (var0.equals(username) && var1.equals(password)) {
         System.out.println("Login Successful!\n");
         menu();
      } else {
         System.out.println("Invalid credentials!");
      }

   }

   static void menu() {
      while(true) {
         System.out.println("\n1. Update Profile/Password");
         System.out.println("2. Start Exam");
         System.out.println("3. Logout");
         System.out.print("Choose: ");
         int var0 = sc.nextInt();
         switch (var0) {
            case 1:
               updateProfile();
               break;
            case 2:
               startExam();
               break;
            case 3:
               System.out.println("Logged out successfully!");
               return;
            default:
               System.out.println("Invalid choice!");
         }
      }
   }

   static void updateProfile() {
      sc.nextLine();
      System.out.print("Enter new password: ");
      password = sc.nextLine();
      System.out.println("Password updated successfully!");
   }

   static void startExam() {
      int var0 = 0;
      long var1 = System.currentTimeMillis();
      long var3 = 30000L;
      sc.nextLine();
      System.out.println("\nExam Started! You have 30 seconds.\n");
      if (System.currentTimeMillis() - var1 < var3) {
         System.out.println("1. Java is?");
         System.out.println("a) Language b) OS c) Hardware d) None");
         String var5 = sc.nextLine();
         if (var5.equalsIgnoreCase("a")) {
            ++var0;
         }
      }

      if (System.currentTimeMillis() - var1 < var3) {
         System.out.println("2. OOP stands for?");
         System.out.println("a) Object Oriented Programming b) Only One Program c) None d) Other");
         String var6 = sc.nextLine();
         if (var6.equalsIgnoreCase("a")) {
            ++var0;
         }
      }

      if (System.currentTimeMillis() - var1 < var3) {
         System.out.println("3. JVM stands for?");
         System.out.println("a) Java Virtual Machine b) Java Variable Method c) None d) Other");
         String var7 = sc.nextLine();
         if (var7.equalsIgnoreCase("a")) {
            ++var0;
         }
      }

      System.out.println("\nTime Up or Completed!");
      System.out.println("Your Score: " + var0 + "/3");
   }

   static {
      sc = new Scanner(System.in);
   }
}
