package boxes;

import java.util.Objects;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) throws IllegalArgumentException {
        if(weight < 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public boolean equals(Object object) {
        if(!(object instanceof Thing)) {
            return false;
        }
        
        Thing otherThing = (Thing) object;
        if(this.name.equals(otherThing.name)) {
            return true;
        }
        return false;
    }
    
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
