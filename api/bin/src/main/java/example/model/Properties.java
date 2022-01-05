package example.model;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Properties implements Serializable {
    @Id
    private String id;

    private String damage;
    private String health;
    private String weight;
    private String value;

}
