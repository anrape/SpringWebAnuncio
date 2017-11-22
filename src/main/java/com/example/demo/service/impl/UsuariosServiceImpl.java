import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.example.demo.service.*;

public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    @Qualifier("AnuncioJpaRepository")
    private UsuariosJpaRepository usuariosJpaRepository;

    @Override
    public List<Usuarios> listAllUsuarios() {
	return usuariosJpaRepository.findAll();
    }

    @Override
    public Usuarios addUsuarios(Usuarios usuarios) {
	return usuariosJpaRepository.save(usuarios);
    }
    
    @Override
    public int removeUsuarios(int id) {
	usuariosJpaRepository.delete(id);
	return 0;
    }
    
    @Override
    public Usuarios updateUsuarios(Usuarios usuarios) {
	return usuariosJpaRepository.save(usuarios);
    }
}
