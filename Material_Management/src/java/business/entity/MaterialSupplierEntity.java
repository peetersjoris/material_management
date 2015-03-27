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
@Table(name = "materialsupplier")
@XmlRootElement
public class MaterialSupplierEntity extends BasicEntity{
    
    @ManyToOne(targetEntity = SupplierEntity.class, fetch = FetchType.LAZY)
    private SupplierEntity supplier;
    
    @ManyToOne(targetEntity = MaterialTypeEntity.class, fetch = FetchType.LAZY)
    private MaterialTypeEntity materialType;

    public SupplierEntity getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierEntity supplier) {
        this.supplier = supplier;
    }

    public MaterialTypeEntity getMaterialType() {
        return materialType;
    }

    public void setMaterialType(MaterialTypeEntity materialType) {
        this.materialType = materialType;
    }
    
}
