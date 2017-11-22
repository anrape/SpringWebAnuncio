public interface UsuariosService {
    public abstract Usuarios addUsuarios(Usuarios rol) ;
    public abstract List<Usuarios> listAllUsuarios();
    public abstract int removeUsuarios(int id);
    public abstract Rol updateUsuarios(Usuarios usuarios);
}
