package spring.solutions.task2.formula1;

import spring.solutions.task2.formula1.commentator.Commentator;

/**
 *
 */
public class TestBean {

    private Commentator commentator;

    public TestBean setCommentator(Commentator commentator) {
        this.commentator = commentator;
        return this;
    }
}
