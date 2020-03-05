package springfive.cms.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author claudioed on 29/10/17. Project cms
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "review")
//@Entity
public class Review {

  String userId;

  String status;

}
