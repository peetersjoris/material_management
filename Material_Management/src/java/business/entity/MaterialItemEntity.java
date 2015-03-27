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
@Table(name = "materialitem")
@XmlRootElement
public class MaterialItemEntity extends BasicEntity{
    
    int stockTotal;
    Date returnToSupplierDate;
    Date deliveryBySupplierDate;
    
    @ManyToOne(targetEntity = MaterialTypeEntity.class, fetch = FetchType.LAZY)
    private MaterialTypeEntity materialType;
    
    @ManyToOne(targetEntity = MaterialSupplierEntity.class, fetch = FetchType.LAZY)
    private MaterialSupplierEntity materialSupplier;

    public int getStockTotal() {
        return stockTotal;
    }

    public void setStockTotal(int stockTotal) {
        this.stockTotal = stockTotal;
    }

    public Date getReturnToSupplierDate() {
        return returnToSupplierDate;
    }

    public void setReturnToSupplierDate(Date returnToSupplierDate) {
        this.returnToSupplierDate = returnToSupplierDate;
    }

    public Date getDeliveryBySupplierDate() {
        return deliveryBySupplierDate;
    }

    public void setDeliveryBySupplierDate(Date deliveryBySupplierDate) {
        this.deliveryBySupplierDate = deliveryBySupplierDate;
    }

    public MaterialTypeEntity getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialTypeEntity materialType) {
        this.materialType = materialType;
    }

    public MaterialSupplierEntity getMaterialSupplier() {
        return materialSupplier;
    }

    public void setMaterialSupplier(MaterialSupplierEntity materialSupplier) {
        this.materialSupplier = materialSupplier;
    }
    
}
