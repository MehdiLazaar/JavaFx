package main.java.Lazaar;

import java.text.SimpleDateFormat;

public class Operations {
    protected StringProperty result;
    protected StringProperty expression;
    protected IntegerProperty nb1;
    protected IntegerProperty nb2;
    Operations(string result, string expression, int nb1, int nb2){
        this.result = new SimpleDStringProperty(result);
        this.expression = new SimpleStringProperty(expression);
        this.nb1 = new SimpleIntegerProperty(nb1);
        this.nb2 = new SimpleIntegerProperty(nb2);
    }

    void init(){
        // Initialize the operations
        if(expression.get().equals("+")){
            result.set(String.valueOf(nb1.get() + nb2.get()));
        } else if(expression.get().equals("-")){
            result.set(String.valueOf(nb1.get() - nb2.get()));
        } else if(expression.equals("*")){
            result.set(String.valueOf(nb1.get() * nb2.get()));
        } else if(expression.equals("/")){
            result.set(String.valueOf(nb1.get() / nb2.get()));
        } else if(expression.equals("%")){
            result.set(String.valueOf(nb1.get() % nb2.get()));
        } else if(expression.equals("^")){
            result.set(String.valueOf(Math.pow(nb1.get(), nb2.get())));
        }
    }
}
