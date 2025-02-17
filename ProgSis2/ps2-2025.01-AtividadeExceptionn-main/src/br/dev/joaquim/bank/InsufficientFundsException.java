package br.dev.joaquim.bank;
/*
@author Ricardo Andre Lopes Ikeda.
*/
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}