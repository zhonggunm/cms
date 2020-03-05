package springfive.cms.domain.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author claudioed on 28/10/17. Project cms
 */
@Data
//@Entity
@Document(collection = "user")
public class User {

  @Id
  //@GeneratedValue(generator = "system-uuid")
  //@GenericGenerator(name = "system-uuid", strategy = "uuid")
  String id;

  String identity;

  String name;

  Role role;

}
