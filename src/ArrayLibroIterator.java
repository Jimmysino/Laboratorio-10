public class ArrayLibroIterator implements Iterador {
    private Libro[] libros;
    private int posicion = 0;

    public ArrayLibroIterator(Libro[] libros) {
        this.libros = libros;
    }

    @Override
    public boolean hasNext() {
        return posicion < libros.length && libros[posicion] != null;
    }

    @Override
    public Object next() {
        Libro libro = libros[posicion];
        posicion++;
        return libro;
    }
}