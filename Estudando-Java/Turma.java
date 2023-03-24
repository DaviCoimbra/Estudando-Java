public class Turma {
    int codigo;
    String nivel;
    String turno;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int cod) {
        if (cod >0) {
            this.codigo = cod;    
        }else{
            System.out.println("o códido da turma precisa ser maior do que 0");
        }
        
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String niv) {
        this.nivel = niv;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turn) {
        this.turno = turn;
    }

    public static void main(String[] args) {

    }
}
