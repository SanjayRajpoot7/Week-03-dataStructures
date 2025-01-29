package SinglyLinkedList.SocialMediaFriendConnections;

import java.util.LinkedList;

public class SocialMedia {
    LinkedList<User> users;

    public SocialMedia() {
        users = new LinkedList<>();
    }

    public void addUser(int userId, String name, int age) {
        users.add(new User(userId, name, age));
    }

    public User findUserById(int userId) {
        for (User user : users) {
            if (user.userId == userId) {
                return user;
            }
        }
        return null;
    }

    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
        else {
            System.out.println("One and other user not found.");
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        } else {
            System.out.println("One and other user not found.");
        }
    }

    public LinkedList<Integer> findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        LinkedList<Integer> mutualFriends = new LinkedList<>();
        if (user1 != null && user2 != null) {
            for (Integer friendId : user1.getFriends()) {
                if (user2.getFriends().contains(friendId)) {
                    mutualFriends.add(friendId);
                }
            }
        } else {
            System.out.println("One or both users not found.");
        }
        return mutualFriends;
    }

    public void displayFriends(int userId) {
        User user = findUserById(userId);

        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.getFriends());
        } else {
            System.out.println("User not found.");
        }
    }

    public User searchUserByName(String name) {
        for (User user : users) {
            if (user.name.equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User searchUserById(int userId) {
        return findUserById(userId);
    }

    public int countFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            return user.getFriends().size();
        }
        return -1;
    }
}
