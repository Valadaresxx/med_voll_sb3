package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.Endereco;

public record DadosAtualizarPaciente(
        @NotNull
        long id,
        String nome,
        String email,
        String cpf,
        Endereco endereco) {
}
