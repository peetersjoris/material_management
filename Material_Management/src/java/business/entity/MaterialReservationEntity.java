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
@Table(name = "materialreservation")
@XmlRootElement
public class MaterialReservationEntity extends BasicEntity{
    
    Date startTime;
    Date endTime;
    
    @ManyToOne(targetEntity = MaterialItemEntity.class, fetch = FetchType.LAZY)
    private MaterialItemEntity materialItem;
    
    @ManyToOne(targetEntity = ReservationEntity.class, fetch = FetchType.LAZY)
    private ReservationEntity reservation;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public MaterialItemEntity getMaterialItem() {
        return materialItem;
    }

    public void setMaterialItem(MaterialItemEntity materialItem) {
        this.materialItem = materialItem;
    }

    public ReservationEntity getReservation() {
        return reservation;
    }

    public void setReservation(ReservationEntity reservation) {
        this.reservation = reservation;
    }
    
}
