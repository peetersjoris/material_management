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
@Table(name = "material")
@XmlRootElement
public class MaterialEntity extends BasicEntity{
    
    int stockTotal;
    Date returnToSupplierDate;
    String materialNameId;
    String typeId;

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

    public String getMaterialNameId() {
        return materialNameId;
    }

    public void setMaterialNameId(String materialNameId) {
        this.materialNameId = materialNameId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
    
}
