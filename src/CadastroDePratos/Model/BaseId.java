package CadastroDePratos.Model;

import java.util.UUID;

public class BaseId {
    private UUID Id;

    public BaseId(){
       geradorId();
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    private void geradorId(){
        UUID uniqueKey = UUID.randomUUID();
        this.Id = uniqueKey;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof BaseId ){
           BaseId id = (BaseId) obj;
           if(this.Id.compareTo(id.getId()) == 0){
               return true;
           }
       }
       return false;
    }

}
