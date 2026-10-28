public class Tarefas {

    private int id;
    private String titulo;
    private boolean concluida;

    public Tarefas(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return id + " - " + titulo + (concluida ? " [✔]" : " [ ]");
    }

}