package pratical.exercise01.v2;

public class Principal {

    public static void main(String[] args) {

        UserAccount user1 = new UserAccount("gabrielj_89@hotmail.com", "Gabriel");
        UserAccount user2 = new UserAccount("leo@leo.com", "Leonardo");
        UserAccount user3 = new UserAccount("charles@charles.com", "Charles");
        UserAccount user4 = new UserAccount("vinicius@vinicius.com", "Vinicius");
        UserAccount user5 = new UserAccount("lucas@lucas.com", "Lucas");
        UserAccount user6 = new UserAccount("livia@livia.com", "Livia");

        user1.acceptFollower(user2);
        user1.acceptFollower(user3);
        user1.acceptFollower(user4);
        user1.acceptFollower(user5);
        user1.acceptFollower(user6);

        System.out.println(user1.showMyFriends());

        user2.publish("Chega logo FDS!! Quero beber!");
        user3.publish("Cara preciso estudar esse FDS!");
        user1.publish("Cyberpunk2077 foi adiado novamente mas que !@#%%");
        user1.publish("Caramba POO ta complicado!");

        String timeline = user1.showTimeline();
        System.out.println("Timeline: " + timeline);

        user1.clapPost(1);
        user1.clapPost(1);

        System.out.println(user1.showMyPosts());
    }
}
