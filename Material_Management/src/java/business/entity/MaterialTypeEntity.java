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
@Table(name = "materialtype")
@XmlRootElement
public class MaterialTypeEntity extends BasicEntity{
    
    String materialTypeName;
    String materialType;

    public String getMaterialTypeName() {
        return materialTypeName;
    }

    public void setMaterialTypeName(String materialTypeName) {
        this.materialTypeName = materialTypeName;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
    
}
