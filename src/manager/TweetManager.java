package manager;

import model.Tweet;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TweetManager {

    private List<Tweet> tweets;

    public TweetManager() {
        tweets = new ArrayList<>();
    }

    public void tweet(Scanner scanner, String username) {
        System.out.println("Tweet内容を入力してください。");
        String tweet = scanner.nextLine();

        // Tweetを作成する
        Tweet newTweet = new Tweet(tweet, username);
        tweets.add(newTweet);

        System.out.println("ツイートしました。");
    }

    public void outputTweetList() {
        System.out.println("ツイート一覧");

        for (Tweet tweet: tweets) {
            tweet.outputTweet();
        }
    }
}
