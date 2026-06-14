public class Main {
    public static void main(String[] args) {
        BibliotecaRepositorio miBiblioteca = new BibliotecaRepositorio(10);


        //Libro clasicos
        miBiblioteca.addLibro(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Novela"));
        miBiblioteca.addLibro(new Libro("El señor de los anillos", "J.R.R. Tolkien", "Fantasia"));
        miBiblioteca.addLibro(new Libro("Hábitos Atómicos", "James Clear", "Autoayuda"));
        miBiblioteca.addLibro(new Libro("Física Universitaria", "Sears Zemansky", "Ciencias"));



        miBiblioteca.buscarLibro("anillos");
        miBiblioteca.buscarLibro("ciencias");
        miBiblioteca.buscarLibro("Harry Potter");
    }
}