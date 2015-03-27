package business.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joris
 */
@Entity
@Table(name = "materialsupplierreview")
@XmlRootElement
public class MaterialSupplierReviewEntity extends BasicEntity{
    
    @ManyToOne(targetEntity = ReviewEntity.class, fetch = FetchType.LAZY)
    private ReviewEntity review;
    
    @ManyToOne(targetEntity = MaterialSupplierEntity.class, fetch = FetchType.LAZY)
    private MaterialSupplierEntity materialsupplierentity;

    public ReviewEntity getReview() {
        return review;
    }

    public void setReview(ReviewEntity review) {
        this.review = review;
    }

    public MaterialSupplierEntity getMaterialsupplierentity() {
        return materialsupplierentity;
    }

    public void setMaterialsupplierentity(MaterialSupplierEntity materialsupplierentity) {
        this.materialsupplierentity = materialsupplierentity;
    }
    
}
