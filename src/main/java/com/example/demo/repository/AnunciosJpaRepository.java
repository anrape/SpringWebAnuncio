@Repository("anunciosJpaRepository")
public interface AnunciosJpaRepository extends JpaRepository<Anuncios, Serializable> {
    public abstract Anuncios findById(int id);
    public abstract List<Anuncios> findByTitle(String[] Title);
}
