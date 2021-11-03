package CadastroDePratos.Controller;

import java.util.ArrayList;

 abstract class BaseController<B>{
    private ArrayList<B> dados;

    public BaseController(){
        this.dados = new ArrayList<B>();
    }

    public void create(B obj){
       this.dados.add(obj);
    }

    public ArrayList<B> read(){
        return this.dados;
    }

    public void update(B obj){
        if(contem(obj)){
            delete(obj);
            create(obj);
        }

    }

    public  void delete(B obj){
        this.dados.remove(obj);
    }

    public  boolean contem(B obj){
        return this.dados.contains(obj);
    }


}
