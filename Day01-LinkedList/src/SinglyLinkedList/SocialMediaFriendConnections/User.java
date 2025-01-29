package SinglyLinkedList.SocialMediaFriendConnections;
import java.util.LinkedList;

class User {
int userId;
String name;
int age;
LinkedList<Integer> friends;

public User(int userId, String name, int age) {
    this.userId = userId;
    this.name = name;
    this.age = age;
    this.friends = new LinkedList<>();
}

public void addFriend(int friendId) {
    if (!friends.contains(friendId)) {
        friends.add(friendId);
    }
}

public void removeFriend(int friendId) {
    friends.remove((Integer) friendId);
}

public LinkedList<Integer> getFriends() {
    return friends;
}

@Override
public String toString() {
    return "User{" +
            "userId=" + userId +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", friends=" + friends +
            '}';
}
}
