public interface AnunciosService {
    public abstract Anuncios addAnuncios(Anuncios anuncios) ;
    public abstract List<Anuncios> listAllAnuncios();
    public abstract int removeAnuncios(int id);
    public abstract Anuncios updateAnuncios(Anuncios anuncios);
}
