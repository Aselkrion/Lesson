public class Arithmetic {
    private final int variable1;
    private final int variable2;

    public Arithmetic(int variable1, int variable2){
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public int sumOfNumbers(){
        return variable1 + variable2;
    }

    public int productOfNumbers(){
        return variable1 * variable2;
    }

    public int maximumNumber(){
        return Math.max(variable1, variable2);
    }

    public int minimumNumber(){
        return Math.min(variable1, variable2);
    }
}
