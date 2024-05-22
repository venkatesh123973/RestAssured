package complexPOJO;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@JsonRootName(value = "store")
public class store {

    private Integer expensive;
    private List<book> books;
    private bicycle Bicycle;


}
