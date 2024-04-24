package com.mballen.demoparkapi.service;

import com.mballen.demoparkapi.entity.Usuario;
import com.mballen.demoparkapi.exception.EntityNotFoundException;
import com.mballen.demoparkapi.exception.PasswordInvalidException;
import com.mballen.demoparkapi.exception.UsernameUniqueViolationException;
import com.mballen.demoparkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Transactional
    public Usuario salvar(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        } catch (org.springframework.dao.DataIntegrityViolationException ex) {
            throw new UsernameUniqueViolationException(String.format("Username {%s} já cadastrado", usuario.getUsername()));
        }
    }

    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("Usuário id=%s não encontrado", id))
        );
    }

    @Transactional(readOnly = true)
    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    @Transactional
    public Usuario editarSenha(Long id, String senhaAtual, String novaSenha, String confirmaSenha) {
        Usuario user = buscarPorId(id);
        if (!novaSenha.equals(confirmaSenha)) {
            throw new PasswordInvalidException("Nova senha não confere com confirmação de senha.");
        }
        if (!senhaAtual.equals(user.getPassword())) {
            throw new PasswordInvalidException("Sua senha não confere.");
        }
        user.setPassword(novaSenha);
        return user;
    }


}
