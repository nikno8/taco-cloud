package nikit.tacocloud.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force=true)
public class Ingredient {

    @Id
    private String id;
    private String name;
    private Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}

