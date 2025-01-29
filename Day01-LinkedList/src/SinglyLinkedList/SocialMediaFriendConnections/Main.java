package SinglyLinkedList.SocialMediaFriendConnections;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();

        socialMedia.addUser(1, "Alice", 25);
        socialMedia.addUser(2, "Bob", 30);
        socialMedia.addUser(3, "Charlie", 22);

        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);

        socialMedia.displayFriends(1); // Friends of Alice: [2, 3]

        socialMedia.removeFriendConnection(1, 2);
        socialMedia.displayFriends(1); // Friends of Alice: [3]

        socialMedia.addFriendConnection(2, 3);
        LinkedList<Integer> mutualFriends = socialMedia.findMutualFriends(1, 2);
        System.out.println("Mutual friends between Alice and Bob: " + mutualFriends); // Mutual friends between Alice and Bob: [3]

        User user = socialMedia.searchUserByName("Charlie");
        if (user != null) {
            System.out.println("User found: " + user);
        }

        int friendCount = socialMedia.countFriends(3);
        System.out.println("Charlie has " + friendCount + " friends."); // Charlie has 2 friends.
    }
}
