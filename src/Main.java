public class Main {
    public static void main(String[] args) {
User user1=new User("Kate",13);
        User user2=new User("Kate",13);
        User user3=new User("Dima",16);
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user1.hashCode());
    }
}