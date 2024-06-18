package JDBCRevision.Dominio;

import lombok.Getter;

@Getter
public enum AccountType {
    CONTA_CORRENTE(1), CONTA_POUPANCA(2);

    public final int valorConta;

    AccountType(int valorConta) {
        this.valorConta = valorConta;
    }
}