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
        if (niv.equals("básico") || niv.equals("intermediário") || niv.equals("avançado")) {
            this.nivel = niv;    
        } else {
            System.out.println("O nível da turma deve ser básico, intermediário ou avançado");
        }
        
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turn) {
        if (turn.equals("manhã") || turn.equals("tarde") || turn.equals("noite") ) {
            
        } else {
            System.out.println("O turno tem que ser manhã, tarde ou noite");
        }
    }

    public static void main(String[] args) {

    }
}
