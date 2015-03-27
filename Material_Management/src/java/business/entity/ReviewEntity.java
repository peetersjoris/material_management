package business.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joris
 */
@Entity
@Table(name = "review")
@XmlRootElement
public class ReviewEntity extends BasicEntity{
    
    int reviewScore;
    String reviewScoreComment;
    int userId;

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getReviewScoreComment() {
        return reviewScoreComment;
    }

    public void setReviewScoreComment(String reviewScoreComment) {
        this.reviewScoreComment = reviewScoreComment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
}
