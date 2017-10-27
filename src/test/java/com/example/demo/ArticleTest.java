package com.example.demo;

import org.junit.Test;

import java.util.Optional;

public class ArticleTest {

    private void doSomethingWithArticle(final String text) {
        System.out.println(text);
    }

    @Test
    public void articleTest() {
        Article article = new Article();
        Optional<Article> maybeArticle = Optional.of(article);
        maybeArticle.ifPresent(theArticle -> doSomethingWithArticle("hello"));
    }

    public static Optional<Article> findById(Integer id) {
        Article maybeConference = null;
        return Optional.ofNullable(maybeConference);
    }

/*

return wsObject.getFoo().getBar().getBaz().getInt()

    public Optional<Integer> m(Ws wsObject) {
        return Optional.ofNullable(wsObject.getFoo()) // Here you get Optional.empty() if the Foo is null
                .map(f -> f.getBar()) // Here you transform the optional or get empty if the Bar is null
                .map(b -> b.getBaz())
                .map(b -> b.getInt());
        // Add this if you want to return an -1 int instead of an empty optional if any is null
        // .orElse(-1);
        // Or this if you want to throw an exception instead
        // .orElseThrow(SomeApplicationException::new);
        */

    }
}
