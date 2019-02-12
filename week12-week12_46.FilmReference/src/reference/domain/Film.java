package reference.domain;

import java.util.Objects;

public class Film {

    private String name;
    
    public Film(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}
