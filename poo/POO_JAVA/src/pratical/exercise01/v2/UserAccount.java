package pratical.exercise01.v2;

public class UserAccount {

    private String email;
    private String userName;

    private UserAccount[]  followers = new UserAccount[1000];
    private Post[] myPosts = new Post[1000];
    private Post[] timeline = new Post[10];

    private int countFlollowers, countMyPosts, countTimelinePosts = 0;

    public UserAccount(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public void publish(String quote){
        if (quote != null) {
            Post newPost = new Post(this, quote);
            myPosts[countMyPosts] = newPost;
            countMyPosts++;
            this.updateTimeLine(newPost);

            for (int i = 0; i < countFlollowers; i++) {
                UserAccount follower = followers[i];
                follower.updateTimeLine(newPost);
            }
        }
    }

    public void updateTimeLine(Post newPost){
        timeline[countTimelinePosts % 10] = newPost;
        countTimelinePosts++;
    }

    public boolean delete (int postIdx){
        for (int i = 0; i < countMyPosts; i++) {
            if(postIdx == i){
                myPosts[i] = null;
                return true;
            }
        }
        return false;
    }

    public String showTimeline(){
        StringBuilder sb = new StringBuilder();

        for (Post post : timeline) {
            if(post != null) {
                String postContent = post.show();
                sb.append(postContent);
            }
        }
        return sb.toString();
    }

    public String showMyPosts(){
        StringBuilder posts = new StringBuilder();

        for (int i = 0; i < countMyPosts; i++) {
            Post post = myPosts[i];
            if(post != null){
                String postContent = post.show();
                posts.append(post.show());
            }
        }
        return posts.toString();
    }

    public String showMyFriends(){
        StringBuilder friends = new StringBuilder();

        for (int i = 0; i < countFlollowers; i++) {
            if(followers != null){
                friends.append(followers[i].getUserName()).append(" ").append(followers[i].getEmail()).append(" ");
            }
        }
        return friends.toString();
    }

    public void clapPost(int postIdx){
        for (int i = 0; i < countTimelinePosts; i++) {
            if (postIdx == i) {
                timeline[i].clap();
            }
        }
    }

    public void booPost(int postIdx){
        for (int i = 0; i < countTimelinePosts; i++) {
            if (postIdx == i) {
                timeline[i].boo();
            }
        }
    }

    public void acceptFollower(UserAccount newFollower){
        followers[countFlollowers] = newFollower;
        countFlollowers++;
    }

    public void bloockFollower(UserAccount follower){
        for (int i = 0; i < countFlollowers; i++) {
            if (follower == followers[i]){
                followers[i] = null;
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
