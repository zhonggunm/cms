package springfive.cms.domain.models;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author claudioed on 28/10/17. Project cms
 */
@Data
/*
@Entity
@Table("category")
*/
@Document(collection = "category")

public class Category {

  @Id
  /*
  @GeneratedValue(generator = "system-uuid")
          @GenericGenerator(name = "system-uuid",strategy = "uuid2")

   */
  String id;

  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(String id) {
    this.id = id;
  }
}
