package com.mballen.demoparkapi.web.dto.mapper;

import com.mballen.demoparkapi.entity.Cliente;
import com.mballen.demoparkapi.entity.Usuario;
import com.mballen.demoparkapi.web.dto.ClienteCreateDto;
import com.mballen.demoparkapi.web.dto.ClienteResponseDto;
import com.mballen.demoparkapi.web.dto.UsuarioResponseDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@NoArgsConstructor(access =  AccessLevel.PRIVATE)
public class ClienteMapper {
    public static Cliente toCliente(ClienteCreateDto dto) {
        return new ModelMapper().map(dto, Cliente.class);
    }

    public static ClienteResponseDto toDto(Cliente cliente) {
        return new ModelMapper().map(cliente, ClienteResponseDto.class);
    }

    public static List<ClienteResponseDto> toListDto(List<Cliente> clientes) {
        return clientes.stream().map(cliente -> toDto(cliente)).toList();
    }
}
