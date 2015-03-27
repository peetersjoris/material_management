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
@Table(name = "reservation")
@XmlRootElement
public class ReservationEntity extends BasicEntity{
    
    Date startTime;
    Date endTime;
    boolean cancellationInsurance;
    
    
    
    
}
