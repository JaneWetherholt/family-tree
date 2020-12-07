import java.util.Arrays;
import java.util.List;

public class Relationship {

    Person relative;
    String relationshipType;
    String[] validRelationshipType = {"mother", "father", "sister", "brother"};

    public Relationship(Person relative, String relationshipType) {
        if(checkValidRelationshipType(relationshipType)) {
            this.relative = relative;
            this.relationshipType = relationshipType;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public Boolean checkValidRelationshipType(String relationshipType) {
        List<String> list = Arrays.asList(validRelationshipType);
        if(list.contains(relationshipType)) {
            return true;
        }
        return false;
    }

}
