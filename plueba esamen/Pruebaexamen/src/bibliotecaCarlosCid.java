

public class bibliotecaCarlosCid {
    private String titulo;
    private String autor;
    private boolean disponible;
    public bibliotecaCarlosCid(String titulo, String autor){ //constructor del objeto biblioteca
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    } //getters 
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public void prestar(){ //funcion prestar que pone el libro en no disponible
        if (disponible == true) {
            disponible = false;
            System.out.println("Se ha prestado el libro");
        } else {
            System.out.println("El libro está prestado");
        }
    }
    public void devolver(){ //funcion devolver que pone el libro en disponible
        if (disponible == false) {
            disponible = true;
            System.out.println("Se ha devuelto el libro");
        } else {
            System.out.println("El libro ya se ha devuelto");
        }
    }
    public String toString(){ //funcion para mostrar el estado del libro
        String si; 
        if (disponible == true) {
            si = "disponible";
        } else {
            si = "no disponible";
        }
        return "El libro " + titulo + " del autor " + autor + " está " + si;
    }
}
