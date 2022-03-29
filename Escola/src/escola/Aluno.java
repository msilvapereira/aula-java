package escola;
/**
 *
 * @author Maria Eduarda, João Ulisses
 */
public class Aluno extends Pessoa {
    private String RA, status, turno;

    public Aluno() {
        super(null, null);
        this.RA = null;
        this.status = null;
        this.turno = null;
    }

    public Aluno(String RA, String turno, String nome, String RG) {
        super(nome, RG);
        this.RA = RA;
        this.status = "ATIVO";
        this.turno = turno;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void trancar() {
        if(this.status.equals("ATIVO")) {
            this.status = "SUSPENSO";
        }
    } 
    
    public void destrancar() {
        if(this.status.equals("SUSPENSO")){
            this.status = "ATIVO";           
        }
    }     
    
    public void formar() {
        if(this.status.equals("ATIVO")){
            this.status = "EGRESSO";
        }
    }
    
    public void desistir() {
        if(this.status.equals("ATIVO") || this.status.equals("SUSPENSO")){
            this.status = "DESISTENTE";
        }
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("RA: " + this.getRA()
                + "\nTurno: " + this.getTurno()
                + "\nStatus: " + this.getStatus()
        );
    }
}
