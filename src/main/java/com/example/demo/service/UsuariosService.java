import java.util.List;
import com.example.demo.entity.Usuarios;
public interface UsuariosService {
    public abstract Usuarios addUsuarios(Usuarios rol) ;
    public abstract List<Usuarios> listAllUsuarios();
    public abstract int removeUsuarios(int id);
    public abstract Usuarios updateUsuarios(Usuarios usuarios);
}
