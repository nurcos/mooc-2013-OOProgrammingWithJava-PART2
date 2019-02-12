package reader.criteria;

public class AtLeastOne implements Criterion {

    private Criterion[] criterion;
    
    public AtLeastOne(Criterion... criterion){
        this.criterion = criterion;
    }

    @Override
    public boolean complies(String line) {
        for(Criterion criteria : this.criterion){
            if(criteria.complies(line)){
                return false;
            }
        }
        return false;
    }
    
}
