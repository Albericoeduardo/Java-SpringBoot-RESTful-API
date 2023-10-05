package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;

@Repository
public class UsarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null){
            throw new CampoObrigatorioException("login");
        }
        if(usuario.getPassword()==null){
            throw new CampoObrigatorioException("password");
        }
        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo o usuário na camada repository");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada repository");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - recebendo o id: %d"));
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("alberico", "password"));
        usuarios.add(new Usuario("eduardo", "senha"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d"));
        return new Usuario("alberico", "password");
    }

    public Usuario findByUsername(String username){
        System.out.println(("FIND/username - Recebendo o username: %d"));
        return new Usuario("alberico", "password");
    }
}
